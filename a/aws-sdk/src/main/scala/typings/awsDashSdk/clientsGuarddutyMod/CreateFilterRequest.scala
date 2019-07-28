package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFilterRequest extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.undefined
  /**
    * The idempotency token for the create request.
    */
  var ClientToken: js.UndefOr[typings.awsDashSdk.clientsGuarddutyMod.ClientToken] = js.undefined
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  /**
    * The unique ID of the detector of the GuardDuty account for which you want to create a filter.
    */
  var DetectorId: typings.awsDashSdk.clientsGuarddutyMod.DetectorId
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: typings.awsDashSdk.clientsGuarddutyMod.FindingCriteria
  /**
    * The name of the filter.
    */
  var Name: FilterName
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
  /**
    * The tags to be added to a new filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object CreateFilterRequest {
  @scala.inline
  def apply(
    DetectorId: DetectorId,
    FindingCriteria: FindingCriteria,
    Name: FilterName,
    Action: FilterAction = null,
    ClientToken: ClientToken = null,
    Description: FilterDescription = null,
    Rank: js.UndefOr[FilterRank] = js.undefined,
    Tags: TagMap = null
  ): CreateFilterRequest = {
    val __obj = js.Dynamic.literal(DetectorId = DetectorId, FindingCriteria = FindingCriteria, Name = Name)
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (ClientToken != null) __obj.updateDynamic("ClientToken")(ClientToken)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (!js.isUndefined(Rank)) __obj.updateDynamic("Rank")(Rank)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateFilterRequest]
  }
}

