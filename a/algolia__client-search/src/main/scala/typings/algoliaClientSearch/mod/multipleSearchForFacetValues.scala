package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.IndexName
import typings.algoliaClientSearch.anon.ReadonlyPromiseArraySearc
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "multipleSearchForFacetValues")
@js.native
object multipleSearchForFacetValues extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* queries */ js.Array[IndexName], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseArraySearc
  ] = js.native
}

