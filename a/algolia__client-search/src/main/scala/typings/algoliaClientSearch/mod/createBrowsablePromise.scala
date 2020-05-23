package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.anon.ReadonlyPromisevoid
import typings.algoliaClientSearch.anon.Request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "createBrowsablePromise")
@js.native
object createBrowsablePromise extends js.Object {
  def apply[TObject](options: Request[TObject] with BrowseOptions[TObject]): ReadonlyPromisevoid = js.native
}

