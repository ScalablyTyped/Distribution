package typings.awsSdk.clientsBraketMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SearchJobsFilter extends StObject {
  
  /**
    * The name to use for the jobs filter.
    */
  var name: String64
  
  /**
    * An operator to use for the jobs filter.
    */
  var operator: SearchJobsFilterOperator
  
  /**
    * The values to use for the jobs filter.
    */
  var values: SearchJobsFilterValuesList
}
object SearchJobsFilter {
  
  inline def apply(name: String64, operator: SearchJobsFilterOperator, values: SearchJobsFilterValuesList): SearchJobsFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchJobsFilter]
  }
  
  extension [Self <: SearchJobsFilter](x: Self) {
    
    inline def setName(value: String64): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SearchJobsFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: SearchJobsFilterValuesList): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: String256*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
