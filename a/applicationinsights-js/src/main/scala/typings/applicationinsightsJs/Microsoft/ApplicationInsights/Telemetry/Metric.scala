package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.DataPoint
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metric extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Metric: Metrics
  var metrics: js.Array[DataPoint]
  var properties: js.Any
  var ver: Double
}

object Metric {
  @scala.inline
  def apply(aiDataContract: Metrics, metrics: js.Array[DataPoint], properties: js.Any, ver: Double): Metric = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
}

