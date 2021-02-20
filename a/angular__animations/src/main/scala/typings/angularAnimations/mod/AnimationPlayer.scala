package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimationPlayer extends StObject {
  
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[_]] = js.native
  
  /**
    * Destroys the animation, after invoking the `beforeDestroy()` callback.
    * Calls the `onDestroy()` callback when destruction is completed.
    */
  def destroy(): Unit = js.native
  
  /**
    * Ends the animation, invoking the `onDone()` callback.
    */
  def finish(): Unit = js.native
  
  /**
    * Reports the current position of the animation.
    * @returns A 0-based offset into the duration, in milliseconds.
    */
  def getPosition(): Double = js.native
  
  /**
    * Reports whether the animation has started.
    * @returns True if the animation has started, false otherwise.
    */
  def hasStarted(): Boolean = js.native
  
  /**
    * Initializes the animation.
    */
  def init(): Unit = js.native
  
  /**
    * Provides a callback to invoke after the animation is destroyed.
    * @param fn The callback function.
    * @see `destroy()`
    * @see `beforeDestroy()`
    */
  def onDestroy(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides a callback to invoke when the animation finishes.
    * @param fn The callback function.
    * @see `finish()`
    */
  def onDone(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * Provides a callback to invoke when the animation starts.
    * @param fn The callback function.
    * @see `run()`
    */
  def onStart(fn: js.Function0[Unit]): Unit = js.native
  
  /**
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | Null = js.native
  
  /**
    * Pauses the animation.
    */
  def pause(): Unit = js.native
  
  /**
    * Runs the animation, invoking the `onStart()` callback.
    */
  def play(): Unit = js.native
  
  /**
    * Resets the animation to its initial state.
    */
  def reset(): Unit = js.native
  
  /**
    * Restarts the paused animation.
    */
  def restart(): Unit = js.native
  
  /**
    * Sets the position of the animation.
    * @param position A 0-based offset into the duration, in milliseconds.
    */
  def setPosition(position: js.Any): Unit = js.native
  
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double = js.native
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
    totalTime: Double
  ): AnimationPlayer = {
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getPosition = js.Any.fromFunction0(getPosition), hasStarted = js.Any.fromFunction0(hasStarted), init = js.Any.fromFunction0(init), onDestroy = js.Any.fromFunction1(onDestroy), onDone = js.Any.fromFunction1(onDone), onStart = js.Any.fromFunction1(onStart), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), restart = js.Any.fromFunction0(restart), setPosition = js.Any.fromFunction1(setPosition), totalTime = totalTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimationPlayer]
  }
  
  @scala.inline
  implicit class AnimationPlayerMutableBuilder[Self <: AnimationPlayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBeforeDestroy(value: () => _): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    @scala.inline
    def setHasStarted(value: () => Boolean): Self = StObject.set(x, "hasStarted", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOnDestroy(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnDone(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onDone", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnStart(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    @scala.inline
    def setParentPlayer(value: AnimationPlayer): Self = StObject.set(x, "parentPlayer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParentPlayerNull: Self = StObject.set(x, "parentPlayer", null)
    
    @scala.inline
    def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetPosition(value: js.Any => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
  }
}
