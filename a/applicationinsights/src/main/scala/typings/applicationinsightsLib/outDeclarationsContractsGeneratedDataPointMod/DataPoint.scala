package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedDataPointMod

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
  var count: scala.Double
  /**
    * Metric type. Single measurement or the aggregated value.
    */
  var kind: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType
  /**
    * Maximum value of the aggregated metric. Should not be set for a measurement.
    */
  var max: scala.Double
  /**
    * Minimum value of the aggregated metric. Should not be set for a measurement.
    */
  var min: scala.Double
  /**
    * Name of the metric.
    */
  var name: java.lang.String
  /**
    * Standard deviation of the aggregated metric. Should not be set for a measurement.
    */
  var stdDev: scala.Double
  /**
    * Single value for measurement. Sum of individual measurements for the aggregation.
    */
  var value: scala.Double
}

object DataPoint {
  @scala.inline
  def apply(
    count: scala.Double,
    kind: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType,
    max: scala.Double,
    min: scala.Double,
    name: java.lang.String,
    stdDev: scala.Double,
    value: scala.Double
  ): DataPoint = {
    val __obj = js.Dynamic.literal(count = count, kind = kind, max = max, min = min, name = name, stdDev = stdDev, value = value)
  
    __obj.asInstanceOf[DataPoint]
  }
}

