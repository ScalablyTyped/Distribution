package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<antd.antd/lib/cascader.CascaderState> */
trait PartialCascaderStateFlattenOptions extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[antdLib.libCascaderMod.CascaderOptionType]]] = js.undefined
  var inputFocused: js.UndefOr[scala.Boolean] = js.undefined
  var inputValue: js.UndefOr[java.lang.String] = js.undefined
  var popupVisible: js.UndefOr[scala.Boolean] = js.undefined
  var prevProps: js.UndefOr[antdLib.libCascaderMod.CascaderProps] = js.undefined
  var value: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object PartialCascaderStateFlattenOptions {
  @scala.inline
  def apply(
    flattenOptions: js.Array[js.Array[antdLib.libCascaderMod.CascaderOptionType]] = null,
    inputFocused: js.UndefOr[scala.Boolean] = js.undefined,
    inputValue: java.lang.String = null,
    popupVisible: js.UndefOr[scala.Boolean] = js.undefined,
    prevProps: antdLib.libCascaderMod.CascaderProps = null,
    value: js.Array[java.lang.String] = null
  ): PartialCascaderStateFlattenOptions = {
    val __obj = js.Dynamic.literal()
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions)
    if (!js.isUndefined(inputFocused)) __obj.updateDynamic("inputFocused")(inputFocused)
    if (inputValue != null) __obj.updateDynamic("inputValue")(inputValue)
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible)
    if (prevProps != null) __obj.updateDynamic("prevProps")(prevProps)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[PartialCascaderStateFlattenOptions]
  }
}

