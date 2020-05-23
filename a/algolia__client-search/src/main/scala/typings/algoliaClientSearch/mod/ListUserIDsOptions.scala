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
  def apply(hitsPerPage: js.UndefOr[Double] = js.undefined, page: js.UndefOr[Double] = js.undefined): ListUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListUserIDsOptions]
  }
}

