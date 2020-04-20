package typings.applicationinsightsJs

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMetrics extends js.Object {
  var metrics: FieldType
  var properties: FieldType
  var ver: FieldType
}

object AnonMetrics {
  @scala.inline
  def apply(metrics: FieldType, properties: FieldType, ver: FieldType): AnonMetrics = {
    val __obj = js.Dynamic.literal(metrics = metrics.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMetrics]
  }
}

