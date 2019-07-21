package typings
package atAntDashDesignReactDashNativeLib.libTabDashBarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarNativeProps
  extends atAntDashDesignReactDashNativeLib.libTabDashBarPropsTypeMod.TabBarProps {
  var styles: js.UndefOr[atAntDashDesignReactDashNativeLib.libTabDashBarStyleMod.TabBarStyle] = js.undefined
}

object TabBarNativeProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    barTintColor: java.lang.String = null,
    styles: atAntDashDesignReactDashNativeLib.libTabDashBarStyleMod.TabBarStyle = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tintColor: java.lang.String = null,
    unselectedTintColor: java.lang.String = null
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

