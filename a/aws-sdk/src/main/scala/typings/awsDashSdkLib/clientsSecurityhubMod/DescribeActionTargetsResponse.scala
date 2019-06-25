package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActionTargetsResponse extends js.Object {
  /**
    * A list of ActionTarget objects. Each object includes the ActionTargetArn, Description, and Name of a custom action target available in Security Hub.
    */
  var ActionTargets: ActionTargetList
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeActionTargetsResponse {
  @scala.inline
  def apply(ActionTargets: ActionTargetList, NextToken: NextToken = null): DescribeActionTargetsResponse = {
    val __obj = js.Dynamic.literal(ActionTargets = ActionTargets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeActionTargetsResponse]
  }
}

