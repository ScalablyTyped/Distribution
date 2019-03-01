package typings
package adalDashAngularLib.adalDashAngularMod.Global

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Window extends js.Object {
  var Logging: adalDashAngularLib.adalDashAngularMod.AuthenticationContextNs.LoggingConfig
}

object Window {
  @scala.inline
  def apply(Logging: adalDashAngularLib.adalDashAngularMod.AuthenticationContextNs.LoggingConfig): Window = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Logging")(Logging)
    __obj.asInstanceOf[Window]
  }
}

