package typings.awsDashSdk.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityResponse extends js.Object {
  /**
    * The unique identifier for the application that the campaign applies to.
    */
  var ApplicationId: __string
  /**
    * The unique identifier for the campaign that the activity applies to.
    */
  var CampaignId: __string
  /**
    * The actual time, in ISO 8601 format, when the activity was marked CANCELLED or COMPLETED.
    */
  var End: js.UndefOr[__string] = js.undefined
  /**
    * The unique identifier for the activity.
    */
  var Id: __string
  /**
    * Specifies whether the activity succeeded. Possible values are SUCCESS and FAIL.
    */
  var Result: js.UndefOr[__string] = js.undefined
  /**
    * The scheduled start time, in ISO 8601 format, for the activity.
    */
  var ScheduledStart: js.UndefOr[__string] = js.undefined
  /**
    * The actual start time, in ISO 8601 format, of the activity.
    */
  var Start: js.UndefOr[__string] = js.undefined
  /**
    * The state of the activity. Possible values are: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, and COMPLETED.
    */
  var State: js.UndefOr[__string] = js.undefined
  /**
    * The total number of endpoints that the campaign successfully delivered messages to.
    */
  var SuccessfulEndpointCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of time zones that were completed.
    */
  var TimezonesCompletedCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of unique time zones that are in the segment for the campaign.
    */
  var TimezonesTotalCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of endpoints that the campaign attempted to deliver messages to.
    */
  var TotalEndpointCount: js.UndefOr[__integer] = js.undefined
  /**
    * The unique identifier for the campaign treatment that the activity applies to. A treatment is a variation of a campaign that's used for A/B testing of a campaign.
    */
  var TreatmentId: js.UndefOr[__string] = js.undefined
}

object ActivityResponse {
  @scala.inline
  def apply(
    ApplicationId: __string,
    CampaignId: __string,
    Id: __string,
    End: __string = null,
    Result: __string = null,
    ScheduledStart: __string = null,
    Start: __string = null,
    State: __string = null,
    SuccessfulEndpointCount: js.UndefOr[__integer] = js.undefined,
    TimezonesCompletedCount: js.UndefOr[__integer] = js.undefined,
    TimezonesTotalCount: js.UndefOr[__integer] = js.undefined,
    TotalEndpointCount: js.UndefOr[__integer] = js.undefined,
    TreatmentId: __string = null
  ): ActivityResponse = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId, CampaignId = CampaignId, Id = Id)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Result != null) __obj.updateDynamic("Result")(Result)
    if (ScheduledStart != null) __obj.updateDynamic("ScheduledStart")(ScheduledStart)
    if (Start != null) __obj.updateDynamic("Start")(Start)
    if (State != null) __obj.updateDynamic("State")(State)
    if (!js.isUndefined(SuccessfulEndpointCount)) __obj.updateDynamic("SuccessfulEndpointCount")(SuccessfulEndpointCount)
    if (!js.isUndefined(TimezonesCompletedCount)) __obj.updateDynamic("TimezonesCompletedCount")(TimezonesCompletedCount)
    if (!js.isUndefined(TimezonesTotalCount)) __obj.updateDynamic("TimezonesTotalCount")(TimezonesTotalCount)
    if (!js.isUndefined(TotalEndpointCount)) __obj.updateDynamic("TotalEndpointCount")(TotalEndpointCount)
    if (TreatmentId != null) __obj.updateDynamic("TreatmentId")(TreatmentId)
    __obj.asInstanceOf[ActivityResponse]
  }
}

