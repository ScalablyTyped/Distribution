package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeNotificationSubscriptionsResponse extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var Marker: js.UndefOr[PageMarkerType] = js.undefined
  /**
    * The subscriptions.
    */
  var Subscriptions: js.UndefOr[SubscriptionList] = js.undefined
}

object DescribeNotificationSubscriptionsResponse {
  @scala.inline
  def apply(Marker: PageMarkerType = null, Subscriptions: SubscriptionList = null): DescribeNotificationSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    if (Subscriptions != null) __obj.updateDynamic("Subscriptions")(Subscriptions)
    __obj.asInstanceOf[DescribeNotificationSubscriptionsResponse]
  }
}

