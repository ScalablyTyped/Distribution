package typings.atAntDashDesignReactDashNative.libRadioPropsTypeMod

import typings.atAntDashDesignReactDashNative.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioPropsType extends js.Object {
  var checked: js.UndefOr[Boolean] = js.undefined
  var defaultChecked: js.UndefOr[Boolean] = js.undefined
  var disabled: js.UndefOr[Boolean] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[js.Function1[/* e */ Anon_Target, Unit]] = js.undefined
  var wrapLabel: js.UndefOr[Boolean] = js.undefined
}

object RadioPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ Anon_Target => Unit = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[RadioPropsType]
  }
}

