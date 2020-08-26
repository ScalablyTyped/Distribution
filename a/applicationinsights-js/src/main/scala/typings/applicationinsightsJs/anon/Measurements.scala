package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Measurements extends js.Object {
  var measurements: FieldType = js.native
  var name: FieldType = js.native
  var properties: FieldType = js.native
  var ver: FieldType = js.native
}

object Measurements {
  @scala.inline
  def apply(measurements: FieldType, name: FieldType, properties: FieldType, ver: FieldType): Measurements = {
    val __obj = js.Dynamic.literal(measurements = measurements.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Measurements]
  }
  @scala.inline
  implicit class MeasurementsOps[Self <: Measurements] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMeasurements(value: FieldType): Self = this.set("measurements", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: FieldType): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: FieldType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: FieldType): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

