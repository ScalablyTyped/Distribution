package typings
package awsDashSdkLib.clientsIot1clickprojectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPlacementsResponse extends js.Object {
  /**
    * The token used to retrieve the next set of results - will be effectively empty if there are no further results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * An object listing the requested placements.
    */
  var placements: PlacementSummaryList
}

object ListPlacementsResponse {
  @scala.inline
  def apply(placements: PlacementSummaryList, nextToken: NextToken = null): ListPlacementsResponse = {
    val __obj = js.Dynamic.literal(placements = placements)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListPlacementsResponse]
  }
}

