package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateBotResponse extends StObject {
  
  /**
    * The updated bot details.
    */
  var Bot: js.UndefOr[typings.awsSdk.chimeMod.Bot] = js.undefined
}
object UpdateBotResponse {
  
  inline def apply(): UpdateBotResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateBotResponse]
  }
  
  extension [Self <: UpdateBotResponse](x: Self) {
    
    inline def setBot(value: Bot): Self = StObject.set(x, "Bot", value.asInstanceOf[js.Any])
    
    inline def setBotUndefined: Self = StObject.set(x, "Bot", js.undefined)
  }
}
