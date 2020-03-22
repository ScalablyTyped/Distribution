package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseUpFinally
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "updateApiKey")
@js.native
object updateApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[UpdateApiKeyOptions with (Pick[RequestOptions, String | Double])], 
    ReadonlyWaitablePromiseUpFinally
  ] = js.native
}

