package typings.algoliasearch.algoliasearchMod

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
    hitsPerPage: Int | Double = null,
    page: Int | Double = null,
    query: String = null,
    `type`: String = null
  ): SearchSynonymOptions = {
    val __obj = js.Dynamic.literal()
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchSynonymOptions]
  }
}

