package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsByRuleRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The name of the rule.
    */
  var Rule: RuleName
}

object ListTargetsByRuleRequest {
  @scala.inline
  def apply(Rule: RuleName, Limit: js.UndefOr[LimitMax100] = js.undefined, NextToken: NextToken = null): ListTargetsByRuleRequest = {
    val __obj = js.Dynamic.literal(Rule = Rule)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTargetsByRuleRequest]
  }
}

