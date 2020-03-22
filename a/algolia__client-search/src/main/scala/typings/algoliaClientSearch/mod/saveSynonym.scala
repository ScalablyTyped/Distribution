package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyWaitablePromiseSa3
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "saveSynonym")
@js.native
object saveSynonym extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* synonym */ Synonym, 
    /* requestOptions */ js.UndefOr[RequestOptions with SaveSynonymsOptions], 
    ReadonlyWaitablePromiseSa3
  ] = js.native
}

