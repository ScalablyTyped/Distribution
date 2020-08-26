package typings.applicationinsightsJs.anon

import typings.applicationinsightsJs.Microsoft.ApplicationInsights.FieldType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exceptions extends js.Object {
  var exceptions: FieldType = js.native
  var handledAt: FieldType = js.native
  var measurements: FieldType = js.native
  var properties: FieldType = js.native
  var severityLevel: FieldType = js.native
  var ver: FieldType = js.native
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
  @scala.inline
  implicit class ExceptionsOps[Self <: Exceptions] (val x: Self) extends AnyVal {
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
    def setExceptions(value: FieldType): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandledAt(value: FieldType): Self = this.set("handledAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurements(value: FieldType): Self = this.set("measurements", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: FieldType): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverityLevel(value: FieldType): Self = this.set("severityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: FieldType): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

