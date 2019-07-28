package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutMetricDataInput extends js.Object {
  /**
    * The data for the metric. The array can include no more than 20 metrics per call.
    */
  var MetricData: typings.awsDashSdk.clientsCloudwatchMod.MetricData
  /**
    * The namespace for the metric data. You cannot specify a namespace that begins with "AWS/". Namespaces that begin with "AWS/" are reserved for use by Amazon Web Services products.
    */
  var Namespace: typings.awsDashSdk.clientsCloudwatchMod.Namespace
}

object PutMetricDataInput {
  @scala.inline
  def apply(MetricData: MetricData, Namespace: Namespace): PutMetricDataInput = {
    val __obj = js.Dynamic.literal(MetricData = MetricData, Namespace = Namespace)
  
    __obj.asInstanceOf[PutMetricDataInput]
  }
}

