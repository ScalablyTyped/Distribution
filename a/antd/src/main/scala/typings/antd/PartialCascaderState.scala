package typings.antd

import typings.antd.esCascaderMod.CascaderOptionType
import typings.antd.esCascaderMod.CascaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/es/cascader.CascaderState> */
trait PartialCascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]] = js.undefined
  var inputFocused: js.UndefOr[Boolean] = js.undefined
  var inputValue: js.UndefOr[String] = js.undefined
  var popupVisible: js.UndefOr[Boolean] = js.undefined
  var prevProps: js.UndefOr[CascaderProps] = js.undefined
  var value: js.UndefOr[js.Array[String]] = js.undefined
}

object PartialCascaderState {
  @scala.inline
  def apply(
    flattenOptions: js.Array[js.Array[CascaderOptionType]] = null,
    inputFocused: js.UndefOr[Boolean] = js.undefined,
    inputValue: String = null,
    popupVisible: js.UndefOr[Boolean] = js.undefined,
    prevProps: CascaderProps = null,
    value: js.Array[String] = null
  ): PartialCascaderState = {
    val __obj = js.Dynamic.literal()
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions)
    if (!js.isUndefined(inputFocused)) __obj.updateDynamic("inputFocused")(inputFocused)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible)
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PartialCascaderState]
  }
}

