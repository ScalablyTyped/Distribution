package typings.antdDashMobile.esTabDashBarMod

import typings.antdDashMobile.antdDashMobileStrings.bottom
import typings.antdDashMobile.antdDashMobileStrings.top
import typings.antdDashMobile.esTabDashBarPropsTypeMod.TabBarProps
import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AntTabbarProps extends TabBarProps {
  var className: js.UndefOr[String] = js.undefined
  var hidden: js.UndefOr[Boolean] = js.undefined
  var noRenderContent: js.UndefOr[Boolean] = js.undefined
  var placeholder: js.UndefOr[ReactNode] = js.undefined
  var prefixCls: js.UndefOr[String] = js.undefined
  var prerenderingSiblingsNumber: js.UndefOr[Double] = js.undefined
}

object AntTabbarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    barTintColor: String = null,
    className: String = null,
    hidden: js.UndefOr[Boolean] = js.undefined,
    noRenderContent: js.UndefOr[Boolean] = js.undefined,
    placeholder: ReactNode = null,
    prefixCls: String = null,
    prerenderingSiblingsNumber: Int | Double = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarPosition: top | bottom = null,
    tintColor: String = null,
    unselectedTintColor: String = null
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

