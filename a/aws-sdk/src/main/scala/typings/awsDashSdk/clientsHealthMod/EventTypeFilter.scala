package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTypeFilter extends js.Object {
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var eventTypeCategories: js.UndefOr[EventTypeCategoryList] = js.undefined
  /**
    * A list of event type codes.
    */
  var eventTypeCodes: js.UndefOr[EventTypeCodeList] = js.undefined
  /**
    * The AWS services associated with the event. For example, EC2, RDS.
    */
  var services: js.UndefOr[serviceList] = js.undefined
}

object EventTypeFilter {
  @scala.inline
  def apply(
    eventTypeCategories: EventTypeCategoryList = null,
    eventTypeCodes: EventTypeCodeList = null,
    services: serviceList = null
  ): EventTypeFilter = {
    val __obj = js.Dynamic.literal()
    if (eventTypeCategories != null) __obj.updateDynamic("eventTypeCategories")(eventTypeCategories)
    if (eventTypeCodes != null) __obj.updateDynamic("eventTypeCodes")(eventTypeCodes)
    if (services != null) __obj.updateDynamic("services")(services)
    __obj.asInstanceOf[EventTypeFilter]
  }
}

