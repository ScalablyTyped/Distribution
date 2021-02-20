package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventBindable extends StObject {
  
  def off(eventName: String, callback: EventCallback): Unit = js.native
  
  def on(eventName: String, callback: EventCallback): Unit = js.native
}
object EventBindable {
  
  @scala.inline
  def apply(off: (String, EventCallback) => Unit, on: (String, EventCallback) => Unit): EventBindable = {
    val __obj = js.Dynamic.literal(off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on))
    __obj.asInstanceOf[EventBindable]
  }
  
  @scala.inline
  implicit class EventBindableMutableBuilder[Self <: EventBindable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOff(value: (String, EventCallback) => Unit): Self = StObject.set(x, "off", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOn(value: (String, EventCallback) => Unit): Self = StObject.set(x, "on", js.Any.fromFunction2(value))
  }
}
