package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.collapseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseOptions extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var allowMultiple: js.UndefOr[scala.Boolean] = js.undefined
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var disallowToggle: js.UndefOr[scala.Boolean] = js.undefined
  var startCollapsed: js.UndefOr[scala.Boolean] = js.undefined
}

object ICollapseOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    allowMultiple: js.UndefOr[scala.Boolean] = js.undefined,
    animation: java.lang.String = null,
    disallowToggle: js.UndefOr[scala.Boolean] = js.undefined,
    startCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  ): ICollapseOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (!js.isUndefined(allowMultiple)) __obj.updateDynamic("allowMultiple")(allowMultiple)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (!js.isUndefined(disallowToggle)) __obj.updateDynamic("disallowToggle")(disallowToggle)
    if (!js.isUndefined(startCollapsed)) __obj.updateDynamic("startCollapsed")(startCollapsed)
    __obj.asInstanceOf[ICollapseOptions]
  }
}

