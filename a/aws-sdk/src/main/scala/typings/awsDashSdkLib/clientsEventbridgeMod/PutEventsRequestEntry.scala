package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutEventsRequestEntry extends js.Object {
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.undefined
  /**
    * Free-form string used to decide which fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.undefined
  /**
    * The event bus that will receive the event. Only the rules that are associated with this event bus can match the event.
    */
  var EventBusName: js.UndefOr[NonPartnerEventBusName] = js.undefined
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including zero, can be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.undefined
  /**
    * The source of the event. This field is required.
    */
  var Source: js.UndefOr[String] = js.undefined
  /**
    * The timestamp of the event, per RFC3339. If no timestamp is provided, the timestamp of the PutEvents call is used.
    */
  var Time: js.UndefOr[EventTime] = js.undefined
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
    if (Detail != null) __obj.updateDynamic("Detail")(Detail)
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType)
    if (EventBusName != null) __obj.updateDynamic("EventBusName")(EventBusName)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Time != null) __obj.updateDynamic("Time")(Time)
    __obj.asInstanceOf[PutEventsRequestEntry]
  }
}

