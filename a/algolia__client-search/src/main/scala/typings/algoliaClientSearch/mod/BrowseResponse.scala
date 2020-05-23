package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseResponse[TObject] extends js.Object {
  /**
    * The cursor used for iterate on the next page.
    */
  var cursor: js.UndefOr[String] = js.undefined
  /**
    * The hits per page.
    */
  var hits: js.Array[TObject with ObjectWithObjectID]
}

object BrowseResponse {
  @scala.inline
  def apply[TObject](hits: js.Array[TObject with ObjectWithObjectID], cursor: String = null): BrowseResponse[TObject] = {
    val __obj = js.Dynamic.literal(hits = hits.asInstanceOf[js.Any])
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseResponse[TObject]]
  }
}

