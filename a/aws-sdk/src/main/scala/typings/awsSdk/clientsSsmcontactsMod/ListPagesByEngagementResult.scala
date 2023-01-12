package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPagesByEngagementResult extends StObject {
  
  /**
    * The pagination token to continue to the next page of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The list of engagements to contact channels.
    */
  var Pages: PagesList
}
object ListPagesByEngagementResult {
  
  inline def apply(Pages: PagesList): ListPagesByEngagementResult = {
    val __obj = js.Dynamic.literal(Pages = Pages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPagesByEngagementResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPagesByEngagementResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPages(value: PagesList): Self = StObject.set(x, "Pages", value.asInstanceOf[js.Any])
    
    inline def setPagesVarargs(value: Page*): Self = StObject.set(x, "Pages", js.Array(value*))
  }
}
