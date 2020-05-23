package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchUserIDsOptions extends js.Object {
  /**
    * If specified, only clusters assigned to this cluster can be returned.
    * */
  val cluster: js.UndefOr[String] = js.undefined
  /**
    * Number of users to return by page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Page to fetch.
    */
  val page: js.UndefOr[Double] = js.undefined
}

object SearchUserIDsOptions {
  @scala.inline
  def apply(
    cluster: String = null,
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined
  ): SearchUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserIDsOptions]
  }
}

