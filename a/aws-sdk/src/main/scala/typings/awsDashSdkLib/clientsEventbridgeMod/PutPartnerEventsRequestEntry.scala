package typings
package awsDashSdkLib.clientsEventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutPartnerEventsRequestEntry extends js.Object {
  /**
    * A valid JSON string. There is no other schema imposed. The JSON string can contain fields and nested subobjects.
    */
  var Detail: js.UndefOr[String] = js.undefined
  /**
    * A free-form string used to decide which fields to expect in the event detail.
    */
  var DetailType: js.UndefOr[String] = js.undefined
  /**
    * AWS resources, identified by Amazon Resource Name (ARN), that the event primarily concerns. Any number, including zero, can be present.
    */
  var Resources: js.UndefOr[EventResourceList] = js.undefined
  /**
    * The event source that is generating the evntry.
    */
  var Source: js.UndefOr[String] = js.undefined
  /**
    * The date and time of the event.
    */
  var Time: js.UndefOr[EventTime] = js.undefined
}

object PutPartnerEventsRequestEntry {
  @scala.inline
  def apply(
    Detail: String = null,
    DetailType: String = null,
    Resources: EventResourceList = null,
    Source: String = null,
    Time: EventTime = null
  ): PutPartnerEventsRequestEntry = {
    val __obj = js.Dynamic.literal()
    if (Detail != null) __obj.updateDynamic("Detail")(Detail)
    if (DetailType != null) __obj.updateDynamic("DetailType")(DetailType)
    if (Resources != null) __obj.updateDynamic("Resources")(Resources)
    if (Source != null) __obj.updateDynamic("Source")(Source)
    if (Time != null) __obj.updateDynamic("Time")(Time)
    __obj.asInstanceOf[PutPartnerEventsRequestEntry]
  }
}

