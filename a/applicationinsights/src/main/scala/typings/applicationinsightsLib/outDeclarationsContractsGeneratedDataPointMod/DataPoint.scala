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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("count")(count)
    __obj.updateDynamic("kind")(kind)
    __obj.updateDynamic("max")(max)
    __obj.updateDynamic("min")(min)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("stdDev")(stdDev)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[DataPoint]
  }
}

