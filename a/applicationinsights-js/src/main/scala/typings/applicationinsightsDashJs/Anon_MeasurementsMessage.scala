package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasurementsMessage extends js.Object {
  var measurements: FieldType
  var message: FieldType
  var properties: FieldType
  var severityLevel: FieldType
  var ver: FieldType
}

object Anon_MeasurementsMessage {
  @scala.inline
  def apply(
    measurements: FieldType,
    message: FieldType,
    properties: FieldType,
    severityLevel: FieldType,
    ver: FieldType
  ): Anon_MeasurementsMessage = {
    val __obj = js.Dynamic.literal(measurements = measurements, message = message, properties = properties, severityLevel = severityLevel, ver = ver)
  
    __obj.asInstanceOf[Anon_MeasurementsMessage]
  }
}

