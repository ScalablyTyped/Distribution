package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutKeywordRequest extends StObject {
  
  /**
    * The new keyword to add.
    */
  var Keyword: typings.awsSdk.clientsPinpointsmsvoicev2Mod.Keyword
  
  /**
    * The action to perform for the new keyword when it is received.
    */
  var KeywordAction: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordAction] = js.undefined
  
  /**
    * The message associated with the keyword.   AUTOMATIC_RESPONSE: A message is sent to the recipient.   OPT_OUT: Keeps the recipient from receiving future messages.   OPT_IN: The recipient wants to receive future messages.  
    */
  var KeywordMessage: typings.awsSdk.clientsPinpointsmsvoicev2Mod.KeywordMessage
  
  /**
    * The origination identity to use such as a PhoneNumberId, PhoneNumberArn, SenderId or SenderIdArn. You can use DescribePhoneNumbers get the values for PhoneNumberId and PhoneNumberArn while DescribeSenderIds can be used to get the values for SenderId and SenderIdArn.
    */
  var OriginationIdentity: PhoneOrPoolIdOrArn
}
object PutKeywordRequest {
  
  inline def apply(Keyword: Keyword, KeywordMessage: KeywordMessage, OriginationIdentity: PhoneOrPoolIdOrArn): PutKeywordRequest = {
    val __obj = js.Dynamic.literal(Keyword = Keyword.asInstanceOf[js.Any], KeywordMessage = KeywordMessage.asInstanceOf[js.Any], OriginationIdentity = OriginationIdentity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutKeywordRequest]
  }
  
  extension [Self <: PutKeywordRequest](x: Self) {
    
    inline def setKeyword(value: Keyword): Self = StObject.set(x, "Keyword", value.asInstanceOf[js.Any])
    
    inline def setKeywordAction(value: KeywordAction): Self = StObject.set(x, "KeywordAction", value.asInstanceOf[js.Any])
    
    inline def setKeywordActionUndefined: Self = StObject.set(x, "KeywordAction", js.undefined)
    
    inline def setKeywordMessage(value: KeywordMessage): Self = StObject.set(x, "KeywordMessage", value.asInstanceOf[js.Any])
    
    inline def setOriginationIdentity(value: PhoneOrPoolIdOrArn): Self = StObject.set(x, "OriginationIdentity", value.asInstanceOf[js.Any])
  }
}
