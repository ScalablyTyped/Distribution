package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeResourcePoliciesResponse extends js.Object {
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The resource policies that exist in this account.
    */
  var resourcePolicies: js.UndefOr[ResourcePolicies] = js.undefined
}

object DescribeResourcePoliciesResponse {
  @scala.inline
  def apply(nextToken: NextToken = null, resourcePolicies: ResourcePolicies = null): DescribeResourcePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (resourcePolicies != null) __obj.updateDynamic("resourcePolicies")(resourcePolicies)
    __obj.asInstanceOf[DescribeResourcePoliciesResponse]
  }
}

