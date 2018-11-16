package typings
package autoDashLaunchLib.autoDashLaunchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AutoLaunch extends js.Object {
  /**
     * Disables auto-launch at start up.
     */
  def disable(): stdLib.Promise[scala.Unit]
  /**
     * Enables auto-launch at start up.
     */
  def enable(): stdLib.Promise[scala.Unit]
  /**
     * Returns true if auto-launch is enabled.
     */
  def isEnabled(): stdLib.Promise[scala.Boolean]
}

