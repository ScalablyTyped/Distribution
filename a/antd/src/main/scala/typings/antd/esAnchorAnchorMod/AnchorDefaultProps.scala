package typings.antd.esAnchorAnchorMod

import typings.antd.Anon_Href
import typings.react.NativeMouseEvent
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.ReactNode
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
    bounds: Int | Double = null,
    children: ReactNode = null,
    className: String = null,
    offsetTop: Int | Double = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Anon_Href) => Unit = null,
    style: CSSProperties = null
  ): AnchorDefaultProps = {
    val __obj = js.Dynamic.literal(affix = affix, getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls, showInkInFixed = showInkInFixed)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[AnchorDefaultProps]
  }
}

