package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchRulesOptions extends js.Object {
  /**
    * When specified, restricts matches to rules with a specific anchoring type. When omitted, all anchoring types may match.
    */
  val anchoring: js.UndefOr[String] = js.undefined
  /**
    * Restricts matches to contextual rules with a specific context (exact match).
    */
  val context: js.UndefOr[String] = js.undefined
  /**
    * When specified, restricts matches to rules with a specific enabled status.
    * When absent (default), all rules are retrieved, regardless of their enabled status.
    */
  val enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Maximum number of hits in a page. Minimum is 1, maximum is 1000.
    */
  val hitsPerPage: js.UndefOr[Double] = js.undefined
  /**
    * Requested page (zero-based).
    */
  val page: js.UndefOr[Double] = js.undefined
  /**
    * Full text query.
    */
  val query: js.UndefOr[String] = js.undefined
}

object SearchRulesOptions {
  @scala.inline
  def apply(
    anchoring: String = null,
    context: String = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    hitsPerPage: Int | Double = null,
    page: Int | Double = null,
    query: String = null
  ): SearchRulesOptions = {
    val __obj = js.Dynamic.literal()
    if (anchoring != null) __obj.updateDynamic("anchoring")(anchoring.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (hitsPerPage != null) __obj.updateDynamic("hitsPerPage")(hitsPerPage.asInstanceOf[js.Any])
    if (page != null) __obj.updateDynamic("page")(page.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchRulesOptions]
  }
}

