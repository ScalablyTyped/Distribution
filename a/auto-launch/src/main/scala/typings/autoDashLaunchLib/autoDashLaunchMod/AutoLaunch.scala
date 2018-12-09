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

