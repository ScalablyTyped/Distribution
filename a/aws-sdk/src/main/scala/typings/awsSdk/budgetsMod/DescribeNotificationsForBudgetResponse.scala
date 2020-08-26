package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationsForBudgetResponse extends js.Object {
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of notifications that are associated with a budget.
    */
  var Notifications: js.UndefOr[typings.awsSdk.budgetsMod.Notifications] = js.native
}

object DescribeNotificationsForBudgetResponse {
  @scala.inline
  def apply(): DescribeNotificationsForBudgetResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeNotificationsForBudgetResponse]
  }
  @scala.inline
  implicit class DescribeNotificationsForBudgetResponseOps[Self <: DescribeNotificationsForBudgetResponse] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setNextToken(value: GenericString): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setNotificationsVarargs(value: Notification*): Self = this.set("Notifications", js.Array(value :_*))
    @scala.inline
    def setNotifications(value: Notifications): Self = this.set("Notifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifications: Self = this.set("Notifications", js.undefined)
  }
  
}

