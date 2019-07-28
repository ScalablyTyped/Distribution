package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlacementGroup extends js.Object {
  /**
    * The name of the placement group.
    */
  var GroupName: js.UndefOr[String] = js.undefined
  /**
    * The number of partitions. Valid only if strategy is set to partition.
    */
  var PartitionCount: js.UndefOr[Integer] = js.undefined
  /**
    * The state of the placement group.
    */
  var State: js.UndefOr[PlacementGroupState] = js.undefined
  /**
    * The placement strategy.
    */
  var Strategy: js.UndefOr[PlacementStrategy] = js.undefined
}

object PlacementGroup {
  @scala.inline
  def apply(
    GroupName: String = null,
    PartitionCount: js.UndefOr[Integer] = js.undefined,
    State: PlacementGroupState = null,
    Strategy: PlacementStrategy = null
  ): PlacementGroup = {
    val __obj = js.Dynamic.literal()
    if (GroupName != null) __obj.updateDynamic("GroupName")(GroupName)
    if (!js.isUndefined(PartitionCount)) __obj.updateDynamic("PartitionCount")(PartitionCount)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Strategy != null) __obj.updateDynamic("Strategy")(Strategy.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementGroup]
  }
}

