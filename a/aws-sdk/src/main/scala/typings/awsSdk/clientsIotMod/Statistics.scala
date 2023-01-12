package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Statistics extends StObject {
  
  /**
    * The average of the aggregated field values.
    */
  var average: js.UndefOr[Average] = js.undefined
  
  /**
    * The count of things that match the query string criteria and contain a valid aggregation field value.
    */
  var count: js.UndefOr[Count] = js.undefined
  
  /**
    * The maximum aggregated field value.
    */
  var maximum: js.UndefOr[Maximum] = js.undefined
  
  /**
    * The minimum aggregated field value.
    */
  var minimum: js.UndefOr[Minimum] = js.undefined
  
  /**
    * The standard deviation of the aggregated field values.
    */
  var stdDeviation: js.UndefOr[StdDeviation] = js.undefined
  
  /**
    * The sum of the aggregated field values.
    */
  var sum: js.UndefOr[Sum] = js.undefined
  
  /**
    * The sum of the squares of the aggregated field values.
    */
  var sumOfSquares: js.UndefOr[SumOfSquares] = js.undefined
  
  /**
    * The variance of the aggregated field values.
    */
  var variance: js.UndefOr[Variance] = js.undefined
}
object Statistics {
  
  inline def apply(): Statistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Statistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Statistics] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: Average): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setAverageUndefined: Self = StObject.set(x, "average", js.undefined)
    
    inline def setCount(value: Count): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setMaximum(value: Maximum): Self = StObject.set(x, "maximum", value.asInstanceOf[js.Any])
    
    inline def setMaximumUndefined: Self = StObject.set(x, "maximum", js.undefined)
    
    inline def setMinimum(value: Minimum): Self = StObject.set(x, "minimum", value.asInstanceOf[js.Any])
    
    inline def setMinimumUndefined: Self = StObject.set(x, "minimum", js.undefined)
    
    inline def setStdDeviation(value: StdDeviation): Self = StObject.set(x, "stdDeviation", value.asInstanceOf[js.Any])
    
    inline def setStdDeviationUndefined: Self = StObject.set(x, "stdDeviation", js.undefined)
    
    inline def setSum(value: Sum): Self = StObject.set(x, "sum", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquares(value: SumOfSquares): Self = StObject.set(x, "sumOfSquares", value.asInstanceOf[js.Any])
    
    inline def setSumOfSquaresUndefined: Self = StObject.set(x, "sumOfSquares", js.undefined)
    
    inline def setSumUndefined: Self = StObject.set(x, "sum", js.undefined)
    
    inline def setVariance(value: Variance): Self = StObject.set(x, "variance", value.asInstanceOf[js.Any])
    
    inline def setVarianceUndefined: Self = StObject.set(x, "variance", js.undefined)
  }
}
