package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportFilter extends StObject {
  
  /**
    * Supported condition: EQUALS 
    */
  var condition: Condition
  
  /**
    * A single ExportFilter name. Supported filters: agentIds.
    */
  var name: FilterName
  
  /**
    * A single agent ID for a Discovery Agent. An agent ID can be found using the DescribeAgents action. Typically an ADS agent ID is in the form o-0123456789abcdef0.
    */
  var values: FilterValues
}
object ExportFilter {
  
  inline def apply(condition: Condition, name: FilterName, values: FilterValues): ExportFilter = {
    val __obj = js.Dynamic.literal(condition = condition.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExportFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportFilter] (val x: Self) extends AnyVal {
    
    inline def setCondition(value: Condition): Self = StObject.set(x, "condition", value.asInstanceOf[js.Any])
    
    inline def setName(value: FilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
