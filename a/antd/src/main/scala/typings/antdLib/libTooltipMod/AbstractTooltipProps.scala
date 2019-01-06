package typings
package antdLib.libTooltipMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AbstractTooltipProps extends js.Object {
  var align: js.UndefOr[TooltipAlignConfig] = js.undefined
  var arrowPointAtCenter: js.UndefOr[scala.Boolean] = js.undefined
  var autoAdjustOverflow: js.UndefOr[scala.Boolean | antdLib.libTooltipPlacementsMod.AdjustOverflow] = js.undefined
  var builtinPlacements: js.UndefOr[js.Object] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var defaultVisible: js.UndefOr[scala.Boolean] = js.undefined
  var getPopupContainer: js.UndefOr[
    js.Function1[/* triggerNode */ js.UndefOr[reactLib.HTMLElement], reactLib.HTMLElement]
  ] = js.undefined
  var getTooltipContainer: js.UndefOr[js.Function1[/* triggerNode */ reactLib.Element, reactLib.HTMLElement]] = js.undefined
  var mouseEnterDelay: js.UndefOr[scala.Double] = js.undefined
  var mouseLeaveDelay: js.UndefOr[scala.Double] = js.undefined
  var onVisibleChange: js.UndefOr[js.Function1[/* visible */ scala.Boolean, scala.Unit]] = js.undefined
  var openClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayClassName: js.UndefOr[java.lang.String] = js.undefined
  var overlayStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var placement: js.UndefOr[TooltipPlacement] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var style: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  var transitionName: js.UndefOr[java.lang.String] = js.undefined
  var trigger: js.UndefOr[TooltipTrigger] = js.undefined
  var visible: js.UndefOr[scala.Boolean] = js.undefined
}

