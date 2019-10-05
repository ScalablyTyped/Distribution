package typings.angularDashStrap.mgcrea.ngStrap.collapse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var allowMultiple: js.UndefOr[Boolean] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var disallowToggle: js.UndefOr[Boolean] = js.undefined
  var startCollapsed: js.UndefOr[Boolean] = js.undefined
}

object ICollapseOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    allowMultiple: js.UndefOr[Boolean] = js.undefined,
    animation: String = null,
    disallowToggle: js.UndefOr[Boolean] = js.undefined,
    startCollapsed: js.UndefOr[Boolean] = js.undefined
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

