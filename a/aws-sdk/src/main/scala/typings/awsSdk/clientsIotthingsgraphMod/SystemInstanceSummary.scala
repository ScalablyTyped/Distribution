package typings.awsSdk.clientsIotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SystemInstanceSummary extends StObject {
  
  /**
    * The ARN of the system instance.
    */
  var arn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The date when the system instance was created.
    */
  var createdAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupId: js.UndefOr[GreengrassGroupId] = js.undefined
  
  /**
    * The ID of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.undefined
  
  /**
    * The version of the Greengrass group where the system instance is deployed.
    */
  var greengrassGroupVersionId: js.UndefOr[GreengrassGroupVersionId] = js.undefined
  
  /**
    * The ID of the system instance.
    */
  var id: js.UndefOr[Urn] = js.undefined
  
  /**
    * The status of the system instance.
    */
  var status: js.UndefOr[SystemInstanceDeploymentStatus] = js.undefined
  
  /**
    * The target of the system instance.
    */
  var target: js.UndefOr[DeploymentTarget] = js.undefined
  
  /**
    *  The date and time when the system instance was last updated.
    */
  var updatedAt: js.UndefOr[js.Date] = js.undefined
}
object SystemInstanceSummary {
  
  inline def apply(): SystemInstanceSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SystemInstanceSummary]
  }
  
  extension [Self <: SystemInstanceSummary](x: Self) {
    
    inline def setArn(value: Arn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "createdAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "createdAt", js.undefined)
    
    inline def setGreengrassGroupId(value: GreengrassGroupId): Self = StObject.set(x, "greengrassGroupId", value.asInstanceOf[js.Any])
    
    inline def setGreengrassGroupIdUndefined: Self = StObject.set(x, "greengrassGroupId", js.undefined)
    
    inline def setGreengrassGroupName(value: GroupName): Self = StObject.set(x, "greengrassGroupName", value.asInstanceOf[js.Any])
    
    inline def setGreengrassGroupNameUndefined: Self = StObject.set(x, "greengrassGroupName", js.undefined)
    
    inline def setGreengrassGroupVersionId(value: GreengrassGroupVersionId): Self = StObject.set(x, "greengrassGroupVersionId", value.asInstanceOf[js.Any])
    
    inline def setGreengrassGroupVersionIdUndefined: Self = StObject.set(x, "greengrassGroupVersionId", js.undefined)
    
    inline def setId(value: Urn): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setStatus(value: SystemInstanceDeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTarget(value: DeploymentTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "updatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "updatedAt", js.undefined)
  }
}
