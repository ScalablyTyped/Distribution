package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentEvent extends StObject {
  
  /**
    * The action to perform when a specific event is raised.
    */
  var action: js.UndefOr[String] = js.undefined
  
  /**
    * Binds an event to an action on a component. When you specify a bindingEvent, the event is called when the action is performed.
    */
  var bindingEvent: js.UndefOr[String] = js.undefined
  
  /**
    * Describes information about the action.
    */
  var parameters: js.UndefOr[ActionParameters] = js.undefined
}
object ComponentEvent {
  
  inline def apply(): ComponentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ComponentEvent]
  }
  
  extension [Self <: ComponentEvent](x: Self) {
    
    inline def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
    
    inline def setBindingEvent(value: String): Self = StObject.set(x, "bindingEvent", value.asInstanceOf[js.Any])
    
    inline def setBindingEventUndefined: Self = StObject.set(x, "bindingEvent", js.undefined)
    
    inline def setParameters(value: ActionParameters): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "parameters", js.undefined)
  }
}
