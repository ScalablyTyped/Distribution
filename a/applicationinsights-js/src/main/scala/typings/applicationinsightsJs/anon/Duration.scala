package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Duration extends js.Object {
  var duration: FieldType
  var measurements: FieldType
  var name: FieldType
  var properties: FieldType
  var url: FieldType
  var ver: FieldType
}

object Duration {
  @scala.inline
  def apply(
    duration: FieldType,
    measurements: FieldType,
    name: FieldType,
    properties: FieldType,
    url: FieldType,
    ver: FieldType
  ): Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Duration]
  }
}

