package typings.awsSdk.braketMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SearchQuantumTasksFilter extends js.Object {
  
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
  implicit class SearchQuantumTasksFilterOps[Self <: SearchQuantumTasksFilter] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String64): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperator(value: SearchQuantumTasksFilterOperator): Self = this.set("operator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: String256*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: SearchQuantumTasksFilterValuesList): Self = this.set("values", value.asInstanceOf[js.Any])
  }
}
