package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBillingGroupsResponse extends js.Object {
  /**
    * The list of billing groups.
    */
  var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.undefined
  /**
    * The token used to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object ListBillingGroupsResponse {
  @scala.inline
  def apply(billingGroups: BillingGroupNameAndArnList = null, nextToken: NextToken = null): ListBillingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (billingGroups != null) __obj.updateDynamic("billingGroups")(billingGroups)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListBillingGroupsResponse]
  }
}

