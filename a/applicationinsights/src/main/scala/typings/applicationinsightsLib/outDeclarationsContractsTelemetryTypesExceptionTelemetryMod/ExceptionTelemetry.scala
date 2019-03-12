package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesExceptionTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExceptionTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Exception thrown
    */
  var exception: stdLib.Error
  /**
    * Metrics associated with this exception, displayed in Metrics Explorer on the portal. Defaults to empty
    */
  var measurements: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
}

object ExceptionTelemetry {
  @scala.inline
  def apply(
    exception: stdLib.Error,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    measurements: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): ExceptionTelemetry = {
    val __obj = js.Dynamic.literal(exception = exception)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (measurements != null) __obj.updateDynamic("measurements")(measurements)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[ExceptionTelemetry]
  }
}

