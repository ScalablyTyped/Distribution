package typings.androiduix.android.graphics.drawable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animatable extends StObject {
  
  def isRunning(): Boolean = js.native
  
  def start(): Unit = js.native
  
  def stop(): Unit = js.native
}
object Animatable {
  
  @scala.inline
  def apply(isRunning: () => Boolean, start: () => Unit, stop: () => Unit): Animatable = {
    val __obj = js.Dynamic.literal(isRunning = js.Any.fromFunction0(isRunning), start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
    __obj.asInstanceOf[Animatable]
  }
  
  @scala.inline
  implicit class AnimatableMutableBuilder[Self <: Animatable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIsRunning(value: () => Boolean): Self = StObject.set(x, "isRunning", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
  }
}
