package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EndState extends StObject {
  
  var attrs: PathWidth
  
  var endState: Any
  
  var startState: PathWidth
  
  var `type`: String
}
object EndState {
  
  inline def apply(attrs: PathWidth, endState: Any, startState: PathWidth, `type`: String): EndState = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endState = endState.asInstanceOf[js.Any], startState = startState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndState]
  }
  
  extension [Self <: EndState](x: Self) {
    
    inline def setAttrs(value: PathWidth): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setEndState(value: Any): Self = StObject.set(x, "endState", value.asInstanceOf[js.Any])
    
    inline def setStartState(value: PathWidth): Self = StObject.set(x, "startState", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
