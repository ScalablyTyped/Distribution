package typings.applicationinsights.outDeclarationsContractsTelemetryTypesExceptionTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionTelemetry extends Telemetry {
  /**
    * Exception thrown
    */
  var exception: Error
  /**
    * Metrics associated with this exception, displayed in Metrics Explorer on the portal. Defaults to empty
    */
  var measurements: js.UndefOr[StringDictionary[Double]] = js.undefined
  /**
    * Exception severity level
    */
  var severity: js.UndefOr[SeverityLevel] = js.undefined
}

object ExceptionTelemetry {
  @scala.inline
  def apply(
    exception: Error,
    contextObjects: StringDictionary[js.Any] = null,
    measurements: StringDictionary[Double] = null,
    properties: StringDictionary[String] = null,
    severity: SeverityLevel = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): ExceptionTelemetry = {
    val __obj = js.Dynamic.literal(exception = exception.asInstanceOf[js.Any])
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects.asInstanceOf[js.Any])
    if (measurements != null) __obj.updateDynamic("measurements")(measurements.asInstanceOf[js.Any])
    if (properties != null) __obj.updateDynamic("properties")(properties.asInstanceOf[js.Any])
    if (severity != null) __obj.updateDynamic("severity")(severity.asInstanceOf[js.Any])
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides.asInstanceOf[js.Any])
    if (time != null) __obj.updateDynamic("time")(time.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExceptionTelemetry]
  }
}

