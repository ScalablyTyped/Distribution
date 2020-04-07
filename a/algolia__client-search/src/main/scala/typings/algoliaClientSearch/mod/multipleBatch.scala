package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseMu
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "multipleBatch")
@js.native
object multipleBatch extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* requests */ js.Array[MultipleBatchRequest], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseMu
  ] = js.native
}

