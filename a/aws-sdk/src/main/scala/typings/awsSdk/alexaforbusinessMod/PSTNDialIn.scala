package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PSTNDialIn extends StObject {
  
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
  implicit class PSTNDialInMutableBuilder[Self <: PSTNDialIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneClickIdDelay(value: OneClickIdDelay): Self = StObject.set(x, "OneClickIdDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOneClickPinDelay(value: OneClickPinDelay): Self = StObject.set(x, "OneClickPinDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhoneNumber(value: OutboundPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
