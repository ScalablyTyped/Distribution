package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBotVersionResponse extends StObject {
  
  /**
    * The identifier of the bot that is being deleted.
    */
  var botId: js.UndefOr[Id] = js.undefined
  
  /**
    * The current status of the bot. 
    */
  var botStatus: js.UndefOr[BotStatus] = js.undefined
  
  /**
    * The version of the bot that is being deleted.
    */
  var botVersion: js.UndefOr[NumericalBotVersion] = js.undefined
}
object DeleteBotVersionResponse {
  
  inline def apply(): DeleteBotVersionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBotVersionResponse]
  }
  
  extension [Self <: DeleteBotVersionResponse](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
    
    inline def setBotIdUndefined: Self = StObject.set(x, "botId", js.undefined)
    
    inline def setBotStatus(value: BotStatus): Self = StObject.set(x, "botStatus", value.asInstanceOf[js.Any])
    
    inline def setBotStatusUndefined: Self = StObject.set(x, "botStatus", js.undefined)
    
    inline def setBotVersion(value: NumericalBotVersion): Self = StObject.set(x, "botVersion", value.asInstanceOf[js.Any])
    
    inline def setBotVersionUndefined: Self = StObject.set(x, "botVersion", js.undefined)
  }
}
