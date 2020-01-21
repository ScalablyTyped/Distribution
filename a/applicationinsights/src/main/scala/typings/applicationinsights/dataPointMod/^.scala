package typings.applicationinsights.dataPointMod

import typings.applicationinsights.dataPointTypeMod.DataPointType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metric data single measurement.
  */
@JSImport("applicationinsights/out/Declarations/Contracts/Generated/DataPoint", JSImport.Namespace)
@js.native
class ^ () extends DataPoint {
  /**
    * Metric weight of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * Metric type. Single measurement or the aggregated value.
    */
  /* CompleteClass */
  override var kind: DataPointType = js.native
  /**
    * Maximum value of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var max: Double = js.native
  /**
    * Minimum value of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var min: Double = js.native
  /**
    * Name of the metric.
    */
  /* CompleteClass */
  override var name: String = js.native
  /**
    * Standard deviation of the aggregated metric. Should not be set for a measurement.
    */
  /* CompleteClass */
  override var stdDev: Double = js.native
  /**
    * Single value for measurement. Sum of individual measurements for the aggregation.
    */
  /* CompleteClass */
  override var value: Double = js.native
}

