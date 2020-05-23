package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  var measurements: FieldType
  var message: FieldType
  var properties: FieldType
  var severityLevel: FieldType
  var ver: FieldType
}

object Message {
  @scala.inline
  def apply(
    measurements: FieldType,
    message: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Message = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Message]
  }
}

