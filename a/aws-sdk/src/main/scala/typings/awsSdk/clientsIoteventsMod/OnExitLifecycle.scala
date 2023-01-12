package typings.awsSdk.clientsIoteventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnExitLifecycle extends StObject {
  
  /**
    * Specifies the actions that are performed when the state is exited and the condition is TRUE.
    */
  var events: js.UndefOr[Events] = js.undefined
}
object OnExitLifecycle {
  
  inline def apply(): OnExitLifecycle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnExitLifecycle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OnExitLifecycle] (val x: Self) extends AnyVal {
    
    inline def setEvents(value: Events): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
    
    inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
    
    inline def setEventsVarargs(value: Event*): Self = StObject.set(x, "events", js.Array(value*))
  }
}
