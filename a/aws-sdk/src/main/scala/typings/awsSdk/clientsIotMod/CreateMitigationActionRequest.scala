package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMitigationActionRequest extends StObject {
  
  /**
    * A friendly name for the action. Choose a friendly name that accurately describes the action (for example, EnableLoggingAction).
    */
  var actionName: MitigationActionName
  
  /**
    * Defines the type of action and the parameters for that action.
    */
  var actionParams: MitigationActionParams
  
  /**
    * The ARN of the IAM role that is used to apply the mitigation action.
    */
  var roleArn: RoleArn
  
  /**
    * Metadata that can be used to manage the mitigation action.
    */
  var tags: js.UndefOr[TagList] = js.undefined
}
object CreateMitigationActionRequest {
  
  inline def apply(actionName: MitigationActionName, actionParams: MitigationActionParams, roleArn: RoleArn): CreateMitigationActionRequest = {
    val __obj = js.Dynamic.literal(actionName = actionName.asInstanceOf[js.Any], actionParams = actionParams.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMitigationActionRequest]
  }
  
  extension [Self <: CreateMitigationActionRequest](x: Self) {
    
    inline def setActionName(value: MitigationActionName): Self = StObject.set(x, "actionName", value.asInstanceOf[js.Any])
    
    inline def setActionParams(value: MitigationActionParams): Self = StObject.set(x, "actionParams", value.asInstanceOf[js.Any])
    
    inline def setRoleArn(value: RoleArn): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
