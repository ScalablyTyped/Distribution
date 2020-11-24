package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetSipMediaApplicationLoggingConfigurationResponse extends js.Object {
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationLoggingConfiguration] = js.native
}
object GetSipMediaApplicationLoggingConfigurationResponse {
  
  @scala.inline
  def apply(): GetSipMediaApplicationLoggingConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSipMediaApplicationLoggingConfigurationResponse]
  }
  
  @scala.inline
  implicit class GetSipMediaApplicationLoggingConfigurationResponseOps[Self <: GetSipMediaApplicationLoggingConfigurationResponse] (val x: Self) extends AnyVal {
    
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
    def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = this.set("SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplicationLoggingConfiguration: Self = this.set("SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
