package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSessionResponse extends StObject {
  
  /**
    * The alias identifier in use for the bot that contained the session data.
    */
  var botAliasId: js.UndefOr[BotAliasIdentifier] = js.undefined
  
  /**
    * The identifier of the bot that contained the session data.
    */
  var botId: js.UndefOr[BotIdentifier] = js.undefined
  
  /**
    * The locale where the session was used.
    */
  var localeId: js.UndefOr[LocaleId] = js.undefined
  
  /**
    * The identifier of the deleted session.
    */
  var sessionId: js.UndefOr[SessionId] = js.undefined
}
object DeleteSessionResponse {
  
  inline def apply(): DeleteSessionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasIdentifier): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotAliasIdUndefined: Self = StObject.set(x, "botAliasId", js.undefined)
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setLocaleId(value: LocaleId): Self = StObject.set(x, "localeId", value.asInstanceOf[js.Any])
    
    inline def setLocaleIdUndefined: Self = StObject.set(x, "localeId", js.undefined)
    
    inline def setSessionId(value: SessionId): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    
    inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
  }
}
