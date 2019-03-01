package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.tabNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITabProvider extends js.Object {
  var defaults: ITabOptions
}

object ITabProvider {
  @scala.inline
  def apply(defaults: ITabOptions): ITabProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ITabProvider]
  }
}

