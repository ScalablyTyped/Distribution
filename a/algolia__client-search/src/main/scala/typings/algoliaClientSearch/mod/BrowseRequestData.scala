package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrowseRequestData extends js.Object {
  /**
    * If available, should be used for browsing to the next page.
    */
  val cursor: js.UndefOr[String] = js.undefined
  /**
    * If cursor is not available, should be used for browsing to the next page.
    */
  val page: js.UndefOr[Double] = js.undefined
}

object BrowseRequestData {
  @scala.inline
  def apply(cursor: String = null, page: js.UndefOr[Double] = js.undefined): BrowseRequestData = {
    val __obj = js.Dynamic.literal()
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrowseRequestData]
  }
}

