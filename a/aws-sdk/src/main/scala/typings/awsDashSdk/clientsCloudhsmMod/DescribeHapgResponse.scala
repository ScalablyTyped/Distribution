package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.HapgArn] = js.native
  /**
    * The serial number of the high-availability partition group.
    */
  var HapgSerial: js.UndefOr[String] = js.native
  /**
    * 
    */
  var HsmsLastActionFailed: js.UndefOr[HsmList] = js.native
  /**
    * 
    */
  var HsmsPendingDeletion: js.UndefOr[HsmList] = js.native
  /**
    * 
    */
  var HsmsPendingRegistration: js.UndefOr[HsmList] = js.native
  /**
    * The label for the high-availability partition group.
    */
  var Label: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.Label] = js.native
  /**
    * The date and time the high-availability partition group was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The list of partition serial numbers that belong to the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[typings.awsDashSdk.clientsCloudhsmMod.PartitionSerialList] = js.native
  /**
    * The state of the high-availability partition group.
    */
  var State: js.UndefOr[CloudHsmObjectState] = js.native
}

object DescribeHapgResponse {
  @scala.inline
  def apply(
    HapgArn: HapgArn = null,
    HapgSerial: String = null,
    HsmsLastActionFailed: HsmList = null,
    HsmsPendingDeletion: HsmList = null,
    HsmsPendingRegistration: HsmList = null,
    Label: Label = null,
    LastModifiedTimestamp: Timestamp = null,
    PartitionSerialList: PartitionSerialList = null,
    State: CloudHsmObjectState = null
  ): DescribeHapgResponse = {
    val __obj = js.Dynamic.literal()
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn.asInstanceOf[js.Any])
    if (HapgSerial != null) __obj.updateDynamic("HapgSerial")(HapgSerial.asInstanceOf[js.Any])
    if (HsmsLastActionFailed != null) __obj.updateDynamic("HsmsLastActionFailed")(HsmsLastActionFailed.asInstanceOf[js.Any])
    if (HsmsPendingDeletion != null) __obj.updateDynamic("HsmsPendingDeletion")(HsmsPendingDeletion.asInstanceOf[js.Any])
    if (HsmsPendingRegistration != null) __obj.updateDynamic("HsmsPendingRegistration")(HsmsPendingRegistration.asInstanceOf[js.Any])
    if (Label != null) __obj.updateDynamic("Label")(Label.asInstanceOf[js.Any])
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp.asInstanceOf[js.Any])
    if (PartitionSerialList != null) __obj.updateDynamic("PartitionSerialList")(PartitionSerialList.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHapgResponse]
  }
}

