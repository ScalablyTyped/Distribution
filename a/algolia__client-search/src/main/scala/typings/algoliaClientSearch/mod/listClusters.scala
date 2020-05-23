package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseListCluste
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "listClusters")
@js.native
object listClusters extends js.Object {
  def apply(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListCluste] = js.native
}

