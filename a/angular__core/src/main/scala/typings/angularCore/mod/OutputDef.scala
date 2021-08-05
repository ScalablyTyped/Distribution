package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.body
import typings.angularCore.angularCoreStrings.component
import typings.angularCore.angularCoreStrings.document
import typings.angularCore.angularCoreStrings.window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OutputDef extends StObject {
  
  var eventName: String
  
  var propName: String | Null
  
  var target: window | document | body | component | Null
  
  var `type`: OutputType
}
object OutputDef {
  
  inline def apply(eventName: String, `type`: OutputType): OutputDef = {
    val __obj = js.Dynamic.literal(eventName = eventName.asInstanceOf[js.Any], propName = null, target = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[OutputDef]
  }
  
  extension [Self <: OutputDef](x: Self) {
    
    inline def setEventName(value: String): Self = StObject.set(x, "eventName", value.asInstanceOf[js.Any])
    
    inline def setPropName(value: String): Self = StObject.set(x, "propName", value.asInstanceOf[js.Any])
    
    inline def setPropNameNull: Self = StObject.set(x, "propName", null)
    
    inline def setTarget(value: window | document | body | component): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    inline def setTargetNull: Self = StObject.set(x, "target", null)
    
    inline def setType(value: OutputType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
