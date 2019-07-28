package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePlacementGroupRequest extends js.Object {
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  /**
    * A name for the placement group. Must be unique within the scope of your account for the Region. Constraints: Up to 255 ASCII characters
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The number of partitions. Valid only when Strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.undefined
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.undefined
}

object CreatePlacementGroupRequest {
  @scala.inline
  def apply(
    DryRun: js.UndefOr[Boolean] = js.undefined,
    GroupName: String = null,
    PartitionCount: js.UndefOr[Integer] = js.undefined,
    Strategy: PlacementStrategy = null
  ): CreatePlacementGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (!js.isUndefined(PartitionCount)) __obj.updateDynamic("PartitionCount")(PartitionCount)
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatePlacementGroupRequest]
  }
}

