package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutVoiceConnectorEmergencyCallingConfigurationResponse extends js.Object {
  
  /**
    * The emergency calling configuration details.
    */
  var EmergencyCallingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.EmergencyCallingConfiguration] = js.native
}
object PutVoiceConnectorEmergencyCallingConfigurationResponse {
  
  @scala.inline
  def apply(): PutVoiceConnectorEmergencyCallingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutVoiceConnectorEmergencyCallingConfigurationResponse]
  }
  
  @scala.inline
  implicit class PutVoiceConnectorEmergencyCallingConfigurationResponseOps[Self <: PutVoiceConnectorEmergencyCallingConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEmergencyCallingConfiguration(value: EmergencyCallingConfiguration): Self = this.set("EmergencyCallingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmergencyCallingConfiguration: Self = this.set("EmergencyCallingConfiguration", js.undefined)
  }
}
