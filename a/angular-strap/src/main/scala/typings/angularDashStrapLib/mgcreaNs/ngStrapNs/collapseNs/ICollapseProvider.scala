package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.collapseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ICollapseProvider extends js.Object {
  var defaults: ICollapseOptions
}

object ICollapseProvider {
  @scala.inline
  def apply(defaults: ICollapseOptions): ICollapseProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ICollapseProvider]
  }
}

