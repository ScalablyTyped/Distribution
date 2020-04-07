package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseDe
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "clearSynonyms")
@js.native
object clearSynonyms extends js.Object {
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[ClearSynonymsOptions with RequestOptions], 
    ReadonlyWaitablePromiseDe
  ] = js.native
}

