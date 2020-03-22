package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseDeFinally
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "clearRules")
@js.native
object clearRules extends js.Object {
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[RequestOptions with ClearRulesOptions], 
    ReadonlyWaitablePromiseDeFinally
  ] = js.native
}

