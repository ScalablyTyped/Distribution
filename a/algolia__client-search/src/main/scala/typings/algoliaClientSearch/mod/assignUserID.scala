package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUser
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "assignUserID")
@js.native
object assignUserID extends js.Object {
  def apply(base: SearchClient): js.Function3[
    /* userID */ String, 
    /* clusterName */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAssignUser
  ] = js.native
}

