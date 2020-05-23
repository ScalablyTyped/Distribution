package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseSettings
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getSettings")
@js.native
object getSettings extends js.Object {
  def apply(base: SearchIndex): js.Function1[/* requestOptions */ js.UndefOr[RequestOptions], ReadonlyPromiseSettings] = js.native
}

