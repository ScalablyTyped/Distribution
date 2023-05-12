package typings.angularRouter.anon

import typings.angularRouter.mod.Event2
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Events extends StObject {
  
  var events: Observable_[Event2]
}
object Events {
  
  inline def apply(events: Observable_[Event2]): Events = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[Events]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Events] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Observable_[Event2]): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
  }
}
