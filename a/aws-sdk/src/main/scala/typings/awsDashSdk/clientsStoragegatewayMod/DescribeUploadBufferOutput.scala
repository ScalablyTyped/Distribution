package typings.awsDashSdk.clientsStoragegatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUploadBufferOutput extends js.Object {
  /**
    * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage, then the DiskIds array is empty.
    */
  var DiskIds: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.DiskIds] = js.undefined
  var GatewayARN: js.UndefOr[typings.awsDashSdk.clientsStoragegatewayMod.GatewayARN] = js.undefined
  /**
    * The total number of bytes allocated in the gateway's as upload buffer.
    */
  var UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined
  /**
    * The total number of bytes being used in the gateway's upload buffer.
    */
  var UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined
}

object DescribeUploadBufferOutput {
  @scala.inline
  def apply(
    DiskIds: DiskIds = null,
    GatewayARN: GatewayARN = null,
    UploadBufferAllocatedInBytes: js.UndefOr[long] = js.undefined,
    UploadBufferUsedInBytes: js.UndefOr[long] = js.undefined
  ): DescribeUploadBufferOutput = {
    val __obj = js.Dynamic.literal()
    if (DiskIds != null) __obj.updateDynamic("DiskIds")(DiskIds)
    if (GatewayARN != null) __obj.updateDynamic("GatewayARN")(GatewayARN)
    if (!js.isUndefined(UploadBufferAllocatedInBytes)) __obj.updateDynamic("UploadBufferAllocatedInBytes")(UploadBufferAllocatedInBytes)
    if (!js.isUndefined(UploadBufferUsedInBytes)) __obj.updateDynamic("UploadBufferUsedInBytes")(UploadBufferUsedInBytes)
    __obj.asInstanceOf[DescribeUploadBufferOutput]
  }
}

