package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFleetsOutput extends js.Object {
  /**
    * Set of fleet IDs matching the list request. You can retrieve additional information about all returned fleets by passing this result set to a call to DescribeFleetAttributes, DescribeFleetCapacity, or DescribeFleetUtilization.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object ListFleetsOutput {
  @scala.inline
  def apply(FleetIds: FleetIdList = null, NextToken: NonZeroAndMaxString = null): ListFleetsOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetIds != null) __obj.updateDynamic("FleetIds")(FleetIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFleetsOutput]
  }
}

