package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesEventTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventTelemetry
  extends applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry {
  /**
    * Metrics associated with this event, displayed in Metrics Explorer on the portal.
    */
  var measurements: js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Double]] = js.undefined
  /**
    * Name of the event
    */
  var name: java.lang.String
}

object EventTelemetry {
  @scala.inline
  def apply(
    name: java.lang.String,
    contextObjects: org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    measurements: org.scalablytyped.runtime.StringDictionary[scala.Double] = null,
    properties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    tagOverrides: org.scalablytyped.runtime.StringDictionary[java.lang.String] = null,
    time: stdLib.Date = null
  ): EventTelemetry = {
    val __obj = js.Dynamic.literal(name = name)
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (measurements != null) __obj.updateDynamic("measurements")(measurements)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[EventTelemetry]
  }
}

