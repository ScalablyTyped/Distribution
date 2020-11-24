package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetVoiceConnectorLoggingConfigurationResponse extends js.Object {
  
  /**
    * The logging configuration details.
    */
  var LoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.LoggingConfiguration] = js.native
}
object GetVoiceConnectorLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): GetVoiceConnectorLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetVoiceConnectorLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetVoiceConnectorLoggingConfigurationResponseOps[Self <: GetVoiceConnectorLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setLoggingConfiguration(value: LoggingConfiguration): Self = this.set("LoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoggingConfiguration: Self = this.set("LoggingConfiguration", js.undefined)
  }
}
