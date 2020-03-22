package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseGetLogsRes
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getLogs")
@js.native
object getLogs extends js.Object {
  def apply(base: SearchClient): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseGetLogsRes] = js.native
}

