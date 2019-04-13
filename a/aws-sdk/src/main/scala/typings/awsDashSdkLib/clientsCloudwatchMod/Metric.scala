package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends js.Object {
  /**
    * The dimensions for the metric.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
  /**
    * The name of the metric. This is a required field.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * The namespace of the metric.
    */
  var Namespace: js.UndefOr[Namespace] = js.undefined
}

object Metric {
  @scala.inline
  def apply(Dimensions: Dimensions = null, MetricName: MetricName = null, Namespace: Namespace = null): Metric = {
    val __obj = js.Dynamic.literal()
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    __obj.asInstanceOf[Metric]
  }
}

