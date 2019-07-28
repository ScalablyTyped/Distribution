package typings.awsDashSdk.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationsForBudgetResponse extends js.Object {
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of notifications that are associated with a budget.
    */
  var Notifications: js.UndefOr[typings.awsDashSdk.clientsBudgetsMod.Notifications] = js.undefined
}

object DescribeNotificationsForBudgetResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, Notifications: Notifications = null): DescribeNotificationsForBudgetResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Notifications != null) __obj.updateDynamic("Notifications")(Notifications)
    __obj.asInstanceOf[DescribeNotificationsForBudgetResponse]
  }
}

