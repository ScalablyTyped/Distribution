package typings.antdDashMobile.libTabDashBarPropsTypeMod

import typings.antdDashMobile.antdDashMobileStrings.bottom
import typings.antdDashMobile.antdDashMobileStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarProps extends js.Object {
  /** default: false */
  var animated: js.UndefOr[Boolean] = js.undefined
  var barTintColor: js.UndefOr[String] = js.undefined
  /** default: false */
  var swipeable: js.UndefOr[Boolean] = js.undefined
  var tabBarPosition: js.UndefOr[top | bottom] = js.undefined
  var tintColor: js.UndefOr[String] = js.undefined
  var unselectedTintColor: js.UndefOr[String] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    barTintColor: String = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tabBarPosition: top | bottom = null,
    tintColor: String = null,
    unselectedTintColor: String = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tabBarPosition != null) __obj.updateDynamic("tabBarPosition")(tabBarPosition.asInstanceOf[js.Any])
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor)
    __obj.asInstanceOf[TabBarProps]
  }
}

