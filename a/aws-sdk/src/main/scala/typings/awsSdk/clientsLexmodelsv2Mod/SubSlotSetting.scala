package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubSlotSetting extends StObject {
  
  /**
    * The expression text for defining the constituent sub slots in the composite slot using logical AND and OR operators.
    */
  var expression: js.UndefOr[SubSlotExpression] = js.undefined
  
  /**
    * Specifications for the constituent sub slots of a composite slot.
    */
  var slotSpecifications: js.UndefOr[SubSlotSpecificationMap] = js.undefined
}
object SubSlotSetting {
  
  inline def apply(): SubSlotSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubSlotSetting]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubSlotSetting] (val x: Self) extends AnyVal {
    
    inline def setExpression(value: SubSlotExpression): Self = StObject.set(x, "expression", value.asInstanceOf[js.Any])
    
    inline def setExpressionUndefined: Self = StObject.set(x, "expression", js.undefined)
    
    inline def setSlotSpecifications(value: SubSlotSpecificationMap): Self = StObject.set(x, "slotSpecifications", value.asInstanceOf[js.Any])
    
    inline def setSlotSpecificationsUndefined: Self = StObject.set(x, "slotSpecifications", js.undefined)
  }
}
