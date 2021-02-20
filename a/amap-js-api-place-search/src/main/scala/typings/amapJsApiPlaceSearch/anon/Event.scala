package typings.amapJsApiPlaceSearch.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Event[E] extends StObject {
  
  var event: E = js.native
}
object Event {
  
  @scala.inline
  def apply[E](event: E): Event[E] = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any])
    __obj.asInstanceOf[Event[E]]
  }
  
  @scala.inline
  implicit class EventMutableBuilder[Self <: Event[_], E] (val x: Self with Event[E]) extends AnyVal {
    
    @scala.inline
    def setEvent(value: E): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
  }
}
