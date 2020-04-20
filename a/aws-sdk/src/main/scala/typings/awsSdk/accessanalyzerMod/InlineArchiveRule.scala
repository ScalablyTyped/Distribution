package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InlineArchiveRule extends js.Object {
  /**
    * The condition and values for a criterion.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the rule.
    */
  var ruleName: Name = js.native
}

object InlineArchiveRule {
  @scala.inline
  def apply(filter: FilterCriteriaMap, ruleName: Name): InlineArchiveRule = {
    val __obj = js.Dynamic.literal(filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlineArchiveRule]
  }
}

