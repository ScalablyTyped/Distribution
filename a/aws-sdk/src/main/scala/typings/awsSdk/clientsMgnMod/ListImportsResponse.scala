package typings.awsSdk.clientsMgnMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsResponse extends StObject {
  
  /**
    * List import response items.
    */
  var items: js.UndefOr[ImportList] = js.undefined
  
  /**
    * List import response next token.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportsResponse {
  
  inline def apply(): ListImportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ImportList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: ImportTask*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
