package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Exceptions extends js.Object {
  var exceptions: FieldType
  var handledAt: FieldType
  var measurements: FieldType
  var properties: FieldType
  var severityLevel: FieldType
  var ver: FieldType
}

object Anon_Exceptions {
  @scala.inline
  def apply(
    exceptions: FieldType,
    handledAt: FieldType,
    measurements: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Anon_Exceptions = {
    val __obj = js.Dynamic.literal(exceptions = exceptions, handledAt = handledAt, measurements = measurements, properties = properties, severityLevel = severityLevel, ver = ver)
  
    __obj.asInstanceOf[Anon_Exceptions]
  }
}

