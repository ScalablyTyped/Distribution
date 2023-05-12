package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateSecurityHubConfigurationRequest extends StObject {
  
  /**
    * Whether to automatically enable new controls when they are added to standards that are enabled. By default, this is set to true, and new controls are enabled automatically. To not automatically enable new controls, set this to false. 
    */
  var AutoEnableControls: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Updates whether the calling account has consolidated control findings turned on. If the value for this field is set to SECURITY_CONTROL, Security Hub generates a single finding for a control check even when the check applies to multiple enabled standards. If the value for this field is set to STANDARD_CONTROL, Security Hub generates separate findings for a control check when the check applies to multiple enabled standards. For accounts that are part of an organization, this value can only be updated in the administrator account.
    */
  var ControlFindingGenerator: js.UndefOr[typings.awsSdk.clientsSecurityhubMod.ControlFindingGenerator] = js.undefined
}
object UpdateSecurityHubConfigurationRequest {
  
  inline def apply(): UpdateSecurityHubConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateSecurityHubConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateSecurityHubConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setAutoEnableControls(value: Boolean): Self = StObject.set(x, "AutoEnableControls", value.asInstanceOf[js.Any])
    
    inline def setAutoEnableControlsUndefined: Self = StObject.set(x, "AutoEnableControls", js.undefined)
    
    inline def setControlFindingGenerator(value: ControlFindingGenerator): Self = StObject.set(x, "ControlFindingGenerator", value.asInstanceOf[js.Any])
    
    inline def setControlFindingGeneratorUndefined: Self = StObject.set(x, "ControlFindingGenerator", js.undefined)
  }
}
