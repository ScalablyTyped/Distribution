package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeActionTargetsRequest extends js.Object {
  /**
    * A list of custom action target ARNs for the custom action targets to retrieve.
    */
  var ActionTargetArns: js.UndefOr[ArnList] = js.undefined
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.MaxResults] = js.undefined
  /**
    * The token that is required for pagination.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.NextToken] = js.undefined
}

object DescribeActionTargetsRequest {
  @scala.inline
  def apply(
    ActionTargetArns: ArnList = null,
    MaxResults: Int | scala.Double = null,
    NextToken: NextToken = null
  ): DescribeActionTargetsRequest = {
    val __obj = js.Dynamic.literal()
    if (ActionTargetArns != null) __obj.updateDynamic("ActionTargetArns")(ActionTargetArns)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeActionTargetsRequest]
  }
}

