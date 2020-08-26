package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.DataPoint
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Metrics
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metric extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Metric: Metrics = js.native
  var metrics: js.Array[DataPoint] = js.native
  var properties: js.Any = js.native
  var ver: Double = js.native
}

object Metric {
  @scala.inline
  def apply(aiDataContract: Metrics, metrics: js.Array[DataPoint], properties: js.Any, ver: Double): Metric = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metric]
  }
  @scala.inline
  implicit class MetricOps[Self <: Metric] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAiDataContract(value: Metrics): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
    @scala.inline
    def setMetricsVarargs(value: DataPoint*): Self = this.set("metrics", js.Array(value :_*))
    @scala.inline
    def setMetrics(value: js.Array[DataPoint]): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

