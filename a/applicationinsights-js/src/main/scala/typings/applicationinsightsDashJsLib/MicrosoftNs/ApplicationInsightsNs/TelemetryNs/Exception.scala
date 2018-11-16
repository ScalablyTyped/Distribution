package typings
package applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Exception")
@js.native
class Exception protected ()
  extends applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.ISerializable {
  /**
           * Constructs a new isntance of the ExceptionTelemetry object
           */
  def this(exception: stdLib.Error) = this()
  /**
           * Constructs a new isntance of the ExceptionTelemetry object
           */
  def this(exception: stdLib.Error, handledAt: java.lang.String) = this()
  /**
           * Constructs a new isntance of the ExceptionTelemetry object
           */
  def this(exception: stdLib.Error, handledAt: java.lang.String, properties: js.Any) = this()
  /**
           * Constructs a new isntance of the ExceptionTelemetry object
           */
  def this(exception: stdLib.Error, handledAt: java.lang.String, properties: js.Any, measurements: js.Any) = this()
  /**
           * Constructs a new isntance of the ExceptionTelemetry object
           */
  def this(exception: stdLib.Error, handledAt: java.lang.String, properties: js.Any, measurements: js.Any, severityLevel: applicationinsightsDashJsLib.AINs.SeverityLevel) = this()
  /**
           * The set of fields for a serializeable object.
           * This defines the serialization order and a value of true/false
           * for each field defines whether the field is required or not.
           */
  /* CompleteClass */
  override var aiDataContract: js.Any = js.native
  @JSName("aiDataContract")
  var aiDataContract_Exception: applicationinsightsDashJsLib.Anon_Exceptions = js.native
  var crashThreadId: scala.Double = js.native
  var exceptions: js.Array[applicationinsightsDashJsLib.AINs.ExceptionDetails] = js.native
  var handledAt: java.lang.String = js.native
  var measurements: js.Any = js.native
  var problemId: java.lang.String = js.native
  var properties: js.Any = js.native
  var severityLevel: applicationinsightsDashJsLib.AINs.SeverityLevel = js.native
  var ver: scala.Double = js.native
}

@JSGlobal("Microsoft.ApplicationInsights.Telemetry.Exception")
@js.native
object Exception extends js.Object {
  var dataType: java.lang.String = js.native
  var envelopeType: java.lang.String = js.native
  /**
           * Creates a simple exception with 1 stack frame. Useful for manual constracting of exception.
           */
  def CreateSimpleException(
    message: java.lang.String,
    typeName: java.lang.String,
    assembly: java.lang.String,
    fileName: java.lang.String,
    details: java.lang.String,
    line: scala.Double
  ): applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.Exception = js.native
  /**
           * Creates a simple exception with 1 stack frame. Useful for manual constracting of exception.
           */
  def CreateSimpleException(
    message: java.lang.String,
    typeName: java.lang.String,
    assembly: java.lang.String,
    fileName: java.lang.String,
    details: java.lang.String,
    line: scala.Double,
    handledAt: java.lang.String
  ): applicationinsightsDashJsLib.MicrosoftNs.ApplicationInsightsNs.TelemetryNs.Exception = js.native
}

