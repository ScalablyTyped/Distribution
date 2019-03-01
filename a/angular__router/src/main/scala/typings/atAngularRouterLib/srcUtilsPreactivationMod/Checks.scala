package typings
package atAngularRouterLib.srcUtilsPreactivationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Checks extends js.Object {
  var canActivateChecks: js.Array[CanActivate]
  var canDeactivateChecks: js.Array[CanDeactivate]
}

object Checks {
  @scala.inline
  def apply(canActivateChecks: js.Array[CanActivate], canDeactivateChecks: js.Array[CanDeactivate]): Checks = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("canActivateChecks")(canActivateChecks)
    __obj.updateDynamic("canDeactivateChecks")(canDeactivateChecks)
    __obj.asInstanceOf[Checks]
  }
}

