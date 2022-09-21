package typings.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventListener extends StObject {
  
  var AddListenerParam: String
  
  var AllListener: XAllListener
  
  var EventMethod: String
  
  var Helper: Any
  
  var ListenerType: String
}
object EventListener {
  
  inline def apply(
    AddListenerParam: String,
    AllListener: XAllListener,
    EventMethod: String,
    Helper: Any,
    ListenerType: String
  ): EventListener = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], AllListener = AllListener.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], Helper = Helper.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventListener]
  }
  
  extension [Self <: EventListener](x: Self) {
    
    inline def setAddListenerParam(value: String): Self = StObject.set(x, "AddListenerParam", value.asInstanceOf[js.Any])
    
    inline def setAllListener(value: XAllListener): Self = StObject.set(x, "AllListener", value.asInstanceOf[js.Any])
    
    inline def setEventMethod(value: String): Self = StObject.set(x, "EventMethod", value.asInstanceOf[js.Any])
    
    inline def setHelper(value: Any): Self = StObject.set(x, "Helper", value.asInstanceOf[js.Any])
    
    inline def setListenerType(value: String): Self = StObject.set(x, "ListenerType", value.asInstanceOf[js.Any])
  }
}
