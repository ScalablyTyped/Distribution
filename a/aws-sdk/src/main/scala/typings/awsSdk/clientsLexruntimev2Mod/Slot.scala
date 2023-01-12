package typings.awsSdk.clientsLexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Slot extends StObject {
  
  /**
    * When the shape value is List, it indicates that the values field contains a list of slot values. When the value is Scalar, it indicates that the value field contains a single value.
    */
  var shape: js.UndefOr[Shape] = js.undefined
  
  /**
    * The constituent sub slots of a composite slot.
    */
  var subSlots: js.UndefOr[Slots] = js.undefined
  
  /**
    * The current value of the slot.
    */
  var value: js.UndefOr[Value] = js.undefined
  
  /**
    * A list of one or more values that the user provided for the slot. For example, if a for a slot that elicits pizza toppings, the values might be "pepperoni" and "pineapple." 
    */
  var values: js.UndefOr[Values] = js.undefined
}
object Slot {
  
  inline def apply(): Slot = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Slot]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Slot] (val x: Self) extends AnyVal {
    
    inline def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setSubSlots(value: Slots): Self = StObject.set(x, "subSlots", value.asInstanceOf[js.Any])
    
    inline def setSubSlotsUndefined: Self = StObject.set(x, "subSlots", js.undefined)
    
    inline def setValue(value: Value): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: Values): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Slot*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
