package typings.angularDashStrap.mgcrea.ngStrap.tab

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var animation: js.UndefOr[String] = js.undefined
  var navClass: js.UndefOr[String] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object ITabOptions {
  @scala.inline
  def apply(
    activeClass: String = null,
    animation: String = null,
    navClass: String = null,
    template: String = null
  ): ITabOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (navClass != null) __obj.updateDynamic("navClass")(navClass)
    if (template != null) __obj.updateDynamic("template")(template)
    __obj.asInstanceOf[ITabOptions]
  }
}

