package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchQuantumTasksFilter extends StObject {
  
  /**
    * The name of the device used for the task.
    */
  var name: String64
  
  /**
    * An operator to use in the filter.
    */
  var operator: SearchQuantumTasksFilterOperator
  
  /**
    * The values to use for the filter.
    */
  var values: SearchQuantumTasksFilterValuesList
}
object SearchQuantumTasksFilter {
  
  inline def apply(
    name: String64,
    operator: SearchQuantumTasksFilterOperator,
    values: SearchQuantumTasksFilterValuesList
  ): SearchQuantumTasksFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksFilter]
  }
  
  extension [Self <: SearchQuantumTasksFilter](x: Self) {
    
    inline def setName(value: String64): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SearchQuantumTasksFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SearchQuantumTasksFilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String256*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
