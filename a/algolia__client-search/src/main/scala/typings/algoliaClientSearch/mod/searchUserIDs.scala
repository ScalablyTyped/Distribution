package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseSearchUser
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "searchUserIDs")
@js.native
object searchUserIDs extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[SearchUserIDsOptions with RequestOptions], 
    ReadonlyPromiseSearchUser
  ] = js.native
}

