package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Metrics extends js.Object {
  var metrics: FieldType
  var properties: FieldType
  var ver: FieldType
}

object Metrics {
  @scala.inline
  def apply(metrics: FieldType, properties: FieldType, ver: FieldType): Metrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Metrics]
  }
}

