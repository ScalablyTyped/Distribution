package typings.applicationinsights.outLibraryTelemetryClientMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsMod.Envelope
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesDependencyTelemetryMod.DependencyTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesEventTelemetryMod.EventTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesExceptionTelemetryMod.ExceptionTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesMetricTelemetryMod.MetricTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesRequestTelemetryMod.RequestTelemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryMod.Telemetry
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTraceTelemetryMod.TraceTelemetry
import typings.applicationinsights.outLibraryFlushOptionsMod.FlushOptions
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
  var channel: typings.applicationinsights.outLibraryChannelMod.^ = js.native
  var commonProperties: StringDictionary[String] = js.native
  var config: typings.applicationinsights.outLibraryConfigMod.^ = js.native
  var context: typings.applicationinsights.outLibraryContextMod.^ = js.native
  var quickPulseClient: typings.applicationinsights.outLibraryQuickPulseStateManagerMod.^ = js.native
  /**
    * Adds telemetry processor to the collection. Telemetry processors will be called one by one
    * before telemetry item is pushed for sending and in the order they were added.
    *
    * @param telemetryProcessor function, takes Envelope, and optional context object and returns boolean
    */
  def addTelemetryProcessor(
    telemetryProcessor: js.Function2[
      /* envelope */ Envelope, 
      /* contextObjects */ js.UndefOr[StringDictionary[js.Any]], 
      Boolean
    ]
  ): Unit = js.native
  def clearTelemetryProcessors(): Unit = js.native
  /**
    * Immediately send all queued telemetry.
    * @param options Flush options, including indicator whether app is crashing and callback
    */
  def flush(): Unit = js.native
  def flush(options: FlushOptions): Unit = js.native
  /* private */ def runTelemetryProcessors(envelope: js.Any, contextObjects: js.Any): js.Any = js.native
  /**
    * Generic track method for all telemetry types
    * @param data the telemetry to send
    * @param telemetryType specify the type of telemetry you are tracking from the list of Contracts.DataTypes
    */
  def track(telemetry: Telemetry, telemetryType: TelemetryType): Unit = js.native
  /**
    * Log a dependency. Note that the default client will attempt to collect dependencies automatically so only use this for dependencies
    * that aren't automatically captured or if you've disabled automatic dependency collection.
    *
    * @param telemetry      Object encapsulating tracking option
    * */
  def trackDependency(telemetry: DependencyTelemetry): Unit = js.native
  /**
    * Log a user action or other occurrence.
    * @param telemetry      Object encapsulating tracking options
    */
  def trackEvent(telemetry: EventTelemetry): Unit = js.native
  /**
    * Log an exception
    * @param telemetry      Object encapsulating tracking options
    */
  def trackException(telemetry: ExceptionTelemetry): Unit = js.native
  /**
    * Log a numeric value that is not associated with a specific event. Typically used to send regular reports of performance indicators.
    * To send a single measurement, use just the first two parameters. If you take measurements very frequently, you can reduce the
    * telemetry bandwidth by aggregating multiple measurements and sending the resulting average at intervals.
    * @param telemetry      Object encapsulating tracking options
    */
  def trackMetric(telemetry: MetricTelemetry): Unit = js.native
  /**
    * Log a request. Note that the default client will attempt to collect HTTP requests automatically so only use this for requests
    * that aren't automatically captured or if you've disabled automatic request collection.
    *
    * @param telemetry      Object encapsulating tracking options
    */
  def trackRequest(telemetry: RequestTelemetry): Unit = js.native
  /**
    * Log a trace message
    * @param telemetry      Object encapsulating tracking options
    */
  def trackTrace(telemetry: TraceTelemetry): Unit = js.native
}

