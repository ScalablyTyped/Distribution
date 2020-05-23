package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchSynonymsOptions extends js.Object {
  /**
    * Number of hits per page.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Page to retrieve.
    */
  val page: js.UndefOr[Double] = js.undefined
  /**
    * The synonym type.
    */
  val `type`: js.UndefOr[String] = js.undefined
}

object SearchSynonymsOptions {
  @scala.inline
  def apply(
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    `type`: String = null
  ): SearchSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsOptions]
  }
}

