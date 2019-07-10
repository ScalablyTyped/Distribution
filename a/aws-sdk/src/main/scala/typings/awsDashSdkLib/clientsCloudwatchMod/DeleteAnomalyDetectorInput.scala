package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteAnomalyDetectorInput extends js.Object {
  /**
    * The metric dimensions associated with the anomaly detection model to delete.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
  /**
    * The metric name associated with the anomaly detection model to delete.
    */
  var MetricName: awsDashSdkLib.clientsCloudwatchMod.MetricName
  /**
    * The namespace associated with the anomaly detection model to delete.
    */
  var Namespace: awsDashSdkLib.clientsCloudwatchMod.Namespace
  /**
    * The statistic associated with the anomaly detection model to delete.
    */
  var Stat: awsDashSdkLib.clientsCloudwatchMod.Stat
}

object DeleteAnomalyDetectorInput {
  @scala.inline
  def apply(MetricName: MetricName, Namespace: Namespace, Stat: Stat, Dimensions: Dimensions = null): DeleteAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Namespace = Namespace, Stat = Stat)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[DeleteAnomalyDetectorInput]
  }
}

