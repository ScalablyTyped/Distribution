package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDimensions extends js.Object {
  /**
    * Custom attributes that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
    */
  var Attributes: js.UndefOr[MapOfAttributeDimension] = js.undefined
  /**
    * The name of the event that causes the campaign to be sent. This can be a standard event type that Amazon Pinpoint generates, such as _session.start, or a custom event that's specific to your app.
    */
  var EventType: js.UndefOr[SetDimension] = js.undefined
  /**
    * Custom metrics that your app reports to Amazon Pinpoint. You can use these attributes as selection criteria when you create an event filter.
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

