package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveObjects")
@js.native
object saveObjects extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* objects */ js.Array[Record[String, _]], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions with SaveObjectsOptions], 
    ReadonlyWaitablePromiseCh
  ] = js.native
}

