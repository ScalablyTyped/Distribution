package typings
package awsDashSdkLib.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListRulesRequest extends js.Object {
  /**
    * The maximum number of results to return.
    */
  var Limit: js.UndefOr[LimitMax100] = js.undefined
  /**
    * The prefix matching the rule name.
    */
  var NamePrefix: js.UndefOr[RuleName] = js.undefined
  /**
    * The token returned by a previous call to retrieve the next set of results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListRulesRequest {
  @scala.inline
  def apply(
    Limit: js.UndefOr[LimitMax100] = js.undefined,
    NamePrefix: RuleName = null,
    NextToken: NextToken = null
  ): ListRulesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NamePrefix != null) __obj.updateDynamic("NamePrefix")(NamePrefix)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListRulesRequest]
  }
}

