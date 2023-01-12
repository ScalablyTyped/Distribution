package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows controlling an animation.
  * @since OOo 3.4
  */
trait XAnimation extends StObject {
  
  /** determines whether the animation is currently running */
  def isAnimationRunning(): Boolean
  
  /** starts the animation */
  def startAnimation(): Unit
  
  /** stops the animation */
  def stopAnimation(): Unit
}
object XAnimation {
  
  inline def apply(isAnimationRunning: () => Boolean, startAnimation: () => Unit, stopAnimation: () => Unit): XAnimation = {
    val __obj = js.Dynamic.literal(isAnimationRunning = js.Any.fromFunction0(isAnimationRunning), startAnimation = js.Any.fromFunction0(startAnimation), stopAnimation = js.Any.fromFunction0(stopAnimation))
    __obj.asInstanceOf[XAnimation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XAnimation] (val x: Self) extends AnyVal {
    
    inline def setIsAnimationRunning(value: () => Boolean): Self = StObject.set(x, "isAnimationRunning", js.Any.fromFunction0(value))
    
    inline def setStartAnimation(value: () => Unit): Self = StObject.set(x, "startAnimation", js.Any.fromFunction0(value))
    
    inline def setStopAnimation(value: () => Unit): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
  }
}
