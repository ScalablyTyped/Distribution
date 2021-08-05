package typings.atlaskitSingleSelect

import typings.react.mod.SyntheticEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Event extends StObject {
    
    var event: SyntheticEvent[js.Any, typings.std.Event]
    
    var isOpen: Boolean
  }
  object Event {
    
    inline def apply(event: SyntheticEvent[js.Any, typings.std.Event], isOpen: Boolean): Event = {
      val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setEvent(value: SyntheticEvent[js.Any, typings.std.Event]): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
    }
  }
}
