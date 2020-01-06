package typings.awsDashSdk.clientsDmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEventSubscriptionsResponse extends js.Object {
  /**
    * A list of event subscriptions.
    */
  var EventSubscriptionsList: js.UndefOr[typings.awsDashSdk.clientsDmsMod.EventSubscriptionsList] = js.native
  /**
    *  An optional pagination token provided by a previous request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords. 
    */
  var Marker: js.UndefOr[String] = js.native
}

object DescribeEventSubscriptionsResponse {
  @scala.inline
  def apply(EventSubscriptionsList: EventSubscriptionsList = null, Marker: String = null): DescribeEventSubscriptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (EventSubscriptionsList != null) __obj.updateDynamic("EventSubscriptionsList")(EventSubscriptionsList.asInstanceOf[js.Any])
    if (Marker != null) __obj.updateDynamic("Marker")(Marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSubscriptionsResponse]
  }
}

