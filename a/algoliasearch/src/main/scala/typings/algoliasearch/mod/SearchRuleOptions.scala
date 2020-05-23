package typings.algoliasearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Describes options used when searching for query rules
  */
trait SearchRuleOptions extends js.Object {
  /**
    * When specified, restricts matches to rules with a specific anchoring type.
    * When omitted, all anchoring types may match.
    */
  var anchoring: js.UndefOr[String] = js.undefined
  /**
    * When specified, restricts matches to contextual rules with a specific context (exact match).
    * When omitted, any generic or contextual rule (with any context) may match.
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Number of hits per page
    * default: 20
    */
  var hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Requested page (zero-based)
    * default: 0
    */
  var page: js.UndefOr[Double] = js.undefined
  /**
    * The actual search query to find synonyms
    */
  var query: js.UndefOr[String] = js.undefined
}

object SearchRuleOptions {
  @scala.inline
  def apply(
    anchoring: String = null,
    context: String = null,
    hitsPerPage: js.UndefOr[Double] = js.undefined,
    page: js.UndefOr[Double] = js.undefined,
    query: String = null
  ): SearchRuleOptions = {
    val __obj = js.Dynamic.literal()
    if (anchoring != null) __obj.updateDynamic("anchoring")(anchoring.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(hitsPerPage)) __obj.updateDynamic("hitsPerPage")(hitsPerPage.get.asInstanceOf[js.Any])
    if (!js.isUndefined(page)) __obj.updateDynamic("page")(page.get.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRuleOptions]
  }
}

