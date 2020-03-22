package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseListApiKey
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "listApiKeys")
@js.native
object listApiKeys extends js.Object {
  def apply(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseListApiKey] = js.native
}

