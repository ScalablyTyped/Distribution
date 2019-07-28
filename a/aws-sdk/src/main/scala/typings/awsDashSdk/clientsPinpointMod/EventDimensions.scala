package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDimensions extends js.Object {
  /**
    * One or more custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  /**
    * The name of the event that causes the campaign to be sent. This can be a standard type of event that Amazon Pinpoint generates, such as _session.start, or a custom event that's specific to your app.
    */
  var EventType: js.UndefOr[SetDimension] = js.undefined
  /**
    * One or more custom metrics that your app reports to Amazon Pinpoint. You can use these metrics as selection criteria when you create an event filter.
    */
  var Metrics: js.UndefOr[MapOfMetricDimension] = js.undefined
}

object EventDimensions {
  @scala.inline
  def apply(
    Attributes: MapOfAttributeDimension = null,
    EventType: SetDimension = null,
    Metrics: MapOfMetricDimension = null
  ): EventDimensions = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    if (EventType != null) __obj.updateDynamic("EventType")(EventType)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    __obj.asInstanceOf[EventDimensions]
  }
}

