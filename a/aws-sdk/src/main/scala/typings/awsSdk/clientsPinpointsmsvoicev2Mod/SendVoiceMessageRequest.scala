package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendVoiceMessageRequest extends StObject {
  
  /**
    * The name of the configuration set to use. This can be either the ConfigurationSetName or ConfigurationSetArn.
    */
  var ConfigurationSetName: js.UndefOr[ConfigurationSetNameOrArn] = js.undefined
  
  /**
    * You can specify custom data in this field. If you do, that data is logged to the event destination.
    */
  var Context: js.UndefOr[ContextMap] = js.undefined
  
  /**
    * The destination phone number in E.164 format.
    */
  var DestinationPhoneNumber: PhoneNumber
  
  /**
    * When set to true, the message is checked and validated, but isn't sent to the end recipient.
    */
  var DryRun: js.UndefOr[PrimitiveBoolean] = js.undefined
  
  /**
    * The maximum amount to spend per voice message, in US dollars.
    */
  var MaxPricePerMinute: js.UndefOr[MaxPrice] = js.undefined
  
  /**
    * The text to convert to a voice message.
    */
  var MessageBody: js.UndefOr[VoiceMessageBody] = js.undefined
  
  /**
    * Specifies if the MessageBody field contains text or speech synthesis markup language (SSML).   TEXT: This is the default value. When used the maximum character limit is 3000.   SSML: When used the maximum character limit is 6000 including SSML tagging.  
    */
  var MessageBodyTextType: js.UndefOr[VoiceMessageBodyTextType] = js.undefined
  
  /**
    * The origination identity to use for the voice call. This can be the PhoneNumber, PhoneNumberId, PhoneNumberArn, PoolId, or PoolArn.
    */
  var OriginationIdentity: VoiceMessageOriginationIdentity
  
  /**
    * How long the voice message is valid for. By default this is 72 hours.
    */
  var TimeToLive: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.TimeToLive] = js.undefined
  
  /**
    * The voice for the Amazon Polly service to use. By default this is set to "MATTHEW".
    */
  var VoiceId: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.VoiceId] = js.undefined
}
object SendVoiceMessageRequest {
  
  inline def apply(DestinationPhoneNumber: PhoneNumber, OriginationIdentity: VoiceMessageOriginationIdentity): SendVoiceMessageRequest = {
    val __obj = js.Dynamic.literal(DestinationPhoneNumber = DestinationPhoneNumber.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendVoiceMessageRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SendVoiceMessageRequest] (val x: Self) extends AnyVal {
    
    inline def setConfigurationSetName(value: ConfigurationSetNameOrArn): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setConfigurationSetNameUndefined: Self = StObject.set(x, "ConfigurationSetName", js.undefined)
    
    inline def setContext(value: ContextMap): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
    
    inline def setContextUndefined: Self = StObject.set(x, "Context", js.undefined)
    
    inline def setDestinationPhoneNumber(value: PhoneNumber): Self = StObject.set(x, "DestinationPhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setDryRun(value: PrimitiveBoolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMaxPricePerMinute(value: MaxPrice): Self = StObject.set(x, "MaxPricePerMinute", value.asInstanceOf[js.Any])
    
    inline def setMaxPricePerMinuteUndefined: Self = StObject.set(x, "MaxPricePerMinute", js.undefined)
    
    inline def setMessageBody(value: VoiceMessageBody): Self = StObject.set(x, "MessageBody", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyTextType(value: VoiceMessageBodyTextType): Self = StObject.set(x, "MessageBodyTextType", value.asInstanceOf[js.Any])
    
    inline def setMessageBodyTextTypeUndefined: Self = StObject.set(x, "MessageBodyTextType", js.undefined)
    
    inline def setMessageBodyUndefined: Self = StObject.set(x, "MessageBody", js.undefined)
    
    inline def setOriginationIdentity(value: VoiceMessageOriginationIdentity): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setTimeToLive(value: TimeToLive): Self = StObject.set(x, "TimeToLive", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveUndefined: Self = StObject.set(x, "TimeToLive", js.undefined)
    
    inline def setVoiceId(value: VoiceId): Self = StObject.set(x, "VoiceId", value.asInstanceOf[js.Any])
    
    inline def setVoiceIdUndefined: Self = StObject.set(x, "VoiceId", js.undefined)
  }
}
