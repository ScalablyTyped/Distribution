package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PSTNDialIn extends js.Object {
  /**
    * The zip code.
    */
  var CountryCode: typings.awsDashSdk.clientsAlexaforbusinessMod.CountryCode
  /**
    * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickIdDelay: typings.awsDashSdk.clientsAlexaforbusinessMod.OneClickIdDelay
  /**
    * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickPinDelay: typings.awsDashSdk.clientsAlexaforbusinessMod.OneClickPinDelay
  /**
    * The phone number to call to join the conference.
    */
  var PhoneNumber: OutboundPhoneNumber
}

object PSTNDialIn {
  @scala.inline
  def apply(
    CountryCode: CountryCode,
    OneClickIdDelay: OneClickIdDelay,
    OneClickPinDelay: OneClickPinDelay,
    PhoneNumber: OutboundPhoneNumber
  ): PSTNDialIn = {
    val __obj = js.Dynamic.literal(CountryCode = CountryCode, OneClickIdDelay = OneClickIdDelay, OneClickPinDelay = OneClickPinDelay, PhoneNumber = PhoneNumber)
  
    __obj.asInstanceOf[PSTNDialIn]
  }
}

