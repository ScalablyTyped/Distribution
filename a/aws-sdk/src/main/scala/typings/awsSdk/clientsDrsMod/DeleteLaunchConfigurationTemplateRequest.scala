package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteLaunchConfigurationTemplateRequest extends StObject {
  
  /**
    * The ID of the Launch Configuration Template to be deleted.
    */
  var launchConfigurationTemplateID: LaunchConfigurationTemplateID
}
object DeleteLaunchConfigurationTemplateRequest {
  
  inline def apply(launchConfigurationTemplateID: LaunchConfigurationTemplateID): DeleteLaunchConfigurationTemplateRequest = {
    val __obj = js.Dynamic.literal(launchConfigurationTemplateID = launchConfigurationTemplateID.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteLaunchConfigurationTemplateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteLaunchConfigurationTemplateRequest] (val x: Self) extends AnyVal {
    
    inline def setLaunchConfigurationTemplateID(value: LaunchConfigurationTemplateID): Self = StObject.set(x, "launchConfigurationTemplateID", value.asInstanceOf[js.Any])
  }
}
