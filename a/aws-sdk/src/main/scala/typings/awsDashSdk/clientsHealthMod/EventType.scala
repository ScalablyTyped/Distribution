package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventType extends js.Object {
  /**
    * A list of event type category codes (issue, scheduledChange, or accountNotification).
    */
  var category: js.UndefOr[eventTypeCategory] = js.undefined
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var code: js.UndefOr[eventTypeCode] = js.undefined
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typings.awsDashSdk.clientsHealthMod.service] = js.undefined
}

object EventType {
  @scala.inline
  def apply(category: eventTypeCategory = null, code: eventTypeCode = null, service: service = null): EventType = {
    val __obj = js.Dynamic.literal()
    if (category != null) __obj.updateDynamic("category")(category.asInstanceOf[js.Any])
    if (code != null) __obj.updateDynamic("code")(code)
    if (service != null) __obj.updateDynamic("service")(service)
    __obj.asInstanceOf[EventType]
  }
}

