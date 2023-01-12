package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutSessionRequest extends StObject {
  
  /**
    * The alias identifier of the bot that receives the session data.
    */
  var botAliasId: BotAliasIdentifier
  
  /**
    * The identifier of the bot that receives the session data.
    */
  var botId: BotIdentifier
  
  /**
    * The locale where the session is in use.
    */
  var localeId: LocaleId
  
  /**
    * A list of messages to send to the user. Messages are sent in the order that they are defined in the list.
    */
  var messages: js.UndefOr[Messages] = js.undefined
  
  /**
    * Request-specific information passed between Amazon Lex V2 and the client application. The namespace x-amz-lex: is reserved for special attributes. Don't create any request attributes with the prefix x-amz-lex:.
    */
  var requestAttributes: js.UndefOr[StringMap] = js.undefined
  
  /**
    * The message that Amazon Lex V2 returns in the response can be either text or speech depending on the value of this parameter.    If the value is text/plain; charset=utf-8, Amazon Lex V2 returns text in the response.  
    */
  var responseContentType: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The identifier of the session that receives the session data.
    */
  var sessionId: SessionId
  
  /**
    * Sets the state of the session with the user. You can use this to set the current intent, attributes, context, and dialog action. Use the dialog action to determine the next step that Amazon Lex V2 should use in the conversation with the user.
    */
  var sessionState: SessionState
}
object PutSessionRequest {
  
  inline def apply(
    botAliasId: BotAliasIdentifier,
    botId: BotIdentifier,
    localeId: LocaleId,
    sessionId: SessionId,
    sessionState: SessionState
  ): PutSessionRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any], sessionState = sessionState.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasIdentifier): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setMessages(value: Messages): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: Message*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setRequestAttributes(value: StringMap): Self = StObject.set(x, "requestAttributes", value.asInstanceOf[js.Any])
    
    inline def setRequestAttributesUndefined: Self = StObject.set(x, "requestAttributes", js.undefined)
    
    inline def setResponseContentType(value: NonEmptyString): Self = StObject.set(x, "responseContentType", value.asInstanceOf[js.Any])
    
    inline def setResponseContentTypeUndefined: Self = StObject.set(x, "responseContentType", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionState(value: SessionState): Self = StObject.set(x, "sessionState", value.asInstanceOf[js.Any])
  }
}
