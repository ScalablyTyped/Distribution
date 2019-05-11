package typings
package antdDashMobileLib.esMenuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var firstLevelSelectValue: java.lang.String
  var height: js.UndefOr[scala.Double] = js.undefined
  var value: js.UndefOr[antdDashMobileLib.esMenuPropsTypeMod.ValueType] = js.undefined
}

object StateType {
  @scala.inline
  def apply(
    firstLevelSelectValue: java.lang.String,
    height: scala.Int | scala.Double = null,
    value: antdDashMobileLib.esMenuPropsTypeMod.ValueType = null
  ): StateType = {
    val __obj = js.Dynamic.literal(firstLevelSelectValue = firstLevelSelectValue)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StateType]
  }
}

