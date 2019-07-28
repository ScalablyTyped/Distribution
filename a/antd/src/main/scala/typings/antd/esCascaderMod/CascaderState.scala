package typings.antd.esCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.undefined
  var inputFocused: Boolean
  var inputValue: String
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prevProps: CascaderProps
  var value: js.Array[String]
}

object CascaderState {
  @scala.inline
  def apply(
    inputFocused: Boolean,
    inputValue: String,
    prevProps: CascaderProps,
    value: js.Array[String],
    flattenOptions: js.Array[js.Array[CascaderOptionType]] = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined
  ): CascaderState = {
    val __obj = js.Dynamic.literal(inputFocused = inputFocused, inputValue = inputValue, prevProps = prevProps, value = value)
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions)
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible)
    __obj.asInstanceOf[CascaderState]
  }
}

