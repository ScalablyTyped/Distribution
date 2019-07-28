package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreatmentResource extends js.Object {
  /**
    * The unique identifier for the treatment.
    */
  var Id: __string
  /**
    * The message configuration settings for the treatment.
    */
  var MessageConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageConfiguration] = js.undefined
  /**
    * The schedule settings for the treatment.
    */
  var Schedule: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Schedule] = js.undefined
  /**
    * The allocated percentage of users (segment members) that the treatment is sent to.
    */
  var SizePercent: __integer
  /**
    * The status of the treatment.
    */
  var State: js.UndefOr[CampaignState] = js.undefined
  /**
    * The custom description of the treatment.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of the treatment. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
}

object TreatmentResource {
  @scala.inline
  def apply(
    Id: __string,
    SizePercent: __integer,
    MessageConfiguration: MessageConfiguration = null,
    Schedule: Schedule = null,
    State: CampaignState = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null
  ): TreatmentResource = {
    val __obj = js.Dynamic.literal(Id = Id, SizePercent = SizePercent)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    __obj.asInstanceOf[TreatmentResource]
  }
}

