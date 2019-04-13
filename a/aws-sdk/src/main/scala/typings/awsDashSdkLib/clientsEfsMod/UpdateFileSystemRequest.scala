package typings
package awsDashSdkLib.clientsEfsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateFileSystemRequest extends js.Object {
  /**
    * The ID of the file system that you want to update.
    */
  var FileSystemId: awsDashSdkLib.clientsEfsMod.FileSystemId
  /**
    * (Optional) The amount of throughput, in MiB/s, that you want to provision for your file system. If you're not updating the amount of provisioned throughput for your file system, you don't need to provide this value in your request.
    */
  var ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined
  /**
    * (Optional) The throughput mode that you want your file system to use. If you're not updating your throughput mode, you don't need to provide this value in your request.
    */
  var ThroughputMode: js.UndefOr[ThroughputMode] = js.undefined
}

object UpdateFileSystemRequest {
  @scala.inline
  def apply(
    FileSystemId: FileSystemId,
    ProvisionedThroughputInMibps: js.UndefOr[ProvisionedThroughputInMibps] = js.undefined,
    ThroughputMode: ThroughputMode = null
  ): UpdateFileSystemRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId)
    if (!js.isUndefined(ProvisionedThroughputInMibps)) __obj.updateDynamic("ProvisionedThroughputInMibps")(ProvisionedThroughputInMibps)
    if (ThroughputMode != null) __obj.updateDynamic("ThroughputMode")(ThroughputMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFileSystemRequest]
  }
}

