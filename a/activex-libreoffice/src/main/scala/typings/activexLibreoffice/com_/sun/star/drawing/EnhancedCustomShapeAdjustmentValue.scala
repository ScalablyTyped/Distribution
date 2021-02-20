package typings.activexLibreoffice.com_.sun.star.drawing

import typings.activexLibreoffice.com_.sun.star.beans.PropertyState
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a single AdjustmentValue */
@js.native
trait EnhancedCustomShapeAdjustmentValue extends StObject {
  
  /** optional name, used by pptx import/export for custom shape presets */
  var Name: String = js.native
  
  var State: PropertyState = js.native
  
  /** the any can be of type long or double */
  var Value: js.Any = js.native
}
object EnhancedCustomShapeAdjustmentValue {
  
  @scala.inline
  def apply(Name: String, State: PropertyState, Value: js.Any): EnhancedCustomShapeAdjustmentValue = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnhancedCustomShapeAdjustmentValue]
  }
  
  @scala.inline
  implicit class EnhancedCustomShapeAdjustmentValueMutableBuilder[Self <: EnhancedCustomShapeAdjustmentValue] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setState(value: PropertyState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
  }
}
