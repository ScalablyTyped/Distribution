package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseGetApiKeyR
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getApiKey")
@js.native
object getApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseGetApiKeyR
  ] = js.native
}

