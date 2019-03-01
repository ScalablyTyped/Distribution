package typings
package algoliasearchLib.algoliasearchMod.algoliasearchNs

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
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  var hitsPerPage: js.UndefOr[scala.Double] = js.undefined
  /**
    * The page to fetch when browsing through several pages of results
    * default: 0
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  var page: js.UndefOr[scala.Double] = js.undefined
  /**
    * The actual search query to find synonyms
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  var query: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Restrict the search to a specific type of synonym
    * Use an empty string to search all types (default behavior)
    * https://github.com/algolia/algoliasearch-client-js#search-synonyms---searchsynonyms
    */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
}

object SearchSynonymOptions {
  @scala.inline
  def apply(
    hitsPerPage: scala.Int | scala.Double = null,
    page: scala.Int | scala.Double = null,
    query: java.lang.String = null,
    `type`: java.lang.String = null
  ): SearchSynonymOptions = {
    val __obj = js.Dynamic.literal()
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[SearchSynonymOptions]
  }
}

