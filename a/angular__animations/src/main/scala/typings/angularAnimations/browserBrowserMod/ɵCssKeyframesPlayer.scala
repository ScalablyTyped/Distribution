package typings.angularAnimations.browserBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.mod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "\u0275CssKeyframesPlayer")
@js.native
class ɵCssKeyframesPlayer protected () extends AnimationPlayer {
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    animationName: String,
    _duration: Double,
    _delay: Double,
    easing: String,
    _finalStyles: StringDictionary[js.Any]
  ) = this()
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    animationName: String,
    _duration: Double,
    _delay: Double,
    easing: String,
    _finalStyles: StringDictionary[js.Any],
    _specialStyles: ɵangularPackagesAnimationsBrowserBrowserA
  ) = this()
  var _buildStyler: js.Any = js.native
  val _delay: js.Any = js.native
  val _duration: js.Any = js.native
  val _finalStyles: js.Any = js.native
  var _flushDoneFns: js.Any = js.native
  var _flushStartFns: js.Any = js.native
  var _onDestroyFns: js.Any = js.native
  var _onDoneFns: js.Any = js.native
  var _onStartFns: js.Any = js.native
  val _specialStyles: js.UndefOr[js.Any] = js.native
  var _started: js.Any = js.native
  var _state: js.Any = js.native
  var _styler: js.Any = js.native
  val animationName: String = js.native
  var currentSnapshot: StringDictionary[String] = js.native
  val easing: String = js.native
  val element: js.Any = js.native
  val keyframes: js.Array[StringDictionary[String | Double]] = js.native
  /**
    * The parent of this player, if any.
    */
  /* CompleteClass */
  override var parentPlayer: AnimationPlayer | Null = js.native
  @JSName("parentPlayer")
  var parentPlayer_ɵCssKeyframesPlayer: AnimationPlayer = js.native
  /**
    * The total run time of the animation, in milliseconds.
    */
  /* CompleteClass */
  override val totalTime: Double = js.native
  @JSName("beforeDestroy")
  def beforeDestroy_MɵCssKeyframesPlayer(): Unit = js.native
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
  def setPosition(value: Double): Unit = js.native
}

