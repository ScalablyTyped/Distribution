package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRuleNamesByTargetResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
  /**
    * The names of the rules that can invoke the given target.
    */
  var RuleNames: js.UndefOr[RuleNameList] = js.undefined
}

object ListRuleNamesByTargetResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, RuleNames: RuleNameList = null): ListRuleNamesByTargetResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RuleNames != null) __obj.updateDynamic("RuleNames")(RuleNames)
    __obj.asInstanceOf[ListRuleNamesByTargetResponse]
  }
}

