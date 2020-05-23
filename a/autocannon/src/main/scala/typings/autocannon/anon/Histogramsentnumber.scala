package typings.autocannon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined autocannon.autocannon.Histogram & {  sent  :number} */
trait Histogramsentnumber extends js.Object {
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
}

