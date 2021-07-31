package typings.activexLibreoffice.com_.sun.star.drawing

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single value which is used with EnhancedCustomShapes */
trait EnhancedCustomShapeParameter extends StObject {
  
  var Type: Double
  
  /** the any can be of type long or double */
  var Value: js.Any
}
object EnhancedCustomShapeParameter {
  
  @scala.inline
  def apply(Type: Double, Value: js.Any): EnhancedCustomShapeParameter = {
    val __obj = js.Dynamic.literal(Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeParameter]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeParameterMutableBuilder[Self <: EnhancedCustomShapeParameter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: Double): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
