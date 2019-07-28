package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventSourceResponse extends js.Object {
  /**
    * The ARN of the partner event source.
    */
  var Arn: js.UndefOr[String] = js.undefined
  /**
    * The name of the SaaS partner that created the event source.
    */
  var CreatedBy: js.UndefOr[String] = js.undefined
  /**
    * The date and time that the event source was created.
    */
  var CreationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The date and time that the event source will expire if you don't create a matching event bus.
    */
  var ExpirationTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the partner event source.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * The state of the event source. If it's ACTIVE, you have already created a matching event bus for this event source, and that event bus is active. If it's PENDING, either you haven't yet created a matching event bus, or that event bus is deactivated. If it's DELETED, you have created a matching event bus, but the event source has since been deleted.
    */
  var State: js.UndefOr[EventSourceState] = js.undefined
}

object DescribeEventSourceResponse {
  @scala.inline
  def apply(
    Arn: String = null,
    CreatedBy: String = null,
    CreationTime: Timestamp = null,
    ExpirationTime: Timestamp = null,
    Name: String = null,
    State: EventSourceState = null
  ): DescribeEventSourceResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreatedBy != null) __obj.updateDynamic("CreatedBy")(CreatedBy)
    if (CreationTime != null) __obj.updateDynamic("CreationTime")(CreationTime)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEventSourceResponse]
  }
}

