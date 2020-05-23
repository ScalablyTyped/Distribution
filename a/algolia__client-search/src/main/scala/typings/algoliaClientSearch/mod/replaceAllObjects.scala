package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseCh
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "replaceAllObjects")
@js.native
object replaceAllObjects extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* objects */ js.Array[Record[String, _]], 
    /* requestOptions */ js.UndefOr[
      ReplaceAllObjectsOptions with ChunkOptions with SaveObjectsOptions with RequestOptions
    ], 
    ReadonlyWaitablePromiseCh
  ] = js.native
}

