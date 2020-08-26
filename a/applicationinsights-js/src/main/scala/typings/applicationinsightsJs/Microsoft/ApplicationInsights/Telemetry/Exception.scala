package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.ExceptionDetails
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Exceptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Exception extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Exception: Exceptions = js.native
  var crashThreadId: Double = js.native
  var exceptions: js.Array[ExceptionDetails] = js.native
  var handledAt: String = js.native
  var measurements: js.Any = js.native
  var problemId: String = js.native
  var properties: js.Any = js.native
  var severityLevel: SeverityLevel = js.native
  var ver: Double = js.native
}

object Exception {
  @scala.inline
  def apply(
    aiDataContract: Exceptions,
    crashThreadId: Double,
    exceptions: js.Array[ExceptionDetails],
    handledAt: String,
    measurements: js.Any,
    problemId: String,
    properties: js.Any,
    severityLevel: SeverityLevel,
    ver: Double
  ): Exception = {
    val __obj = js.Dynamic.literal(aiDataContract = aiDataContract.asInstanceOf[js.Any], crashThreadId = crashThreadId.asInstanceOf[js.Any], exceptions = exceptions.asInstanceOf[js.Any], handledAt = handledAt.asInstanceOf[js.Any], measurements = measurements.asInstanceOf[js.Any], problemId = problemId.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any], severityLevel = severityLevel.asInstanceOf[js.Any], ver = ver.asInstanceOf[js.Any])
    __obj.asInstanceOf[Exception]
  }
  @scala.inline
  implicit class ExceptionOps[Self <: Exception] (val x: Self) extends AnyVal {
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
    def setAiDataContract(value: Exceptions): Self = this.set("aiDataContract", value.asInstanceOf[js.Any])
    @scala.inline
    def setCrashThreadId(value: Double): Self = this.set("crashThreadId", value.asInstanceOf[js.Any])
    @scala.inline
    def setExceptionsVarargs(value: ExceptionDetails*): Self = this.set("exceptions", js.Array(value :_*))
    @scala.inline
    def setExceptions(value: js.Array[ExceptionDetails]): Self = this.set("exceptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHandledAt(value: String): Self = this.set("handledAt", value.asInstanceOf[js.Any])
    @scala.inline
    def setMeasurements(value: js.Any): Self = this.set("measurements", value.asInstanceOf[js.Any])
    @scala.inline
    def setProblemId(value: String): Self = this.set("problemId", value.asInstanceOf[js.Any])
    @scala.inline
    def setProperties(value: js.Any): Self = this.set("properties", value.asInstanceOf[js.Any])
    @scala.inline
    def setSeverityLevel(value: SeverityLevel): Self = this.set("severityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def setVer(value: Double): Self = this.set("ver", value.asInstanceOf[js.Any])
  }
  
}

