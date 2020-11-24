package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutSipMediaApplicationLoggingConfigurationRequest extends js.Object {
  
  /**
    * The ID of the specified SIP media application
    */
  var SipMediaApplicationId: NonEmptyString = js.native
  
  /**
    * The actual logging configuration.
    */
  var SipMediaApplicationLoggingConfiguration: js.UndefOr[typings.awsSdk.chimeMod.SipMediaApplicationLoggingConfiguration] = js.native
}
object PutSipMediaApplicationLoggingConfigurationRequest {
  
  @scala.inline
  def apply(SipMediaApplicationId: NonEmptyString): PutSipMediaApplicationLoggingConfigurationRequest = {
    val __obj = js.Dynamic.literal(SipMediaApplicationId = SipMediaApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSipMediaApplicationLoggingConfigurationRequest]
  }
  
  @scala.inline
  implicit class PutSipMediaApplicationLoggingConfigurationRequestOps[Self <: PutSipMediaApplicationLoggingConfigurationRequest] (val x: Self) extends AnyVal {
    
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
    def setSipMediaApplicationId(value: NonEmptyString): Self = this.set("SipMediaApplicationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSipMediaApplicationLoggingConfiguration(value: SipMediaApplicationLoggingConfiguration): Self = this.set("SipMediaApplicationLoggingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSipMediaApplicationLoggingConfiguration: Self = this.set("SipMediaApplicationLoggingConfiguration", js.undefined)
  }
}
