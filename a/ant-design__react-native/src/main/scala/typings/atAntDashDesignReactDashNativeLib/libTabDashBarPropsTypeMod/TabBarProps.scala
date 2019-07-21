package typings
package atAntDashDesignReactDashNativeLib.libTabDashBarPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TabBarProps extends js.Object {
  var animated: js.UndefOr[scala.Boolean] = js.undefined
  var barTintColor: js.UndefOr[java.lang.String] = js.undefined
  var swipeable: js.UndefOr[scala.Boolean] = js.undefined
  var tintColor: js.UndefOr[java.lang.String] = js.undefined
  var unselectedTintColor: js.UndefOr[java.lang.String] = js.undefined
}

object TabBarProps {
  @scala.inline
  def apply(
    animated: js.UndefOr[scala.Boolean] = js.undefined,
    barTintColor: java.lang.String = null,
    swipeable: js.UndefOr[scala.Boolean] = js.undefined,
    tintColor: java.lang.String = null,
    unselectedTintColor: java.lang.String = null
  ): TabBarProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animated)) __obj.updateDynamic("animated")(animated)
    if (barTintColor != null) __obj.updateDynamic("barTintColor")(barTintColor)
    if (!js.isUndefined(swipeable)) __obj.updateDynamic("swipeable")(swipeable)
    if (tintColor != null) __obj.updateDynamic("tintColor")(tintColor)
    if (unselectedTintColor != null) __obj.updateDynamic("unselectedTintColor")(unselectedTintColor)
    __obj.asInstanceOf[TabBarProps]
  }
}

