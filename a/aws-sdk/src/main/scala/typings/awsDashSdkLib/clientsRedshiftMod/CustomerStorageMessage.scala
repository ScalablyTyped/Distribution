package typings
package awsDashSdkLib.clientsRedshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerStorageMessage extends js.Object {
  /**
    * The total amount of storage currently used for snapshots.
    */
  var TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined
  /**
    * The total amount of storage currently provisioned.
    */
  var TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
}

object CustomerStorageMessage {
  @scala.inline
  def apply(
    TotalBackupSizeInMegaBytes: js.UndefOr[Double] = js.undefined,
    TotalProvisionedStorageInMegaBytes: js.UndefOr[Double] = js.undefined
  ): CustomerStorageMessage = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(TotalBackupSizeInMegaBytes)) __obj.updateDynamic("TotalBackupSizeInMegaBytes")(TotalBackupSizeInMegaBytes)
    if (!js.isUndefined(TotalProvisionedStorageInMegaBytes)) __obj.updateDynamic("TotalProvisionedStorageInMegaBytes")(TotalProvisionedStorageInMegaBytes)
    __obj.asInstanceOf[CustomerStorageMessage]
  }
}

