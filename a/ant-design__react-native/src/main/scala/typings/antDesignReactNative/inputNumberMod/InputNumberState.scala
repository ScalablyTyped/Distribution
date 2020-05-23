package typings.antDesignReactNative.inputNumberMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputNumberState extends js.Object {
  var focused: js.UndefOr[Boolean] = js.undefined
  var inputValue: js.UndefOr[Double] = js.undefined
  var value: Double
}

object InputNumberState {
  @scala.inline
  def apply(
    value: Double,
    focused: js.UndefOr[Boolean] = js.undefined,
    inputValue: js.UndefOr[Double] = js.undefined
  ): InputNumberState = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    if (!js.isUndefined(focused)) __obj.updateDynamic("focused")(focused.get.asInstanceOf[js.Any])
    if (!js.isUndefined(inputValue)) __obj.updateDynamic("inputValue")(inputValue.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputNumberState]
  }
}

