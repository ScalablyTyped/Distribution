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
    * The namespace for the metric data. To avoid conflicts with AWS service namespaces, you should not specify a namespace that begins with AWS/ 
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

