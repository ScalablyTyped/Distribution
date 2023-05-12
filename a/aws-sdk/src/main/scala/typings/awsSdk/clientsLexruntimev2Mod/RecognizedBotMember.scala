package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecognizedBotMember extends StObject {
  
  /**
    * The identifier of the bot member that processes the request.
    */
  var botId: BotIdentifier
  
  /**
    * The name of the bot member that processes the request.
    */
  var botName: js.UndefOr[Name] = js.undefined
}
object RecognizedBotMember {
  
  inline def apply(botId: BotIdentifier): RecognizedBotMember = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecognizedBotMember]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RecognizedBotMember] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: BotIdentifier): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotName(value: Name): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setBotNameUndefined: Self = StObject.set(x, "botName", js.undefined)
  }
}
