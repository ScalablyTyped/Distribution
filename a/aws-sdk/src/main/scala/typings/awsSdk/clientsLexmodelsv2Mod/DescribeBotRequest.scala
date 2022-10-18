package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeBotRequest extends StObject {
  
  /**
    * The unique identifier of the bot to describe.
    */
  var botId: Id
}
object DescribeBotRequest {
  
  inline def apply(botId: Id): DescribeBotRequest = {
    val __obj = js.Dynamic.literal(botId = botId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeBotRequest]
  }
  
  extension [Self <: DescribeBotRequest](x: Self) {
    
    inline def setBotId(value: Id): Self = StObject.set(x, "botId", value.asInstanceOf[js.Any])
  }
}
