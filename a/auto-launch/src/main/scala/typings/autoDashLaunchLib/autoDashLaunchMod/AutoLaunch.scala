package typings
package autoDashLaunchLib.autoDashLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLaunch extends js.Object {
  /**
    * Disables auto-launch at start up.
    */
  def disable(): js.Promise[scala.Unit]
  /**
    * Enables auto-launch at start up.
    */
  def enable(): js.Promise[scala.Unit]
  /**
    * Returns true if auto-launch is enabled.
    */
  def isEnabled(): js.Promise[scala.Boolean]
}

object AutoLaunch {
  @scala.inline
  def apply(
    disable: () => js.Promise[scala.Unit],
    enable: () => js.Promise[scala.Unit],
    isEnabled: () => js.Promise[scala.Boolean]
  ): AutoLaunch = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[AutoLaunch]
  }
}

