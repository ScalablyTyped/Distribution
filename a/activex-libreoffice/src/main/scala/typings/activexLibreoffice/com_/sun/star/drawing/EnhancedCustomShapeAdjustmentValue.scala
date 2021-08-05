package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single AdjustmentValue */
trait EnhancedCustomShapeAdjustmentValue extends StObject {
  
  /** optional name, used by pptx import/export for custom shape presets */
  var Name: String
  
  var State: PropertyState
  
  /** the any can be of type long or double */
  var Value: js.Any
}
object EnhancedCustomShapeAdjustmentValue {
  
  inline def apply(Name: String, State: PropertyState, Value: js.Any): EnhancedCustomShapeAdjustmentValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeAdjustmentValue]
  }
  
  extension [Self <: EnhancedCustomShapeAdjustmentValue](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setState(value: PropertyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
