package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WriteCampaignRequest extends js.Object {
  /**
    * An array of requests that defines additional treatments for the campaign, in addition to the default treatment for the campaign.
    */
  var AdditionalTreatments: js.UndefOr[ListOfWriteTreatmentResource] = js.native
  /**
    * A custom description of the campaign.
    */
  var Description: js.UndefOr[__string] = js.native
  /**
    * The allocated percentage of users (segment members) who shouldn't receive messages from the campaign.
    */
  var HoldoutPercent: js.UndefOr[__integer] = js.native
  /**
    * The settings for the AWS Lambda function to use as a code hook for the campaign.
    */
  var Hook: js.UndefOr[CampaignHook] = js.native
  /**
    * Specifies whether to pause the campaign. A paused campaign doesn't run unless you resume it by setting this value to false.
    */
  var IsPaused: js.UndefOr[__boolean] = js.native
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.native
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageConfiguration] = js.native
  /**
    * The custom name of the campaign.
    */
  var Name: js.UndefOr[__string] = js.native
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Schedule] = js.native
  /**
    * The unique identifier for the segment to associate with the campaign.
    */
  var SegmentId: js.UndefOr[__string] = js.native
  /**
    * The version of the segment to associate with the campaign.
    */
  var SegmentVersion: js.UndefOr[__integer] = js.native
  /**
    * The message template to use for the campaign.
    */
  var TemplateConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.TemplateConfiguration] = js.native
  /**
    * A custom description of a variation of the campaign to use for A/B testing.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.native
  /**
    * The custom name of a variation of the campaign to use for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.native
  /**
    * A string-to-string map of key-value pairs that defines the tags to associate with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.native
}

object WriteCampaignRequest {
  @scala.inline
  def apply(
    AdditionalTreatments: ListOfWriteTreatmentResource = null,
    Description: __string = null,
    HoldoutPercent: Int | Double = null,
    Hook: CampaignHook = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: __string = null,
    Schedule: Schedule = null,
    SegmentId: __string = null,
    SegmentVersion: Int | Double = null,
    TemplateConfiguration: TemplateConfiguration = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null,
    tags: MapOf__string = null
  ): WriteCampaignRequest = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (HoldoutPercent != null) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook.asInstanceOf[js.Any])
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused.asInstanceOf[js.Any])
    if (Limits != null) __obj.updateDynamic("Limits")(Limits.asInstanceOf[js.Any])
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId.asInstanceOf[js.Any])
    if (SegmentVersion != null) __obj.updateDynamic("SegmentVersion")(SegmentVersion.asInstanceOf[js.Any])
    if (TemplateConfiguration != null) __obj.updateDynamic("TemplateConfiguration")(TemplateConfiguration.asInstanceOf[js.Any])
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription.asInstanceOf[js.Any])
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteCampaignRequest]
  }
}

