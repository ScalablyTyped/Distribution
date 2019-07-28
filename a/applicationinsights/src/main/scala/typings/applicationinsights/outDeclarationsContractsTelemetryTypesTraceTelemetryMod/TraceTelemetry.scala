package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTraceTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceTelemetry extends Telemetry {
  /**
    * Trace message
    */
  var message: String
  /**
    * Trace severity level
    */
  var severity: js.UndefOr[SeverityLevel] = js.undefined
}

object TraceTelemetry {
  @scala.inline
  def apply(
    message: String,
    contextObjects: StringDictionary[js.Any] = null,
    properties: StringDictionary[String] = null,
    severity: SeverityLevel = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): TraceTelemetry = {
    val __obj = js.Dynamic.literal(message = message)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (severity != null) __obj.updateDynamic("severity")(severity)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[TraceTelemetry]
  }
}

