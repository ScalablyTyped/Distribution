package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutAnomalyDetectorInput extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric. You can in
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.undefined
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Dimensions] = js.undefined
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: typings.awsDashSdk.clientsCloudwatchMod.MetricName
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: typings.awsDashSdk.clientsCloudwatchMod.Namespace
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: typings.awsDashSdk.clientsCloudwatchMod.Stat
}

object PutAnomalyDetectorInput {
  @scala.inline
  def apply(
    MetricName: MetricName,
    Namespace: Namespace,
    Stat: Stat,
    Configuration: AnomalyDetectorConfiguration = null,
    Dimensions: Dimensions = null
  ): PutAnomalyDetectorInput = {
    val __obj = js.Dynamic.literal(MetricName = MetricName, Namespace = Namespace, Stat = Stat)
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration)
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions)
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
}

