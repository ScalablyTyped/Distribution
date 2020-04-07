package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseSaThen
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveRule")
@js.native
object saveRule extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* rule */ Rule, 
    /* requestOptions */ js.UndefOr[RequestOptions with SaveRulesOptions], 
    ReadonlyWaitablePromiseSaThen
  ] = js.native
}

