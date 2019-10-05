package typings.angularDashStrap.mgcrea.ngStrap.navbar

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavbarOptions extends js.Object {
  var activeClass: js.UndefOr[String] = js.undefined
  var routeAttr: js.UndefOr[String] = js.undefined
}

object INavbarOptions {
  @scala.inline
  def apply(activeClass: String = null, routeAttr: String = null): INavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (routeAttr != null) __obj.updateDynamic("routeAttr")(routeAttr)
    __obj.asInstanceOf[INavbarOptions]
  }
}

