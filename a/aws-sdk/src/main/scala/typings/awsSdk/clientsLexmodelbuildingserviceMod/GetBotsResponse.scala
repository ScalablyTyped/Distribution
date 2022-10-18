package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetBotsResponse extends StObject {
  
  /**
    * An array of botMetadata objects, with one entry for each bot. 
    */
  var bots: js.UndefOr[BotMetadataList] = js.undefined
  
  /**
    * If the response is truncated, it includes a pagination token that you can specify in your next request to fetch the next page of bots. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetBotsResponse {
  
  inline def apply(): GetBotsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBotsResponse]
  }
  
  extension [Self <: GetBotsResponse](x: Self) {
    
    inline def setBots(value: BotMetadataList): Self = StObject.set(x, "bots", value.asInstanceOf[js.Any])
    
    inline def setBotsUndefined: Self = StObject.set(x, "bots", js.undefined)
    
    inline def setBotsVarargs(value: BotMetadata*): Self = StObject.set(x, "bots", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
