package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInstancesInput extends js.Object {
  /**
    * Unique identifier for a fleet to retrieve instance information for.
    */
  var FleetId: typings.awsDashSdk.clientsGameliftMod.FleetId
  /**
    * Unique identifier for an instance to retrieve. Specify an instance ID or leave blank to retrieve all instances in the fleet.
    */
  var InstanceId: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.InstanceId] = js.undefined
  /**
    * Maximum number of results to return. Use this parameter with NextToken to get results as a set of sequential pages.
    */
  var Limit: js.UndefOr[PositiveInteger] = js.undefined
  /**
    * Token that indicates the start of the next sequential page of results. Use the token that is returned with a previous call to this action. To start at the beginning of the result set, do not specify a value.
    */
  var NextToken: js.UndefOr[NonZeroAndMaxString] = js.undefined
}

object DescribeInstancesInput {
  @scala.inline
  def apply(
    FleetId: FleetId,
    InstanceId: InstanceId = null,
    Limit: js.UndefOr[PositiveInteger] = js.undefined,
    NextToken: NonZeroAndMaxString = null
  ): DescribeInstancesInput = {
    val __obj = js.Dynamic.literal(FleetId = FleetId)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeInstancesInput]
  }
}

