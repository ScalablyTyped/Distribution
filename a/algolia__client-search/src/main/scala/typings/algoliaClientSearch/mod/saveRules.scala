package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseSaFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveRules")
@js.native
object saveRules extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* rules */ js.Array[Rule], 
    /* requestOptions */ js.UndefOr[RequestOptions with SaveRulesOptions], 
    ReadonlyWaitablePromiseSaFinally
  ] = js.native
}

