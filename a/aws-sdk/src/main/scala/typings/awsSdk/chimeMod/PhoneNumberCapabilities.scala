package typings.awsSdk.chimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneNumberCapabilities extends js.Object {
  /**
    * Allows or denies inbound calling for the specified phone number.
    */
  var InboundCall: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies inbound MMS messaging for the specified phone number.
    */
  var InboundMMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies inbound SMS messaging for the specified phone number.
    */
  var InboundSMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound calling for the specified phone number.
    */
  var OutboundCall: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound MMS messaging for the specified phone number.
    */
  var OutboundMMS: js.UndefOr[NullableBoolean] = js.native
  /**
    * Allows or denies outbound SMS messaging for the specified phone number.
    */
  var OutboundSMS: js.UndefOr[NullableBoolean] = js.native
}

object PhoneNumberCapabilities {
  @scala.inline
  def apply(): PhoneNumberCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberCapabilities]
  }
  @scala.inline
  implicit class PhoneNumberCapabilitiesOps[Self <: PhoneNumberCapabilities] (val x: Self) extends AnyVal {
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
    def setInboundCall(value: NullableBoolean): Self = this.set("InboundCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundCall: Self = this.set("InboundCall", js.undefined)
    @scala.inline
    def setInboundMMS(value: NullableBoolean): Self = this.set("InboundMMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundMMS: Self = this.set("InboundMMS", js.undefined)
    @scala.inline
    def setInboundSMS(value: NullableBoolean): Self = this.set("InboundSMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInboundSMS: Self = this.set("InboundSMS", js.undefined)
    @scala.inline
    def setOutboundCall(value: NullableBoolean): Self = this.set("OutboundCall", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundCall: Self = this.set("OutboundCall", js.undefined)
    @scala.inline
    def setOutboundMMS(value: NullableBoolean): Self = this.set("OutboundMMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundMMS: Self = this.set("OutboundMMS", js.undefined)
    @scala.inline
    def setOutboundSMS(value: NullableBoolean): Self = this.set("OutboundSMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutboundSMS: Self = this.set("OutboundSMS", js.undefined)
  }
  
}

