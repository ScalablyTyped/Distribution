package typings.applicationinsightsJs.global.Microsoft.ApplicationInsights

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsightsJs.AI.DataPoint
import typings.applicationinsightsJs.AI.DataPointType
import typings.applicationinsightsJs.AI.DependencyKind
import typings.applicationinsightsJs.AI.DependencySourceType
import typings.applicationinsightsJs.AI.ExceptionDetails
import typings.applicationinsightsJs.AI.SeverityLevel
import typings.applicationinsightsJs.anon.DomProcessing
import typings.applicationinsightsJs.anon.Duration
import typings.applicationinsightsJs.anon.Exceptions
import typings.applicationinsightsJs.anon.Measurements
import typings.applicationinsightsJs.anon.Message
import typings.applicationinsightsJs.anon.Metrics
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
    def this(name: String, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_Event: Measurements = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class Exception protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Exception {
    /**
      * Constructs a new isntance of the ExceptionTelemetry object
      */
    def this(exception: Error) = this()
    def this(exception: Error, handledAt: String) = this()
    def this(exception: Error, handledAt: String, properties: js.Any) = this()
    def this(exception: Error, handledAt: String, properties: js.Any, measurements: js.Any) = this()
    def this(
      exception: Error,
      handledAt: String,
      properties: js.Any,
      measurements: js.Any,
      severityLevel: SeverityLevel
    ) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_Exception: Exceptions = js.native
    /* CompleteClass */
    override var crashThreadId: Double = js.native
    /* CompleteClass */
    override var exceptions: js.Array[ExceptionDetails] = js.native
    /* CompleteClass */
    override var handledAt: String = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var problemId: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var severityLevel: SeverityLevel = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class Metric protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Metric {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(name: String, value: Double) = this()
    def this(name: String, value: Double, count: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double) = this()
    def this(name: String, value: Double, count: Double, min: Double, max: Double, properties: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_Metric: Metrics = js.native
    /* CompleteClass */
    override var metrics: js.Array[DataPoint] = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  /**
    * Constructs a new instance of the PageEventTelemetry object
    */
  class PageView ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.PageView {
    def this(name: String) = this()
    def this(name: String, url: String) = this()
    def this(name: String, url: String, durationMs: Double) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any) = this()
    def this(name: String, url: String, durationMs: Double, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_PageView: Duration = js.native
    /* CompleteClass */
    override var duration: String = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var referrer: String = js.native
    /* CompleteClass */
    override var referrerData: String = js.native
    /* CompleteClass */
    override var url: String = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  class PageViewPerformance protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.PageViewPerformance {
    /**
      * Constructs a new instance of the PageEventTelemetry object
      */
    def this(name: String, url: String, unused: Double) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any) = this()
    def this(name: String, url: String, unused: Double, properties: js.Any, measurements: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_PageViewPerformance: DomProcessing = js.native
    /* CompleteClass */
    override var domProcessing: String = js.native
    /* CompleteClass */
    override var duration: String = js.native
    /* CompleteClass */
    override var durationMs: js.Any = js.native
    /**
      * Field indicating whether this instance of PageViewPerformance is valid and should be sent
      */
    /* CompleteClass */
    override var isValid: js.Any = js.native
    /* CompleteClass */
    override var measurements: js.Any = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var networkConnect: String = js.native
    /* CompleteClass */
    override var perfTotal: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var receivedResponse: String = js.native
    /* CompleteClass */
    override var referrer: String = js.native
    /* CompleteClass */
    override var referrerData: String = js.native
    /* CompleteClass */
    override var sentRequest: String = js.native
    /* CompleteClass */
    override var url: String = js.native
    /* CompleteClass */
    override var ver: Double = js.native
    /**
      * Gets the total duration (PLT) in milliseconds. Check getIsValid() before using this method.
      */
    /* CompleteClass */
    override def getDurationMs(): Double = js.native
    /**
      * Indicates whether this instance of PageViewPerformance is valid and should be sent
      */
    /* CompleteClass */
    override def getIsValid(): Boolean = js.native
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
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    override var async: Boolean = js.native
    /* CompleteClass */
    override var commandName: String = js.native
    /* CompleteClass */
    override var count: Double = js.native
    /* CompleteClass */
    override var dependencyKind: DependencyKind = js.native
    /* CompleteClass */
    override var dependencySource: DependencySourceType = js.native
    /* CompleteClass */
    override var dependencyTypeName: String = js.native
    /* CompleteClass */
    override var id: String = js.native
    /* CompleteClass */
    override var kind: DataPointType = js.native
    /* CompleteClass */
    override var max: Double = js.native
    /* CompleteClass */
    override var min: Double = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var resultCode: String = js.native
    /* CompleteClass */
    override var stdDev: Double = js.native
    /* CompleteClass */
    override var success: Boolean = js.native
    /* CompleteClass */
    override var value: Double = js.native
    /* CompleteClass */
    override var ver: Double = js.native
    /* CompleteClass */
    /* private */ override def formatDependencyName(method: js.Any, absoluteUrl: js.Any): js.Any = js.native
  }
  
  @js.native
  class Trace protected ()
    extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Trace {
    /**
      * Constructs a new instance of the MetricTelemetry object
      */
    def this(message: String) = this()
    def this(message: String, properties: js.Any) = this()
    /**
      * The set of fields for a serializeable object.
      * This defines the serialization order and a value of true/false
      * for each field defines whether the field is required or not.
      */
    /* CompleteClass */
    override var aiDataContract: js.Any = js.native
    /* CompleteClass */
    @JSName("aiDataContract")
    override var aiDataContract_Trace: Message = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var properties: js.Any = js.native
    /* CompleteClass */
    override var severityLevel: SeverityLevel = js.native
    /* CompleteClass */
    override var ver: Double = js.native
  }
  
  @js.native
  object Common extends js.Object {
    @js.native
    class Base ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Base {
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
      /* CompleteClass */
      override var baseType: String = js.native
    }
    
    @js.native
    class Data[TDomain] protected ()
      extends typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Data[TDomain] {
      /**
        * Constructs a new instance of telemetry data.
        */
      def this(`type`: String, data: TDomain) = this()
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
      /* CompleteClass */
      override var baseData: TDomain = js.native
      /* CompleteClass */
      override var baseType: String = js.native
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
      /**
        * The set of fields for a serializeable object.
        * This defines the serialization order and a value of true/false
        * for each field defines whether the field is required or not.
        */
      /* CompleteClass */
      override var aiDataContract: js.Any = js.native
      /* CompleteClass */
      override var appId: String = js.native
      /* CompleteClass */
      override var appVer: String = js.native
      /* CompleteClass */
      override var data: js.Any = js.native
      /* CompleteClass */
      @JSName("data")
      override var data_Envelope: typings.applicationinsightsJs.Microsoft.ApplicationInsights.Telemetry.Common.Base = js.native
      /* CompleteClass */
      override var deviceId: String = js.native
      /* CompleteClass */
      override var flags: Double = js.native
      /* CompleteClass */
      override var iKey: String = js.native
      /* CompleteClass */
      override var name: String = js.native
      /* CompleteClass */
      override var os: String = js.native
      /* CompleteClass */
      override var osVer: String = js.native
      /* CompleteClass */
      override var sampleRate: Double = js.native
      /* CompleteClass */
      override var seq: String = js.native
      /* CompleteClass */
      override var tags: StringDictionary[js.Any] = js.native
      /* CompleteClass */
      override var time: String = js.native
      /* CompleteClass */
      override var userId: String = js.native
      /* CompleteClass */
      override var ver: Double = js.native
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

