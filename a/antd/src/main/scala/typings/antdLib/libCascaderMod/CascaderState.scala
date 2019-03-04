package typings
package antdLib.libCascaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CascaderState extends js.Object {
  var flattenOptions: js.UndefOr[js.Array[js.Array[CascaderOptionType]]]
  var inputFocused: scala.Boolean
  var inputValue: java.lang.String
  var popupVisible: js.UndefOr[scala.Boolean]
  var prevProps: CascaderProps
  var value: js.Array[java.lang.String]
}

object CascaderState {
  @scala.inline
  def apply(
    inputFocused: scala.Boolean,
    inputValue: java.lang.String,
    prevProps: CascaderProps,
    value: js.Array[java.lang.String],
    flattenOptions: js.Array[js.Array[CascaderOptionType]] = null,
    popupVisible: js.UndefOr[scala.Boolean] = js.undefined
  ): CascaderState = {
    val __obj = js.Dynamic.literal(inputFocused = inputFocused, inputValue = inputValue, prevProps = prevProps, value = value)
    if (flattenOptions != null) __obj.updateDynamic("flattenOptions")(flattenOptions)
    if (!js.isUndefined(popupVisible)) __obj.updateDynamic("popupVisible")(popupVisible)
    __obj.asInstanceOf[CascaderState]
  }
}

