package typings.applicationinsightsDashJs

import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Measurements extends js.Object {
  var measurements: FieldType
  var name: FieldType
  var properties: FieldType
  var ver: FieldType
}

object Anon_Measurements {
  @scala.inline
  def apply(measurements: FieldType, name: FieldType, properties: FieldType, ver: FieldType): Anon_Measurements = {
    val __obj = js.Dynamic.literal(measurements = measurements, name = name, properties = properties, ver = ver)
  
    __obj.asInstanceOf[Anon_Measurements]
  }
}

