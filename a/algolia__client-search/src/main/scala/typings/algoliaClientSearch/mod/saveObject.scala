package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseSaFinally
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveObject")
@js.native
object saveObject extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* object */ Record[String, _], 
    /* requestOptions */ js.UndefOr[RequestOptions with ChunkOptions with SaveObjectsOptions], 
    ReadonlyWaitablePromiseSaFinally
  ] = js.native
}

