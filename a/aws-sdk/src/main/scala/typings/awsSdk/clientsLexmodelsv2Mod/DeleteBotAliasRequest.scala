package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotAliasRequest extends StObject {
  
  /**
    * The unique identifier of the bot alias to delete.
    */
  var botAliasId: BotAliasId
  
  /**
    * The unique identifier of the bot associated with the alias to delete.
    */
  var botId: Id
  
  /**
    * By default, Amazon Lex checks if any other resource, such as a bot network, is using the bot alias before it is deleted and throws a ResourceInUseException exception if the alias is being used by another resource. Set this parameter to true to skip this check and remove the alias even if it is being used by another resource.
    */
  var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
}
object DeleteBotAliasRequest {
  
  inline def apply(botAliasId: BotAliasId, botId: Id): DeleteBotAliasRequest = {
    val __obj = js.Dynamic.literal(botAliasId = botAliasId.asInstanceOf[js.Any], botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotAliasRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBotAliasRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAliasId(value: BotAliasId): Self = StObject.set(x, "botAliasId", value.asInstanceOf[js.Any])
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheck(value: SkipResourceInUseCheck): Self = StObject.set(x, "skipResourceInUseCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheckUndefined: Self = StObject.set(x, "skipResourceInUseCheck", js.undefined)
  }
}
