package typings
package applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Telemetry extends js.Object {
  /**
       * An event-specific context that will be passed to telemetry processors handling this event before it is sent. For a context spanning your entire operation, consider appInsights.getCorrelationContext
       */
  var contextObjects: js.UndefOr[ScalablyTyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
       * Additional data used to filter events and metrics in the portal. Defaults to empty.
       */
  var properties: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * The context tags to use for this telemetry which overwrite default context values
       */
  var tagOverrides: js.UndefOr[ScalablyTyped.runtime.StringDictionary[java.lang.String]] = js.undefined
  /**
       * Telemetry time stamp. When it is not specified, current tiestamp will be used.
       */
  var time: js.UndefOr[stdLib.Date] = js.undefined
}

