package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PSTNDialIn extends js.Object {
  /**
    * The zip code.
    */
  var CountryCode: typings.awsSdk.alexaforbusinessMod.CountryCode = js.native
  /**
    * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickIdDelay: typings.awsSdk.alexaforbusinessMod.OneClickIdDelay = js.native
  /**
    * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickPinDelay: typings.awsSdk.alexaforbusinessMod.OneClickPinDelay = js.native
  /**
    * The phone number to call to join the conference.
    */
  var PhoneNumber: OutboundPhoneNumber = js.native
}

object PSTNDialIn {
  @scala.inline
  def apply(
    CountryCode: CountryCode,
    OneClickIdDelay: OneClickIdDelay,
    OneClickPinDelay: OneClickPinDelay,
    PhoneNumber: OutboundPhoneNumber
  ): PSTNDialIn = {
    val __obj = js.Dynamic.literal(CountryCode = CountryCode.asInstanceOf[js.Any], OneClickIdDelay = OneClickIdDelay.asInstanceOf[js.Any], OneClickPinDelay = OneClickPinDelay.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSTNDialIn]
  }
  @scala.inline
  implicit class PSTNDialInOps[Self <: PSTNDialIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCountryCode(value: CountryCode): Self = this.set("CountryCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneClickIdDelay(value: OneClickIdDelay): Self = this.set("OneClickIdDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setOneClickPinDelay(value: OneClickPinDelay): Self = this.set("OneClickPinDelay", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneNumber(value: OutboundPhoneNumber): Self = this.set("PhoneNumber", value.asInstanceOf[js.Any])
  }
  
}

