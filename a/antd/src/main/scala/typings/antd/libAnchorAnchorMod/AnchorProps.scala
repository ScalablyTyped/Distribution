package typings.antd.libAnchorAnchorMod

import typings.antd.Anon_Href
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod.ReactNode
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnchorProps extends js.Object {
  var affix: js.UndefOr[Boolean] = js.undefined
  var bounds: js.UndefOr[Double] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var className: js.UndefOr[String] = js.undefined
  var getContainer: js.UndefOr[js.Function0[AnchorContainer]] = js.undefined
  /** Return customize highlight anchor */
  var getCurrentAnchor: js.UndefOr[js.Function0[String]] = js.undefined
  var offsetTop: js.UndefOr[Double] = js.undefined
  /** Listening event when scrolling change active link */
  var onChange: js.UndefOr[js.Function1[/* currentActiveLink */ String, Unit]] = js.undefined
  var onClick: js.UndefOr[
    js.Function2[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Anon_Href, Unit]
  ] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var showInkInFixed: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[CSSProperties] = js.undefined
  /** Scroll to target offset value, if none, it's offsetTop prop value or 0. */
  var targetOffset: js.UndefOr[Double] = js.undefined
}

object AnchorProps {
  @scala.inline
  def apply(
    affix: js.UndefOr[Boolean] = js.undefined,
    bounds: Int | Double = null,
    children: ReactNode = null,
    className: String = null,
    getContainer: () => AnchorContainer = null,
    getCurrentAnchor: () => String = null,
    offsetTop: Int | Double = null,
    onChange: /* currentActiveLink */ String => Unit = null,
    onClick: (/* e */ MouseEvent[HTMLElement, NativeMouseEvent], /* link */ Anon_Href) => Unit = null,
    prefixCls: String = null,
    showInkInFixed: js.UndefOr[Boolean] = js.undefined,
    style: CSSProperties = null,
    targetOffset: Int | Double = null
  ): AnchorProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(affix)) __obj.updateDynamic("affix")(affix.asInstanceOf[js.Any])
    if (bounds != null) __obj.updateDynamic("bounds")(bounds.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (getContainer != null) __obj.updateDynamic("getContainer")(js.Any.fromFunction0(getContainer))
    if (getCurrentAnchor != null) __obj.updateDynamic("getCurrentAnchor")(js.Any.fromFunction0(getCurrentAnchor))
    if (offsetTop != null) __obj.updateDynamic("offsetTop")(offsetTop.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction2(onClick))
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls.asInstanceOf[js.Any])
    if (!js.isUndefined(showInkInFixed)) __obj.updateDynamic("showInkInFixed")(showInkInFixed.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (targetOffset != null) __obj.updateDynamic("targetOffset")(targetOffset.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorProps]
  }
}

