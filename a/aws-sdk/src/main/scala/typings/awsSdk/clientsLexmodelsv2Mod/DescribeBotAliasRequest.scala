package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotAliasRequest extends StObject {
  
  /**
    * The identifier of the bot alias to describe.
    */
  var botAliasId: BotAliasId
  
  /**
    * The identifier of the bot associated with the bot alias to describe.
    */
  var botId: Id
}
object DescribeBotAliasRequest {
  
  inline def apply(botAliasId: BotAliasId, botId: Id): DescribeBotAliasRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBotAliasRequest]
  }
  
  extension [Self <: DescribeBotAliasRequest](x: Self) {
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
  }
}
