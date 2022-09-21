package typings.algoliasearchHelper.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SortBy extends StObject {
  
  var facetOrdering: js.UndefOr[Boolean] = js.undefined
  
  var sortBy: js.UndefOr[Any] = js.undefined
}
object SortBy {
  
  inline def apply(): SortBy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SortBy]
  }
  
  extension [Self <: SortBy](x: Self) {
    
    inline def setFacetOrdering(value: Boolean): Self = StObject.set(x, "facetOrdering", value.asInstanceOf[js.Any])
    
    inline def setFacetOrderingUndefined: Self = StObject.set(x, "facetOrdering", js.undefined)
    
    inline def setSortBy(value: Any): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
  }
}
