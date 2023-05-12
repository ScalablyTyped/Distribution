package typings.awsSdk.clientsDataexchangeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEventActionRequest extends StObject {
  
  /**
    * The unique identifier for the event action.
    */
  var EventActionId: _String
}
object DeleteEventActionRequest {
  
  inline def apply(EventActionId: _String): DeleteEventActionRequest = {
    val __obj = js.Dynamic.literal(EventActionId = EventActionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteEventActionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEventActionRequest] (val x: Self) extends AnyVal {
    
    inline def setEventActionId(value: _String): Self = StObject.set(x, "EventActionId", value.asInstanceOf[js.Any])
  }
}
