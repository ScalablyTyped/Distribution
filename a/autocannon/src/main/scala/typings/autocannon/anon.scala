package typings.autocannon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined autocannon.autocannon.Histogram & {  sent :number} */
  trait Histogramsentnumber extends StObject {
    
    /** The average (mean) value. */
    var average: Double
    
    /** The highest value for this statistic. */
    var max: Double
    
    /** The average (mean) value */
    var mean: Double
    
    /** The lowest value for this statistic. */
    var min: Double
    
    /** The 0.001st percentile value for this statistic. */
    var p0_001: Double
    
    /** The 0.01st percentile value for this statistic. */
    var p0_01: Double
    
    /** The 0.1st percentile value for this statistic. */
    var p0_1: Double
    
    /** The 1st percentile value for this statistic. */
    var p1: Double
    
    /** The 10th percentile value for this statistic. */
    var p10: Double
    
    /** The 25th percentile value for this statistic. */
    var p25: Double
    
    /** The 2.5th percentile value for this statistic. */
    var p2_5: Double
    
    /** The 50th percentile value for this statistic. */
    var p50: Double
    
    /** The 75th percentile value for this statistic. */
    var p75: Double
    
    /** The 90th percentile value for this statistic. */
    var p90: Double
    
    /** The 97.5th percentile value for this statistic. */
    var p97_5: Double
    
    /** The 99th percentile value for this statistic. */
    var p99: Double
    
    /** The 99.9th percentile value for this statistic. */
    var p99_9: Double
    
    /** The 99.99th percentile value for this statistic. */
    var p99_99: Double
    
    /** The 99.999th percentile value for this statistic. */
    var p99_999: Double
    
    var sent: Double
    
    /** The standard deviation. */
    var stddev: Double
    
    var total: Double
  }
  object Histogramsentnumber {
    
    @scala.inline
    def apply(
      average: Double,
      max: Double,
      mean: Double,
      min: Double,
      p0_001: Double,
      p0_01: Double,
      p0_1: Double,
      p1: Double,
      p10: Double,
      p25: Double,
      p2_5: Double,
      p50: Double,
      p75: Double,
      p90: Double,
      p97_5: Double,
      p99: Double,
      p99_9: Double,
      p99_99: Double,
      p99_999: Double,
      sent: Double,
      stddev: Double,
      total: Double
    ): Histogramsentnumber = {
      val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], mean = mean.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], p0_001 = p0_001.asInstanceOf[js.Any], p0_01 = p0_01.asInstanceOf[js.Any], p0_1 = p0_1.asInstanceOf[js.Any], p1 = p1.asInstanceOf[js.Any], p10 = p10.asInstanceOf[js.Any], p25 = p25.asInstanceOf[js.Any], p2_5 = p2_5.asInstanceOf[js.Any], p50 = p50.asInstanceOf[js.Any], p75 = p75.asInstanceOf[js.Any], p90 = p90.asInstanceOf[js.Any], p97_5 = p97_5.asInstanceOf[js.Any], p99 = p99.asInstanceOf[js.Any], p99_9 = p99_9.asInstanceOf[js.Any], p99_99 = p99_99.asInstanceOf[js.Any], p99_999 = p99_999.asInstanceOf[js.Any], sent = sent.asInstanceOf[js.Any], stddev = stddev.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
      __obj.asInstanceOf[Histogramsentnumber]
    }
    
    @scala.inline
    implicit class HistogramsentnumberMutableBuilder[Self <: Histogramsentnumber] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAverage(value: Double): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMean(value: Double): Self = StObject.set(x, "mean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP0_001(value: Double): Self = StObject.set(x, "p0_001", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP0_01(value: Double): Self = StObject.set(x, "p0_01", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP0_1(value: Double): Self = StObject.set(x, "p0_1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP1(value: Double): Self = StObject.set(x, "p1", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP10(value: Double): Self = StObject.set(x, "p10", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP25(value: Double): Self = StObject.set(x, "p25", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP2_5(value: Double): Self = StObject.set(x, "p2_5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP50(value: Double): Self = StObject.set(x, "p50", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP75(value: Double): Self = StObject.set(x, "p75", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP90(value: Double): Self = StObject.set(x, "p90", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP97_5(value: Double): Self = StObject.set(x, "p97_5", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP99(value: Double): Self = StObject.set(x, "p99", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP99_9(value: Double): Self = StObject.set(x, "p99_9", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP99_99(value: Double): Self = StObject.set(x, "p99_99", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setP99_999(value: Double): Self = StObject.set(x, "p99_999", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSent(value: Double): Self = StObject.set(x, "sent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
    }
  }
}
