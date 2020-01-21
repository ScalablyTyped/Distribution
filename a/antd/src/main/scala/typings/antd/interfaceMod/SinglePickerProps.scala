package typings.antd.interfaceMod

import typings.moment.mod.Moment
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SinglePickerProps extends js.Object {
  var defaultPickerValue: js.UndefOr[Moment | Null] = js.undefined
  var defaultValue: js.UndefOr[Moment | Null] = js.undefined
  var onChange: js.UndefOr[js.Function2[/* date */ Moment | Null, /* dateString */ String, Unit]] = js.undefined
  var placeholder: js.UndefOr[String] = js.undefined
  var renderExtraFooter: js.UndefOr[js.Function1[/* mode */ DatePickerMode, ReactNode]] = js.undefined
  var value: js.UndefOr[Moment | Null] = js.undefined
}

object SinglePickerProps {
  @scala.inline
  def apply(
    defaultPickerValue: Moment = null,
    defaultValue: Moment = null,
    onChange: (/* date */ Moment | Null, /* dateString */ String) => Unit = null,
    placeholder: String = null,
    renderExtraFooter: /* mode */ DatePickerMode => ReactNode = null,
    value: Moment = null
  ): SinglePickerProps = {
    val __obj = js.Dynamic.literal()
    if (defaultPickerValue != null) __obj.updateDynamic("defaultPickerValue")(defaultPickerValue.asInstanceOf[js.Any])
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction2(onChange))
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (renderExtraFooter != null) __obj.updateDynamic("renderExtraFooter")(js.Any.fromFunction1(renderExtraFooter))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SinglePickerProps]
  }
}

