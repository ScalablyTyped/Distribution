package typings.atAntDashDesignReactDashNative.esRadioPropsTypeMod

import typings.atAntDashDesignReactDashNative.Anon_Target
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadioItemPropsType extends RadioPropsType {
  var onPress: js.UndefOr[js.Function0[_]] = js.undefined
  var radioProps: js.UndefOr[js.Object] = js.undefined
}

object RadioItemPropsType {
  @scala.inline
  def apply(
    checked: js.UndefOr[Boolean] = js.undefined,
    defaultChecked: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    name: String = null,
    onChange: /* e */ Anon_Target => Unit = null,
    onPress: () => _ = null,
    radioProps: js.Object = null,
    wrapLabel: js.UndefOr[Boolean] = js.undefined
  ): RadioItemPropsType = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(checked)) __obj.updateDynamic("checked")(checked)
    if (!js.isUndefined(defaultChecked)) __obj.updateDynamic("defaultChecked")(defaultChecked)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction0(onPress))
    if (radioProps != null) __obj.updateDynamic("radioProps")(radioProps)
    if (!js.isUndefined(wrapLabel)) __obj.updateDynamic("wrapLabel")(wrapLabel)
    __obj.asInstanceOf[RadioItemPropsType]
  }
}

