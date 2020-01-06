package typings.awsDashSdk.clientsHealthMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Event extends js.Object {
  /**
    * The unique identifier for the event. Format: arn:aws:health:event-region::event/SERVICE/EVENT_TYPE_CODE/EVENT_TYPE_PLUS_ID . Example: Example: arn:aws:health:us-east-1::event/EC2/EC2_INSTANCE_RETIREMENT_SCHEDULED/EC2_INSTANCE_RETIREMENT_SCHEDULED_ABC123-DEF456 
    */
  var arn: js.UndefOr[eventArn] = js.native
  /**
    * The AWS Availability Zone of the event. For example, us-east-1a.
    */
  var availabilityZone: js.UndefOr[typings.awsDashSdk.clientsHealthMod.availabilityZone] = js.native
  /**
    * The date and time that the event ended.
    */
  var endTime: js.UndefOr[timestamp] = js.native
  /**
    * The category of the event. Possible values are issue, scheduledChange, and accountNotification.
    */
  var eventTypeCategory: js.UndefOr[typings.awsDashSdk.clientsHealthMod.eventTypeCategory] = js.native
  /**
    * The unique identifier for the event type. The format is AWS_SERVICE_DESCRIPTION ; for example, AWS_EC2_SYSTEM_MAINTENANCE_EVENT.
    */
  var eventTypeCode: js.UndefOr[typings.awsDashSdk.clientsHealthMod.eventTypeCode] = js.native
  /**
    * The most recent date and time that the event was updated.
    */
  var lastUpdatedTime: js.UndefOr[timestamp] = js.native
  /**
    * The AWS region name of the event.
    */
  var region: js.UndefOr[typings.awsDashSdk.clientsHealthMod.region] = js.native
  /**
    * The AWS service that is affected by the event. For example, EC2, RDS.
    */
  var service: js.UndefOr[typings.awsDashSdk.clientsHealthMod.service] = js.native
  /**
    * The date and time that the event began.
    */
  var startTime: js.UndefOr[timestamp] = js.native
  /**
    * The most recent status of the event. Possible values are open, closed, and upcoming.
    */
  var statusCode: js.UndefOr[eventStatusCode] = js.native
}

object Event {
  @scala.inline
  def apply(
    arn: eventArn = null,
    availabilityZone: availabilityZone = null,
    endTime: timestamp = null,
    eventTypeCategory: eventTypeCategory = null,
    eventTypeCode: eventTypeCode = null,
    lastUpdatedTime: timestamp = null,
    region: region = null,
    service: service = null,
    startTime: timestamp = null,
    statusCode: eventStatusCode = null
  ): Event = {
    val __obj = js.Dynamic.literal()
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (eventTypeCategory != null) __obj.updateDynamic("eventTypeCategory")(eventTypeCategory.asInstanceOf[js.Any])
    if (eventTypeCode != null) __obj.updateDynamic("eventTypeCode")(eventTypeCode.asInstanceOf[js.Any])
    if (lastUpdatedTime != null) __obj.updateDynamic("lastUpdatedTime")(lastUpdatedTime.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (statusCode != null) __obj.updateDynamic("statusCode")(statusCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event]
  }
}

