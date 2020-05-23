package typings.antd.anchorAnchorMod

import typings.antd.anon.Href
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorDefaultProps extends AnchorProps {
  @JSName("affix")
  var affix_AnchorDefaultProps: Boolean
  @JSName("prefixCls")
  var prefixCls_AnchorDefaultProps: String
  @JSName("showInkInFixed")
  var showInkInFixed_AnchorDefaultProps: Boolean
  @JSName("getContainer")
  def getContainer_MAnchorDefaultProps(): AnchorContainer
}

object AnchorDefaultProps {
  @scala.inline
  def apply(
    affix: Boolean,
    getContainer: () => AnchorContainer,
    prefixCls: String,
    showInkInFixed: Boolean,
    bounds: js.UndefOr[Double] = js.undefined,
    children: ReactNode = null,
    className: String = null,
    getCurrentAnchor: () => String = null,
    offsetTop: js.UndefOr[Double] = js.undefined,
    onChange: /* currentActiveLink */ String => Unit = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Href) => Unit = null,
    style: CSSProperties = null,
    targetOffset: js.UndefOr[Double] = js.undefined
  ): AnchorDefaultProps = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    if (!js.isUndefined(bounds)) __obj.updateDynamic("bounds")(bounds.get.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (!js.isUndefined(offsetTop)) __obj.updateDynamic("offsetTop")(offsetTop.get.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (!js.isUndefined(targetOffset)) __obj.updateDynamic("targetOffset")(targetOffset.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorDefaultProps]
  }
}

