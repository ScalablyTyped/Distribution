package typings.awsDashSdk.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeNotificationSubscriptionsResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.native
  /**
    * The subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionList] = js.native
}

object DescribeNotificationSubscriptionsResponse {
  @scala.inline
  def apply(Marker: PageMarkerType = null, Subscriptions: SubscriptionList = null): DescribeNotificationSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeNotificationSubscriptionsResponse]
  }
}

