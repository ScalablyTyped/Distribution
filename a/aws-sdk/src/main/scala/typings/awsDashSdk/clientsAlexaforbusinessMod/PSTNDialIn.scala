package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PSTNDialIn extends js.Object {
  /**
    * The zip code.
    */
  var CountryCode: typings.awsDashSdk.clientsAlexaforbusinessMod.CountryCode = js.native
  /**
    * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickIdDelay: typings.awsDashSdk.clientsAlexaforbusinessMod.OneClickIdDelay = js.native
  /**
    * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickPinDelay: typings.awsDashSdk.clientsAlexaforbusinessMod.OneClickPinDelay = js.native
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
}

