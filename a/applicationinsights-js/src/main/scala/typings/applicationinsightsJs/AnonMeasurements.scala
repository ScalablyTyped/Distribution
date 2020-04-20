package typings.applicationinsightsJs

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMeasurements extends js.Object {
  var measurements: FieldType
  var name: FieldType
  var properties: FieldType
  var ver: FieldType
}

object AnonMeasurements {
  @scala.inline
  def apply(measurements: FieldType, name: FieldType, properties: FieldType, ver: FieldType): AnonMeasurements = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMeasurements]
  }
}

