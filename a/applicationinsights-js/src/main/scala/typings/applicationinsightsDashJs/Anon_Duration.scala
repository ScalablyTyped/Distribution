package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Duration extends js.Object {
  var duration: FieldType
  var measurements: FieldType
  var name: FieldType
  var properties: FieldType
  var url: FieldType
  var ver: FieldType
}

object Anon_Duration {
  @scala.inline
  def apply(
    duration: FieldType,
    measurements: FieldType,
    name: FieldType,
    properties: FieldType,
    url: FieldType,
    ver: FieldType
  ): Anon_Duration = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Duration]
  }
}

