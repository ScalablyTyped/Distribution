package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTargetsByRuleResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The targets assigned to the rule.
    */
  var Targets: js.UndefOr[TargetList] = js.undefined
}

object ListTargetsByRuleResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Targets: TargetList = null): ListTargetsByRuleResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Targets != null) __obj.updateDynamic("Targets")(Targets)
    __obj.asInstanceOf[ListTargetsByRuleResponse]
  }
}

