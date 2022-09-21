package typings.ahooks.anon

import typings.ahooks.useEventTargetMod.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnChange[U] extends StObject {
  
  def onChange(e: EventTarget[U]): Unit
  
  def reset(): Unit
}
object OnChange {
  
  inline def apply[U](onChange: EventTarget[U] => Unit, reset: () => Unit): OnChange[U] = {
    val __obj = js.Dynamic.literal(onChange = js.Any.fromFunction1(onChange), reset = js.Any.fromFunction0(reset))
    __obj.asInstanceOf[OnChange[U]]
  }
  
  extension [Self <: OnChange[?], U](x: Self & OnChange[U]) {
    
    inline def setOnChange(value: EventTarget[U] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
    
    inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
  }
}
