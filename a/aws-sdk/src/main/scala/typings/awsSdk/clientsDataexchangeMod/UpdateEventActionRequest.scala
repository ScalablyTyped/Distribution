package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEventActionRequest extends StObject {
  
  /**
    * What occurs after a certain event.
    */
  var Action: js.UndefOr[typings.awsSdk.clientsDataexchangeMod.Action] = js.undefined
  
  /**
    * The unique identifier for the event action.
    */
  var EventActionId: string
}
object UpdateEventActionRequest {
  
  inline def apply(EventActionId: string): UpdateEventActionRequest = {
    val __obj = js.Dynamic.literal(EventActionId = EventActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEventActionRequest]
  }
  
  extension [Self <: UpdateEventActionRequest](x: Self) {
    
    inline def setAction(value: Action): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
    
    inline def setEventActionId(value: string): Self = StObject.set(x, "EventActionId", value.asInstanceOf[js.Any])
  }
}
