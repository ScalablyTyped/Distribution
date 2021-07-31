package typings.aframe.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Behavior extends StObject {
  
  def tick(): Unit
}
object Behavior {
  
  @scala.inline
  def apply(tick: () => Unit): Behavior = {
    val __obj = js.Dynamic.literal(tick = js.Any.fromFunction0(tick))
    __obj.asInstanceOf[Behavior]
  }
  
  @scala.inline
  implicit class BehaviorMutableBuilder[Self <: Behavior] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setTick(value: () => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction0(value))
  }
}
