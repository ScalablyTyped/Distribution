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
    * When true, Amazon Lex doesn't check to see if another resource, such as an alias, is using the bot before it is deleted.
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
