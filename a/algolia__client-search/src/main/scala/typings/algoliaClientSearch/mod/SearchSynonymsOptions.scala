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
  def apply(hitsPerPage: Int | Double = null, page: Int | Double = null, `type`: String = null): SearchSynonymsOptions = {
    val __obj = js.Dynamic.literal()
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymsOptions]
  }
}

