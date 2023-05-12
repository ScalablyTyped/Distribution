package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotRequest extends StObject {
  
  /**
    * The identifier of the bot to delete. 
    */
  var botId: Id
  
  /**
    * By default, Amazon Lex checks if any other resource, such as an alias or bot network, is using the bot version before it is deleted and throws a ResourceInUseException exception if the bot is being used by another resource. Set this parameter to true to skip this check and remove the bot even if it is being used by another resource.
    */
  var skipResourceInUseCheck: js.UndefOr[SkipResourceInUseCheck] = js.undefined
}
object DeleteBotRequest {
  
  inline def apply(botId: Id): DeleteBotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBotRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteBotRequest] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheck(value: SkipResourceInUseCheck): Self = StObject.set(x, "skipResourceInUseCheck", value.asInstanceOf[js.Any])
    
    inline def setSkipResourceInUseCheckUndefined: Self = StObject.set(x, "skipResourceInUseCheck", js.undefined)
  }
}
