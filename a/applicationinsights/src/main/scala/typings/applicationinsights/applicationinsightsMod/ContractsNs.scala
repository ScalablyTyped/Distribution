package typings.applicationinsights.applicationinsightsMod

import org.scalablytyped.runtime.StringDictionary
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("applicationinsights", "Contracts")
@js.native
object ContractsNs extends js.Object {
  /**
    * Instances of AvailabilityData represent the result of executing an availability test.
    */
  @js.native
  class AvailabilityData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.AvailabilityData
  
  @js.native
  class Base ()
    extends typings.applicationinsights.outDeclarationsContractsMod.Base
  
  @js.native
  class ContextTagKeys ()
    extends typings.applicationinsights.outDeclarationsContractsMod.ContextTagKeys
  
  /**
    * Data struct to contain both B and C sections.
    */
  @js.native
  class Data[TDomain] ()
    extends typings.applicationinsights.outDeclarationsContractsMod.Data[TDomain]
  
  /**
    * Metric data single measurement.
    */
  @js.native
  class DataPoint ()
    extends typings.applicationinsights.outDeclarationsContractsMod.DataPoint
  
  @js.native
  class Domain ()
    extends typings.applicationinsights.outDeclarationsContractsMod.Domain
  
  /**
    * System variables for a telemetry item.
    */
  @js.native
  class Envelope ()
    extends typings.applicationinsights.outDeclarationsContractsMod.Envelope
  
  /**
    * Instances of Event represent structured event records that can be grouped and searched by their properties. Event data item also creates a metric of event count by name.
    */
  @js.native
  class EventData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.EventData
  
  /**
    * An instance of Exception represents a handled or unhandled exception that occurred during execution of the monitored application.
    */
  @js.native
  class ExceptionData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.ExceptionData
  
  /**
    * Exception details of the exception in a chain.
    */
  @js.native
  class ExceptionDetails ()
    extends typings.applicationinsights.outDeclarationsContractsMod.ExceptionDetails
  
  /**
    * Instances of Message represent printf-like trace statements that are text-searched. Log4Net, NLog and other text-based log file entries are translated into intances of this type. The message does not have measurements.
    */
  @js.native
  class MessageData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.MessageData
  
  /**
    * An instance of the Metric item is a list of measurements (single data points) and/or aggregations.
    */
  @js.native
  class MetricData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.MetricData
  
  /**
    * An instance of PageView represents a generic action on a page like a button click. It is also the base type for PageView.
    */
  @js.native
  class PageViewData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.PageViewData
  
  /**
    * An instance of Remote Dependency represents an interaction of the monitored component with a remote component/service like SQL or an HTTP endpoint.
    */
  @js.native
  class RemoteDependencyData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.RemoteDependencyData
  
  @js.native
  class RemoteDependencyDataConstants ()
    extends typings.applicationinsights.outDeclarationsContractsMod.RemoteDependencyDataConstants
  
  /**
    * An instance of Request represents completion of an external request to the application to do work and contains a summary of that request execution and the results.
    */
  @js.native
  class RequestData ()
    extends typings.applicationinsights.outDeclarationsContractsMod.RequestData
  
  @js.native
  class StackFrame ()
    extends typings.applicationinsights.outDeclarationsContractsMod.StackFrame
  
  def baseTypeToTelemetryType(baseType: TelemetryTypeValues): typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType = js.native
  def domainSupportsProperties(domain: typings.applicationinsights.outDeclarationsContractsGeneratedMod.Domain): /* is applicationinsights.applicationinsights/out/Declarations/Contracts/Constants.ISupportProperties */ Boolean = js.native
  def telemetryTypeToBaseType(
    `type`: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  ): TelemetryTypeValues = js.native
  @js.native
  object DataPointType extends js.Object {
    /* 1 */ val Aggregation: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Aggregation with Double = js.native
    /* 0 */ val Measurement: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Measurement with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType with Double
      ] = js.native
  }
  
  @JSName("DataPointType")
  @js.native
  object DataPointTypeNs extends js.Object {
    @js.native
    object DataPointType extends js.Object {
      /* 1 */ val Aggregation: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Aggregation with Double = js.native
      /* 0 */ val Measurement: typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Measurement with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.applicationinsights.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType with Double
          ] = js.native
    }
    
  }
  
  /* static members */
  @js.native
  object RemoteDependencyDataConstants extends js.Object {
    var TYPE_AI: String = js.native
    var TYPE_HTTP: String = js.native
  }
  
  @js.native
  object SeverityLevel extends js.Object {
    /* 4 */ val Critical: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Critical with Double = js.native
    /* 3 */ val Error: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Error with Double = js.native
    /* 1 */ val Information: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Information with Double = js.native
    /* 0 */ val Verbose: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Verbose with Double = js.native
    /* 2 */ val Warning: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Warning with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel with Double
      ] = js.native
  }
  
  @JSName("SeverityLevel")
  @js.native
  object SeverityLevelNs extends js.Object {
    @js.native
    object SeverityLevel extends js.Object {
      /* 4 */ val Critical: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Critical with Double = js.native
      /* 3 */ val Error: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Error with Double = js.native
      /* 1 */ val Information: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Information with Double = js.native
      /* 0 */ val Verbose: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Verbose with Double = js.native
      /* 2 */ val Warning: typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Warning with Double = js.native
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[
            typings.applicationinsights.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel with Double
          ] = js.native
    }
    
  }
  
  @js.native
  object TelemetryType extends js.Object {
    /* 5 */ val Dependency: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Dependency with Double = js.native
    /* 0 */ val Event: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Event with Double = js.native
    /* 1 */ val Exception: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Exception with Double = js.native
    /* 3 */ val Metric: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Metric with Double = js.native
    /* 4 */ val Request: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Request with Double = js.native
    /* 2 */ val Trace: typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Trace with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[
        typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType with Double
      ] = js.native
  }
  
  @js.native
  object TelemetryTypeString extends /* key */ StringDictionary[TelemetryTypeValues]
  
}

