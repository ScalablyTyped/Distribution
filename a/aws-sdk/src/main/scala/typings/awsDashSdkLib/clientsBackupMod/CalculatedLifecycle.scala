package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CalculatedLifecycle extends js.Object {
  /**
    * A timestamp that specifies when to delete a recovery point.
    */
  var DeleteAt: js.UndefOr[timestamp] = js.undefined
  /**
    * A timestamp that specifies when to transition a recovery point to cold storage.
    */
  var MoveToColdStorageAt: js.UndefOr[timestamp] = js.undefined
}

object CalculatedLifecycle {
  @scala.inline
  def apply(DeleteAt: timestamp = null, MoveToColdStorageAt: timestamp = null): CalculatedLifecycle = {
    val __obj = js.Dynamic.literal()
    if (DeleteAt != null) __obj.updateDynamic("DeleteAt")(DeleteAt)
    if (MoveToColdStorageAt != null) __obj.updateDynamic("MoveToColdStorageAt")(MoveToColdStorageAt)
    __obj.asInstanceOf[CalculatedLifecycle]
  }
}

