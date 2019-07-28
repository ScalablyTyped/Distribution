package typings.algoliasearch

import typings.algoliasearch.algoliasearchStrings.contains
import typings.algoliasearch.algoliasearchStrings.endsWith
import typings.algoliasearch.algoliasearchStrings.is
import typings.algoliasearch.algoliasearchStrings.startsWith
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Anchoring extends js.Object {
  /**
    * Whether the pattern must match the beginning or the end of the query string, or both, or none.
    */
  var anchoring: is | startsWith | endsWith | contains
  /**
    * Rule context (format: [A-Za-z0-9_-]+).
    * When specified, the rule is contextual and applies only when the same context is specified
    * at query time (using the ruleContexts parameter).
    * When absent, the rule is generic and always applies
    * (provided that its other conditions are met, of course).
    */
  var context: js.UndefOr[String] = js.undefined
  /**
    * Query pattern
    */
  var pattern: String
}

object Anon_Anchoring {
  @scala.inline
  def apply(anchoring: is | startsWith | endsWith | contains, pattern: String, context: String = null): Anon_Anchoring = {
    val __obj = js.Dynamic.literal(anchoring = anchoring.asInstanceOf[js.Any], pattern = pattern)
    if (context != null) __obj.updateDynamic("context")(context)
    __obj.asInstanceOf[Anon_Anchoring]
  }
}

