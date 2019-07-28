package typings.atAntDashDesignReactDashNative.libTabDashBarMod

import typings.atAntDashDesignReactDashNative.libTabDashBarPropsTypeMod.TabBarProps
import typings.atAntDashDesignReactDashNative.libTabDashBarStyleMod.TabBarStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarNativeProps extends TabBarProps {
  var styles: js.UndefOr[TabBarStyle] = js.undefined
}

object TabBarNativeProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[Boolean] = js.undefined,
    barTintColor: String = null,
    styles: TabBarStyle = null,
    swipeable: js.UndefOr[Boolean] = js.undefined,
    tintColor: String = null,
    unselectedTintColor: String = null
  ): TabBarNativeProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (styles != null) __obj.updateDynamic("styles")(styles)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor)
    __obj.asInstanceOf[TabBarNativeProps]
  }
}

