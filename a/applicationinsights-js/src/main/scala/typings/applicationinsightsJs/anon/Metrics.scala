package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Metrics extends js.Object {
  var metrics: FieldType = js.native
  var properties: FieldType = js.native
  var ver: FieldType = js.native
}

object Metrics {
  @scala.inline
  def apply(metrics: FieldType, properties: FieldType, ver: FieldType): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
  @scala.inline
  implicit class MetricsOps[Self <: Metrics] (val x: Self) extends AnyVal {
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
    def setMetrics(value: FieldType): Self = this.set("metrics", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: FieldType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: FieldType): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

