package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportsResponse extends StObject {
  
  /**
    * List export response items.
    */
  var items: js.UndefOr[ExportsList] = js.undefined
  
  /**
    * List export response next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExportsResponse {
  
  inline def apply(): ListExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ExportsList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ExportTask*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
