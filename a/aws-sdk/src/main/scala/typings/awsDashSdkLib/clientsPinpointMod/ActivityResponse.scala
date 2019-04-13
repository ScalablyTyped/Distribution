package typings
package awsDashSdkLib.clientsPinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActivityResponse extends js.Object {
  /**
    * The ID of the application to which the campaign applies.
    */
  var ApplicationId: js.UndefOr[__string] = js.undefined
  /**
    * The ID of the campaign to which the activity applies.
    */
  var CampaignId: js.UndefOr[__string] = js.undefined
  /**
    * The actual time the activity was marked CANCELLED or COMPLETED. Provided in ISO 8601 format.
    */
  var End: js.UndefOr[__string] = js.undefined
  /**
    * The unique activity ID.
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * Indicates whether the activity succeeded.
  Valid values: SUCCESS, FAIL
    */
  var Result: js.UndefOr[__string] = js.undefined
  /**
    * The scheduled start time for the activity in ISO 8601 format.
    */
  var ScheduledStart: js.UndefOr[__string] = js.undefined
  /**
    * The actual start time of the activity in ISO 8601 format.
    */
  var Start: js.UndefOr[__string] = js.undefined
  /**
    * The state of the activity.
  Valid values: PENDING, INITIALIZING, RUNNING, PAUSED, CANCELLED, COMPLETED
    */
  var State: js.UndefOr[__string] = js.undefined
  /**
    * The total number of endpoints to which the campaign successfully delivered messages.
    */
  var SuccessfulEndpointCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of timezones completed.
    */
  var TimezonesCompletedCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of unique timezones present in the segment.
    */
  var TimezonesTotalCount: js.UndefOr[__integer] = js.undefined
  /**
    * The total number of endpoints to which the campaign attempts to deliver messages.
    */
  var TotalEndpointCount: js.UndefOr[__integer] = js.undefined
  /**
    * The ID of a variation of the campaign used for A/B testing.
    */
  var TreatmentId: js.UndefOr[__string] = js.undefined
}

object ActivityResponse {
  @scala.inline
  def apply(
    ApplicationId: __string = null,
    CampaignId: __string = null,
    End: __string = null,
    Id: __string = null,
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
    val __obj = js.Dynamic.literal()
    if (ApplicationId != null) __obj.updateDynamic("ApplicationId")(ApplicationId)
    if (CampaignId != null) __obj.updateDynamic("CampaignId")(CampaignId)
    if (End != null) __obj.updateDynamic("End")(End)
    if (Id != null) __obj.updateDynamic("Id")(Id)
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

