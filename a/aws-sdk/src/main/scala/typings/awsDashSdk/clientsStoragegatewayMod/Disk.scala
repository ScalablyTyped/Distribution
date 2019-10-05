package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disk extends js.Object {
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId. 
    */
  var DiskAllocationResource: js.UndefOr[String] = js.undefined
  var DiskAllocationType: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DiskAllocationType] = js.undefined
  var DiskAttributeList: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DiskAttributeList] = js.undefined
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DiskId] = js.undefined
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[String] = js.undefined
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[String] = js.undefined
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[String] = js.undefined
}

object Disk {
  @scala.inline
  def apply(
    DiskAllocationResource: String = null,
    DiskAllocationType: DiskAllocationType = null,
    DiskAttributeList: DiskAttributeList = null,
    DiskId: DiskId = null,
    DiskNode: String = null,
    DiskPath: String = null,
    DiskSizeInBytes: Int | Double = null,
    DiskStatus: String = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (DiskAllocationResource != null) __obj.updateDynamic("DiskAllocationResource")(DiskAllocationResource)
    if (DiskAllocationType != null) __obj.updateDynamic("DiskAllocationType")(DiskAllocationType)
    if (DiskAttributeList != null) __obj.updateDynamic("DiskAttributeList")(DiskAttributeList)
    if (DiskId != null) __obj.updateDynamic("DiskId")(DiskId)
    if (DiskNode != null) __obj.updateDynamic("DiskNode")(DiskNode)
    if (DiskPath != null) __obj.updateDynamic("DiskPath")(DiskPath)
    if (DiskSizeInBytes != null) __obj.updateDynamic("DiskSizeInBytes")(DiskSizeInBytes.asInstanceOf[js.Any])
    if (DiskStatus != null) __obj.updateDynamic("DiskStatus")(DiskStatus)
    __obj.asInstanceOf[Disk]
  }
}

