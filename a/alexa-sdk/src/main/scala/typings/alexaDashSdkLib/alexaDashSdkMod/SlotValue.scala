package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotValue extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.undefined
  var name: java.lang.String
  var resolutions: js.UndefOr[Resolutions] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object SlotValue {
  @scala.inline
  def apply(
    name: java.lang.String,
    confirmationStatus: ConfirmationStatuses = null,
    resolutions: Resolutions = null,
    value: js.Any = null
  ): SlotValue = {
    val __obj = js.Dynamic.literal(name = name)
    if (confirmationStatus != null) __obj.updateDynamic("confirmationStatus")(confirmationStatus)
    if (resolutions != null) __obj.updateDynamic("resolutions")(resolutions)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SlotValue]
  }
}

