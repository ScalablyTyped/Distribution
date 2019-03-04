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

object AnimationPlayer {
  @scala.inline
  def apply(
    destroy: js.Function0[scala.Unit],
    finish: js.Function0[scala.Unit],
    getPosition: js.Function0[scala.Double],
    hasStarted: js.Function0[scala.Boolean],
    init: js.Function0[scala.Unit],
    onDestroy: js.Function1[js.Function0[scala.Unit], scala.Unit],
    onDone: js.Function1[js.Function0[scala.Unit], scala.Unit],
    onStart: js.Function1[js.Function0[scala.Unit], scala.Unit],
    pause: js.Function0[scala.Unit],
    play: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    restart: js.Function0[scala.Unit],
    setPosition: js.Function1[js.Any, scala.Unit],
    totalTime: scala.Double,
    beforeDestroy: js.Function0[_] = null,
    parentPlayer: AnimationPlayer = null
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(destroy = destroy, finish = finish, getPosition = getPosition, hasStarted = hasStarted, init = init, onDestroy = onDestroy, onDone = onDone, onStart = onStart, pause = pause, play = play, reset = reset, restart = restart, setPosition = setPosition, totalTime = totalTime)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(beforeDestroy)
    if (parentPlayer != null) __obj.updateDynamic("parentPlayer")(parentPlayer)
    __obj.asInstanceOf[AnimationPlayer]
  }
}

