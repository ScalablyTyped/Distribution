package typings.atAngularAnimations.atAngularAnimationsMod

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
  var parentPlayer: AnimationPlayer | Null
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  def destroy(): Unit
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  def finish(): Unit
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  def getPosition(): Double
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  def hasStarted(): Boolean
  /**
    * Initializes the animation.
    */
  def init(): Unit
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  def onDestroy(fn: js.Function0[Unit]): Unit
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  def onDone(fn: js.Function0[Unit]): Unit
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  def onStart(fn: js.Function0[Unit]): Unit
  /**
    * Pauses the animation.
    */
  def pause(): Unit
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  def play(): Unit
  /**
    * Resets the animation to its initial state.
    */
  def reset(): Unit
  /**
    * Restarts the paused animation.
    */
  def restart(): Unit
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  def setPosition(position: js.Any): Unit
}

object AnimationPlayer {
  @scala.inline
  def apply(
    destroy: () => Unit,
    finish: () => Unit,
    getPosition: () => Double,
    hasStarted: () => Boolean,
    init: () => Unit,
    onDestroy: js.Function0[Unit] => Unit,
    onDone: js.Function0[Unit] => Unit,
    onStart: js.Function0[Unit] => Unit,
    pause: () => Unit,
    play: () => Unit,
    reset: () => Unit,
    restart: () => Unit,
    setPosition: js.Any => Unit,
    totalTime: Double,
    beforeDestroy: () => _ = null,
    parentPlayer: AnimationPlayer = null
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getPosition = js.Any.fromFunction0(getPosition), hasStarted = js.Any.fromFunction0(hasStarted), init = js.Any.fromFunction0(init), onDestroy = js.Any.fromFunction1(onDestroy), onDone = js.Any.fromFunction1(onDone), onStart = js.Any.fromFunction1(onStart), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), restart = js.Any.fromFunction0(restart), setPosition = js.Any.fromFunction1(setPosition), totalTime = totalTime)
    if (beforeDestroy != null) __obj.updateDynamic("beforeDestroy")(js.Any.fromFunction0(beforeDestroy))
    if (parentPlayer != null) __obj.updateDynamic("parentPlayer")(parentPlayer)
    __obj.asInstanceOf[AnimationPlayer]
  }
}

