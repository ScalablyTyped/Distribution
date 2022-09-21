package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Add[K] extends StObject {
  
  def add(key: K): Unit
  
  def remove(key: K): Unit
  
  def reset(): Unit
}
object Add {
  
  inline def apply[K](add: K => Unit, remove: K => Unit, reset: () => Unit): Add[K] = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), remove = js.Any.fromFunction1(remove), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[Add[K]]
  }
  
  extension [Self <: Add[?], K](x: Self & Add[K]) {
    
    inline def setAdd(value: K => Unit): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setRemove(value: K => Unit): Self = StObject.set(x, "remove", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
