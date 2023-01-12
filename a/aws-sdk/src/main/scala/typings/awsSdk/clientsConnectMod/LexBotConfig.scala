package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LexBotConfig extends StObject {
  
  var LexBot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexBot] = js.undefined
  
  /**
    * Configuration information of an Amazon Lex V2 bot.
    */
  var LexV2Bot: js.UndefOr[typings.awsSdk.clientsConnectMod.LexV2Bot] = js.undefined
}
object LexBotConfig {
  
  inline def apply(): LexBotConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LexBotConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LexBotConfig] (val x: Self) extends AnyVal {
    
    inline def setLexBot(value: LexBot): Self = StObject.set(x, "LexBot", value.asInstanceOf[js.Any])
    
    inline def setLexBotUndefined: Self = StObject.set(x, "LexBot", js.undefined)
    
    inline def setLexV2Bot(value: LexV2Bot): Self = StObject.set(x, "LexV2Bot", value.asInstanceOf[js.Any])
    
    inline def setLexV2BotUndefined: Self = StObject.set(x, "LexV2Bot", js.undefined)
  }
}
