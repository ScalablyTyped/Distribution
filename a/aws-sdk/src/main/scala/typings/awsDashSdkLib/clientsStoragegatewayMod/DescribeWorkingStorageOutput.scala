package typings
package awsDashSdkLib.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeWorkingStorageOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[DiskIds] = js.undefined
  var GatewayARN: js.UndefOr[GatewayARN] = js.undefined
  /**
    * The total working storage in bytes allocated for the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined
  /**
    * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway, this field returns 0.
    */
  var WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined
}

object DescribeWorkingStorageOutput {
  @scala.inline
  def apply(
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null,
    WorkingStorageAllocatedInBytes: js.UndefOr[long] = js.undefined,
    WorkingStorageUsedInBytes: js.UndefOr[long] = js.undefined
  ): DescribeWorkingStorageOutput = {
    val __obj = js.Dynamic.literal()
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(WorkingStorageAllocatedInBytes)) __obj.updateDynamic("WorkingStorageAllocatedInBytes")(WorkingStorageAllocatedInBytes)
    if (!js.isUndefined(WorkingStorageUsedInBytes)) __obj.updateDynamic("WorkingStorageUsedInBytes")(WorkingStorageUsedInBytes)
    __obj.asInstanceOf[DescribeWorkingStorageOutput]
  }
}

