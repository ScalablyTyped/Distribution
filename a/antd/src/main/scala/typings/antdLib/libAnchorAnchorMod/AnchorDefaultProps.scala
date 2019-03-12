package typings
package antdLib.libAnchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorDefaultProps extends AnchorProps {
  @JSName("affix")
  var affix_AnchorDefaultProps: scala.Boolean
  @JSName("prefixCls")
  var prefixCls_AnchorDefaultProps: java.lang.String
  @JSName("showInkInFixed")
  var showInkInFixed_AnchorDefaultProps: scala.Boolean
  @JSName("getContainer")
  def getContainer_MAnchorDefaultProps(): AnchorContainer
}

object AnchorDefaultProps {
  @scala.inline
  def apply(
    affix: scala.Boolean,
    getContainer: () => AnchorContainer,
    prefixCls: java.lang.String,
    showInkInFixed: scala.Boolean,
    bounds: scala.Int | scala.Double = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    className: java.lang.String = null,
    offsetTop: scala.Int | scala.Double = null,
    onClick: (/* e */ reactLib.reactMod.ReactNs.MouseEvent[stdLib.HTMLElement, reactLib.NativeMouseEvent], /* link */ antdLib.Anon_Href) => scala.Unit = null,
    style: reactLib.reactMod.ReactNs.CSSProperties = null
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

