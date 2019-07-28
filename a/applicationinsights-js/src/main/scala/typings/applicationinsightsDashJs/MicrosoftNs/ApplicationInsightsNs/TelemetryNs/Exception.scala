package typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import typings.applicationinsightsDashJs.AINs.ExceptionDetails
import typings.applicationinsightsDashJs.AINs.SeverityLevel
import typings.applicationinsightsDashJs.Anon_Exceptions
import typings.applicationinsightsDashJs.MicrosoftNs.ApplicationInsightsNs.ISerializable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Exception")
@js.native
class Exception protected () extends ISerializable {
  /**
    * Constructs a new isntance of the ExceptionTelemetry object
    */
  def this(exception: Error) = this()
  def this(exception: Error, handledAt: String) = this()
  def this(exception: Error, handledAt: String, properties: js.Any) = this()
  def this(exception: Error, handledAt: String, properties: js.Any, measurements: js.Any) = this()
  def this(
    exception: Error,
    handledAt: String,
    properties: js.Any,
    measurements: js.Any,
    severityLevel: SeverityLevel
  ) = this()
  /**
    * The set of fields for a serializeable object.
    * This defines the serialization order and a value of true/false
    * for each field defines whether the field is required or not.
    */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Exception: Anon_Exceptions = js.native
  var crashThreadId: Double = js.native
  var exceptions: js.Array[ExceptionDetails] = js.native
  var handledAt: String = js.native
  var measurements: js.Any = js.native
  var problemId: String = js.native
  var properties: js.Any = js.native
  var severityLevel: SeverityLevel = js.native
  var ver: Double = js.native
}

/* static members */
@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Exception")
@js.native
object Exception extends js.Object {
  var dataType: String = js.native
  var envelopeType: String = js.native
  /**
    * Creates a simple exception with 1 stack frame. Useful for manual constracting of exception.
    */
  def CreateSimpleException(
    message: String,
    typeName: String,
    assembly: String,
    fileName: String,
    details: String,
    line: Double
  ): Exception = js.native
  def CreateSimpleException(
    message: String,
    typeName: String,
    assembly: String,
    fileName: String,
    details: String,
    line: Double,
    handledAt: String
  ): Exception = js.native
}

