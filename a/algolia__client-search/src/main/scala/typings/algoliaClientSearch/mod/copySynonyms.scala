package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseIn
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "copySynonyms")
@js.native
object copySynonyms extends js.Object {
  def apply(base: SearchClient): js.Function3[
    /* from */ String, 
    /* to */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseIn
  ] = js.native
}

