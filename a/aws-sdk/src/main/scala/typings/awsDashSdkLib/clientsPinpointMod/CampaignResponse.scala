package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CampaignResponse extends js.Object {
  /**
    * Treatments that are defined in addition to the default treatment.
    */
  var AdditionalTreatments: js.UndefOr[ListOfTreatmentResource] = js.undefined
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The arn for the campaign.
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The date the campaign was created in ISO 8601 format.
    */
  var CreationDate: js.UndefOr[__string] = js.undefined
  /**
    * The status of the campaign's default treatment. Only present for A/B test campaigns.
    */
  var DefaultState: js.UndefOr[CampaignState] = js.undefined
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
    * The unique campaign ID.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Indicates whether the campaign is paused. A paused campaign does not send messages unless you resume it by setting IsPaused to false.
    */
  var IsPaused: js.UndefOr[__boolean] = js.undefined
  /**
    * The date the campaign was last updated in ISO 8601 format.	
    */
  var LastModifiedDate: js.UndefOr[__string] = js.undefined
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
    * The campaign status.
  An A/B test campaign will have a status of COMPLETED only when all treatments have a status of COMPLETED.
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
  /**
    * The campaign version number.
    */
  var Version: js.UndefOr[__integer] = js.undefined
  /**
    * The Tags for the campaign.
    */
  var tags: js.UndefOr[MapOf__string] = js.undefined
}

object CampaignResponse {
  @scala.inline
  def apply(
    AdditionalTreatments: ListOfTreatmentResource = null,
    ApplicationId: __string = null,
    Arn: __string = null,
    CreationDate: __string = null,
    DefaultState: CampaignState = null,
    Description: __string = null,
    HoldoutPercent: js.UndefOr[__integer] = js.undefined,
    Hook: CampaignHook = null,
    Id: __string = null,
    IsPaused: js.UndefOr[__boolean] = js.undefined,
    LastModifiedDate: __string = null,
    Limits: CampaignLimits = null,
    MessageConfiguration: MessageConfiguration = null,
    Name: __string = null,
    Schedule: Schedule = null,
    SegmentId: __string = null,
    SegmentVersion: js.UndefOr[__integer] = js.undefined,
    State: CampaignState = null,
    TreatmentDescription: __string = null,
    TreatmentName: __string = null,
    Version: js.UndefOr[__integer] = js.undefined,
    tags: MapOf__string = null
  ): CampaignResponse = {
    val __obj = js.Dynamic.literal()
    if (AdditionalTreatments != null) __obj.updateDynamic("AdditionalTreatments")(AdditionalTreatments)
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (CreationDate != null) __obj.updateDynamic("CreationDate")(CreationDate)
    if (DefaultState != null) __obj.updateDynamic("DefaultState")(DefaultState)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(HoldoutPercent)) __obj.updateDynamic("HoldoutPercent")(HoldoutPercent)
    if (Hook != null) __obj.updateDynamic("Hook")(Hook)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(IsPaused)) __obj.updateDynamic("IsPaused")(IsPaused)
    if (LastModifiedDate != null) __obj.updateDynamic("LastModifiedDate")(LastModifiedDate)
    if (Limits != null) __obj.updateDynamic("Limits")(Limits)
    if (MessageConfiguration != null) __obj.updateDynamic("MessageConfiguration")(MessageConfiguration)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule)
    if (SegmentId != null) __obj.updateDynamic("SegmentId")(SegmentId)
    if (!js.isUndefined(SegmentVersion)) __obj.updateDynamic("SegmentVersion")(SegmentVersion)
    if (State != null) __obj.updateDynamic("State")(State)
    if (TreatmentDescription != null) __obj.updateDynamic("TreatmentDescription")(TreatmentDescription)
    if (TreatmentName != null) __obj.updateDynamic("TreatmentName")(TreatmentName)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[CampaignResponse]
  }
}

