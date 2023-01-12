package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeFilter extends StObject {
  
  /**
    * The name of the field to use for filtering.
    */
  var name: SlotTypeFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListSlotTypes operation should return only aliases that equal the specified value. Specify CO when the ListSlotTypes operation should return aliases that contain the specified value.
    */
  var operator: SlotTypeFilterOperator
  
  /**
    * The value to use to filter the response.
    */
  var values: FilterValues
}
object SlotTypeFilter {
  
  inline def apply(name: SlotTypeFilterName, operator: SlotTypeFilterOperator, values: FilterValues): SlotTypeFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotTypeFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlotTypeFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: SlotTypeFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SlotTypeFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
