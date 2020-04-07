package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseDeCatch
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "deleteApiKey")
@js.native
object deleteApiKey extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* apiKey */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseDeCatch
  ] = js.native
}

