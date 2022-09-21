package typings.ahooks.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Back[T] extends StObject {
  
  def back(): Unit
  
  var backLength: Double
  
  def forward(): Unit
  
  var forwardLength: Double
  
  def go(step: Double): Unit
  
  def reset(params: Any*): Unit
  
  def setValue(`val`: T): Unit
  
  var value: js.UndefOr[T] = js.undefined
}
object Back {
  
  inline def apply[T](
    back: () => Unit,
    backLength: Double,
    forward: () => Unit,
    forwardLength: Double,
    go: Double => Unit,
    reset: /* repeated */ Any => Unit,
    setValue: T => Unit
  ): Back[T] = {
    val __obj = js.Dynamic.literal(back = js.Any.fromFunction0(back), backLength = backLength.asInstanceOf[js.Any], forward = js.Any.fromFunction0(forward), forwardLength = forwardLength.asInstanceOf[js.Any], go = js.Any.fromFunction1(go), reset = js.Any.fromFunction1(reset), setValue = js.Any.fromFunction1(setValue))
    __obj.asInstanceOf[Back[T]]
  }
  
  extension [Self <: Back[?], T](x: Self & Back[T]) {
    
    inline def setBack(value: () => Unit): Self = StObject.set(x, "back", js.Any.fromFunction0(value))
    
    inline def setBackLength(value: Double): Self = StObject.set(x, "backLength", value.asInstanceOf[js.Any])
    
    inline def setForward(value: () => Unit): Self = StObject.set(x, "forward", js.Any.fromFunction0(value))
    
    inline def setForwardLength(value: Double): Self = StObject.set(x, "forwardLength", value.asInstanceOf[js.Any])
    
    inline def setGo(value: Double => Unit): Self = StObject.set(x, "go", js.Any.fromFunction1(value))
    
    inline def setReset(value: /* repeated */ Any => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction1(value))
    
    inline def setSetValue(value: T => Unit): Self = StObject.set(x, "setValue", js.Any.fromFunction1(value))
    
    inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
