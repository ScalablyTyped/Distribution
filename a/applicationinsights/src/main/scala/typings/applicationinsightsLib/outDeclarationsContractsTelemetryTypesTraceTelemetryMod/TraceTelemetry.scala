package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesTraceTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TraceTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Trace message
    */
  var message: java.lang.String
  /**
    * Trace severity level
    */
  var severity: js.UndefOr[
    applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  ] = js.undefined
}

object TraceTelemetry {
  @scala.inline
  def apply(
    message: java.lang.String,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    severity: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
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

