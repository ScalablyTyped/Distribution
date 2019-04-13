package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreatmentResource extends js.Object {
  /**
    * The unique treatment ID.
    */
  var Id: js.UndefOr[__string] = js.undefined
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
    * The treatment status.
    */
  var State: js.UndefOr[CampaignState] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
}

object TreatmentResource {
  @scala.inline
  def apply(
    Id: __string = null,
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    SizePercent: js.UndefOr[__integer] = js.undefined,
    State: CampaignState = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null
  ): TreatmentResource = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (!js.isUndefined(SizePercent)) __obj.updateDynamic("SizePercent")(SizePercent)
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[TreatmentResource]
  }
}

