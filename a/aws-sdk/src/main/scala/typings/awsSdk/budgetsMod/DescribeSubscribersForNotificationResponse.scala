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
  def apply(NextToken: GenericString = null, Subscribers: Subscribers = null): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Subscribers != null) __obj.updateDynamic("Subscribers")(Subscribers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
}

