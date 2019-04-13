package typings
package awsDashSdkLib.clientsBudgetsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSubscribersForNotificationResponse extends js.Object {
  /**
    * The pagination token in the service response that indicates the next set of results that you can retrieve.
    */
  var NextToken: js.UndefOr[GenericString] = js.undefined
  /**
    * A list of subscribers that are associated with a notification.
    */
  var Subscribers: js.UndefOr[Subscribers] = js.undefined
}

object DescribeSubscribersForNotificationResponse {
  @scala.inline
  def apply(NextToken: GenericString = null, Subscribers: Subscribers = null): DescribeSubscribersForNotificationResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Subscribers != null) __obj.updateDynamic("Subscribers")(Subscribers)
    __obj.asInstanceOf[DescribeSubscribersForNotificationResponse]
  }
}

