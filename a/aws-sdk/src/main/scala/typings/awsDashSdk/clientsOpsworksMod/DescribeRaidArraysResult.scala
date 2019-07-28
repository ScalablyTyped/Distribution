package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRaidArraysResult extends js.Object {
  /**
    * A RaidArrays object that describes the specified RAID arrays.
    */
  var RaidArrays: js.UndefOr[typings.awsDashSdk.clientsOpsworksMod.RaidArrays] = js.undefined
}

object DescribeRaidArraysResult {
  @scala.inline
  def apply(RaidArrays: RaidArrays = null): DescribeRaidArraysResult = {
    val __obj = js.Dynamic.literal()
    if (RaidArrays != null) __obj.updateDynamic("RaidArrays")(RaidArrays)
    __obj.asInstanceOf[DescribeRaidArraysResult]
  }
}

