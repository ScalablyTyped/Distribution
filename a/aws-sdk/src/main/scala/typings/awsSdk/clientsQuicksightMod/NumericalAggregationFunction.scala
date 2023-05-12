package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NumericalAggregationFunction extends StObject {
  
  /**
    * An aggregation based on the percentile of values in a dimension or measure.
    */
  var PercentileAggregation: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PercentileAggregation] = js.undefined
  
  /**
    * Built-in aggregation functions for numerical values.    SUM: The sum of a dimension or measure.     AVERAGE: The average of a dimension or measure.    MIN: The minimum value of a dimension or measure.    MAX: The maximum value of a dimension or measure.    COUNT: The count of a dimension or measure.    DISTINCT_COUNT: The count of distinct values in a dimension or measure.    VAR: The variance of a dimension or measure.    VARP: The partitioned variance of a dimension or measure.    STDEV: The standard deviation of a dimension or measure.    STDEVP: The partitioned standard deviation of a dimension or measure.    MEDIAN: The median value of a dimension or measure.  
    */
  var SimpleNumericalAggregation: js.UndefOr[SimpleNumericalAggregationFunction] = js.undefined
}
object NumericalAggregationFunction {
  
  inline def apply(): NumericalAggregationFunction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NumericalAggregationFunction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NumericalAggregationFunction] (val x: Self) extends AnyVal {
    
    inline def setPercentileAggregation(value: PercentileAggregation): Self = StObject.set(x, "PercentileAggregation", value.asInstanceOf[js.Any])
    
    inline def setPercentileAggregationUndefined: Self = StObject.set(x, "PercentileAggregation", js.undefined)
    
    inline def setSimpleNumericalAggregation(value: SimpleNumericalAggregationFunction): Self = StObject.set(x, "SimpleNumericalAggregation", value.asInstanceOf[js.Any])
    
    inline def setSimpleNumericalAggregationUndefined: Self = StObject.set(x, "SimpleNumericalAggregation", js.undefined)
  }
}
