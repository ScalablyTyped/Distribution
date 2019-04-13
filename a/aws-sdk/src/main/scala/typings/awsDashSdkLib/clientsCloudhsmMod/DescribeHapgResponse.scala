package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeHapgResponse extends js.Object {
  /**
    * The ARN of the high-availability partition group.
    */
  var HapgArn: js.UndefOr[HapgArn] = js.undefined
  /**
    * The serial number of the high-availability partition group.
    */
  var HapgSerial: js.UndefOr[String] = js.undefined
  /**
    * 
    */
  var HsmsLastActionFailed: js.UndefOr[HsmList] = js.undefined
  /**
    * 
    */
  var HsmsPendingDeletion: js.UndefOr[HsmList] = js.undefined
  /**
    * 
    */
  var HsmsPendingRegistration: js.UndefOr[HsmList] = js.undefined
  /**
    * The label for the high-availability partition group.
    */
  var Label: js.UndefOr[Label] = js.undefined
  /**
    * The date and time the high-availability partition group was last modified.
    */
  var LastModifiedTimestamp: js.UndefOr[Timestamp] = js.undefined
  /**
    * The list of partition serial numbers that belong to the high-availability partition group.
    */
  var PartitionSerialList: js.UndefOr[PartitionSerialList] = js.undefined
  /**
    * The state of the high-availability partition group.
    */
  var State: js.UndefOr[CloudHsmObjectState] = js.undefined
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
    if (HapgArn != null) __obj.updateDynamic("HapgArn")(HapgArn)
    if (HapgSerial != null) __obj.updateDynamic("HapgSerial")(HapgSerial)
    if (HsmsLastActionFailed != null) __obj.updateDynamic("HsmsLastActionFailed")(HsmsLastActionFailed)
    if (HsmsPendingDeletion != null) __obj.updateDynamic("HsmsPendingDeletion")(HsmsPendingDeletion)
    if (HsmsPendingRegistration != null) __obj.updateDynamic("HsmsPendingRegistration")(HsmsPendingRegistration)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    if (LastModifiedTimestamp != null) __obj.updateDynamic("LastModifiedTimestamp")(LastModifiedTimestamp)
    if (PartitionSerialList != null) __obj.updateDynamic("PartitionSerialList")(PartitionSerialList)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeHapgResponse]
  }
}

