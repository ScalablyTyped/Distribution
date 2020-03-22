package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseSynonym
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getSynonym")
@js.native
object getSynonym extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* objectID */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseSynonym
  ] = js.native
}

