package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseChFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "deleteObjects")
@js.native
object deleteObjects extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* objectIDs */ js.Array[String], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions], 
    ReadonlyWaitablePromiseChFinally
  ] = js.native
}

