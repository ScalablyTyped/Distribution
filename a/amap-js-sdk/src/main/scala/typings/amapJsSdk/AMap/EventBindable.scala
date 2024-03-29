package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventBindable extends StObject {
  
  def off(eventName: String, callback: EventCallback): Unit
  
  def on(eventName: String, callback: EventCallback): Unit
}
object EventBindable {
  
  inline def apply(off: (String, EventCallback) => Unit, on: (String, EventCallback) => Unit): EventBindable = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[EventBindable]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EventBindable] (val x: Self) extends AnyVal {
    
    inline def setOff(value: (String, EventCallback) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    inline def setOn(value: (String, EventCallback) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
