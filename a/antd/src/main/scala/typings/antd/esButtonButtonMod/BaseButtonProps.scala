package typings.antd.esButtonButtonMod

import typings.antd.Anon_Delay
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BaseButtonProps extends js.Object {
  var block: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var ghost: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var loading: js.UndefOr[Boolean | Anon_Delay] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var shape: js.UndefOr[ButtonShape] = js.undefined
  var size: js.UndefOr[ButtonSize] = js.undefined
  var `type`: js.UndefOr[ButtonType] = js.undefined
}

object BaseButtonProps {
  @scala.inline
  def apply(
    block: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    ghost: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    loading: Boolean | Anon_Delay = null,
    prefixCls: String = null,
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

