package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait High extends StObject {
  
  var high: Double
  
  var low: Double
  
  var median: js.Array[Double]
  
  var minMax: js.Array[Double]
  
  var q1: Double
  
  var q3: Double
  
  var quantile: js.Array[Double]
}
object High {
  
  inline def apply(
    high: Double,
    low: Double,
    median: js.Array[Double],
    minMax: js.Array[Double],
    q1: Double,
    q3: Double,
    quantile: js.Array[Double]
  ): High = {
    val __obj = js.Dynamic.literal(high = high.asInstanceOf[js.Any], low = low.asInstanceOf[js.Any], median = median.asInstanceOf[js.Any], minMax = minMax.asInstanceOf[js.Any], q1 = q1.asInstanceOf[js.Any], q3 = q3.asInstanceOf[js.Any], quantile = quantile.asInstanceOf[js.Any])
    __obj.asInstanceOf[High]
  }
  
  extension [Self <: High](x: Self) {
    
    inline def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    inline def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    inline def setMedian(value: js.Array[Double]): Self = StObject.set(x, "median", value.asInstanceOf[js.Any])
    
    inline def setMedianVarargs(value: Double*): Self = StObject.set(x, "median", js.Array(value*))
    
    inline def setMinMax(value: js.Array[Double]): Self = StObject.set(x, "minMax", value.asInstanceOf[js.Any])
    
    inline def setMinMaxVarargs(value: Double*): Self = StObject.set(x, "minMax", js.Array(value*))
    
    inline def setQ1(value: Double): Self = StObject.set(x, "q1", value.asInstanceOf[js.Any])
    
    inline def setQ3(value: Double): Self = StObject.set(x, "q3", value.asInstanceOf[js.Any])
    
    inline def setQuantile(value: js.Array[Double]): Self = StObject.set(x, "quantile", value.asInstanceOf[js.Any])
    
    inline def setQuantileVarargs(value: Double*): Self = StObject.set(x, "quantile", js.Array(value*))
  }
}
