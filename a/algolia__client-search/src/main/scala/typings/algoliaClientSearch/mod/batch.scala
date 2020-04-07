package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseBa
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "batch")
@js.native
object batch extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* requests */ js.Array[BatchRequest], 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseBa
  ] = js.native
}

