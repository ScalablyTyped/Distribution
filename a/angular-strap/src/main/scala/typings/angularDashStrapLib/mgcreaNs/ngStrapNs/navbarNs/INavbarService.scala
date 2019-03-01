package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.navbarNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INavbarService extends js.Object {
  var defaults: INavbarOptions
}

object INavbarService {
  @scala.inline
  def apply(defaults: INavbarOptions): INavbarService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[INavbarService]
  }
}

