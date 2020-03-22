package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseRemoveUser
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "removeUserID")
@js.native
object removeUserID extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* userID */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseRemoveUser
  ] = js.native
}

