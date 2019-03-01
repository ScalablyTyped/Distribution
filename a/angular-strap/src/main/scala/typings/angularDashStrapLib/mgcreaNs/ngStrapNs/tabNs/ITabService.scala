package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabService extends js.Object {
  var controller: js.Any
  var defaults: ITabOptions
}

object ITabService {
  @scala.inline
  def apply(controller: js.Any, defaults: ITabOptions): ITabService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("controller")(controller)
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ITabService]
  }
}

