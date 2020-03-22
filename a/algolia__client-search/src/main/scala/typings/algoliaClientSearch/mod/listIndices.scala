package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseListIndice
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "listIndices")
@js.native
object listIndices extends js.Object {
  def apply(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListIndice] = js.native
}

