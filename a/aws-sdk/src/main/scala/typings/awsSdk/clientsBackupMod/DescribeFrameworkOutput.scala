package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFrameworkOutput extends StObject {
  
  /**
    * The date and time that a framework is created, in Unix format and Coordinated Universal Time (UTC). The value of CreationTime is accurate to milliseconds. For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The deployment status of a framework. The statuses are:  CREATE_IN_PROGRESS | UPDATE_IN_PROGRESS | DELETE_IN_PROGRESS | COMPLETED | FAILED 
    */
  var DeploymentStatus: js.UndefOr[String] = js.undefined
  
  /**
    * An Amazon Resource Name (ARN) that uniquely identifies a resource. The format of the ARN depends on the resource type.
    */
  var FrameworkArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * A list of the controls that make up the framework. Each control in the list has a name, input parameters, and scope.
    */
  var FrameworkControls: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkControls] = js.undefined
  
  /**
    * An optional description of the framework.
    */
  var FrameworkDescription: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkDescription] = js.undefined
  
  /**
    * The unique name of a framework.
    */
  var FrameworkName: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkName] = js.undefined
  
  /**
    * A framework consists of one or more controls. Each control governs a resource, such as backup plans, backup selections, backup vaults, or recovery points. You can also turn Config recording on or off for each resource. The statuses are:    ACTIVE when recording is turned on for all resources governed by the framework.    PARTIALLY_ACTIVE when recording is turned off for at least one resource governed by the framework.    INACTIVE when recording is turned off for all resources governed by the framework.    UNAVAILABLE when Backup is unable to validate recording status at this time.  
    */
  var FrameworkStatus: js.UndefOr[String] = js.undefined
  
  /**
    * A customer-chosen string that you can use to distinguish between otherwise identical calls to DescribeFrameworkOutput. Retrying a successful request with the same idempotency token results in a success message with no action taken.
    */
  var IdempotencyToken: js.UndefOr[String] = js.undefined
}
object DescribeFrameworkOutput {
  
  inline def apply(): DescribeFrameworkOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeFrameworkOutput]
  }
  
  extension [Self <: DescribeFrameworkOutput](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeploymentStatus(value: String): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    inline def setFrameworkArn(value: ARN): Self = StObject.set(x, "FrameworkArn", value.asInstanceOf[js.Any])
    
    inline def setFrameworkArnUndefined: Self = StObject.set(x, "FrameworkArn", js.undefined)
    
    inline def setFrameworkControls(value: FrameworkControls): Self = StObject.set(x, "FrameworkControls", value.asInstanceOf[js.Any])
    
    inline def setFrameworkControlsUndefined: Self = StObject.set(x, "FrameworkControls", js.undefined)
    
    inline def setFrameworkControlsVarargs(value: FrameworkControl*): Self = StObject.set(x, "FrameworkControls", js.Array(value*))
    
    inline def setFrameworkDescription(value: FrameworkDescription): Self = StObject.set(x, "FrameworkDescription", value.asInstanceOf[js.Any])
    
    inline def setFrameworkDescriptionUndefined: Self = StObject.set(x, "FrameworkDescription", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "FrameworkName", js.undefined)
    
    inline def setFrameworkStatus(value: String): Self = StObject.set(x, "FrameworkStatus", value.asInstanceOf[js.Any])
    
    inline def setFrameworkStatusUndefined: Self = StObject.set(x, "FrameworkStatus", js.undefined)
    
    inline def setIdempotencyToken(value: String): Self = StObject.set(x, "IdempotencyToken", value.asInstanceOf[js.Any])
    
    inline def setIdempotencyTokenUndefined: Self = StObject.set(x, "IdempotencyToken", js.undefined)
  }
}
