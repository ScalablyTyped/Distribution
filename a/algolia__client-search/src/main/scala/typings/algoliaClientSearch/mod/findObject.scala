package typings.algoliaClientSearch.mod

import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "findObject")
@js.native
object findObject extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* callback */ js.Function1[/* object */ js.Any with ObjectWithObjectID, Boolean], 
    /* requestOptions */ js.UndefOr[FindObjectOptions with RequestOptions], 
    js.Promise[FindObjectResponse[_]]
  ] = js.native
}

