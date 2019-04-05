package typings
package applicationinsightsLib.applicationinsightsMod

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
    extends applicationinsightsLib.outDeclarationsContractsMod.AvailabilityData
  
  @js.native
  class Base ()
    extends applicationinsightsLib.outDeclarationsContractsMod.Base
  
  @js.native
  class ContextTagKeys ()
    extends applicationinsightsLib.outDeclarationsContractsMod.ContextTagKeys
  
  /**
    * Data struct to contain both B and C sections.
    */
  @js.native
  class Data[TDomain] ()
    extends applicationinsightsLib.outDeclarationsContractsMod.Data[TDomain]
  
  /**
    * Metric data single measurement.
    */
  @js.native
  class DataPoint ()
    extends applicationinsightsLib.outDeclarationsContractsMod.DataPoint
  
  @js.native
  class Domain ()
    extends applicationinsightsLib.outDeclarationsContractsMod.Domain
  
  /**
    * System variables for a telemetry item.
    */
  @js.native
  class Envelope ()
    extends applicationinsightsLib.outDeclarationsContractsMod.Envelope
  
  /**
    * Instances of Event represent structured event records that can be grouped and searched by their properties. Event data item also creates a metric of event count by name.
    */
  @js.native
  class EventData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.EventData
  
  /**
    * An instance of Exception represents a handled or unhandled exception that occurred during execution of the monitored application.
    */
  @js.native
  class ExceptionData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.ExceptionData
  
  /**
    * Exception details of the exception in a chain.
    */
  @js.native
  class ExceptionDetails ()
    extends applicationinsightsLib.outDeclarationsContractsMod.ExceptionDetails
  
  /**
    * Instances of Message represent printf-like trace statements that are text-searched. Log4Net, NLog and other text-based log file entries are translated into intances of this type. The message does not have measurements.
    */
  @js.native
  class MessageData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.MessageData
  
  /**
    * An instance of the Metric item is a list of measurements (single data points) and/or aggregations.
    */
  @js.native
  class MetricData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.MetricData
  
  /**
    * An instance of PageView represents a generic action on a page like a button click. It is also the base type for PageView.
    */
  @js.native
  class PageViewData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.PageViewData
  
  /**
    * An instance of Remote Dependency represents an interaction of the monitored component with a remote component/service like SQL or an HTTP endpoint.
    */
  @js.native
  class RemoteDependencyData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.RemoteDependencyData
  
  @js.native
  class RemoteDependencyDataConstants ()
    extends applicationinsightsLib.outDeclarationsContractsMod.RemoteDependencyDataConstants
  
  /**
    * An instance of Request represents completion of an external request to the application to do work and contains a summary of that request execution and the results.
    */
  @js.native
  class RequestData ()
    extends applicationinsightsLib.outDeclarationsContractsMod.RequestData
  
  @js.native
  class StackFrame ()
    extends applicationinsightsLib.outDeclarationsContractsMod.StackFrame
  
  def baseTypeToTelemetryType(
    baseType: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
  ): applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType = js.native
  def domainSupportsProperties(domain: applicationinsightsLib.outDeclarationsContractsGeneratedMod.Domain): /* is applicationinsights.applicationinsights/out/Declarations/Contracts/Constants.ISupportProperties */ scala.Boolean = js.native
  def telemetryTypeToBaseType(
    `type`: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
  ): applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues = js.native
  @js.native
  object DataPointType extends js.Object {
    /* 1 */ val Aggregation: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Aggregation with scala.Double = js.native
    /* 0 */ val Measurement: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Measurement with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType with scala.Double
      ] = js.native
  }
  
  @JSName("DataPointType")
  @js.native
  object DataPointTypeNs extends js.Object {
    @js.native
    object DataPointType extends js.Object {
      /* 1 */ val Aggregation: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Aggregation with scala.Double = js.native
      /* 0 */ val Measurement: applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType.Measurement with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType with scala.Double
          ] = js.native
    }
    
    type DataPointType = applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType
  }
  
  /* static members */
  @js.native
  object RemoteDependencyDataConstants extends js.Object {
    var TYPE_AI: java.lang.String = js.native
    var TYPE_HTTP: java.lang.String = js.native
  }
  
  @js.native
  object SeverityLevel extends js.Object {
    /* 4 */ val Critical: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Critical with scala.Double = js.native
    /* 3 */ val Error: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Error with scala.Double = js.native
    /* 1 */ val Information: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Information with scala.Double = js.native
    /* 0 */ val Verbose: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Verbose with scala.Double = js.native
    /* 2 */ val Warning: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Warning with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel with scala.Double
      ] = js.native
  }
  
  @JSName("SeverityLevel")
  @js.native
  object SeverityLevelNs extends js.Object {
    @js.native
    object SeverityLevel extends js.Object {
      /* 4 */ val Critical: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Critical with scala.Double = js.native
      /* 3 */ val Error: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Error with scala.Double = js.native
      /* 1 */ val Information: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Information with scala.Double = js.native
      /* 0 */ val Verbose: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Verbose with scala.Double = js.native
      /* 2 */ val Warning: applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel.Warning with scala.Double = js.native
      @JSBracketAccess
      def apply(value: scala.Double): js.UndefOr[
            applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel with scala.Double
          ] = js.native
    }
    
    type SeverityLevel = applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  }
  
  @js.native
  object TelemetryType extends js.Object {
    /* 5 */ val Dependency: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Dependency with scala.Double = js.native
    /* 0 */ val Event: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Event with scala.Double = js.native
    /* 1 */ val Exception: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Exception with scala.Double = js.native
    /* 3 */ val Metric: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Metric with scala.Double = js.native
    /* 4 */ val Request: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Request with scala.Double = js.native
    /* 2 */ val Trace: applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType.Trace with scala.Double = js.native
    @JSBracketAccess
    def apply(value: scala.Double): js.UndefOr[
        applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType with scala.Double
      ] = js.native
  }
  
  @js.native
  object TelemetryTypeString
    extends /* key */ org.scalablytyped.runtime.StringDictionary[
          applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
        ]
  
  type DataPointType = applicationinsightsLib.outDeclarationsContractsGeneratedDataPointTypeMod.DataPointType
  type SeverityLevel = applicationinsightsLib.outDeclarationsContractsGeneratedSeverityLevelMod.SeverityLevel
  type TelemetryType = applicationinsightsLib.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryType
}

