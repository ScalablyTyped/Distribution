package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetUtilizationOutput extends js.Object {
  /**
    * Collection of objects containing utilization information for each requested fleet ID.
    */
  var FleetUtilization: js.UndefOr[FleetUtilizationList] = js.undefined
  /**
    * Token that indicates where to resume retrieving results on the next call to this action. If no token is returned, these results represent the end of the list.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeFleetUtilizationOutput {
  @scala.inline
  def apply(FleetUtilization: FleetUtilizationList = null, NextToken: NonZeroAndMaxString = null): DescribeFleetUtilizationOutput = {
    val __obj = js.Dynamic.literal()
    if (FleetUtilization != null) __obj.updateDynamic("FleetUtilization")(FleetUtilization)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFleetUtilizationOutput]
  }
}

