package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListWavesResponse extends StObject {
  
  /**
    * Waves list.
    */
  var items: js.UndefOr[WavesList] = js.undefined
  
  /**
    * Response next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListWavesResponse {
  
  inline def apply(): ListWavesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListWavesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListWavesResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: WavesList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: Wave*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
