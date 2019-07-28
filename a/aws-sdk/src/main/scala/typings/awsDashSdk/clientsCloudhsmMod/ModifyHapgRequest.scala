package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyHapgRequest extends js.Object {
  /**
    * The ARN of the high-availability partition group to modify.
    */
  var HapgArn: typings.awsDashSdk.clientsCloudhsmMod.HapgArn
  /**
    * The new label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.Label] = js.undefined
  /**
    * The list of partition serial numbers to make members of the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.PartitionSerialList] = js.undefined
}

object ModifyHapgRequest {
  @scala.inline
  def apply(HapgArn: HapgArn, Label: Label = null, PartitionSerialList: PartitionSerialList = null): ModifyHapgRequest = {
    val __obj = js.Dynamic.literal(HapgArn = HapgArn)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (PartitionSerialList != null) __obj.updateDynamic("PartitionSerialList")(PartitionSerialList)
    __obj.asInstanceOf[ModifyHapgRequest]
  }
}

