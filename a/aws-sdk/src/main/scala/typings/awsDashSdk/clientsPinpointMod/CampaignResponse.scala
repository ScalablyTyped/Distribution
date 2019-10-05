package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignResponse extends js.Object {
  /**
    * An array of responses, one for each treatment that you defined for the campaign, in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: __string
  /**
    * The Amazon Resource Name (ARN) of the campaign.
    */
  var Arn: __string
  /**
    * The date, ISO 8601 format, when the campaign was created.
    */
  var CreationDate: __string
  /**
    * The current status of the campaign's default treatment. This value exists only for campaigns that have more than one treatment, to support A/B testing.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.undefined
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
    * The unique identifier for the campaign.
    */
  var Id: __string
  /**
    * Specifies whether the campaign is paused. A paused campaign doesn't run unless you resume it by changing this value to false.
    */
  var IsPaused: js.UndefOr[__boolean] = js.undefined
  /**
    * The date, in ISO 8601 format, when the campaign was last modified.
    */
  var LastModifiedDate: __string
  /**
    * The messaging limits for the campaign.
    */
  var Limits: js.UndefOr[CampaignLimits] = js.undefined
  /**
    * The message configuration settings for the campaign.
    */
  var MessageConfiguration: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.MessageConfiguration] = js.undefined
  /**
    * The name of the campaign.
    */
  var Name: js.UndefOr[__string] = js.undefined
  /**
    * The schedule settings for the campaign.
    */
  var Schedule: js.UndefOr[typings.awsDashSdk.clientsPinpointMod.Schedule] = js.undefined
  /**
    * The unique identifier for the segment that's associated with the campaign.
    */
  var SegmentId: __string
  /**
    * The version number of the segment that's associated with the campaign.
    */
  var SegmentVersion: __integer
  /**
    * The current status of the campaign.
    */
  var State: js.UndefOr[CampaignState] = js.undefined
  /**
    * The custom description of a variation of the campaign that's used for A/B testing.
    */
  var TreatmentDescription: js.UndefOr[__string] = js.undefined
  /**
    * The custom name of a variation of the campaign that's used for A/B testing.
    */
  var TreatmentName: js.UndefOr[__string] = js.undefined
  /**
    * The version number of the campaign.
    */
  var Version: js.UndefOr[__integer] = js.undefined
  /**
    * A string-to-string map of key-value pairs that identifies the tags that are associated with the campaign. Each tag consists of a required tag key and an associated tag value.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object CampaignResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    Arn: __string,
    CreationDate: __string,
    Id: __string,
    LastModifiedDate: __string,
    SegmentId: __string,
    SegmentVersion: __integer,
    AdditionalTreatments: ListOfTreatmentResource = null,
    DefaultState: CampaignState = null,
    Description: __string = null,
    HoldoutPercent: Int | Double = null,
    Hook: CampaignHook = null,
    IsPaused: js.UndefOr[Boolean] = js.undefined,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: __string = null,
    Schedule: Schedule = null,
    State: CampaignState = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null,
    Version: Int | Double = null,
    tags: MapOf__string = null
  ): CampaignResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, Arn = Arn, CreationDate = CreationDate, Id = Id, LastModifiedDate = LastModifiedDate, SegmentId = SegmentId, SegmentVersion = SegmentVersion)
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments)
    if (DefaultState != null) __obj.updateDynamic("DefaultState")(DefaultState)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (HoldoutPercent != null) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent.asInstanceOf[js.Any])
    if (Hook != null) __obj.updateDynamic("Hook")(Hook)
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    if (Version != null) __obj.updateDynamic("Version")(Version.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CampaignResponse]
  }
}

