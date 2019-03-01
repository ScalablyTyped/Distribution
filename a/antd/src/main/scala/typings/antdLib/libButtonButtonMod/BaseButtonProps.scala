package typings
package antdLib.libButtonButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseButtonProps extends js.Object {
  var block: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var ghost: js.UndefOr[scala.Boolean] = js.undefined
  var icon: js.UndefOr[java.lang.String] = js.undefined
  var loading: js.UndefOr[scala.Boolean | antdLib.Anon_Delay] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var shape: js.UndefOr[ButtonShape] = js.undefined
  var size: js.UndefOr[ButtonSize] = js.undefined
  var `type`: js.UndefOr[ButtonType] = js.undefined
}

object BaseButtonProps {
  @scala.inline
  def apply(
    block: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    ghost: js.UndefOr[scala.Boolean] = js.undefined,
    icon: java.lang.String = null,
    loading: scala.Boolean | antdLib.Anon_Delay = null,
    prefixCls: java.lang.String = null,
    shape: ButtonShape = null,
    size: ButtonSize = null,
    `type`: ButtonType = null
  ): BaseButtonProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(block)) __obj.updateDynamic("block")(block)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(ghost)) __obj.updateDynamic("ghost")(ghost)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (loading != null) __obj.updateDynamic("loading")(loading.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (shape != null) __obj.updateDynamic("shape")(shape)
    if (size != null) __obj.updateDynamic("size")(size)
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[BaseButtonProps]
  }
}

