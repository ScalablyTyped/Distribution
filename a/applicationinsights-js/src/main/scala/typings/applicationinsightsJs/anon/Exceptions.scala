package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exceptions extends js.Object {
  var exceptions: FieldType
  var handledAt: FieldType
  var measurements: FieldType
  var properties: FieldType
  var severityLevel: FieldType
  var ver: FieldType
}

object Exceptions {
  @scala.inline
  def apply(
    exceptions: FieldType,
    handledAt: FieldType,
    measurements: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Exceptions = {
    val __obj = js.Dynamic.literal(exceptions = exceptions.asInstanceOf[js.Any], handledAt = handledAt.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exceptions]
  }
}

