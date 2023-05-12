package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRunsResponse extends StObject {
  
  /**
    * A list of runs.
    */
  var items: js.UndefOr[RunList] = js.undefined
  
  /**
    * A pagination token that's included if more results are available.
    */
  var nextToken: js.UndefOr[RunListToken] = js.undefined
}
object ListRunsResponse {
  
  inline def apply(): ListRunsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRunsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRunsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: RunList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: RunListItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: RunListToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
