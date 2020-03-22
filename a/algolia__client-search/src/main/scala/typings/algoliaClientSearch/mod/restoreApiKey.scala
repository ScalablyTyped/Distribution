package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseReFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "restoreApiKey")
@js.native
object restoreApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseReFinally
  ] = js.native
}

