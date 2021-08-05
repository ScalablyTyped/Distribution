package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PSTNDialIn extends StObject {
  
  /**
    * The zip code.
    */
  var CountryCode: typings.awsSdk.alexaforbusinessMod.CountryCode
  
  /**
    * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickIdDelay: typings.awsSdk.alexaforbusinessMod.OneClickIdDelay
  
  /**
    * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
    */
  var OneClickPinDelay: typings.awsSdk.alexaforbusinessMod.OneClickPinDelay
  
  /**
    * The phone number to call to join the conference.
    */
  var PhoneNumber: OutboundPhoneNumber
}
object PSTNDialIn {
  
  inline def apply(
    CountryCode: CountryCode,
    OneClickIdDelay: OneClickIdDelay,
    OneClickPinDelay: OneClickPinDelay,
    PhoneNumber: OutboundPhoneNumber
  ): PSTNDialIn = {
    val __obj = js.Dynamic.literal(CountryCode = CountryCode.asInstanceOf[js.Any], OneClickIdDelay = OneClickIdDelay.asInstanceOf[js.Any], OneClickPinDelay = OneClickPinDelay.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[PSTNDialIn]
  }
  
  extension [Self <: PSTNDialIn](x: Self) {
    
    inline def setCountryCode(value: CountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    inline def setOneClickIdDelay(value: OneClickIdDelay): Self = StObject.set(x, "OneClickIdDelay", value.asInstanceOf[js.Any])
    
    inline def setOneClickPinDelay(value: OneClickPinDelay): Self = StObject.set(x, "OneClickPinDelay", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: OutboundPhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
  }
}
