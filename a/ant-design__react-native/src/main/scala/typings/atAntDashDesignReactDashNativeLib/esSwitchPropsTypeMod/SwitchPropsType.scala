package typings
package atAntDashDesignReactDashNativeLib.esSwitchPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SwitchPropsType extends js.Object {
  var checked: js.UndefOr[scala.Boolean] = js.undefined
  var color: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* checked */ scala.Boolean, scala.Unit]] = js.undefined
  var onPress: js.UndefOr[js.Function1[/* checked */ js.UndefOr[scala.Boolean], scala.Unit]] = js.undefined
}

object SwitchPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[scala.Boolean] = js.undefined,
    color: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    name: java.lang.String = null,
    onChange: /* checked */ scala.Boolean => scala.Unit = null,
    onPress: /* checked */ js.UndefOr[scala.Boolean] => scala.Unit = null
  ): SwitchPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[SwitchPropsType]
  }
}

