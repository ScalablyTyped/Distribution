package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.algoliaClientSearchStrings.contains
import typings.algoliaClientSearch.algoliaClientSearchStrings.endsWith
import typings.algoliaClientSearch.algoliaClientSearchStrings.is
import typings.algoliaClientSearch.algoliaClientSearchStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Condition extends js.Object {
  /**
    * If set to true, alternatives make the rule to trigger on synonyms, typos and plurals.
    * Note that setting ignorePlurals to false overrides this parameter.
    */
  val alternatives: js.UndefOr[Boolean] = js.undefined
  /** { is | startsWith | endsWith | contains }: Whether the pattern must match the beginning or the end of the query string, or both, or none. */
  val anchoring: js.UndefOr[is | startsWith | endsWith | contains] = js.undefined
  /**
    * Rule context (format: [A-Za-z0-9_-]+). When specified, the rule is contextual and applies only when the same context is specified at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies (provided that its other conditions are met, of course).
    */
  val context: js.UndefOr[String] = js.undefined
  /** Query patterns are expressed as a string with a specific syntax. A pattern is a sequence of tokens. */
  val pattern: js.UndefOr[String] = js.undefined
}

object Condition {
  @scala.inline
  def apply(
    alternatives: js.UndefOr[Boolean] = js.undefined,
    anchoring: is | startsWith | endsWith | contains = null,
    context: String = null,
    pattern: String = null
  ): Condition = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(alternatives)) __obj.updateDynamic("alternatives")(alternatives.get.asInstanceOf[js.Any])
    if (anchoring != null) __obj.updateDynamic("anchoring")(anchoring.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (pattern != null) __obj.updateDynamic("pattern")(pattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[Condition]
  }
}

