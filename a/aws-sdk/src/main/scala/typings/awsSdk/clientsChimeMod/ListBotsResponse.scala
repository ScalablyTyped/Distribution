package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBotsResponse extends StObject {
  
  /**
    * List of bots and bot details.
    */
  var Bots: js.UndefOr[BotList] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object ListBotsResponse {
  
  inline def apply(): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBotsResponse]
  }
  
  extension [Self <: ListBotsResponse](x: Self) {
    
    inline def setBots(value: BotList): Self = StObject.set(x, "Bots", value.asInstanceOf[js.Any])
    
    inline def setBotsUndefined: Self = StObject.set(x, "Bots", js.undefined)
    
    inline def setBotsVarargs(value: Bot*): Self = StObject.set(x, "Bots", js.Array(value*))
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
