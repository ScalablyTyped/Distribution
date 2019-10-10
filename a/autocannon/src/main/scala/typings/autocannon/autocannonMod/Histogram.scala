package typings.autocannon.autocannonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Histogram extends js.Object {
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
  /** The standard deviation. */
  var stddev: Double
  var total: Double
}

object Histogram {
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
    stddev: Double,
    total: Double
  ): Histogram = {
    val __obj = js.Dynamic.literal(average = average, max = max, mean = mean, min = min, p0_001 = p0_001, p0_01 = p0_01, p0_1 = p0_1, p1 = p1, p10 = p10, p25 = p25, p2_5 = p2_5, p50 = p50, p75 = p75, p90 = p90, p97_5 = p97_5, p99 = p99, p99_9 = p99_9, p99_99 = p99_99, p99_999 = p99_999, stddev = stddev, total = total)
  
    __obj.asInstanceOf[Histogram]
  }
}

