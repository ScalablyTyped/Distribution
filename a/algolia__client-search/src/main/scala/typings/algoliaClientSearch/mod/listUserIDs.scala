package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseListUserID
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "listUserIDs")
@js.native
object listUserIDs extends js.Object {
  def apply(base: SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[ListUserIDsOptions with RequestOptions], 
    ReadonlyPromiseListUserID
  ] = js.native
}

