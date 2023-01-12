package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleasePhoneNumberResult extends StObject {
  
  /**
    * The time when the phone number was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region.
    */
  var IsoCountryCode: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode] = js.undefined
  
  /**
    * The message type that was associated with the phone number.
    */
  var MessageType: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType] = js.undefined
  
  /**
    * The monthly price of the phone number, in US dollars.
    */
  var MonthlyLeasingPrice: js.UndefOr[String] = js.undefined
  
  /**
    * Specifies if the number could be used for text messages, voice, or both.
    */
  var NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined
  
  /**
    * The type of number that was released.
    */
  var NumberType: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NumberType] = js.undefined
  
  /**
    * The name of the OptOutList that was associated with the phone number.
    */
  var OptOutListName: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName] = js.undefined
  
  /**
    * The phone number that was released.
    */
  var PhoneNumber: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.PhoneNumber] = js.undefined
  
  /**
    * The PhoneNumberArn of the phone number that was released.
    */
  var PhoneNumberArn: js.UndefOr[String] = js.undefined
  
  /**
    * The PhoneNumberId of the phone number that was released.
    */
  var PhoneNumberId: js.UndefOr[String] = js.undefined
  
  /**
    * By default this is set to false. When an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out requests.
    */
  var SelfManagedOptOutsEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The current status of the request.
    */
  var Status: js.UndefOr[NumberStatus] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the TwoWayChannel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * By default this is set to false. When set to true you can receive incoming text messages from your end recipients.
    */
  var TwoWayEnabled: js.UndefOr[PrimitiveBoolean] = js.undefined
}
object ReleasePhoneNumberResult {
  
  inline def apply(): ReleasePhoneNumberResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleasePhoneNumberResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleasePhoneNumberResult] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCodeUndefined: Self = StObject.set(x, "IsoCountryCode", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setMonthlyLeasingPrice(value: String): Self = StObject.set(x, "MonthlyLeasingPrice", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLeasingPriceUndefined: Self = StObject.set(x, "MonthlyLeasingPrice", js.undefined)
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesUndefined: Self = StObject.set(x, "NumberCapabilities", js.undefined)
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setNumberType(value: NumberType): Self = StObject.set(x, "NumberType", value.asInstanceOf[js.Any])
    
    inline def setNumberTypeUndefined: Self = StObject.set(x, "NumberType", js.undefined)
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArn(value: String): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArnUndefined: Self = StObject.set(x, "PhoneNumberArn", js.undefined)
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setSelfManagedOptOutsEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setSelfManagedOptOutsEnabledUndefined: Self = StObject.set(x, "SelfManagedOptOutsEnabled", js.undefined)
    
    inline def setStatus(value: NumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
    
    inline def setTwoWayEnabledUndefined: Self = StObject.set(x, "TwoWayEnabled", js.undefined)
  }
}
