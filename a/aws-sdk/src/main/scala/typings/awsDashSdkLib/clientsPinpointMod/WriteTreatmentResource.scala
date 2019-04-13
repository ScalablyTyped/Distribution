package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteTreatmentResource extends js.Object {
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[Schedule] = js.undefined
  /**
    * The allocated percentage of users for this treatment.
    */
  var SizePercent: js.UndefOr[__integer] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
}

object WriteTreatmentResource {
  @scala.inline
  def apply(
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    SizePercent: js.UndefOr[__integer] = js.undefined,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null
  ): WriteTreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (!js.isUndefined(SizePercent)) __obj.updateDynamic("SizePercent")(SizePercent)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[WriteTreatmentResource]
  }
}

