package typings.awsDashSdk.clientsNeptuneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidDBInstanceModificationsMessage extends js.Object {
  /**
    * Valid storage options for your DB instance.
    */
  var Storage: js.UndefOr[ValidStorageOptionsList] = js.undefined
}

object ValidDBInstanceModificationsMessage {
  @scala.inline
  def apply(Storage: ValidStorageOptionsList = null): ValidDBInstanceModificationsMessage = {
    val __obj = js.Dynamic.literal()
    if (Storage != null) __obj.updateDynamic("Storage")(Storage)
    __obj.asInstanceOf[ValidDBInstanceModificationsMessage]
  }
}

