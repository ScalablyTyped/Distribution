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
  def apply(cluster: String = null, hitsPerPage: Int | Double = null, page: Int | Double = null): SearchUserIDsOptions = {
    val __obj = js.Dynamic.literal()
    if (cluster != null) __obj.updateDynamic("cluster")(cluster.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchUserIDsOptions]
  }
}

