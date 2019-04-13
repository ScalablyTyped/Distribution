package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFilterResponse extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: js.UndefOr[FilterAction] = js.undefined
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
  /**
    * Represents the criteria to be used in the filter for querying findings.
    */
  var FindingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  /**
    * The name of the filter.
    */
  var Name: js.UndefOr[FilterName] = js.undefined
  /**
    * Specifies the position of the filter in the list of current filters. Also specifies the order in which this filter is applied to the findings.
    */
  var Rank: js.UndefOr[FilterRank] = js.undefined
}

object GetFilterResponse {
  @scala.inline
  def apply(
    Action: FilterAction = null,
    Description: FilterDescription = null,
    FindingCriteria: FindingCriteria = null,
    Name: FilterName = null,
    Rank: js.UndefOr[FilterRank] = js.undefined
  ): GetFilterResponse = {
    val __obj = js.Dynamic.literal()
    if (Action != null) __obj.updateDynamic("Action")(Action.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (FindingCriteria != null) __obj.updateDynamic("FindingCriteria")(FindingCriteria)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(Rank)) __obj.updateDynamic("Rank")(Rank)
    __obj.asInstanceOf[GetFilterResponse]
  }
}

