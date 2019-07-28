package typings.antdDashMobile.libMenuMod

import typings.antdDashMobile.libMenuPropsTypeMod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StateType extends js.Object {
  var firstLevelSelectValue: String
  var height: js.UndefOr[Double] = js.undefined
  var value: js.UndefOr[ValueType] = js.undefined
}

object StateType {
  @scala.inline
  def apply(firstLevelSelectValue: String, height: Int | Double = null, value: ValueType = null): StateType = {
    val __obj = js.Dynamic.literal(firstLevelSelectValue = firstLevelSelectValue)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[StateType]
  }
}

