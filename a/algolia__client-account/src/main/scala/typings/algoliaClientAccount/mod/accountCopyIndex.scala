package typings.algoliaClientAccount.mod

import typings.algoliaClientCommon.mod.WaitablePromise
import typings.algoliaClientSearch.mod.SearchIndex
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-account", "accountCopyIndex")
@js.native
object accountCopyIndex extends js.Object {
  def apply(source: SearchIndex, destination: SearchIndex): WaitablePromise[Unit] = js.native
  def apply(source: SearchIndex, destination: SearchIndex, requestOptions: RequestOptions): WaitablePromise[Unit] = js.native
}

