package typings.awsSdk.clientsBackupMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Framework extends StObject {
  
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
    * An optional description of the framework with a maximum 1,024 characters.
    */
  var FrameworkDescription: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkDescription] = js.undefined
  
  /**
    * The unique name of a framework. This name is between 1 and 256 characters, starting with a letter, and consisting of letters (a-z, A-Z), numbers (0-9), and underscores (_).
    */
  var FrameworkName: js.UndefOr[typings.awsSdk.clientsBackupMod.FrameworkName] = js.undefined
  
  /**
    * The number of controls contained by the framework.
    */
  var NumberOfControls: js.UndefOr[integer] = js.undefined
}
object Framework {
  
  inline def apply(): Framework = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Framework]
  }
  
  extension [Self <: Framework](x: Self) {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDeploymentStatus(value: String): Self = StObject.set(x, "DeploymentStatus", value.asInstanceOf[js.Any])
    
    inline def setDeploymentStatusUndefined: Self = StObject.set(x, "DeploymentStatus", js.undefined)
    
    inline def setFrameworkArn(value: ARN): Self = StObject.set(x, "FrameworkArn", value.asInstanceOf[js.Any])
    
    inline def setFrameworkArnUndefined: Self = StObject.set(x, "FrameworkArn", js.undefined)
    
    inline def setFrameworkDescription(value: FrameworkDescription): Self = StObject.set(x, "FrameworkDescription", value.asInstanceOf[js.Any])
    
    inline def setFrameworkDescriptionUndefined: Self = StObject.set(x, "FrameworkDescription", js.undefined)
    
    inline def setFrameworkName(value: FrameworkName): Self = StObject.set(x, "FrameworkName", value.asInstanceOf[js.Any])
    
    inline def setFrameworkNameUndefined: Self = StObject.set(x, "FrameworkName", js.undefined)
    
    inline def setNumberOfControls(value: integer): Self = StObject.set(x, "NumberOfControls", value.asInstanceOf[js.Any])
    
    inline def setNumberOfControlsUndefined: Self = StObject.set(x, "NumberOfControls", js.undefined)
  }
}
