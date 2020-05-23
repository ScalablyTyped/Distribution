package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes options used when searching for synonyms
  */
trait SearchSynonymOptions extends js.Object {
  /**
    * Number of hits per page
    * default: 100
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * The page to fetch when browsing through several pages of results
    * default: 0
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The actual search query to find synonyms
    */
  var query: js.UndefOr[String] = js.undefined
  /**
    * Restrict the search to a specific type of synonym
    * Use an empty string to search all types (default behavior)
    */
  var `type`: js.UndefOr[String] = js.undefined
}

object SearchSynonymOptions {
  @scala.inline
  def apply(
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    query: String = null,
    `type`: String = null
  ): SearchSynonymOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSynonymOptions]
  }
}

