package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportErrorsResponse extends StObject {
  
  /**
    * List imports errors response items.
    */
  var items: js.UndefOr[ImportErrors] = js.undefined
  
  /**
    * List imports errors response next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportErrorsResponse {
  
  inline def apply(): ListImportErrorsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportErrorsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportErrorsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ImportErrors): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ImportTaskError*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
