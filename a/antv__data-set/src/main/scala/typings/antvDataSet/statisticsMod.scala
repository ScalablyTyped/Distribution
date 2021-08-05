package typings.antvDataSet

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object statisticsMod {
  
  trait StatisticsApi extends StObject {
    
    def average(column: String): Double
    
    def extent(column: String): Double
    
    def max(column: String): Double
    
    def mean(column: String): Double
    
    def median(column: String): Double
    
    def min(column: String): Double
    
    def mode(column: String): Double
    
    def product(column: String): Double
    
    def quantile(column: String, percent: Double): Double
    
    def quantiles(column: String, percents: js.Array[Double]): js.Array[Double]
    
    def quantilesByFraction(column: String, fraction: Double): Double
    
    def range(column: String): js.Tuple2[Double, Double]
    
    def standardDeviation(column: String): Double
    
    def sum(column: String): Double
    
    def sumSimple(column: String): Double
    
    def variance(column: String): Double
  }
  object StatisticsApi {
    
    inline def apply(
      average: String => Double,
      extent: String => Double,
      max: String => Double,
      mean: String => Double,
      median: String => Double,
      min: String => Double,
      mode: String => Double,
      product: String => Double,
      quantile: (String, Double) => Double,
      quantiles: (String, js.Array[Double]) => js.Array[Double],
      quantilesByFraction: (String, Double) => Double,
      range: String => js.Tuple2[Double, Double],
      standardDeviation: String => Double,
      sum: String => Double,
      sumSimple: String => Double,
      variance: String => Double
    ): StatisticsApi = {
      val __obj = js.Dynamic.literal(average = js.Any.fromFunction1(average), extent = js.Any.fromFunction1(extent), max = js.Any.fromFunction1(max), mean = js.Any.fromFunction1(mean), median = js.Any.fromFunction1(median), min = js.Any.fromFunction1(min), mode = js.Any.fromFunction1(mode), product = js.Any.fromFunction1(product), quantile = js.Any.fromFunction2(quantile), quantiles = js.Any.fromFunction2(quantiles), quantilesByFraction = js.Any.fromFunction2(quantilesByFraction), range = js.Any.fromFunction1(range), standardDeviation = js.Any.fromFunction1(standardDeviation), sum = js.Any.fromFunction1(sum), sumSimple = js.Any.fromFunction1(sumSimple), variance = js.Any.fromFunction1(variance))
      __obj.asInstanceOf[StatisticsApi]
    }
    
    extension [Self <: StatisticsApi](x: Self) {
      
      inline def setAverage(value: String => Double): Self = StObject.set(x, "average", js.Any.fromFunction1(value))
      
      inline def setExtent(value: String => Double): Self = StObject.set(x, "extent", js.Any.fromFunction1(value))
      
      inline def setMax(value: String => Double): Self = StObject.set(x, "max", js.Any.fromFunction1(value))
      
      inline def setMean(value: String => Double): Self = StObject.set(x, "mean", js.Any.fromFunction1(value))
      
      inline def setMedian(value: String => Double): Self = StObject.set(x, "median", js.Any.fromFunction1(value))
      
      inline def setMin(value: String => Double): Self = StObject.set(x, "min", js.Any.fromFunction1(value))
      
      inline def setMode(value: String => Double): Self = StObject.set(x, "mode", js.Any.fromFunction1(value))
      
      inline def setProduct(value: String => Double): Self = StObject.set(x, "product", js.Any.fromFunction1(value))
      
      inline def setQuantile(value: (String, Double) => Double): Self = StObject.set(x, "quantile", js.Any.fromFunction2(value))
      
      inline def setQuantiles(value: (String, js.Array[Double]) => js.Array[Double]): Self = StObject.set(x, "quantiles", js.Any.fromFunction2(value))
      
      inline def setQuantilesByFraction(value: (String, Double) => Double): Self = StObject.set(x, "quantilesByFraction", js.Any.fromFunction2(value))
      
      inline def setRange(value: String => js.Tuple2[Double, Double]): Self = StObject.set(x, "range", js.Any.fromFunction1(value))
      
      inline def setStandardDeviation(value: String => Double): Self = StObject.set(x, "standardDeviation", js.Any.fromFunction1(value))
      
      inline def setSum(value: String => Double): Self = StObject.set(x, "sum", js.Any.fromFunction1(value))
      
      inline def setSumSimple(value: String => Double): Self = StObject.set(x, "sumSimple", js.Any.fromFunction1(value))
      
      inline def setVariance(value: String => Double): Self = StObject.set(x, "variance", js.Any.fromFunction1(value))
    }
  }
}
