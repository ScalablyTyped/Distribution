package typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Telemetry extends js.Object {
  /**
    * An event-specific context that will be passed to telemetry processors handling this event before it is sent. For a context spanning your entire operation, consider appInsights.getCorrelationContext
    */
  var contextObjects: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Additional data used to filter events and metrics in the portal. Defaults to empty.
    */
  var properties: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * The context tags to use for this telemetry which overwrite default context values
    */
  var tagOverrides: js.UndefOr[StringDictionary[String]] = js.undefined
  /**
    * Telemetry time stamp. When it is not specified, current tiestamp will be used.
    */
  var time: js.UndefOr[Date] = js.undefined
}

object Telemetry {
  @scala.inline
  def apply(
    contextObjects: StringDictionary[js.Any] = null,
    properties: StringDictionary[String] = null,
    tagOverrides: StringDictionary[String] = null,
    time: Date = null
  ): Telemetry = {
    val __obj = js.Dynamic.literal()
    if (contextObjects != null) __obj.updateDynamic("contextObjects")(contextObjects)
    if (properties != null) __obj.updateDynamic("properties")(properties)
    if (tagOverrides != null) __obj.updateDynamic("tagOverrides")(tagOverrides)
    if (time != null) __obj.updateDynamic("time")(time)
    __obj.asInstanceOf[Telemetry]
  }
}

