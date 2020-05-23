package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyWaitablePromiseDe
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "deleteBy")
@js.native
object deleteBy extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* filters */ DeleteByFiltersOptions, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyWaitablePromiseDe
  ] = js.native
}

