package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useToggleMod {
  
  @JSImport("ahooks/lib/useToggle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[T](): js.Tuple2[Boolean, Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Boolean, Actions[T]]]
  inline def default[T](defaultValue: T): js.Tuple2[T, Actions[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[T, Actions[T]]]
  inline def default[T, U](defaultValue: T, reverseValue: U): js.Tuple2[T | U, Actions[T | U]] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any], reverseValue.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[T | U, Actions[T | U]]]
  
  trait Actions[T] extends StObject {
    
    def set(value: T): Unit
    
    def setLeft(): Unit
    
    def setRight(): Unit
    
    def toggle(): Unit
  }
  object Actions {
    
    inline def apply[T](set: T => Unit, setLeft: () => Unit, setRight: () => Unit, toggle: () => Unit): Actions[T] = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), setLeft = js.Any.fromFunction0(setLeft), setRight = js.Any.fromFunction0(setRight), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Actions[T]]
    }
    
    extension [Self <: Actions[?], T](x: Self & Actions[T]) {
      
      inline def setSet(value: T => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetLeft(value: () => Unit): Self = StObject.set(x, "setLeft", js.Any.fromFunction0(value))
      
      inline def setSetRight(value: () => Unit): Self = StObject.set(x, "setRight", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
