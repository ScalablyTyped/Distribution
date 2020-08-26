package typings.awsSdk.budgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSubscribersForNotificationResponse extends js.Object {
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.native
  /**
    * A list of subscribers that are associated with a notification.
    */
  var Subscribers: js.UndefOr[typings.awsSdk.budgetsMod.Subscribers] = js.native
}

object DescribeSubscribersForNotificationResponse {
  @scala.inline
  def apply(): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
  @scala.inline
  implicit class DescribeSubscribersForNotificationResponseOps[Self <: DescribeSubscribersForNotificationResponse] (val x: Self) extends AnyVal {
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
    def setSubscribersVarargs(value: Subscriber*): Self = this.set("Subscribers", js.Array(value :_*))
    @scala.inline
    def setSubscribers(value: Subscribers): Self = this.set("Subscribers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubscribers: Self = this.set("Subscribers", js.undefined)
  }
  
}

