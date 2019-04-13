package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Disk extends js.Object {
  /**
    * The iSCSI qualified name (IQN) that is defined for a disk. This field is not included in the response if the local disk is not defined as an iSCSI target. The format of this field is targetIqn::LUNNumber::region-volumeId. 
    */
  var DiskAllocationResource: js.UndefOr[java.lang.String] = js.undefined
  var DiskAllocationType: js.UndefOr[DiskAllocationType] = js.undefined
  var DiskAttributeList: js.UndefOr[DiskAttributeList] = js.undefined
  /**
    * The unique device ID or other distinguishing data that identifies a local disk.
    */
  var DiskId: js.UndefOr[DiskId] = js.undefined
  /**
    * The device node of a local disk as assigned by the virtualization environment.
    */
  var DiskNode: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The path of a local disk in the gateway virtual machine (VM).
    */
  var DiskPath: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The local disk size in bytes.
    */
  var DiskSizeInBytes: js.UndefOr[long] = js.undefined
  /**
    * A value that represents the status of a local disk.
    */
  var DiskStatus: js.UndefOr[java.lang.String] = js.undefined
}

object Disk {
  @scala.inline
  def apply(
    DiskAllocationResource: java.lang.String = null,
    DiskAllocationType: DiskAllocationType = null,
    DiskAttributeList: DiskAttributeList = null,
    DiskId: DiskId = null,
    DiskNode: java.lang.String = null,
    DiskPath: java.lang.String = null,
    DiskSizeInBytes: js.UndefOr[long] = js.undefined,
    DiskStatus: java.lang.String = null
  ): Disk = {
    val __obj = js.Dynamic.literal()
    if (DiskAllocationResource != null) __obj.updateDynamic("DiskAllocationResource")(DiskAllocationResource)
    if (DiskAllocationType != null) __obj.updateDynamic("DiskAllocationType")(DiskAllocationType)
    if (DiskAttributeList != null) __obj.updateDynamic("DiskAttributeList")(DiskAttributeList)
    if (DiskId != null) __obj.updateDynamic("DiskId")(DiskId)
    if (DiskNode != null) __obj.updateDynamic("DiskNode")(DiskNode)
    if (DiskPath != null) __obj.updateDynamic("DiskPath")(DiskPath)
    if (!js.isUndefined(DiskSizeInBytes)) __obj.updateDynamic("DiskSizeInBytes")(DiskSizeInBytes)
    if (DiskStatus != null) __obj.updateDynamic("DiskStatus")(DiskStatus)
    __obj.asInstanceOf[Disk]
  }
}

