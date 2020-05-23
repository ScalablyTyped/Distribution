package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseHasPending
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "hasPendingMappings")
@js.native
object hasPendingMappings extends js.Object {
  def apply(base: SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[HasPendingMappingsOptions with RequestOptions], 
    ReadonlyPromiseHasPending
  ] = js.native
}

