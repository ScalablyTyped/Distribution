package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnomalyDetector extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude from use for training the model, and the time zone to use for the metric.
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined
  /**
    * The metric dimensions associated with the anomaly detection model.
    */
  var Dimensions: js.UndefOr[Dimensions] = js.undefined
  /**
    * The name of the metric associated with the anomaly detection model.
    */
  var MetricName: js.UndefOr[MetricName] = js.undefined
  /**
    * The namespace of the metric associated with the anomaly detection model.
    */
  var Namespace: js.UndefOr[Namespace] = js.undefined
  /**
    * The statistic associated with the anomaly detection model.
    */
  var Stat: js.UndefOr[Stat] = js.undefined
}

object AnomalyDetector {
  @scala.inline
  def apply(
    Configuration: AnomalyDetectorConfiguration = null,
    Dimensions: Dimensions = null,
    MetricName: MetricName = null,
    Namespace: Namespace = null,
    Stat: Stat = null
  ): AnomalyDetector = {
    val __obj = js.Dynamic.literal()
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    if (MetricName != null) __obj.updateDynamic("MetricName")(MetricName)
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    if (Stat != null) __obj.updateDynamic("Stat")(Stat)
    __obj.asInstanceOf[AnomalyDetector]
  }
}

