package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseInFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "copySettings")
@js.native
object copySettings extends js.Object {
  def apply(base: SearchClient): js.Function3[
    /* from */ String, 
    /* to */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseInFinally
  ] = js.native
}

