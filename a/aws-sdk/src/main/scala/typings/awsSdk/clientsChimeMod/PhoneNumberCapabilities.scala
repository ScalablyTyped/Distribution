package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberCapabilities extends StObject {
  
  /**
    * Allows or denies inbound calling for the specified phone number.
    */
  var InboundCall: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Allows or denies inbound MMS messaging for the specified phone number.
    */
  var InboundMMS: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Allows or denies inbound SMS messaging for the specified phone number.
    */
  var InboundSMS: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Allows or denies outbound calling for the specified phone number.
    */
  var OutboundCall: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Allows or denies outbound MMS messaging for the specified phone number.
    */
  var OutboundMMS: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Allows or denies outbound SMS messaging for the specified phone number.
    */
  var OutboundSMS: js.UndefOr[NullableBoolean] = js.undefined
}
object PhoneNumberCapabilities {
  
  inline def apply(): PhoneNumberCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberCapabilities] (val x: Self) extends AnyVal {
    
    inline def setInboundCall(value: NullableBoolean): Self = StObject.set(x, "InboundCall", value.asInstanceOf[js.Any])
    
    inline def setInboundCallUndefined: Self = StObject.set(x, "InboundCall", js.undefined)
    
    inline def setInboundMMS(value: NullableBoolean): Self = StObject.set(x, "InboundMMS", value.asInstanceOf[js.Any])
    
    inline def setInboundMMSUndefined: Self = StObject.set(x, "InboundMMS", js.undefined)
    
    inline def setInboundSMS(value: NullableBoolean): Self = StObject.set(x, "InboundSMS", value.asInstanceOf[js.Any])
    
    inline def setInboundSMSUndefined: Self = StObject.set(x, "InboundSMS", js.undefined)
    
    inline def setOutboundCall(value: NullableBoolean): Self = StObject.set(x, "OutboundCall", value.asInstanceOf[js.Any])
    
    inline def setOutboundCallUndefined: Self = StObject.set(x, "OutboundCall", js.undefined)
    
    inline def setOutboundMMS(value: NullableBoolean): Self = StObject.set(x, "OutboundMMS", value.asInstanceOf[js.Any])
    
    inline def setOutboundMMSUndefined: Self = StObject.set(x, "OutboundMMS", js.undefined)
    
    inline def setOutboundSMS(value: NullableBoolean): Self = StObject.set(x, "OutboundSMS", value.asInstanceOf[js.Any])
    
    inline def setOutboundSMSUndefined: Self = StObject.set(x, "OutboundSMS", js.undefined)
  }
}
