package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesResponse extends js.Object {
  /**
    * Indicates whether there are additional results to retrieve. If there are no more results, the value is null.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudwatcheventsMod.NextToken] = js.undefined
  /**
    * The rules that match the specified criteria.
    */
  var Rules: js.UndefOr[RuleResponseList] = js.undefined
}

object ListRulesResponse {
  @scala.inline
  def apply(NextToken: NextToken = null, Rules: RuleResponseList = null): ListRulesResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[ListRulesResponse]
  }
}

