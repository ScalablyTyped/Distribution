package typings.awsDashSdk.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutEventsRequestEntry extends js.Object {
  /**
    * A valid JSON object. There is no other schema imposed. The JSON object can contain fields and nested subobjects. This field is required.
    */
  var Detail: js.UndefOr[String] = js.native
  /**
    * Free-form string used to decide which fields to expect in the event detail. This field is required.
    */
  var DetailType: js.UndefOr[String] = js.native
  /**
    * The event bus that will receive the event. Only the rules that are associated with this event bus can match the event.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.native
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including zero, can be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.native
  /**
    * The source of the event. This field is required.
    */
  var Source: js.UndefOr[String] = js.native
  /**
    * The timestamp of the event, per RFC3339. If no timestamp is provided, the timestamp of the PutEvents call is used.
    */
  var Time: js.UndefOr[EventTime] = js.native
}

object PutEventsRequestEntry {
  @scala.inline
  def apply(
    Detail: String = null,
    DetailType: String = null,
    EventBusName: NonPartnerEventBusName = null,
    Resources: EventResourceList = null,
    Source: String = null,
    Time: EventTime = null
  ): PutEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (Detail != null) __obj.updateDynamic("Detail")(Detail.asInstanceOf[js.Any])
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType.asInstanceOf[js.Any])
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName.asInstanceOf[js.Any])
    if (Resources != null) __obj.updateDynamic("Resources")(Resources.asInstanceOf[js.Any])
    if (Source != null) __obj.updateDynamic("Source")(Source.asInstanceOf[js.Any])
    if (Time != null) __obj.updateDynamic("Time")(Time.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutEventsRequestEntry]
  }
}

