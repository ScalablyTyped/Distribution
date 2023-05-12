package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentBotNetwork extends StObject {
  
  /**
    * The identifier of the network of bots assigned by Amazon Lex.
    */
  var botId: Id
  
  /**
    * The version of the network of bots.
    */
  var botVersion: BotVersion
}
object ParentBotNetwork {
  
  inline def apply(botId: Id, botVersion: BotVersion): ParentBotNetwork = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any], botVersion = botVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentBotNetwork]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParentBotNetwork] (val x: Self) extends AnyVal {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotVersion(value: BotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
  }
}
