package typings.antvG2.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Attrs extends StObject {
  
  var attrs: HeightPath
  
  def endState(ratio: Any): `1`
  
  var startState: HeightPath
  
  var `type`: String
}
object Attrs {
  
  inline def apply(attrs: HeightPath, endState: Any => `1`, startState: HeightPath, `type`: String): Attrs = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], endState = js.Any.fromFunction1(endState), startState = startState.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Attrs]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Attrs] (val x: Self) extends AnyVal {
    
    inline def setAttrs(value: HeightPath): Self = StObject.set(x, "attrs", value.asInstanceOf[js.Any])
    
    inline def setEndState(value: Any => `1`): Self = StObject.set(x, "endState", js.Any.fromFunction1(value))
    
    inline def setStartState(value: HeightPath): Self = StObject.set(x, "startState", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
