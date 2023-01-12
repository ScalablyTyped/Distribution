package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSessionRequest extends StObject {
  
  /**
    * The alias identifier in use for the bot that contains the session data.
    */
  var botAliasId: BotAliasIdentifier
  
  /**
    * The identifier of the bot that contains the session data.
    */
  var botId: BotIdentifier
  
  /**
    * The locale where the session is in use.
    */
  var localeId: LocaleId
  
  /**
    * The identifier of the session to return.
    */
  var sessionId: SessionId
}
object GetSessionRequest {
  
  inline def apply(botAliasId: BotAliasIdentifier, botId: BotIdentifier, localeId: LocaleId, sessionId: SessionId): GetSessionRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any], localeId = localeId.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasIdentifier): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
  }
}
