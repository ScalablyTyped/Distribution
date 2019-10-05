package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFilterResponse extends js.Object {
  /**
    * Specifies the action that is to be applied to the findings that match the filter.
    */
  var Action: FilterAction
  /**
    * The description of the filter.
    */
  var Description: js.UndefOr[FilterDescription] = js.undefined
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
    * The tags of the filter resource.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
}

object GetFilterResponse {
  @scala.inline
  def apply(
    Action: FilterAction,
    FindingCriteria: FindingCriteria,
    Name: FilterName,
    Description: FilterDescription = null,
    Rank: Int | scala.Double = null,
    Tags: TagMap = null
  ): GetFilterResponse = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any], FindingCriteria = FindingCriteria, Name = Name)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Rank != null) __obj.updateDynamic("Rank")(Rank.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[GetFilterResponse]
  }
}

