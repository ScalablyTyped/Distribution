package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchForFacetValuesQueryParams extends js.Object {
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
  implicit class SearchForFacetValuesQueryParamsOps[Self <: SearchForFacetValuesQueryParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFacetName(value: String): Self = this.set("facetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacetQuery(value: String): Self = this.set("facetQuery", value.asInstanceOf[js.Any])
  }
  
}

