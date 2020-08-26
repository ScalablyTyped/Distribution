package typings.applicationinsightsJs.global.Microsoft.ApplicationInsights

import typings.applicationinsightsJs.AI.SeverityLevel
import typings.std.Error
import typings.std.PerformanceTiming
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Microsoft.ApplicationInsights.Telemetry")
@js.native
object Telemetry extends js.Object {
  @js.native
  class Event protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Event {
    /**
      * Constructs a new instance of the EventTelemetry object
      */
    def this(name: String) = this()
    def this(name: String, properties: js.Any) = this()
    def this(name: String, properties: js.UndefOr[scala.Nothing], measurements: js.Any) = this()
    def this(name: String, properties: js.Any, measurements: js.Any) = this()
  }
  
  @js.native
  class Exception protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Exception {
    /**
      * Constructs a new isntance of the ExceptionTelemetry object
      */
    def this(exception: Error) = this()
    def this(exception: Error, handledAt: String) = this()
    def this(exception: Error, handledAt: js.UndefOr[scala.Nothing], properties: js.Any) = this()
    def this(exception: Error, handledAt: String, properties: js.Any) = this()
    def this(
      exception: Error,
      handledAt: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(exception: Error, handledAt: js.UndefOr[scala.Nothing], properties: js.Any, measurements: js.Any) = this()
    def this(exception: Error, handledAt: String, properties: js.UndefOr[scala.Nothing], measurements: js.Any) = this()
    def this(exception: Error, handledAt: String, properties: js.Any, measurements: js.Any) = this()
    def this(
      exception: Error,
      handledAt: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.UndefOr[scala.Nothing],
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.UndefOr[scala.Nothing],
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: String,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.UndefOr[scala.Nothing],
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: String,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: String,
      properties: js.Any,
      measurements: js.UndefOr[scala.Nothing],
      severityLevel: SeverityLevel
    ) = this()
    def this(
      exception: Error,
      handledAt: String,
      properties: js.Any,
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
  }
  
  @js.native
  class Metric protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Metric {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(name: String, value: Double) = this()
    def this(name: String, value: Double, count: Double) = this()
    def this(name: String, value: Double, count: js.UndefOr[scala.Nothing], min: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double) = this()
    def this(
      name: String,
      value: Double,
      count: js.UndefOr[scala.Nothing],
      min: js.UndefOr[scala.Nothing],
      max: Double
    ) = this()
    def this(name: String, value: Double, count: js.UndefOr[scala.Nothing], min: Double, max: Double) = this()
    def this(name: String, value: Double, count: Double, min: js.UndefOr[scala.Nothing], max: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double) = this()
    def this(
      name: String,
      value: Double,
      count: js.UndefOr[scala.Nothing],
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: js.UndefOr[scala.Nothing],
      min: js.UndefOr[scala.Nothing],
      max: Double,
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: js.UndefOr[scala.Nothing],
      min: Double,
      max: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: js.UndefOr[scala.Nothing],
      min: Double,
      max: Double,
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: Double,
      min: js.UndefOr[scala.Nothing],
      max: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: Double,
      min: js.UndefOr[scala.Nothing],
      max: Double,
      properties: js.Any
    ) = this()
    def this(
      name: String,
      value: Double,
      count: Double,
      min: Double,
      max: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double, properties: js.Any) = this()
  }
  
  @js.native
  /**
    * Constructs a new instance of the PageEventTelemetry object
    */
  class PageView ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.PageView {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], url: String) = this()
    def this(name: String, url: String) = this()
    def this(name: js.UndefOr[scala.Nothing], url: js.UndefOr[scala.Nothing], durationMs: Double) = this()
    def this(name: js.UndefOr[scala.Nothing], url: String, durationMs: Double) = this()
    def this(name: String, url: js.UndefOr[scala.Nothing], durationMs: Double) = this()
    def this(name: String, url: String, durationMs: Double) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: Double,
      properties: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: String,
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(name: js.UndefOr[scala.Nothing], url: String, durationMs: Double, properties: js.Any) = this()
    def this(
      name: String,
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any
    ) = this()
    def this(name: String, url: js.UndefOr[scala.Nothing], durationMs: Double, properties: js.Any) = this()
    def this(name: String, url: String, durationMs: js.UndefOr[scala.Nothing], properties: js.Any) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: Double,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: js.UndefOr[scala.Nothing],
      durationMs: Double,
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: String,
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: String,
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: String,
      durationMs: Double,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      url: String,
      durationMs: Double,
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: js.UndefOr[scala.Nothing],
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: js.UndefOr[scala.Nothing],
      durationMs: Double,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: js.UndefOr[scala.Nothing],
      durationMs: Double,
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: String,
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: String,
      durationMs: js.UndefOr[scala.Nothing],
      properties: js.Any,
      measurements: js.Any
    ) = this()
    def this(
      name: String,
      url: String,
      durationMs: Double,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any, measurements: js.Any) = this()
  }
  
  @js.native
  class PageViewPerformance protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.PageViewPerformance {
    /**
      * Constructs a new instance of the PageEventTelemetry object
      */
    def this(name: String, url: String, unused: Double) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any) = this()
    def this(
      name: String,
      url: String,
      unused: Double,
      properties: js.UndefOr[scala.Nothing],
      measurements: js.Any
    ) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any, measurements: js.Any) = this()
  }
  
  @js.native
  class RemoteDependencyData protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.RemoteDependencyData {
    /**
      * Constructs a new instance of the RemoteDependencyData object
      */
    def this(
      id: String,
      absoluteUrl: String,
      commandName: String,
      value: Double,
      success: Boolean,
      resultCode: Double
    ) = this()
    def this(
      id: String,
      absoluteUrl: String,
      commandName: String,
      value: Double,
      success: Boolean,
      resultCode: Double,
      method: String
    ) = this()
  }
  
  @js.native
  class Trace protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Trace {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(message: String) = this()
    def this(message: String, properties: js.Any) = this()
  }
  
  @js.native
  object Common extends js.Object {
    @js.native
    class Base ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Base
    
    @js.native
    class Data[TDomain] protected ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Data[TDomain] {
      /**
        * Constructs a new instance of telemetry data.
        */
      def this(`type`: String, data: TDomain) = this()
    }
    
    @js.native
    class DataSanitizer ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.DataSanitizer
    
    @js.native
    class Envelope protected ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Envelope {
      /**
        * Constructs a new instance of telemetry data.
        */
      def this(data: typings.applicationinsightsJs.Microsoft.Telemetry.Base, name: String) = this()
    }
    
    /* static members */
    @js.native
    object DataSanitizer extends js.Object {
      def padNumber(num: js.Any): String = js.native
      def sanitizeException(exception: js.Any): js.Any = js.native
      def sanitizeKey(name: js.Any): js.Any = js.native
      def sanitizeKeyAndAddUniqueness(key: js.Any, map: js.Any): js.Any = js.native
      def sanitizeMeasurements(measurements: js.Any): js.Any = js.native
      def sanitizeMessage(message: js.Any): js.Any = js.native
      def sanitizeProperties(properties: js.Any): js.Any = js.native
      def sanitizeString(value: js.Any): js.Any = js.native
      def sanitizeUrl(url: js.Any): js.Any = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object Event extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object Exception extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
    /**
      * Creates a simple exception with 1 stack frame. Useful for manual constracting of exception.
      */
    def CreateSimpleException(
      message: String,
      typeName: String,
      assembly: String,
      fileName: String,
      details: String,
      line: Double
    ): typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Exception = js.native
    def CreateSimpleException(
      message: String,
      typeName: String,
      assembly: String,
      fileName: String,
      details: String,
      line: Double,
      handledAt: String
    ): typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Exception = js.native
  }
  
  /* static members */
  @js.native
  object Metric extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object PageView extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object PageViewPerformance extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
    def getDuration(start: js.Any, end: js.Any): Double = js.native
    def getPerformanceTiming(): PerformanceTiming = js.native
    /**
      * As page loads different parts of performance timing numbers get set. When all of them are set we can report it.
      * Returns true if ready, false otherwise.
      */
    def isPerformanceTimingDataReady(): Boolean = js.native
    /**
      * Returns true is window performance timing API is supported, false otherwise.
      */
    def isPerformanceTimingSupported(): PerformanceTiming = js.native
  }
  
  /* static members */
  @js.native
  object RemoteDependencyData extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
  /* static members */
  @js.native
  object Trace extends js.Object {
    var dataType: String = js.native
    var envelopeType: String = js.native
  }
  
}

