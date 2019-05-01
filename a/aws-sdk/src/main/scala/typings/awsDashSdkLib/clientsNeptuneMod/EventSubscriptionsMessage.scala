package typings
package awsDashSdkLib.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventSubscriptionsMessage extends js.Object {
  /**
    * A list of EventSubscriptions data types.
    */
  var EventSubscriptionsList: js.UndefOr[EventSubscriptionsList] = js.undefined
  /**
    *  An optional pagination token provided by a previous DescribeOrderableDBInstanceOptions request. If this parameter is specified, the response includes only records beyond the marker, up to the value specified by MaxRecords.
    */
  var Marker: js.UndefOr[String] = js.undefined
}

object EventSubscriptionsMessage {
  @scala.inline
  def apply(EventSubscriptionsList: EventSubscriptionsList = null, Marker: String = null): EventSubscriptionsMessage = {
    val __obj = js.Dynamic.literal()
    if (EventSubscriptionsList != null) __obj.updateDynamic("EventSubscriptionsList")(EventSubscriptionsList)
    if (Marker != null) __obj.updateDynamic("Marker")(Marker)
    __obj.asInstanceOf[EventSubscriptionsMessage]
  }
}

