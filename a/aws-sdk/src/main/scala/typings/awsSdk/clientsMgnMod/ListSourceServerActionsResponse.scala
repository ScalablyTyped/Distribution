package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSourceServerActionsResponse extends StObject {
  
  /**
    * List of source server post migration custom actions.
    */
  var items: js.UndefOr[SourceServerActionDocuments] = js.undefined
  
  /**
    * Next token returned when listing source server post migration custom actions.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListSourceServerActionsResponse {
  
  inline def apply(): ListSourceServerActionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSourceServerActionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListSourceServerActionsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: SourceServerActionDocuments): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: SourceServerActionDocument*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
