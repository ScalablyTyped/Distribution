package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseSearchForF
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "searchForFacetValues")
@js.native
object searchForFacetValues extends js.Object {
  def apply(base: SearchIndex): js.Function3[
    /* facetName */ String, 
    /* facetQuery */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions with SearchOptions], 
    ReadonlyPromiseSearchForF
  ] = js.native
}

