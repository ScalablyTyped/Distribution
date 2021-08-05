package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnimationPlayer extends StObject {
  
  /**
    * Provides a callback to invoke before the animation is destroyed.
    */
  var beforeDestroy: js.UndefOr[js.Function0[js.Any]] = js.undefined
  
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
    * The parent of this player, if any.
    */
  var parentPlayer: AnimationPlayer | Null
  
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
  
  /**
    * The total run time of the animation, in milliseconds.
    */
  val totalTime: Double
}
object AnimationPlayer {
  
  inline def apply(
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
    val __obj = js.Dynamic.literal(destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), getPosition = js.Any.fromFunction0(getPosition), hasStarted = js.Any.fromFunction0(hasStarted), init = js.Any.fromFunction0(init), onDestroy = js.Any.fromFunction1(onDestroy), onDone = js.Any.fromFunction1(onDone), onStart = js.Any.fromFunction1(onStart), pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), reset = js.Any.fromFunction0(reset), restart = js.Any.fromFunction0(restart), setPosition = js.Any.fromFunction1(setPosition), totalTime = totalTime.asInstanceOf[js.Any], parentPlayer = null)
    __obj.asInstanceOf[AnimationPlayer]
  }
  
  extension [Self <: AnimationPlayer](x: Self) {
    
    inline def setBeforeDestroy(value: () => js.Any): Self = StObject.set(x, "beforeDestroy", js.Any.fromFunction0(value))
    
    inline def setBeforeDestroyUndefined: Self = StObject.set(x, "beforeDestroy", js.undefined)
    
    inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
    
    inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
    
    inline def setGetPosition(value: () => Double): Self = StObject.set(x, "getPosition", js.Any.fromFunction0(value))
    
    inline def setHasStarted(value: () => Boolean): Self = StObject.set(x, "hasStarted", js.Any.fromFunction0(value))
    
    inline def setInit(value: () => Unit): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
    
    inline def setOnDestroy(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onDestroy", js.Any.fromFunction1(value))
    
    inline def setOnDone(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onDone", js.Any.fromFunction1(value))
    
    inline def setOnStart(value: js.Function0[Unit] => Unit): Self = StObject.set(x, "onStart", js.Any.fromFunction1(value))
    
    inline def setParentPlayer(value: AnimationPlayer): Self = StObject.set(x, "parentPlayer", value.asInstanceOf[js.Any])
    
    inline def setParentPlayerNull: Self = StObject.set(x, "parentPlayer", null)
    
    inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
    
    inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
    
    inline def setSetPosition(value: js.Any => Unit): Self = StObject.set(x, "setPosition", js.Any.fromFunction1(value))
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
  }
}
