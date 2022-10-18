package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityHubConfigurationRequest extends StObject {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. By default, this is set to true, and new controls are enabled automatically. To not automatically enable new controls, set this to false. 
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.undefined
}
object UpdateSecurityHubConfigurationRequest {
  
  inline def apply(): UpdateSecurityHubConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityHubConfigurationRequest]
  }
  
  extension [Self <: UpdateSecurityHubConfigurationRequest](x: Self) {
    
    inline def setAutoEnableControls(value: Boolean): Self = StObject.set(x, "AutoEnableControls", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableControlsUndefined: Self = StObject.set(x, "AutoEnableControls", js.undefined)
  }
}
