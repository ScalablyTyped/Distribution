package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseSearchSyno
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "searchSynonyms")
@js.native
object searchSynonyms extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[SearchSynonymsOptions with RequestOptions], 
    ReadonlyPromiseSearchSyno
  ] = js.native
}

