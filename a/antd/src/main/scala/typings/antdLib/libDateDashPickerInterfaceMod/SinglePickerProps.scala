package typings
package antdLib.libDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* date */ momentLib.momentMod.Moment, /* dateString */ java.lang.String, scala.Unit]
  ] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
}

object SinglePickerProps {
  @scala.inline
  def apply(
    defaultPickerValue: momentLib.momentMod.Moment = null,
    defaultValue: momentLib.momentMod.Moment = null,
    onChange: (/* date */ momentLib.momentMod.Moment, /* dateString */ java.lang.String) => scala.Unit = null,
    value: momentLib.momentMod.Moment = null
  ): SinglePickerProps = {
    val __obj = js.Dynamic.literal()
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SinglePickerProps]
  }
}

