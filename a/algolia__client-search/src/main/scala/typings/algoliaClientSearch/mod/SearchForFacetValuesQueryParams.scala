package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchForFacetValuesQueryParams extends js.Object {
  /**
    * The facet name.
    */
  val facetName: String
  /**
    * The facet query.
    */
  val facetQuery: String
}

object SearchForFacetValuesQueryParams {
  @scala.inline
  def apply(facetName: String, facetQuery: String): SearchForFacetValuesQueryParams = {
    val __obj = js.Dynamic.literal(facetName = facetName.asInstanceOf[js.Any], facetQuery = facetQuery.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchForFacetValuesQueryParams]
  }
}

