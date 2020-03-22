package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseChFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "chunkedBatch")
@js.native
object chunkedBatch extends js.Object {
  def apply(base: SearchIndex): js.Function3[
    /* bodies */ js.Array[js.Object], 
    /* action */ BatchActionType, 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions], 
    ReadonlyWaitablePromiseChFinally
  ] = js.native
}

