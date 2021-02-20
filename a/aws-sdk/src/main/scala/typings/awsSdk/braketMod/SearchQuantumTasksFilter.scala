package typings.awsSdk.braketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQuantumTasksFilter extends StObject {
  
  /**
    * The name of the device used for the task.
    */
  var name: String64 = js.native
  
  /**
    * An operator to use in the filter.
    */
  var operator: SearchQuantumTasksFilterOperator = js.native
  
  /**
    * The values to use for the filter.
    */
  var values: SearchQuantumTasksFilterValuesList = js.native
}
object SearchQuantumTasksFilter {
  
  @scala.inline
  def apply(
    name: String64,
    operator: SearchQuantumTasksFilterOperator,
    values: SearchQuantumTasksFilterValuesList
  ): SearchQuantumTasksFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchQuantumTasksFilter]
  }
  
  @scala.inline
  implicit class SearchQuantumTasksFilterMutableBuilder[Self <: SearchQuantumTasksFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String64): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: SearchQuantumTasksFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValues(value: SearchQuantumTasksFilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String256*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
