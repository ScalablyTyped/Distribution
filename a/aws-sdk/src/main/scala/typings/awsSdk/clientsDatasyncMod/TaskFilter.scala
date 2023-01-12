package typings.awsSdk.clientsDatasyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TaskFilter extends StObject {
  
  /**
    * The name of the filter being used. Each API call supports a list of filters that are available for it. For example, LocationId for ListTasks.
    */
  var Name: TaskFilterName
  
  /**
    * The operator that is used to compare filter values (for example, Equals or Contains).
    */
  var Operator: typings.awsSdk.clientsDatasyncMod.Operator
  
  /**
    * The values that you want to filter for. For example, you might want to display only tasks for a specific destination location.
    */
  var Values: FilterValues
}
object TaskFilter {
  
  inline def apply(Name: TaskFilterName, Operator: Operator, Values: FilterValues): TaskFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Operator = Operator.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TaskFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TaskFilter] (val x: Self) extends AnyVal {
    
    inline def setName(value: TaskFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: Operator): Self = StObject.set(x, "Operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterAttributeValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
