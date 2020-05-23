package typings.antdMobile.menuMod

import typings.antdMobile.menuPropsTypeMod.ValueType
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
  def apply(firstLevelSelectValue: String, height: js.UndefOr[Double] = js.undefined, value: ValueType = null): StateType = {
    val __obj = js.Dynamic.literal(firstLevelSelectValue = firstLevelSelectValue.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateType]
  }
}

