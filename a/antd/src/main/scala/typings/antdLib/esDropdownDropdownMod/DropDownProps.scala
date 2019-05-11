package typings
package antdLib.esDropdownDropdownMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropDownProps extends js.Object {
  var align: js.UndefOr[Align] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ stdLib.HTMLElement, stdLib.HTMLElement]] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var openClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlay: reactLib.reactMod.ReactNode | OverlayFunc
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.CSSProperties] = js.undefined
  var placement: js.UndefOr[Placement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[
    js.Array[
      antdLib.antdLibStrings.click | antdLib.antdLibStrings.hover | antdLib.antdLibStrings.contextMenu
    ]
  ] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

object DropDownProps {
  @scala.inline
  def apply(
    overlay: reactLib.reactMod.ReactNode | OverlayFunc,
    align: Align = null,
    className: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    forceRender: js.UndefOr[scala.Boolean] = js.undefined,
    getPopupContainer: /* triggerNode */ stdLib.HTMLElement => stdLib.HTMLElement = null,
    mouseEnterDelay: scala.Int | scala.Double = null,
    mouseLeaveDelay: scala.Int | scala.Double = null,
    onVisibleChange: /* visible */ scala.Boolean => scala.Unit = null,
    openClassName: java.lang.String = null,
    overlayClassName: java.lang.String = null,
    overlayStyle: reactLib.reactMod.CSSProperties = null,
    placement: Placement = null,
    prefixCls: java.lang.String = null,
    transitionName: java.lang.String = null,
    trigger: js.Array[
      antdLib.antdLibStrings.click | antdLib.antdLibStrings.hover | antdLib.antdLibStrings.contextMenu
    ] = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): DropDownProps = {
    val __obj = js.Dynamic.literal(overlay = overlay.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (!js.isUndefined(forceRender)) __obj.updateDynamic("forceRender")(forceRender)
    if (getPopupContainer != null) __obj.updateDynamic("getPopupContainer")(js.Any.fromFunction1(getPopupContainer))
    if (mouseEnterDelay != null) __obj.updateDynamic("mouseEnterDelay")(mouseEnterDelay.asInstanceOf[js.Any])
    if (mouseLeaveDelay != null) __obj.updateDynamic("mouseLeaveDelay")(mouseLeaveDelay.asInstanceOf[js.Any])
    if (onVisibleChange != null) __obj.updateDynamic("onVisibleChange")(js.Any.fromFunction1(onVisibleChange))
    if (openClassName != null) __obj.updateDynamic("openClassName")(openClassName)
    if (overlayClassName != null) __obj.updateDynamic("overlayClassName")(overlayClassName)
    if (overlayStyle != null) __obj.updateDynamic("overlayStyle")(overlayStyle)
    if (placement != null) __obj.updateDynamic("placement")(placement)
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (transitionName != null) __obj.updateDynamic("transitionName")(transitionName)
    if (trigger != null) __obj.updateDynamic("trigger")(trigger)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[DropDownProps]
  }
}

