package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnInputLifecycle extends StObject {
  
  /**
    * Specifies the actions performed when the condition evaluates to TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
  
  /**
    * Specifies the actions performed, and the next state entered, when a condition evaluates to TRUE.
    */
  var transitionEvents: js.UndefOr[TransitionEvents] = js.undefined
}
object OnInputLifecycle {
  
  inline def apply(): OnInputLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnInputLifecycle]
  }
  
  extension [Self <: OnInputLifecycle](x: Self) {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
    
    inline def setTransitionEvents(value: TransitionEvents): Self = StObject.set(x, "transitionEvents", value.asInstanceOf[js.Any])
    
    inline def setTransitionEventsUndefined: Self = StObject.set(x, "transitionEvents", js.undefined)
    
    inline def setTransitionEventsVarargs(value: TransitionEvent*): Self = StObject.set(x, "transitionEvents", js.Array(value*))
  }
}
