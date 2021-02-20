package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchForFacetValuesQueryParams extends StObject {
  
  /**
    * The facet name.
    */
  val facetName: String = js.native
  
  /**
    * The facet query.
    */
  val facetQuery: String = js.native
}
object SearchForFacetValuesQueryParams {
  
  @scala.inline
  def apply(facetName: String, facetQuery: String): SearchForFacetValuesQueryParams = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], facetQuery = facetQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesQueryParams]
  }
  
  @scala.inline
  implicit class SearchForFacetValuesQueryParamsMutableBuilder[Self <: SearchForFacetValuesQueryParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacetName(value: String): Self = StObject.set(x, "facetName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacetQuery(value: String): Self = StObject.set(x, "facetQuery", value.asInstanceOf[js.Any])
  }
}
