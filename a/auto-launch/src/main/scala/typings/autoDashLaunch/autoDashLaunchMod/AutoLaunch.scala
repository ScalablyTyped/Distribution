package typings.autoDashLaunch.autoDashLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoLaunch extends js.Object {
  /**
    * Disables auto-launch at start up.
    */
  def disable(): js.Promise[Unit]
  /**
    * Enables auto-launch at start up.
    */
  def enable(): js.Promise[Unit]
  /**
    * Returns true if auto-launch is enabled.
    */
  def isEnabled(): js.Promise[Boolean]
}

object AutoLaunch {
  @scala.inline
  def apply(
    disable: () => js.Promise[Unit],
    enable: () => js.Promise[Unit],
    isEnabled: () => js.Promise[Boolean]
  ): AutoLaunch = {
    val __obj = js.Dynamic.literal(disable = js.Any.fromFunction0(disable), enable = js.Any.fromFunction0(enable), isEnabled = js.Any.fromFunction0(isEnabled))
  
    __obj.asInstanceOf[AutoLaunch]
  }
}

