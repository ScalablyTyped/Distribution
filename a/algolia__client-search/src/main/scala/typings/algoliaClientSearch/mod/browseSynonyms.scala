package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "browseSynonyms")
@js.native
object browseSynonyms extends js.Object {
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[SearchSynonymsOptions with BrowseOptions[Synonym] with RequestOptions], 
    ReadonlyPromisevoid
  ] = js.native
}

