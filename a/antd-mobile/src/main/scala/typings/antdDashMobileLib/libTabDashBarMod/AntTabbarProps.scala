package typings
package antdDashMobileLib.libTabDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTabbarProps
  extends antdDashMobileLib.libTabDashBarPropsTypeMod.TabBarProps {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var hidden: js.UndefOr[scala.Boolean] = js.undefined
  var noRenderContent: js.UndefOr[scala.Boolean] = js.undefined
  var placeholder: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  var prefixCls: js.UndefOr[java.lang.String] = js.undefined
  var prerenderingSiblingsNumber: js.UndefOr[scala.Double] = js.undefined
}

object AntTabbarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    barTintColor: java.lang.String = null,
    className: java.lang.String = null,
    hidden: js.UndefOr[scala.Boolean] = js.undefined,
    noRenderContent: js.UndefOr[scala.Boolean] = js.undefined,
    placeholder: reactLib.reactMod.ReactNs.ReactNode = null,
    prefixCls: java.lang.String = null,
    prerenderingSiblingsNumber: scala.Int | scala.Double = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tabBarPosition: antdDashMobileLib.antdDashMobileLibStrings.top | antdDashMobileLib.antdDashMobileLibStrings.bottom = null,
    tintColor: java.lang.String = null,
    unselectedTintColor: java.lang.String = null
  ): AntTabbarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(hidden)) __obj.updateDynamic("hidden")(hidden)
    if (!js.isUndefined(noRenderContent)) __obj.updateDynamic("noRenderContent")(noRenderContent)
    if (placeholder != null) __obj.updateDynamic("placeholder")(placeholder.asInstanceOf[js.Any])
    if (prefixCls != null) __obj.updateDynamic("prefixCls")(prefixCls)
    if (prerenderingSiblingsNumber != null) __obj.updateDynamic("prerenderingSiblingsNumber")(prerenderingSiblingsNumber.asInstanceOf[js.Any])
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor)
    __obj.asInstanceOf[AntTabbarProps]
  }
}

