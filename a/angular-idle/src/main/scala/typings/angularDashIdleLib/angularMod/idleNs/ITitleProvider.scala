package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure the Title service.
  */
trait ITitleProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
    * Enables or disables the Title functionality.
    *
    * @param enabled Boolean, default is true.
    */
  def enabled(enabled: scala.Boolean): scala.Unit
}

object ITitleProvider {
  @scala.inline
  def apply($get: js.Any, enabled: js.Function1[scala.Boolean, scala.Unit]): ITitleProvider = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("$get")($get)
    __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[ITitleProvider]
  }
}

