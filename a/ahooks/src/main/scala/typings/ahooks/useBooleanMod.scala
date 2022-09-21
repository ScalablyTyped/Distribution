package typings.ahooks

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useBooleanMod {
  
  @JSImport("ahooks/lib/useBoolean", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Tuple2[Boolean, Actions]]
  inline def default(defaultValue: Boolean): js.Tuple2[Boolean, Actions] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(defaultValue.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[Boolean, Actions]]
  
  trait Actions extends StObject {
    
    def set(value: Boolean): Unit
    
    def setFalse(): Unit
    
    def setTrue(): Unit
    
    def toggle(): Unit
  }
  object Actions {
    
    inline def apply(set: Boolean => Unit, setFalse: () => Unit, setTrue: () => Unit, toggle: () => Unit): Actions = {
      val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set), setFalse = js.Any.fromFunction0(setFalse), setTrue = js.Any.fromFunction0(setTrue), toggle = js.Any.fromFunction0(toggle))
      __obj.asInstanceOf[Actions]
    }
    
    extension [Self <: Actions](x: Self) {
      
      inline def setSet(value: Boolean => Unit): Self = StObject.set(x, "set", js.Any.fromFunction1(value))
      
      inline def setSetFalse(value: () => Unit): Self = StObject.set(x, "setFalse", js.Any.fromFunction0(value))
      
      inline def setSetTrue(value: () => Unit): Self = StObject.set(x, "setTrue", js.Any.fromFunction0(value))
      
      inline def setToggle(value: () => Unit): Self = StObject.set(x, "toggle", js.Any.fromFunction0(value))
    }
  }
}
