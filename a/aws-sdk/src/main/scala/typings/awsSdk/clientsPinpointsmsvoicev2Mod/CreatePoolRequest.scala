package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatePoolRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * By default this is set to false. When set to true the pool can't be deleted. You can change this value using the UpdatePool action.
    */
  var DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The new two-character code, in ISO 3166-1 alpha-2 format, for the country or region of the new pool.
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType
  
  /**
    * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use DescribePhoneNumbers to find the values for PhoneNumberId and PhoneNumberArn while DescribeSenderIds can be used to get the values for SenderId and SenderIdArn.
    */
  var OriginationIdentity: PhoneOrSenderIdOrArn
  
  /**
    * An array of tags (key and value pairs) associated with the pool.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreatePoolRequest {
  
  inline def apply(
    IsoCountryCode: IsoCountryCode,
    MessageType: MessageType,
    OriginationIdentity: PhoneOrSenderIdOrArn
  ): CreatePoolRequest = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], MessageType = MessageType.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePoolRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatePoolRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentity(value: PhoneOrSenderIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
