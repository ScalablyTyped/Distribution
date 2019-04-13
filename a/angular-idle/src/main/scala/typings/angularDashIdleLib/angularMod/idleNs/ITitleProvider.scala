package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Used to configure the Title service.
  */
trait ITitleProvider
  extends angularLib.angularMod.IServiceProvider {
  /**
    * Enables or disables the Title functionality.
    *
    * @param enabled Boolean, default is true.
    */
  def enabled(enabled: scala.Boolean): scala.Unit
}

object ITitleProvider {
  @scala.inline
  def apply($get: js.Any, enabled: scala.Boolean => scala.Unit): ITitleProvider = {
    val __obj = js.Dynamic.literal($get = $get, enabled = js.Any.fromFunction1(enabled))
  
    __obj.asInstanceOf[ITitleProvider]
  }
}

