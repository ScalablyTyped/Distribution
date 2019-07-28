package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InventoryEncryption extends js.Object {
  /**
    * Specifies the use of SSE-KMS to encrypt delivered Inventory reports.
    */
  var SSEKMS: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSEKMS] = js.undefined
  /**
    * Specifies the use of SSE-S3 to encrypt delivered Inventory reports.
    */
  var SSES3: js.UndefOr[typings.awsDashSdk.clientsS3Mod.SSES3] = js.undefined
}

object InventoryEncryption {
  @scala.inline
  def apply(SSEKMS: SSEKMS = null, SSES3: SSES3 = null): InventoryEncryption = {
    val __obj = js.Dynamic.literal()
    if (SSEKMS != null) __obj.updateDynamic("SSEKMS")(SSEKMS)
    if (SSES3 != null) __obj.updateDynamic("SSES3")(SSES3)
    __obj.asInstanceOf[InventoryEncryption]
  }
}

