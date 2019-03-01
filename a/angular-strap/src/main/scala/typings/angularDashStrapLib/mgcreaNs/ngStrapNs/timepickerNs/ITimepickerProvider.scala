package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.timepickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITimepickerProvider extends js.Object {
  var defaults: ITimepickerOptions
}

object ITimepickerProvider {
  @scala.inline
  def apply(defaults: ITimepickerOptions): ITimepickerProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaults")(defaults)
    __obj.asInstanceOf[ITimepickerProvider]
  }
}

