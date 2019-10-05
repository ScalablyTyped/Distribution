package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeFleetUtilizationInput extends js.Object {
  /**
    * Unique identifier for a fleet(s) to retrieve utilization data for. To request utilization data for all fleets, leave this parameter empty.
    */
  var FleetIds: js.UndefOr[FleetIdList] = js.undefined
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value. This parameter is ignored when the request specifies one or a list of fleet IDs.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeFleetUtilizationInput {
  @scala.inline
  def apply(
    FleetIds: FleetIdList = null,
    Limit: Int | scala.Double = null,
    NextToken: NonZeroAndMaxString = null
  ): DescribeFleetUtilizationInput = {
    val __obj = js.Dynamic.literal()
    if (FleetIds != null) __obj.updateDynamic("FleetIds")(FleetIds)
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeFleetUtilizationInput]
  }
}

