package typings.activexLibreoffice.com_.sun.star.awt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows controlling an animation.
  * @since OOo 3.4
  */
@js.native
trait XAnimation extends StObject {
  
  /** determines whether the animation is currently running */
  def isAnimationRunning(): Boolean = js.native
  
  /** starts the animation */
  def startAnimation(): Unit = js.native
  
  /** stops the animation */
  def stopAnimation(): Unit = js.native
}
object XAnimation {
  
  @scala.inline
  def apply(isAnimationRunning: () => Boolean, startAnimation: () => Unit, stopAnimation: () => Unit): XAnimation = {
    val __obj = js.Dynamic.literal(isAnimationRunning = js.Any.fromFunction0(isAnimationRunning), startAnimation = js.Any.fromFunction0(startAnimation), stopAnimation = js.Any.fromFunction0(stopAnimation))
    __obj.asInstanceOf[XAnimation]
  }
  
  @scala.inline
  implicit class XAnimationMutableBuilder[Self <: XAnimation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsAnimationRunning(value: () => Boolean): Self = StObject.set(x, "isAnimationRunning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStartAnimation(value: () => Unit): Self = StObject.set(x, "startAnimation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopAnimation(value: () => Unit): Self = StObject.set(x, "stopAnimation", js.Any.fromFunction0(value))
  }
}
