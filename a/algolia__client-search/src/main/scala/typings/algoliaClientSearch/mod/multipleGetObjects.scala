package typings.algoliaClientSearch.mod

import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "multipleGetObjects")
@js.native
object multipleGetObjects extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* requests */ js.Array[MultipleGetObject], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    js.Promise[MultipleGetObjectsResponse[_]]
  ] = js.native
}

