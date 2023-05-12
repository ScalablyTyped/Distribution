package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListExportErrorsResponse extends StObject {
  
  /**
    * List export errors response items.
    */
  var items: js.UndefOr[ExportErrors] = js.undefined
  
  /**
    * List export errors response next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListExportErrorsResponse {
  
  inline def apply(): ListExportErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListExportErrorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListExportErrorsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ExportErrors): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ExportTaskError*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
