package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseSe
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "setSettings")
@js.native
object setSettings extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* settings */ Settings, 
    /* requestOptions */ js.UndefOr[RequestOptions with SetSettingsOptions], 
    ReadonlyWaitablePromiseSe
  ] = js.native
}

