package typings.amapJsApiPlaceSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Event[E] extends StObject {
  
  var event: E
}
object Event {
  
  inline def apply[E](event: E): Event[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[E]]
  }
  
  extension [Self <: Event[?], E](x: Self & Event[E]) {
    
    inline def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
