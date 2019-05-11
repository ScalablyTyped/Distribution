package typings
package antdLib.esDateDashPickerInterfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var defaultValue: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
  var onChange: js.UndefOr[
    js.Function2[/* date */ momentLib.momentMod.Moment, /* dateString */ java.lang.String, scala.Unit]
  ] = js.undefined
  var placeholder: js.UndefOr[java.lang.String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ DatePickerMode, reactLib.reactMod.ReactNode]] = js.undefined
  var value: js.UndefOr[momentLib.momentMod.Moment] = js.undefined
}

object SinglePickerProps {
  @scala.inline
  def apply(
    defaultPickerValue: momentLib.momentMod.Moment = null,
    defaultValue: momentLib.momentMod.Moment = null,
    onChange: (/* date */ momentLib.momentMod.Moment, /* dateString */ java.lang.String) => scala.Unit = null,
    placeholder: java.lang.String = null,
    renderExtraFooter: /* mode */ DatePickerMode => reactLib.reactMod.ReactNode = null,
    value: momentLib.momentMod.Moment = null
  ): SinglePickerProps = {
    val __obj = js.Dynamic.literal()
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder)
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SinglePickerProps]
  }
}

