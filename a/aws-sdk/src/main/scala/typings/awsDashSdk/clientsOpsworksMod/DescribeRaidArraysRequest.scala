package typings.awsDashSdk.clientsOpsworksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRaidArraysRequest extends js.Object {
  /**
    * The instance ID. If you use this parameter, DescribeRaidArrays returns descriptions of the RAID arrays associated with the specified instance. 
    */
  var InstanceId: js.UndefOr[String] = js.undefined
  /**
    * An array of RAID array IDs. If you use this parameter, DescribeRaidArrays returns descriptions of the specified arrays. Otherwise, it returns a description of every array.
    */
  var RaidArrayIds: js.UndefOr[Strings] = js.undefined
  /**
    * The stack ID.
    */
  var StackId: js.UndefOr[String] = js.undefined
}

object DescribeRaidArraysRequest {
  @scala.inline
  def apply(InstanceId: String = null, RaidArrayIds: Strings = null, StackId: String = null): DescribeRaidArraysRequest = {
    val __obj = js.Dynamic.literal()
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    if (RaidArrayIds != null) __obj.updateDynamic("RaidArrayIds")(RaidArrayIds)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[DescribeRaidArraysRequest]
  }
}

