package typings
package antdLib.libDropdownDropdownDashButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- antdLib.libDropdownDropdownMod.DropDownProps because var conflicts: className, prefixCls. Inlined trigger, overlay, onVisibleChange, visible, disabled, align, getPopupContainer, transitionName, placement, overlayClassName, overlayStyle, forceRender, mouseEnterDelay, mouseLeaveDelay, openClassName */ trait DropdownButtonProps
  extends antdLib.libButtonButtonDashGroupMod.ButtonGroupProps {
  var align: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[js.Any] = js.undefined
  var disabled: js.UndefOr[scala.Boolean] = js.undefined
  var forceRender: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var href: js.UndefOr[java.lang.String] = js.undefined
  var htmlType: js.UndefOr[antdLib.libButtonButtonMod.ButtonHTMLType] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[reactLib.reactMod.ReactNs.MouseEventHandler[reactLib.HTMLButtonElement]] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var openClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlay: reactLib.reactMod.ReactNs.ReactNode | antdLib.libDropdownDropdownMod.OverlayFunc
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var placement: js.UndefOr[antdLib.libDropdownDropdownMod.Placement] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[
    js.Array[
      antdLib.antdLibStrings.click | antdLib.antdLibStrings.hover | antdLib.antdLibStrings.contextMenu
    ]
  ] = js.undefined
  var `type`: js.UndefOr[DropdownButtonType] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

