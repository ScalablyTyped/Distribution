package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WriteCampaignRequest extends js.Object {
  /**
    * An array of requests that defines additional treatments for the campaign, in addition to the default treatment for the campaign.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.undefined
  /**
    * The custom description of the campaign.
    */
  var Description: js.UndefOr[__string] = js.undefined
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[__integer] = js.undefined
  /**
    * The settings for the AWS Lambda function to use as a code hook for the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.undefined
  /**
    * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value to false.
    */
  var IsPaused: js.UndefOr[__boolean] = js.undefined
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageConfiguration] = js.undefined
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Schedule] = js.undefined
  /**
    * The unique identifier for the segment to associate with the campaign.
    */
  var SegmentId: js.UndefOr[__string] = js.undefined
  /**
    * The version of the segment to associate with the campaign.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.undefined
  /**
    * The custom description of a variation of the campaign to use for A/B testing.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of a variation of the campaign to use for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists of a required tag key and an associated tag value.
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

