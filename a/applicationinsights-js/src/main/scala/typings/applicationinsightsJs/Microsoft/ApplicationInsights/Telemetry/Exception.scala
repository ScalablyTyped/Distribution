package typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry

import typings.applicationinsightsJs.AI.ExceptionDetails
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.applicationinsightsJs.Microsoft.ApplicationInsights.ISerializable
import typings.applicationinsightsJs.anon.Exceptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Exception extends ISerializable {
  @JSName("aiDataContract")
  var aiDataContract_Exception: Exceptions
  var crashThreadId: Double
  var exceptions: js.Array[ExceptionDetails]
  var handledAt: String
  var measurements: js.Any
  var problemId: String
  var properties: js.Any
  var severityLevel: SeverityLevel
  var ver: Double
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
}

