package typings.algoliaClientSearch.anon

import typings.algoliaClientSearch.mod.SearchForFacetValuesQueryParams
import typings.algoliaClientSearch.mod.SearchOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexName extends js.Object {
  val indexName: String
  val params: SearchForFacetValuesQueryParams with SearchOptions
}

object IndexName {
  @scala.inline
  def apply(indexName: String, params: SearchForFacetValuesQueryParams with SearchOptions): IndexName = {
    val __obj = js.Dynamic.literal(indexName = indexName.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexName]
  }
}

