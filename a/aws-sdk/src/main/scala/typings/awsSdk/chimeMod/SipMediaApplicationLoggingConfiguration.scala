package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SipMediaApplicationLoggingConfiguration extends js.Object {
  
  /**
    * Enables application message logs for the SIP media application.
    */
  var EnableSipMediaApplicationMessageLogs: js.UndefOr[Boolean] = js.native
}
object SipMediaApplicationLoggingConfiguration {
  
  @scala.inline
  def apply(): SipMediaApplicationLoggingConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SipMediaApplicationLoggingConfiguration]
  }
  
  @scala.inline
  implicit class SipMediaApplicationLoggingConfigurationOps[Self <: SipMediaApplicationLoggingConfiguration] (val x: Self) extends AnyVal {
    
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
    def setEnableSipMediaApplicationMessageLogs(value: Boolean): Self = this.set("EnableSipMediaApplicationMessageLogs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableSipMediaApplicationMessageLogs: Self = this.set("EnableSipMediaApplicationMessageLogs", js.undefined)
  }
}
