package typings
package awsDashSdkLib.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricFilterMatchRecord extends js.Object {
  /**
    * The raw event data.
    */
  var eventMessage: js.UndefOr[EventMessage] = js.undefined
  /**
    * The event number.
    */
  var eventNumber: js.UndefOr[EventNumber] = js.undefined
  /**
    * The values extracted from the event data by the filter.
    */
  var extractedValues: js.UndefOr[ExtractedValues] = js.undefined
}

object MetricFilterMatchRecord {
  @scala.inline
  def apply(
    eventMessage: EventMessage = null,
    eventNumber: js.UndefOr[EventNumber] = js.undefined,
    extractedValues: ExtractedValues = null
  ): MetricFilterMatchRecord = {
    val __obj = js.Dynamic.literal()
    if (eventMessage != null) __obj.updateDynamic("eventMessage")(eventMessage)
    if (!js.isUndefined(eventNumber)) __obj.updateDynamic("eventNumber")(eventNumber)
    if (extractedValues != null) __obj.updateDynamic("extractedValues")(extractedValues)
    __obj.asInstanceOf[MetricFilterMatchRecord]
  }
}

