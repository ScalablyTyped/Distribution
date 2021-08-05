package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations", "\u0275AnimationGroupPlayer")
@js.native
class ɵAnimationGroupPlayer protected ()
  extends StObject
     with AnimationPlayer {
  def this(_players: js.Array[AnimationPlayer]) = this()
  
  /* private */ var _destroyed: js.Any = js.native
  
  /* private */ var _finished: js.Any = js.native
  
  /* private */ var _onDestroy: js.Any = js.native
  
  /* private */ var _onDestroyFns: js.Any = js.native
  
  /* private */ var _onDoneFns: js.Any = js.native
  
  /* private */ var _onFinish: js.Any = js.native
  
  /* private */ var _onStart: js.Any = js.native
  
  /* private */ var _onStartFns: js.Any = js.native
  
  /* private */ var _started: js.Any = js.native
  
  @JSName("beforeDestroy")
  def beforeDestroy_MɵAnimationGroupPlayer(): Unit = js.native
  
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
    * The parent of this player, if any.
    */
  /* CompleteClass */
  var parentPlayer: AnimationPlayer | Null = js.native
  
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
  
  val players: js.Array[AnimationPlayer] = js.native
  
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
  
  /**
    * The total run time of the animation, in milliseconds.
    */
  /* CompleteClass */
  override val totalTime: Double = js.native
}
