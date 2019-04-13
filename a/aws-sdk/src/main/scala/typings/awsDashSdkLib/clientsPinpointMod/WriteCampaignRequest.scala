package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteCampaignRequest extends js.Object {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined
  /**
    * A description of the campaign.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The allocated percentage of end users who will not receive messages from this campaign.
    */
  var HoldoutPercent: js.UndefOr[__integer] = js.undefined
  /**
    * Campaign hook information.
    */
  var Hook: js.UndefOr[CampaignHook] = js.undefined
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[__boolean] = js.undefined
  /**
    * The campaign limits settings.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The message configuration settings.
    */
  var MessageConfiguration: js.UndefOr[MessageConfiguration] = js.undefined
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The campaign schedule.
    */
  var Schedule: js.UndefOr[Schedule] = js.undefined
  /**
    * The ID of the segment to which the campaign sends messages.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * The version of the segment to which the campaign sends messages.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.undefined
  /**
    * A custom description for the treatment.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of a variation of the campaign used for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
  /**
    * The Tags for the campaign.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object WriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: ListOfWriteTreatmentResource = null,
    Description: __string = null,
    HoldoutPercent: js.UndefOr[__integer] = js.undefined,
    Hook: CampaignHook = null,
    IsPaused: js.UndefOr[__boolean] = js.undefined,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: __string = null,
    Schedule: Schedule = null,
    SegmentId: __string = null,
    SegmentVersion: js.UndefOr[__integer] = js.undefined,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null,
    tags: MapOf__string = null
  ): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(HoldoutPercent)) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent)
    if (Hook != null) __obj.updateDynamic("Hook")(Hook)
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[WriteCampaignRequest]
  }
}

