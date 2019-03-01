package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabOptions extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var navClass: js.UndefOr[java.lang.String] = js.undefined
  var template: js.UndefOr[java.lang.String] = js.undefined
}

object ITabOptions {
  @scala.inline
  def apply(
    activeClass: java.lang.String = null,
    animation: java.lang.String = null,
    navClass: java.lang.String = null,
    template: java.lang.String = null
  ): ITabOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (navClass != null) __obj.updateDynamic("navClass")(navClass)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ITabOptions]
  }
}

