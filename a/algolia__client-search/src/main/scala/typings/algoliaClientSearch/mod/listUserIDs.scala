package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromiseListUserID
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "listUserIDs")
@js.native
object listUserIDs extends js.Object {
  
  def apply(base: SearchClient): js.Function1[
    /* requestOptions */ js.UndefOr[ListUserIDsOptions with RequestOptions], 
    ReadonlyPromiseListUserID
  ] = js.native
}
