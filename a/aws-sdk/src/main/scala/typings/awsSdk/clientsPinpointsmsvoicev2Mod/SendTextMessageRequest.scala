package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendTextMessageRequest extends StObject {
  
  /**
    * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn] = js.undefined
  
  /**
    * You can specify custom data in this field. If you do, that data is logged to the event destination.
    */
  var Context: js.UndefOr[ContextMap] = js.undefined
  
  /**
    * This field is used for any country-specific registration requirements. Currently, this setting is only used when you send messages to recipients in India using a sender ID. For more information see Special requirements for sending SMS messages to recipients in India. 
    */
  var DestinationCountryParameters: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.DestinationCountryParameters] = js.undefined
  
  /**
    * The destination phone number in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber
  
  /**
    * When set to true, the message is checked and validated, but isn't sent to the end recipient.
    */
  var DryRun: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * When you register a short code in the US, you must specify a program name. If you don’t have a US short code, omit this attribute.
    */
  var Keyword: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.Keyword] = js.undefined
  
  /**
    * The maximum amount that you want to spend, in US dollars, per each text message part. A text message can contain multiple parts.
    */
  var MaxPrice: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MaxPrice] = js.undefined
  
  /**
    * The body of the text message.
    */
  var MessageBody: js.UndefOr[TextMessageBody] = js.undefined
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType] = js.undefined
  
  /**
    * The origination identity of the message. This can be either the PhoneNumber, PhoneNumberId, PhoneNumberArn, SenderId, SenderIdArn, PoolId, or PoolArn.
    */
  var OriginationIdentity: js.UndefOr[TextMessageOriginationIdentity] = js.undefined
  
  /**
    * How long the text message is valid for. By default this is 72 hours.
    */
  var TimeToLive: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TimeToLive] = js.undefined
}
object SendTextMessageRequest {
  
  inline def apply(DestinationPhoneNumber: PhoneNumber): SendTextMessageRequest = {
    val __obj = js.Dynamic.literal(DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendTextMessageRequest]
  }
  
  extension [Self <: SendTextMessageRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setContext(value: ContextMap): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setDestinationCountryParameters(value: DestinationCountryParameters): Self = StObject.set(x, "DestinationCountryParameters", value.asInstanceOf[js.Any])
    
    inline def setDestinationCountryParametersUndefined: Self = StObject.set(x, "DestinationCountryParameters", js.undefined)
    
    inline def setDestinationPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: PrimitiveBoolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordUndefined: Self = StObject.set(x, "Keyword", js.undefined)
    
    inline def setMaxPrice(value: MaxPrice): Self = StObject.set(x, "MaxPrice", value.asInstanceOf[js.Any])
    
    inline def setMaxPriceUndefined: Self = StObject.set(x, "MaxPrice", js.undefined)
    
    inline def setMessageBody(value: TextMessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "MessageBody", js.undefined)
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setMessageTypeUndefined: Self = StObject.set(x, "MessageType", js.undefined)
    
    inline def setOriginationIdentity(value: TextMessageOriginationIdentity): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentityUndefined: Self = StObject.set(x, "OriginationIdentity", js.undefined)
    
    inline def setTimeToLive(value: TimeToLive): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
  }
}
