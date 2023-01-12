package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListImportsResponse extends StObject {
  
  /**
    *  The list of returned imports. 
    */
  var Imports: js.UndefOr[ImportsList] = js.undefined
  
  /**
    *  A token you can use to get the next page of import results. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListImportsResponse {
  
  inline def apply(): ListImportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListImportsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListImportsResponse] (val x: Self) extends AnyVal {
    
    inline def setImports(value: ImportsList): Self = StObject.set(x, "Imports", value.asInstanceOf[js.Any])
    
    inline def setImportsUndefined: Self = StObject.set(x, "Imports", js.undefined)
    
    inline def setImportsVarargs(value: ImportsListItem*): Self = StObject.set(x, "Imports", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
