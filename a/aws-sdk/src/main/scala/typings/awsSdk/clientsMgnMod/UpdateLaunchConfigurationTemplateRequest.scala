package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationTemplateRequest extends StObject {
  
  /**
    * Update Launch configuration Target instance right sizing request.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
  
  /**
    * Update Launch configuration Target instance right sizing request.
    */
  var postLaunchActions: js.UndefOr[PostLaunchActions] = js.undefined
}
object UpdateLaunchConfigurationTemplateRequest {
  
  inline def apply(launchConfigurationTemplateID: LaunchConfigurationTemplateID): UpdateLaunchConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateLaunchConfigurationTemplateRequest]
  }
  
  extension [Self <: UpdateLaunchConfigurationTemplateRequest](x: Self) {
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActions(value: PostLaunchActions): Self = StObject.set(x, "postLaunchActions", value.asInstanceOf[js.Any])
    
    inline def setPostLaunchActionsUndefined: Self = StObject.set(x, "postLaunchActions", js.undefined)
  }
}
