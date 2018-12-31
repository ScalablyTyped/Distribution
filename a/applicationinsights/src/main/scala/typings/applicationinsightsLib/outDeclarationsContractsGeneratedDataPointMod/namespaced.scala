package typings
package applicationinsightsLib.outDeclarationsContractsGeneratedDataPointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metric data single measurement.
  */
@JSImport("applicationinsights/out/Declarations/Contracts/Generated/DataPoint", JSImport.Namespace)
@js.native
class namespaced () extends DataPoint {
  /**
    * Metric weight of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var count: scala.Double = js.native
  /**
    * Metric type. Single measurement or the aggregated value.
    */
  /* CompleteClass */
  override var kind: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType = js.native
  /**
    * Maximum value of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var max: scala.Double = js.native
  /**
    * Minimum value of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var min: scala.Double = js.native
  /**
    * Name of the metric.
    */
  /* CompleteClass */
  override var name: java.lang.String = js.native
  /**
    * Standard deviation of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var stdDev: scala.Double = js.native
  /**
    * Single value for measurement. Sum of individual measurements for the aggregation.
    */
  /* CompleteClass */
  override var value: scala.Double = js.native
}

