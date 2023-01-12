package typings.awsSdk.clientsLexmodelbuildingserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetIntentsResponse extends StObject {
  
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.undefined
  
  /**
    * If the response is truncated, the response includes a pagination token that you can specify in your next request to fetch the next page of intents. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object GetIntentsResponse {
  
  inline def apply(): GetIntentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetIntentsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetIntentsResponse] (val x: Self) extends AnyVal {
    
    inline def setIntents(value: IntentMetadataList): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setIntentsVarargs(value: IntentMetadata*): Self = StObject.set(x, "intents", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
