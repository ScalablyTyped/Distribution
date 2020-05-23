package typings.antdMobile.sliderPropsTypeMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SliderPropsType extends js.Object {
  var defaultValue: js.UndefOr[Double] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var handle: js.UndefOr[js.Any] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var onAfterChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* value */ js.UndefOr[Double], Unit]] = js.undefined
  var step: js.UndefOr[Double] = js.undefined
  var tipFormatter: js.UndefOr[js.Function1[/* value */ js.UndefOr[String], ReactNode]] = js.undefined
  var value: js.UndefOr[Double] = js.undefined
}

object SliderPropsType {
  @scala.inline
  def apply(
    defaultValue: js.UndefOr[Double] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    handle: js.Any = null,
    max: js.UndefOr[Double] = js.undefined,
    min: js.UndefOr[Double] = js.undefined,
    onAfterChange: /* value */ js.UndefOr[Double] => Unit = null,
    onChange: /* value */ js.UndefOr[Double] => Unit = null,
    step: js.UndefOr[Double] = js.undefined,
    tipFormatter: /* value */ js.UndefOr[String] => ReactNode = null,
    value: js.UndefOr[Double] = js.undefined
  ): SliderPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(defaultValue)) __obj.updateDynamic("defaultValue")(defaultValue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.get.asInstanceOf[js.Any])
    if (handle != null) __obj.updateDynamic("handle")(handle.asInstanceOf[js.Any])
    if (!js.isUndefined(max)) __obj.updateDynamic("max")(max.get.asInstanceOf[js.Any])
    if (!js.isUndefined(min)) __obj.updateDynamic("min")(min.get.asInstanceOf[js.Any])
    if (onAfterChange != null) __obj.updateDynamic("onAfterChange")(js.Any.fromFunction1(onAfterChange))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(step)) __obj.updateDynamic("step")(step.get.asInstanceOf[js.Any])
    if (tipFormatter != null) __obj.updateDynamic("tipFormatter")(js.Any.fromFunction1(tipFormatter))
    if (!js.isUndefined(value)) __obj.updateDynamic("value")(value.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SliderPropsType]
  }
}

