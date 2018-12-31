package typings
package atAngularAnimationsLib.srcPlayersAnimationUnderscorePlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimationPlayer extends js.Object {
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.undefined
  /**
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | scala.Null
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: scala.Double
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  def destroy(): scala.Unit
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  def finish(): scala.Unit
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  def getPosition(): scala.Double
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  def hasStarted(): scala.Boolean
  /**
    * Initializes the animation.
    */
  def init(): scala.Unit
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  def onDestroy(fn: js.Function0[scala.Unit]): scala.Unit
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  def onDone(fn: js.Function0[scala.Unit]): scala.Unit
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  def onStart(fn: js.Function0[scala.Unit]): scala.Unit
  /**
    * Pauses the animation.
    */
  def pause(): scala.Unit
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  def play(): scala.Unit
  /**
    * Resets the animation to its initial state.
    */
  def reset(): scala.Unit
  /**
    * Restarts the paused animation.
    */
  def restart(): scala.Unit
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  def setPosition(position: js.Any): scala.Unit
}

