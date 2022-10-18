package typings.awsSdk.clientsCloudformationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChangeSetHookResourceTargetDetails extends StObject {
  
  /**
    * The resource's logical ID, which is defined in the stack's template.
    */
  var LogicalResourceId: js.UndefOr[typings.awsSdk.clientsCloudformationMod.LogicalResourceId] = js.undefined
  
  /**
    * Specifies the action of the resource.
    */
  var ResourceAction: js.UndefOr[ChangeAction] = js.undefined
  
  /**
    * The type of CloudFormation resource, such as AWS::S3::Bucket.
    */
  var ResourceType: js.UndefOr[HookTargetTypeName] = js.undefined
}
object ChangeSetHookResourceTargetDetails {
  
  inline def apply(): ChangeSetHookResourceTargetDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChangeSetHookResourceTargetDetails]
  }
  
  extension [Self <: ChangeSetHookResourceTargetDetails](x: Self) {
    
    inline def setLogicalResourceId(value: LogicalResourceId): Self = StObject.set(x, "LogicalResourceId", value.asInstanceOf[js.Any])
    
    inline def setLogicalResourceIdUndefined: Self = StObject.set(x, "LogicalResourceId", js.undefined)
    
    inline def setResourceAction(value: ChangeAction): Self = StObject.set(x, "ResourceAction", value.asInstanceOf[js.Any])
    
    inline def setResourceActionUndefined: Self = StObject.set(x, "ResourceAction", js.undefined)
    
    inline def setResourceType(value: HookTargetTypeName): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceTypeUndefined: Self = StObject.set(x, "ResourceType", js.undefined)
  }
}
