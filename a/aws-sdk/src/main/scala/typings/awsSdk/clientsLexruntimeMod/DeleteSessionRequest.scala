package typings.awsSdk.clientsLexruntimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSessionRequest extends StObject {
  
  /**
    * The alias in use for the bot that contains the session data.
    */
  var botAlias: BotAlias
  
  /**
    * The name of the bot that contains the session data.
    */
  var botName: BotName
  
  /**
    * The identifier of the user associated with the session data.
    */
  var userId: UserId
}
object DeleteSessionRequest {
  
  inline def apply(botAlias: BotAlias, botName: BotName, userId: UserId): DeleteSessionRequest = {
    val __obj = js.Dynamic.literal(botAlias = botAlias.asInstanceOf[js.Any], botName = botName.asInstanceOf[js.Any], userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setBotAlias(value: BotAlias): Self = StObject.set(x, "botAlias", value.asInstanceOf[js.Any])
    
    inline def setBotName(value: BotName): Self = StObject.set(x, "botName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
  }
}
