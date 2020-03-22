package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserIDsOptions extends js.Object {
  /**
    * Number of users to retrieve per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.undefined
}

object ListUserIDsOptions {
  @scala.inline
  def apply(hitsPerPage: Int | Double = null, page: Int | Double = null): ListUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserIDsOptions]
  }
}

