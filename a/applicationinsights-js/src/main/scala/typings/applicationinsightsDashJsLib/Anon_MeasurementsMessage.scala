package typings
package applicationinsightsDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MeasurementsMessage extends js.Object {
  var measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var message: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var severityLevel: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  var ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
}

object Anon_MeasurementsMessage {
  @scala.inline
  def apply(
    measurements: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    message: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    properties: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    severityLevel: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType,
    ver: applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.FieldType
  ): Anon_MeasurementsMessage = {
    val __obj = js.Dynamic.literal(measurements = measurements, message = message, properties = properties, severityLevel = severityLevel, ver = ver)
  
    __obj.asInstanceOf[Anon_MeasurementsMessage]
  }
}

