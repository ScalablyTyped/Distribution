package typings.autocannon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined autocannon.autocannon.Histogram & {  sent :number} */
@js.native
trait Histogramsentnumber extends js.Object {
  /** The average (mean) value. */
  var average: Double = js.native
  /** The highest value for this statistic. */
  var max: Double = js.native
  /** The average (mean) value */
  var mean: Double = js.native
  /** The lowest value for this statistic. */
  var min: Double = js.native
  /** The 0.001st percentile value for this statistic. */
  var p0_001: Double = js.native
  /** The 0.01st percentile value for this statistic. */
  var p0_01: Double = js.native
  /** The 0.1st percentile value for this statistic. */
  var p0_1: Double = js.native
  /** The 1st percentile value for this statistic. */
  var p1: Double = js.native
  /** The 10th percentile value for this statistic. */
  var p10: Double = js.native
  /** The 25th percentile value for this statistic. */
  var p25: Double = js.native
  /** The 2.5th percentile value for this statistic. */
  var p2_5: Double = js.native
  /** The 50th percentile value for this statistic. */
  var p50: Double = js.native
  /** The 75th percentile value for this statistic. */
  var p75: Double = js.native
  /** The 90th percentile value for this statistic. */
  var p90: Double = js.native
  /** The 97.5th percentile value for this statistic. */
  var p97_5: Double = js.native
  /** The 99th percentile value for this statistic. */
  var p99: Double = js.native
  /** The 99.9th percentile value for this statistic. */
  var p99_9: Double = js.native
  /** The 99.99th percentile value for this statistic. */
  var p99_99: Double = js.native
  /** The 99.999th percentile value for this statistic. */
  var p99_999: Double = js.native
  var sent: Double = js.native
  /** The standard deviation. */
  var stddev: Double = js.native
  var total: Double = js.native
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
  implicit class HistogramsentnumberOps[Self <: Histogramsentnumber] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAverage(value: Double): Self = this.set("average", value.asInstanceOf[js.Any])
    @scala.inline
    def setMax(value: Double): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def setMean(value: Double): Self = this.set("mean", value.asInstanceOf[js.Any])
    @scala.inline
    def setMin(value: Double): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def setP0_001(value: Double): Self = this.set("p0_001", value.asInstanceOf[js.Any])
    @scala.inline
    def setP0_01(value: Double): Self = this.set("p0_01", value.asInstanceOf[js.Any])
    @scala.inline
    def setP0_1(value: Double): Self = this.set("p0_1", value.asInstanceOf[js.Any])
    @scala.inline
    def setP1(value: Double): Self = this.set("p1", value.asInstanceOf[js.Any])
    @scala.inline
    def setP10(value: Double): Self = this.set("p10", value.asInstanceOf[js.Any])
    @scala.inline
    def setP25(value: Double): Self = this.set("p25", value.asInstanceOf[js.Any])
    @scala.inline
    def setP2_5(value: Double): Self = this.set("p2_5", value.asInstanceOf[js.Any])
    @scala.inline
    def setP50(value: Double): Self = this.set("p50", value.asInstanceOf[js.Any])
    @scala.inline
    def setP75(value: Double): Self = this.set("p75", value.asInstanceOf[js.Any])
    @scala.inline
    def setP90(value: Double): Self = this.set("p90", value.asInstanceOf[js.Any])
    @scala.inline
    def setP97_5(value: Double): Self = this.set("p97_5", value.asInstanceOf[js.Any])
    @scala.inline
    def setP99(value: Double): Self = this.set("p99", value.asInstanceOf[js.Any])
    @scala.inline
    def setP99_9(value: Double): Self = this.set("p99_9", value.asInstanceOf[js.Any])
    @scala.inline
    def setP99_99(value: Double): Self = this.set("p99_99", value.asInstanceOf[js.Any])
    @scala.inline
    def setP99_999(value: Double): Self = this.set("p99_999", value.asInstanceOf[js.Any])
    @scala.inline
    def setSent(value: Double): Self = this.set("sent", value.asInstanceOf[js.Any])
    @scala.inline
    def setStddev(value: Double): Self = this.set("stddev", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

