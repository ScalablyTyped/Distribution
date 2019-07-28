package typings.antdDashMobile.libStepperMod

import typings.antdDashMobile.libStepperPropsTypeMod.StepPropsType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StepProps extends StepPropsType {
  var className: js.UndefOr[String] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showNumber: js.UndefOr[Boolean] = js.undefined
}

object StepProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    defaultValue: Int | Double = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    downStyle: js.Object = null,
    inputStyle: js.Object = null,
    max: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    onChange: /* value */ js.Any => Unit = null,
    prefixCls: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    showNumber: js.UndefOr[Boolean] = js.undefined,
    step: Double | String = null,
    upStyle: js.Object = null,
    value: Int | Double = null
  ): StepProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (className != null) __obj.updateDynamic("className")(className)
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (downStyle != null) __obj.updateDynamic("downStyle")(downStyle)
    if (inputStyle != null) __obj.updateDynamic("inputStyle")(inputStyle)
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly)
    if (!js.isUndefined(showNumber)) __obj.updateDynamic("showNumber")(showNumber)
    if (step != null) __obj.updateDynamic("step")(step.asInstanceOf[js.Any])
    if (upStyle != null) __obj.updateDynamic("upStyle")(upStyle)
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepProps]
  }
}

