package typings
package atAngularAnimationsLib.srcPlayersAnimationUnderscorePlayerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/src/players/animation_player", "NoopAnimationPlayer")
@js.native
class NoopAnimationPlayer () extends AnimationPlayer {
  def this(duration: scala.Double) = this()
  def this(duration: scala.Double, delay: scala.Double) = this()
  var _destroyed: js.Any = js.native
  var _finished: js.Any = js.native
  var _onDestroyFns: js.Any = js.native
  var _onDoneFns: js.Any = js.native
  var _onFinish: js.Any = js.native
  var _onStart: js.Any = js.native
  var _onStartFns: js.Any = js.native
  var _started: js.Any = js.native
  /**
    * The parent of this player, if any.
    */
  /* CompleteClass */
  override var parentPlayer: AnimationPlayer | scala.Null = js.native
  /**
    * The total run time of the animation, in milliseconds.
    */
  /* CompleteClass */
  override val totalTime: scala.Double = js.native
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  /* CompleteClass */
  override def destroy(): scala.Unit = js.native
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  /* CompleteClass */
  override def finish(): scala.Unit = js.native
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def getPosition(): scala.Double = js.native
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  /* CompleteClass */
  override def hasStarted(): scala.Boolean = js.native
  /**
    * Initializes the animation.
    */
  /* CompleteClass */
  override def init(): scala.Unit = js.native
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  /* CompleteClass */
  override def onDestroy(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  /* CompleteClass */
  override def onDone(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  /* CompleteClass */
  override def onStart(fn: js.Function0[scala.Unit]): scala.Unit = js.native
  /**
    * Pauses the animation.
    */
  /* CompleteClass */
  override def pause(): scala.Unit = js.native
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  /* CompleteClass */
  override def play(): scala.Unit = js.native
  /**
    * Resets the animation to its initial state.
    */
  /* CompleteClass */
  override def reset(): scala.Unit = js.native
  /**
    * Restarts the paused animation.
    */
  /* CompleteClass */
  override def restart(): scala.Unit = js.native
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def setPosition(position: js.Any): scala.Unit = js.native
  def setPosition(position: scala.Double): scala.Unit = js.native
}

