package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceFilter extends StObject {
  
  /**
    * The operator that you want to use to determine whether a service is returned by ListServices. Valid values for Condition include the following:    EQ: When you specify EQ, specify one namespace ID for Values. EQ is the default condition and can be omitted.  
    */
  var Condition: js.UndefOr[FilterCondition] = js.undefined
  
  /**
    * Specify NAMESPACE_ID.
    */
  var Name: ServiceFilterName
  
  /**
    * The values that are applicable to the value that you specify for Condition to filter the list of services.
    */
  var Values: FilterValues
}
object ServiceFilter {
  
  inline def apply(Name: ServiceFilterName, Values: FilterValues): ServiceFilter = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any], Values = Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceFilter] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: FilterCondition): Self = StObject.set(x, "Condition", value.asInstanceOf[js.Any])
    
    inline def setConditionUndefined: Self = StObject.set(x, "Condition", js.undefined)
    
    inline def setName(value: ServiceFilterName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "Values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "Values", js.Array(value*))
  }
}
