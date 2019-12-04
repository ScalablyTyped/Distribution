package typings.atAngularAnimations.browserBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularAnimations.atAngularAnimationsMod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "ɵWebAnimationsPlayer")
@js.native
class ɵWebAnimationsPlayer protected () extends AnimationPlayer {
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    options: StringDictionary[String | Double]
  ) = this()
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    options: StringDictionary[String | Double],
    _specialStyles: ɵangular_packages_animations_browser_browser_a
  ) = this()
  var _buildPlayer: js.Any = js.native
  var _delay: js.Any = js.native
  var _destroyed: js.Any = js.native
  var _duration: js.Any = js.native
  var _finalKeyframe: js.Any = js.native
  var _finished: js.Any = js.native
  var _initialized: js.Any = js.native
  var _onDestroyFns: js.Any = js.native
  var _onDoneFns: js.Any = js.native
  var _onFinish: js.Any = js.native
  var _onStartFns: js.Any = js.native
  var _preparePlayerBeforeStart: js.Any = js.native
  var _resetDomPlayerState: js.Any = js.native
  var _specialStyles: js.UndefOr[js.Any] = js.native
  var _started: js.Any = js.native
  var currentSnapshot: StringDictionary[String | Double] = js.native
  val domPlayer: DOMAnimation = js.native
  var element: js.Any = js.native
  var keyframes: js.Array[StringDictionary[String | Double]] = js.native
  var options: StringDictionary[String | Double] = js.native
  /**
    * The parent of this player, if any.
    */
  /* CompleteClass */
  override var parentPlayer: AnimationPlayer | Null = js.native
  var time: Double = js.native
  /**
    * The total run time of the animation, in milliseconds.
    */
  /* CompleteClass */
  override val totalTime: Double = js.native
  @JSName("beforeDestroy")
  def beforeDestroy_MɵWebAnimationsPlayer(): Unit = js.native
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  /* CompleteClass */
  override def destroy(): Unit = js.native
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  /* CompleteClass */
  override def finish(): Unit = js.native
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def getPosition(): Double = js.native
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  /* CompleteClass */
  override def hasStarted(): Boolean = js.native
  /**
    * Initializes the animation.
    */
  /* CompleteClass */
  override def init(): Unit = js.native
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  /* CompleteClass */
  override def onDestroy(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  /* CompleteClass */
  override def onDone(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  /* CompleteClass */
  override def onStart(fn: js.Function0[Unit]): Unit = js.native
  /**
    * Pauses the animation.
    */
  /* CompleteClass */
  override def pause(): Unit = js.native
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  /* CompleteClass */
  override def play(): Unit = js.native
  /**
    * Resets the animation to its initial state.
    */
  /* CompleteClass */
  override def reset(): Unit = js.native
  /**
    * Restarts the paused animation.
    */
  /* CompleteClass */
  override def restart(): Unit = js.native
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  /* CompleteClass */
  override def setPosition(position: js.Any): Unit = js.native
  def setPosition(p: Double): Unit = js.native
}

