package typings.applicationinsights.dataPointMod

import typings.applicationinsights.dataPointTypeMod.DataPointType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metric data single measurement.
  */
trait DataPoint extends js.Object {
  /**
    * Metric weight of the aggregated metric. Should not be set for a measurement.
    */
  var count: Double
  /**
    * Metric type. Single measurement or the aggregated value.
    */
  var kind: DataPointType
  /**
    * Maximum value of the aggregated metric. Should not be set for a measurement.
    */
  var max: Double
  /**
    * Minimum value of the aggregated metric. Should not be set for a measurement.
    */
  var min: Double
  /**
    * Name of the metric.
    */
  var name: String
  /**
    * Standard deviation of the aggregated metric. Should not be set for a measurement.
    */
  var stdDev: Double
  /**
    * Single value for measurement. Sum of individual measurements for the aggregation.
    */
  var value: Double
}

object DataPoint {
  @scala.inline
  def apply(
    count: Double,
    kind: DataPointType,
    max: Double,
    min: Double,
    name: String,
    stdDev: Double,
    value: Double
  ): DataPoint = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], max = max.asInstanceOf[js.Any], min = min.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], stdDev = stdDev.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DataPoint]
  }
}

