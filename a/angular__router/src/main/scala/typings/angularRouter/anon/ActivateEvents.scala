package typings.angularRouter.anon

import typings.angularRouter.angularRouterStrings.activate
import typings.angularRouter.angularRouterStrings.attach
import typings.angularRouter.angularRouterStrings.deactivate
import typings.angularRouter.angularRouterStrings.detach
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivateEvents extends StObject {
  
  var activateEvents: activate
  
  var attachEvents: attach
  
  var deactivateEvents: deactivate
  
  var detachEvents: detach
}
object ActivateEvents {
  
  inline def apply(): ActivateEvents = {
    val __obj = js.Dynamic.literal(activateEvents = "activate", attachEvents = "attach", deactivateEvents = "deactivate", detachEvents = "detach")
    __obj.asInstanceOf[ActivateEvents]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivateEvents] (val x: Self) extends AnyVal {
    
    inline def setActivateEvents(value: activate): Self = StObject.set(x, "activateEvents", value.asInstanceOf[js.Any])
    
    inline def setAttachEvents(value: attach): Self = StObject.set(x, "attachEvents", value.asInstanceOf[js.Any])
    
    inline def setDeactivateEvents(value: deactivate): Self = StObject.set(x, "deactivateEvents", value.asInstanceOf[js.Any])
    
    inline def setDetachEvents(value: detach): Self = StObject.set(x, "detachEvents", value.asInstanceOf[js.Any])
  }
}
