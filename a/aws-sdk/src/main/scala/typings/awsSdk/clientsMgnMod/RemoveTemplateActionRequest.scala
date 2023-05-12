package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoveTemplateActionRequest extends StObject {
  
  /**
    * Template post migration custom action ID to remove.
    */
  var actionID: ActionID
  
  /**
    * Launch configuration template ID of the post migration custom action to remove.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
}
object RemoveTemplateActionRequest {
  
  inline def apply(actionID: ActionID, launchConfigurationTemplateID: LaunchConfigurationTemplateID): RemoveTemplateActionRequest = {
    val __obj = js.Dynamic.literal(actionID = actionID.asInstanceOf[js.Any], launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoveTemplateActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RemoveTemplateActionRequest] (val x: Self) extends AnyVal {
    
    inline def setActionID(value: ActionID): Self = StObject.set(x, "actionID", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
  }
}
