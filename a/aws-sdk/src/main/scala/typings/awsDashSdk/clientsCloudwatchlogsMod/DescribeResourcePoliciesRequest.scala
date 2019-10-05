package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourcePoliciesRequest extends js.Object {
  /**
    * The maximum number of resource policies to be displayed with one call of this API.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object DescribeResourcePoliciesRequest {
  @scala.inline
  def apply(limit: Int | Double = null, nextToken: NextToken = null): DescribeResourcePoliciesRequest = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[DescribeResourcePoliciesRequest]
  }
}

