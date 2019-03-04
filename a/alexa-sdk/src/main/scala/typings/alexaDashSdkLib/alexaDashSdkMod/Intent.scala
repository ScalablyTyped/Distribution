package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intent extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.undefined
  var name: java.lang.String
  var slots: stdLib.Record[java.lang.String, SlotValue]
}

object Intent {
  @scala.inline
  def apply(
    name: java.lang.String,
    slots: stdLib.Record[java.lang.String, SlotValue],
    confirmationStatus: ConfirmationStatuses = null
  ): Intent = {
    val __obj = js.Dynamic.literal(name = name, slots = slots)
    if (confirmationStatus != null) __obj.updateDynamic("confirmationStatus")(confirmationStatus)
    __obj.asInstanceOf[Intent]
  }
}

