package typings.antd.cascaderMod

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
    val __obj = js.Dynamic.literal(inputFocused = inputFocused.asInstanceOf[js.Any], inputValue = inputValue.asInstanceOf[js.Any], prevProps = prevProps.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible.asInstanceOf[js.Any])
    __obj.asInstanceOf[CascaderState]
  }
}

