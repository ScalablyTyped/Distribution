package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseUp
import typings.algoliaTransporter.mod.RequestOptions
import typings.std.Pick
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@algolia/client-search", "updateApiKey")
@js.native
object updateApiKey extends js.Object {
  
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[UpdateApiKeyOptions with (Pick[RequestOptions, String | Double])], 
    ReadonlyWaitablePromiseUp
  ] = js.native
}
