package typings.activexLibreoffice.com_.sun.star.script

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** describes an effect, especially a script to be executed, for a certain event given by the listener type and the name of the event method. */
trait ScriptEventDescriptor extends StObject {
  
  /**
    * data to be used if the addListener method needs an additional parameter.
    *
    * If the type of this parameter is different from string, it will be converted, when added.
    */
  var AddListenerParam: String
  
  /** event method as string. */
  var EventMethod: String
  
  /** listener type as string, same as listener-XIdlClass.getName(). */
  var ListenerType: String
  
  /** script code as string (the code has to correspond with the language defined by ScriptType). */
  var ScriptCode: String
  
  /** type of the script language as string; for example, "Basic" or "StarScript". */
  var ScriptType: String
}
object ScriptEventDescriptor {
  
  inline def apply(
    AddListenerParam: String,
    EventMethod: String,
    ListenerType: String,
    ScriptCode: String,
    ScriptType: String
  ): ScriptEventDescriptor = {
    val __obj = js.Dynamic.literal(AddListenerParam = AddListenerParam.asInstanceOf[js.Any], EventMethod = EventMethod.asInstanceOf[js.Any], ListenerType = ListenerType.asInstanceOf[js.Any], ScriptCode = ScriptCode.asInstanceOf[js.Any], ScriptType = ScriptType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScriptEventDescriptor]
  }
  
  extension [Self <: ScriptEventDescriptor](x: Self) {
    
    inline def setAddListenerParam(value: String): Self = StObject.set(x, "AddListenerParam", value.asInstanceOf[js.Any])
    
    inline def setEventMethod(value: String): Self = StObject.set(x, "EventMethod", value.asInstanceOf[js.Any])
    
    inline def setListenerType(value: String): Self = StObject.set(x, "ListenerType", value.asInstanceOf[js.Any])
    
    inline def setScriptCode(value: String): Self = StObject.set(x, "ScriptCode", value.asInstanceOf[js.Any])
    
    inline def setScriptType(value: String): Self = StObject.set(x, "ScriptType", value.asInstanceOf[js.Any])
  }
}
