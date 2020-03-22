package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseSearchResp
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "searchRules")
@js.native
object searchRules extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* query */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions with SearchRulesOptions], 
    ReadonlyPromiseSearchResp
  ] = js.native
}

