package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseAdFinally
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "addApiKey")
@js.native
object addApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* acl */ js.Array[String], 
    /* requestOptions */ js.UndefOr[AddApiKeyOptions with (Pick[RequestOptions, String | Double])], 
    ReadonlyWaitablePromiseAdFinally
  ] = js.native
}

