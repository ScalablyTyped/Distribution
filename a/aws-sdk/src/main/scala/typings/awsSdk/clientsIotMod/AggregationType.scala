package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationType extends StObject {
  
  /**
    * The name of the aggregation type.
    */
  var name: AggregationTypeName
  
  /**
    * A list of the values of aggregation types.
    */
  var values: js.UndefOr[AggregationTypeValues] = js.undefined
}
object AggregationType {
  
  inline def apply(name: AggregationTypeName): AggregationType = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregationType]
  }
  
  extension [Self <: AggregationType](x: Self) {
    
    inline def setName(value: AggregationTypeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValues(value: AggregationTypeValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: AggregationTypeValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
