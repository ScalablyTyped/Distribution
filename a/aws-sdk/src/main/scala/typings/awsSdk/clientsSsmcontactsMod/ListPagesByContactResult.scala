package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPagesByContactResult extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of engagements to a contact's contact channel.
    */
  var Pages: PagesList
}
object ListPagesByContactResult {
  
  inline def apply(Pages: PagesList): ListPagesByContactResult = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPagesByContactResult]
  }
  
  extension [Self <: ListPagesByContactResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPages(value: PagesList): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "Pages", js.Array(value*))
  }
}
