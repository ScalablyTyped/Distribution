package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PhoneNumberCapabilities extends StObject {
  
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
  implicit class PhoneNumberCapabilitiesMutableBuilder[Self <: PhoneNumberCapabilities] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInboundCall(value: NullableBoolean): Self = StObject.set(x, "InboundCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundCallUndefined: Self = StObject.set(x, "InboundCall", js.undefined)
    
    @scala.inline
    def setInboundMMS(value: NullableBoolean): Self = StObject.set(x, "InboundMMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundMMSUndefined: Self = StObject.set(x, "InboundMMS", js.undefined)
    
    @scala.inline
    def setInboundSMS(value: NullableBoolean): Self = StObject.set(x, "InboundSMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInboundSMSUndefined: Self = StObject.set(x, "InboundSMS", js.undefined)
    
    @scala.inline
    def setOutboundCall(value: NullableBoolean): Self = StObject.set(x, "OutboundCall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundCallUndefined: Self = StObject.set(x, "OutboundCall", js.undefined)
    
    @scala.inline
    def setOutboundMMS(value: NullableBoolean): Self = StObject.set(x, "OutboundMMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundMMSUndefined: Self = StObject.set(x, "OutboundMMS", js.undefined)
    
    @scala.inline
    def setOutboundSMS(value: NullableBoolean): Self = StObject.set(x, "OutboundSMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutboundSMSUndefined: Self = StObject.set(x, "OutboundSMS", js.undefined)
  }
}
