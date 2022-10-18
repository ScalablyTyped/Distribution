package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestPhoneNumberRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don't specify a client token, a randomly generated token is used for the request to ensure idempotency.
    */
  var ClientToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.ClientToken] = js.undefined
  
  /**
    * By default this is set to false. When set to true the phone number can't be deleted.
    */
  var DeletionProtectionEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region. 
    */
  var IsoCountryCode: typings.awsSdk.clientsPinpointsmsvoicev2Mod.IsoCountryCode
  
  /**
    * The type of message. Valid values are TRANSACTIONAL for messages that are critical or time-sensitive and PROMOTIONAL for messages that aren't critical or time-sensitive.
    */
  var MessageType: typings.awsSdk.clientsPinpointsmsvoicev2Mod.MessageType
  
  /**
    * Indicates if the phone number will be used for text messages, voice messages, or both. 
    */
  var NumberCapabilities: NumberCapabilityList
  
  /**
    * The type of phone number to request.
    */
  var NumberType: RequestableNumberType
  
  /**
    * The name of the OptOutList to associate with the phone number. You can use the OutOutListName or OptPutListArn.
    */
  var OptOutListName: js.UndefOr[OptOutListNameOrArn] = js.undefined
  
  /**
    * The pool to associated with the phone number. You can use the PoolId or PoolArn. 
    */
  var PoolId: js.UndefOr[PoolIdOrArn] = js.undefined
  
  /**
    * Use this field to attach your phone number for an external registration process.
    */
  var RegistrationId: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.RegistrationId] = js.undefined
  
  /**
    * An array of tags (key and value pairs) associate with the requested phone number. 
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object RequestPhoneNumberRequest {
  
  inline def apply(
    IsoCountryCode: IsoCountryCode,
    MessageType: MessageType,
    NumberCapabilities: NumberCapabilityList,
    NumberType: RequestableNumberType
  ): RequestPhoneNumberRequest = {
    val __obj = js.Dynamic.literal(IsoCountryCode = IsoCountryCode.asInstanceOf[js.Any], MessageType = MessageType.asInstanceOf[js.Any], NumberCapabilities = NumberCapabilities.asInstanceOf[js.Any], NumberType = NumberType.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestPhoneNumberRequest]
  }
  
  extension [Self <: RequestPhoneNumberRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "ClientToken", js.undefined)
    
    inline def setDeletionProtectionEnabled(value: Boolean): Self = StObject.set(x, "DeletionProtectionEnabled", value.asInstanceOf[js.Any])
    
    inline def setDeletionProtectionEnabledUndefined: Self = StObject.set(x, "DeletionProtectionEnabled", js.undefined)
    
    inline def setIsoCountryCode(value: IsoCountryCode): Self = StObject.set(x, "IsoCountryCode", value.asInstanceOf[js.Any])
    
    inline def setMessageType(value: MessageType): Self = StObject.set(x, "MessageType", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setNumberType(value: RequestableNumberType): Self = StObject.set(x, "NumberType", value.asInstanceOf[js.Any])
    
    inline def setOptOutListName(value: OptOutListNameOrArn): Self = StObject.set(x, "OptOutListName", value.asInstanceOf[js.Any])
    
    inline def setOptOutListNameUndefined: Self = StObject.set(x, "OptOutListName", js.undefined)
    
    inline def setPoolId(value: PoolIdOrArn): Self = StObject.set(x, "PoolId", value.asInstanceOf[js.Any])
    
    inline def setPoolIdUndefined: Self = StObject.set(x, "PoolId", js.undefined)
    
    inline def setRegistrationId(value: RegistrationId): Self = StObject.set(x, "RegistrationId", value.asInstanceOf[js.Any])
    
    inline def setRegistrationIdUndefined: Self = StObject.set(x, "RegistrationId", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
