package typings
package applicationinsightsLib.outLibraryTelemetryClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Application Insights telemetry client provides interface to track telemetry items, register telemetry initializers and
  * and manually trigger immediate sending (flushing)
  */
@js.native
trait TelemetryClient extends js.Object {
  var _telemetryProcessors: js.Any = js.native
  var channel: applicationinsightsLib.outLibraryChannelMod.^ = js.native
  var commonProperties: org.scalablytyped.runtime.StringDictionary[java.lang.String] = js.native
  var config: applicationinsightsLib.outLibraryConfigMod.^ = js.native
  var context: applicationinsightsLib.outLibraryContextMod.^ = js.native
  var quickPulseClient: applicationinsightsLib.outLibraryQuickPulseStateManagerMod.^ = js.native
  /**
    * Adds telemetry processor to the collection. Telemetry processors will be called one by one
    * before telemetry item is pushed for sending and in the order they were added.
    *
    * @param telemetryProcessor function, takes Envelope, and optional context object and returns boolean
    */
  def addTelemetryProcessor(
    telemetryProcessor: js.Function2[
      /* envelope */ applicationinsightsLib.outDeclarationsContractsMod.Envelope, 
      /* contextObjects */ js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]], 
      scala.Boolean
    ]
  ): scala.Unit = js.native
  def clearTelemetryProcessors(): scala.Unit = js.native
  /**
    * Immediately send all queued telemetry.
    * @param options Flush options, including indicator whether app is crashing and callback
    */
  def flush(): scala.Unit = js.native
  def flush(options: applicationinsightsLib.outLibraryFlushOptionsMod.FlushOptions): scala.Unit = js.native
  /* private */ def runTelemetryProcessors(envelope: js.Any, contextObjects: js.Any): js.Any = js.native
  /**
    * Generic track method for all telemetry types
    * @param data the telemetry to send
    * @param telemetryType specify the type of telemetry you are tracking from the list of Contracts.DataTypes
    */
  def track(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry,
    telemetryType: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  ): scala.Unit = js.native
  /**
    * Log a dependency. Note that the default client will attempt to collect dependencies automatically so only use this for dependencies
    * that aren't automatically captured or if you've disabled automatic dependency collection.
    *
    * @param telemetry      Object encapsulating tracking option
    * */
  def trackDependency(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesDependencyTelemetryMod.DependencyTelemetry
  ): scala.Unit = js.native
  /**
    * Log a user action or other occurrence.
    * @param telemetry      Object encapsulating tracking options
    */
  def trackEvent(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesEventTelemetryMod.EventTelemetry
  ): scala.Unit = js.native
  /**
    * Log an exception
    * @param telemetry      Object encapsulating tracking options
    */
  def trackException(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesExceptionTelemetryMod.ExceptionTelemetry
  ): scala.Unit = js.native
  /**
    * Log a numeric value that is not associated with a specific event. Typically used to send regular reports of performance indicators.
    * To send a single measurement, use just the first two parameters. If you take measurements very frequently, you can reduce the
    * telemetry bandwidth by aggregating multiple measurements and sending the resulting average at intervals.
    * @param telemetry      Object encapsulating tracking options
    */
  def trackMetric(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesMetricTelemetryMod.MetricTelemetry
  ): scala.Unit = js.native
  /**
    * Log a request. Note that the default client will attempt to collect HTTP requests automatically so only use this for requests
    * that aren't automatically captured or if you've disabled automatic request collection.
    *
    * @param telemetry      Object encapsulating tracking options
    */
  def trackRequest(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesRequestTelemetryMod.RequestTelemetry
  ): scala.Unit = js.native
  /**
    * Log a trace message
    * @param telemetry      Object encapsulating tracking options
    */
  def trackTrace(
    telemetry: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTraceTelemetryMod.TraceTelemetry
  ): scala.Unit = js.native
}

