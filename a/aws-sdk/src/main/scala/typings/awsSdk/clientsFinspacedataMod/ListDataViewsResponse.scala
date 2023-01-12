package typings.awsSdk.clientsFinspacedataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDataViewsResponse extends StObject {
  
  /**
    * A list of Dataviews.
    */
  var dataViews: js.UndefOr[DataViewList] = js.undefined
  
  /**
    * A token that indicates where a results page should begin.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}
object ListDataViewsResponse {
  
  inline def apply(): ListDataViewsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDataViewsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDataViewsResponse] (val x: Self) extends AnyVal {
    
    inline def setDataViews(value: DataViewList): Self = StObject.set(x, "dataViews", value.asInstanceOf[js.Any])
    
    inline def setDataViewsUndefined: Self = StObject.set(x, "dataViews", js.undefined)
    
    inline def setDataViewsVarargs(value: DataViewSummary*): Self = StObject.set(x, "dataViews", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
