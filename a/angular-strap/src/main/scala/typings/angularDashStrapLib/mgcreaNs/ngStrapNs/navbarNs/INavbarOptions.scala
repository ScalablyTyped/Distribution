package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.navbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavbarOptions extends js.Object {
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  var routeAttr: js.UndefOr[java.lang.String] = js.undefined
}

object INavbarOptions {
  @scala.inline
  def apply(activeClass: java.lang.String = null, routeAttr: java.lang.String = null): INavbarOptions = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (routeAttr != null) __obj.updateDynamic("routeAttr")(routeAttr)
    __obj.asInstanceOf[INavbarOptions]
  }
}

