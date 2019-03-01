package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.asideNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAsideProvider extends js.Object {
  var defaults: IAsideOptions
}

object IAsideProvider {
  @scala.inline
  def apply(defaults: IAsideOptions): IAsideProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[IAsideProvider]
  }
}

