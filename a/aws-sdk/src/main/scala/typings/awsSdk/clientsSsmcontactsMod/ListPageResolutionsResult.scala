package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListPageResolutionsResult extends StObject {
  
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the resolution for an engagement.
    */
  var PageResolutions: ResolutionList
}
object ListPageResolutionsResult {
  
  inline def apply(PageResolutions: ResolutionList): ListPageResolutionsResult = {
    val __obj = js.Dynamic.literal(PageResolutions = PageResolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPageResolutionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListPageResolutionsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPageResolutions(value: ResolutionList): Self = StObject.set(x, "PageResolutions", value.asInstanceOf[js.Any])
    
    inline def setPageResolutionsVarargs(value: ResolutionContact*): Self = StObject.set(x, "PageResolutions", js.Array(value*))
  }
}
