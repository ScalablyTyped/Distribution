package typings.alexaDashSdk.alexaDashSdkMod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Intent extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.undefined
  var name: String
  var slots: Record[String, SlotValue]
}

object Intent {
  @scala.inline
  def apply(name: String, slots: Record[String, SlotValue], confirmationStatus: ConfirmationStatuses = null): Intent = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], slots = slots.asInstanceOf[js.Any])
    if (confirmationStatus != null) __obj.updateDynamic("confirmationStatus")(confirmationStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Intent]
  }
}

