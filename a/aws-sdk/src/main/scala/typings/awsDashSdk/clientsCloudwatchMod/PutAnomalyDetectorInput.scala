package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAnomalyDetectorInput extends js.Object {
  /**
    * The configuration specifies details about how the anomaly detection model is to be trained, including time ranges to exclude when training and updating the model. You can specify as many as 10 time ranges. The configuration can also include the time zone to use for the metric. You can in
    */
  var Configuration: js.UndefOr[AnomalyDetectorConfiguration] = js.native
  /**
    * The metric dimensions to create the anomaly detection model for.
    */
  var Dimensions: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.Dimensions] = js.native
  /**
    * The name of the metric to create the anomaly detection model for.
    */
  var MetricName: typings.awsDashSdk.clientsCloudwatchMod.MetricName = js.native
  /**
    * The namespace of the metric to create the anomaly detection model for.
    */
  var Namespace: typings.awsDashSdk.clientsCloudwatchMod.Namespace = js.native
  /**
    * The statistic to use for the metric and the anomaly detection model.
    */
  var Stat: typings.awsDashSdk.clientsCloudwatchMod.Stat = js.native
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
    val __obj = js.Dynamic.literal(MetricName = MetricName.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any], Stat = Stat.asInstanceOf[js.Any])
    if (Configuration != null) __obj.updateDynamic("Configuration")(Configuration.asInstanceOf[js.Any])
    if (Dimensions != null) __obj.updateDynamic("Dimensions")(Dimensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAnomalyDetectorInput]
  }
}

