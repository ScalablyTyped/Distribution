package typings
package angularDashIdleLib.angularMod.idleNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Idle, once watch() is called, will start a timeout which if expires, will enter a warning state
  * countdown. Once the countdown reaches zero, idle will broadcast a timeout event indicating the
  * user has timed out (where your app should log them out or whatever you like). If the user performs
  * an action that triggers a watched DOM event that bubbles up to document.body, this will reset the
  * idle/warning state and start the process over again.
  */
trait IIdleService extends js.Object {
  /**
    * Gets the current idle value
    */
  def getIdle(): scala.Double
  /**
    * Gets the current timeout value
    */
  def getTimeout(): scala.Double
  /**
    * Whether or not the user appears to be idle.
    */
  def idling(): scala.Boolean
  /**
    * Manually trigger the idle interrupt that normally occurs during user activity.
    */
  def interrupt(): js.Any
  /**
    * Whether user has timed out (meaning idleDuration + timeout has passed without any activity)
    */
  def isExpired(): scala.Boolean
  /**
    * Whether or not the watch() has been called and it is watching for idleness.
    */
  def running(): scala.Boolean
  /**
    * Updates the idle value (see IdleProvider.idle()) and
    * restarts the watch if its running.
    */
  def setIdle(idle: scala.Double): scala.Unit
  /**
    * Updates the timeout value (see IdleProvider.timeout()) and
    * restarts the watch if its running.
    */
  def setTimeout(timeout: scala.Double): scala.Unit
  /**
    * Stops watching for idleness, and resets the idle/warning state.
    */
  def unwatch(): scala.Unit
  /**
    * Starts watching for idleness, or resets the idle/warning state and continues watching.
    */
  def watch(): scala.Unit
}

