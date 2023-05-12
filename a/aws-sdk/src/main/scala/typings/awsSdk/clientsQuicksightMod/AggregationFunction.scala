package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregationFunction extends StObject {
  
  /**
    * Aggregation for categorical values.    COUNT: Aggregate by the total number of values, including duplicates.    DISTINCT_COUNT: Aggregate by the total number of distinct values.  
    */
  var CategoricalAggregationFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CategoricalAggregationFunction] = js.undefined
  
  /**
    * Aggregation for date values.    COUNT: Aggregate by the total number of values, including duplicates.    DISTINCT_COUNT: Aggregate by the total number of distinct values.    MIN: Select the smallest date value.    MAX: Select the largest date value.  
    */
  var DateAggregationFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.DateAggregationFunction] = js.undefined
  
  /**
    * Aggregation for numerical values.
    */
  var NumericalAggregationFunction: js.UndefOr[typings.awsSdk.clientsQuicksightMod.NumericalAggregationFunction] = js.undefined
}
object AggregationFunction {
  
  inline def apply(): AggregationFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregationFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregationFunction] (val x: Self) extends AnyVal {
    
    inline def setCategoricalAggregationFunction(value: CategoricalAggregationFunction): Self = StObject.set(x, "CategoricalAggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setCategoricalAggregationFunctionUndefined: Self = StObject.set(x, "CategoricalAggregationFunction", js.undefined)
    
    inline def setDateAggregationFunction(value: DateAggregationFunction): Self = StObject.set(x, "DateAggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setDateAggregationFunctionUndefined: Self = StObject.set(x, "DateAggregationFunction", js.undefined)
    
    inline def setNumericalAggregationFunction(value: NumericalAggregationFunction): Self = StObject.set(x, "NumericalAggregationFunction", value.asInstanceOf[js.Any])
    
    inline def setNumericalAggregationFunctionUndefined: Self = StObject.set(x, "NumericalAggregationFunction", js.undefined)
  }
}
