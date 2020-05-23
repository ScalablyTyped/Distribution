package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseAssignUserCatch
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "assignUserIDs")
@js.native
object assignUserIDs extends js.Object {
  def apply(base: SearchClient): js.Function3[
    /* userIDs */ js.Array[String], 
    /* clusterName */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseAssignUserCatch
  ] = js.native
}

