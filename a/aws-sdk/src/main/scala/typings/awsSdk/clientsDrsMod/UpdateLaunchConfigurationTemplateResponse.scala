package typings.awsSdk.clientsDrsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateLaunchConfigurationTemplateResponse extends StObject {
  
  /**
    * Updated Launch Configuration Template.
    */
  var launchConfigurationTemplate: js.UndefOr[LaunchConfigurationTemplate] = js.undefined
}
object UpdateLaunchConfigurationTemplateResponse {
  
  inline def apply(): UpdateLaunchConfigurationTemplateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateLaunchConfigurationTemplateResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateLaunchConfigurationTemplateResponse] (val x: Self) extends AnyVal {
    
    inline def setLaunchConfigurationTemplate(value: LaunchConfigurationTemplate): Self = StObject.set(x, "launchConfigurationTemplate", value.asInstanceOf[js.Any])
    
    inline def setLaunchConfigurationTemplateUndefined: Self = StObject.set(x, "launchConfigurationTemplate", js.undefined)
  }
}
