package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberInformation extends StObject {
  
  /**
    * The time when the phone number was created, in UNIX epoch time format.
    */
  var CreatedTimestamp: js.Date
  
  /**
    * When set to true the phone number can't be deleted.
    */
  var DeletionProtectionEnabled: PrimitiveBoolean
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType
  
  /**
    * The price, in US dollars, to lease the phone number.
    */
  var MonthlyLeasingPrice: String
  
  /**
    * Describes if the origination identity can be used for text messages, voice calls or both.
    */
  var NumberCapabilities: NumberCapabilityList
  
  /**
    * The type of phone number.
    */
  var NumberType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.NumberType
  
  /**
    * The name of the OptOutList associated with the phone number.
    */
  var OptOutListName: typings.awsSdk.clientsPinpointsmsvoicev2Mod.OptOutListName
  
  /**
    * The phone number in E.164 format.
    */
  var PhoneNumber: typings.awsSdk.clientsPinpointsmsvoicev2Mod.PhoneNumber
  
  /**
    * The Amazon Resource Name (ARN) associated with the phone number.
    */
  var PhoneNumberArn: String
  
  /**
    * The unique identifier for the phone number.
    */
  var PhoneNumberId: js.UndefOr[String] = js.undefined
  
  /**
    * The unique identifier of the pool associated with the phone number.
    */
  var PoolId: js.UndefOr[String] = js.undefined
  
  /**
    * When set to false an end recipient sends a message that begins with HELP or STOP to one of your dedicated numbers, Amazon Pinpoint automatically replies with a customizable message and adds the end recipient to the OptOutList. When set to true you're responsible for responding to HELP and STOP requests. You're also responsible for tracking and honoring opt-out request. For more information see Self-managed opt-outs 
    */
  var SelfManagedOptOutsEnabled: PrimitiveBoolean
  
  /**
    * The current status of the phone number.
    */
  var Status: NumberStatus
  
  /**
    * The Amazon Resource Name (ARN) of the two way channel.
    */
  var TwoWayChannelArn: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TwoWayChannelArn] = js.undefined
  
  /**
    * By default this is set to false. When set to true you can receive incoming text messages from your end recipients using the TwoWayChannelArn.
    */
  var TwoWayEnabled: PrimitiveBoolean
}
object PhoneNumberInformation {
  
  inline def apply(
    CreatedTimestamp: js.Date,
    DeletionProtectionEnabled: PrimitiveBoolean,
    IsoCountryCode: IsoCountryCode,
    MessageType: MessageType,
    MonthlyLeasingPrice: String,
    NumberCapabilities: NumberCapabilityList,
    NumberType: NumberType,
    OptOutListName: OptOutListName,
    PhoneNumber: PhoneNumber,
    PhoneNumberArn: String,
    SelfManagedOptOutsEnabled: PrimitiveBoolean,
    Status: NumberStatus,
    TwoWayEnabled: PrimitiveBoolean
  ): PhoneNumberInformation = {
    val __obj = js.Dynamic.literal(CreatedTimestamp = CreatedTimestamp.asInstanceOf[js.Any], DeletionProtectionEnabled = DeletionProtectionEnabled.asInstanceOf[js.Any], IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], MessageType = MessageType.asInstanceOf[js.Any], MonthlyLeasingPrice = MonthlyLeasingPrice.asInstanceOf[js.Any], NumberCapabilities = NumberCapabilities.asInstanceOf[js.Any], NumberType = NumberType.asInstanceOf[js.Any], OptOutListName = OptOutListName.asInstanceOf[js.Any], PhoneNumber = PhoneNumber.asInstanceOf[js.Any], PhoneNumberArn = PhoneNumberArn.asInstanceOf[js.Any], SelfManagedOptOutsEnabled = SelfManagedOptOutsEnabled.asInstanceOf[js.Any], Status = Status.asInstanceOf[js.Any], TwoWayEnabled = TwoWayEnabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneNumberInformation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PhoneNumberInformation] (val x: Self) extends AnyVal {
    
    inline def setCreatedTimestamp(value: js.Date): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMonthlyLeasingPrice(value: String): Self = StObject.set(x, "MonthlyLeasingPrice", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setNumberType(value: NumberType): Self = StObject.set(x, "NumberType", value.asInstanceOf[js.Any])
    
    inline def setOptOutListName(value: OptOutListName): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberArn(value: String): Self = StObject.set(x, "PhoneNumberArn", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberId(value: String): Self = StObject.set(x, "PhoneNumberId", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberIdUndefined: Self = StObject.set(x, "PhoneNumberId", js.undefined)
    
    inline def setPoolId(value: String): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setSelfManagedOptOutsEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "SelfManagedOptOutsEnabled", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: NumberStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArn(value: TwoWayChannelArn): Self = StObject.set(x, "TwoWayChannelArn", value.asInstanceOf[js.Any])
    
    inline def setTwoWayChannelArnUndefined: Self = StObject.set(x, "TwoWayChannelArn", js.undefined)
    
    inline def setTwoWayEnabled(value: PrimitiveBoolean): Self = StObject.set(x, "TwoWayEnabled", value.asInstanceOf[js.Any])
  }
}
