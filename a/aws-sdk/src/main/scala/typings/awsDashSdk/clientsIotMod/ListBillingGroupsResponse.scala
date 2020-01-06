package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBillingGroupsResponse extends js.Object {
  /**
    * The list of billing groups.
    */
  var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.native
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object ListBillingGroupsResponse {
  @scala.inline
  def apply(billingGroups: BillingGroupNameAndArnList = null, nextToken: NextToken = null): ListBillingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroups != null) __obj.updateDynamic("billingGroups")(billingGroups.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBillingGroupsResponse]
  }
}

