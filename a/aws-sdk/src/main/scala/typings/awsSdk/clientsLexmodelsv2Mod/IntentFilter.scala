package typings.awsSdk.clientsLexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFilter extends StObject {
  
  /**
    * The name of the field to use for the filter.
    */
  var name: IntentFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListIntents operation should return only aliases that equal the specified value. Specify CO when the ListIntents operation should return aliases that contain the specified value.
    */
  var operator: IntentFilterOperator
  
  /**
    * The value to use for the filter.
    */
  var values: FilterValues
}
object IntentFilter {
  
  inline def apply(name: IntentFilterName, operator: IntentFilterOperator, values: FilterValues): IntentFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IntentFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: IntentFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: IntentFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
