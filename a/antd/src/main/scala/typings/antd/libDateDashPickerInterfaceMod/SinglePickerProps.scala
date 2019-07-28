package typings.antd.libDateDashPickerInterfaceMod

import typings.moment.momentMod.Moment
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[Moment] = js.undefined
  var defaultValue: js.UndefOr[Moment] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* date */ Moment, /* dateString */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ DatePickerMode, ReactNode]] = js.undefined
  var value: js.UndefOr[Moment] = js.undefined
}

object SinglePickerProps {
  @scala.inline
  def apply(
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    onChange: (/* date */ Moment, /* dateString */ String) => Unit = null,
    placeholder: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => ReactNode = null,
    value: Moment = null
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

