package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFilterRequest extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.undefined
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  /**
    * The unique ID of the detector that specifies the GuardDuty service where you want to update a filter.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * The name of the filter.
    */
  var FilterName: String
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.FindingCriteria] = js.undefined
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
}

object UpdateFilterRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    FilterName: String,
    Action: FilterAction = null,
    Description: FilterDescription = null,
    FindingCriteria: FindingCriteria = null,
    Rank: Int | scala.Double = null
  ): UpdateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FilterName = FilterName)
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria)
    if (Rank != null) __obj.updateDynamic("Rank")(Rank.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFilterRequest]
  }
}

