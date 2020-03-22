package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseRule
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getRule")
@js.native
object getRule extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* objectID */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseRule
  ] = js.native
}

