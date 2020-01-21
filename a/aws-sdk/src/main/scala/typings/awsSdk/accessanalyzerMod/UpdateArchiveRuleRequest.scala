package typings.awsSdk.accessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateArchiveRuleRequest extends js.Object {
  /**
    * The name of the analyzer to update the archive rules for.
    */
  var analyzerName: Name = js.native
  /**
    * A client token.
    */
  var clientToken: js.UndefOr[String] = js.native
  /**
    * A filter to match for the rules to update. Only rules that match the filter are updated.
    */
  var filter: FilterCriteriaMap = js.native
  /**
    * The name of the rule to update.
    */
  var ruleName: Name = js.native
}

object UpdateArchiveRuleRequest {
  @scala.inline
  def apply(analyzerName: Name, filter: FilterCriteriaMap, ruleName: Name, clientToken: String = null): UpdateArchiveRuleRequest = {
    val __obj = js.Dynamic.literal(analyzerName = analyzerName.asInstanceOf[js.Any], filter = filter.asInstanceOf[js.Any], ruleName = ruleName.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateArchiveRuleRequest]
  }
}

