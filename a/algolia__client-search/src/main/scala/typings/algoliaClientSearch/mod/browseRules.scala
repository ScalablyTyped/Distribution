package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "browseRules")
@js.native
object browseRules extends js.Object {
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[SearchRulesOptions with BrowseOptions[Rule] with RequestOptions], 
    ReadonlyPromisevoid
  ] = js.native
}

