package typings.applicationinsights

import typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseDocumentType
import typings.applicationinsights.outDeclarationsConstantsMod.QuickPulseType
import typings.applicationinsights.outDeclarationsContractsConstantsMod.ConnectionStringKey
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeKeys
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object applicationinsightsStrings {
  @js.native
  sealed trait Availability
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait AvailabilityData extends TelemetryTypeValues
  
  @js.native
  sealed trait AvailabilityTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait Dependency extends TelemetryTypeKeys
  
  @js.native
  sealed trait DependencyTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait Event
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait EventData extends TelemetryTypeValues
  
  @js.native
  sealed trait EventTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait Exception
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait ExceptionData extends TelemetryTypeValues
  
  @js.native
  sealed trait ExceptionTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait MessageData extends TelemetryTypeValues
  
  @js.native
  sealed trait Metric
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait MetricData extends TelemetryTypeValues
  
  @js.native
  sealed trait MetricTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait RemoteDependency extends QuickPulseDocumentType
  
  @js.native
  sealed trait RemoteDependencyData extends TelemetryTypeValues
  
  @js.native
  sealed trait Request
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait RequestData extends TelemetryTypeValues
  
  @js.native
  sealed trait RequestTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait Trace
    extends QuickPulseDocumentType
       with TelemetryTypeKeys
  
  @js.native
  sealed trait TraceTelemetryDocument extends QuickPulseType
  
  @js.native
  sealed trait authorization extends ConnectionStringKey
  
  @js.native
  sealed trait endpointsuffix extends ConnectionStringKey
  
  @js.native
  sealed trait httpsColonSlashSlashdcDotservicesDotvisualstudioDotcom extends js.Object
  
  @js.native
  sealed trait httpsColonSlashSlashrtDotservicesDotvisualstudioDotcom extends js.Object
  
  @js.native
  sealed trait ingestionendpoint extends ConnectionStringKey
  
  @js.native
  sealed trait instrumentationkey extends ConnectionStringKey
  
  @js.native
  sealed trait liveendpoint extends ConnectionStringKey
  
  @js.native
  sealed trait location extends ConnectionStringKey
  
  @js.native
  sealed trait rtDotservicesDotvisualstudioDotcom extends js.Object
  
  @scala.inline
  def Availability: Availability = "Availability".asInstanceOf[Availability]
  @scala.inline
  def AvailabilityData: AvailabilityData = "AvailabilityData".asInstanceOf[AvailabilityData]
  @scala.inline
  def AvailabilityTelemetryDocument: AvailabilityTelemetryDocument = "AvailabilityTelemetryDocument".asInstanceOf[AvailabilityTelemetryDocument]
  @scala.inline
  def Dependency: Dependency = "Dependency".asInstanceOf[Dependency]
  @scala.inline
  def DependencyTelemetryDocument: DependencyTelemetryDocument = "DependencyTelemetryDocument".asInstanceOf[DependencyTelemetryDocument]
  @scala.inline
  def Event: Event = "Event".asInstanceOf[Event]
  @scala.inline
  def EventData: EventData = "EventData".asInstanceOf[EventData]
  @scala.inline
  def EventTelemetryDocument: EventTelemetryDocument = "EventTelemetryDocument".asInstanceOf[EventTelemetryDocument]
  @scala.inline
  def Exception: Exception = "Exception".asInstanceOf[Exception]
  @scala.inline
  def ExceptionData: ExceptionData = "ExceptionData".asInstanceOf[ExceptionData]
  @scala.inline
  def ExceptionTelemetryDocument: ExceptionTelemetryDocument = "ExceptionTelemetryDocument".asInstanceOf[ExceptionTelemetryDocument]
  @scala.inline
  def MessageData: MessageData = "MessageData".asInstanceOf[MessageData]
  @scala.inline
  def Metric: Metric = "Metric".asInstanceOf[Metric]
  @scala.inline
  def MetricData: MetricData = "MetricData".asInstanceOf[MetricData]
  @scala.inline
  def MetricTelemetryDocument: MetricTelemetryDocument = "MetricTelemetryDocument".asInstanceOf[MetricTelemetryDocument]
  @scala.inline
  def RemoteDependency: RemoteDependency = "RemoteDependency".asInstanceOf[RemoteDependency]
  @scala.inline
  def RemoteDependencyData: RemoteDependencyData = "RemoteDependencyData".asInstanceOf[RemoteDependencyData]
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  @scala.inline
  def RequestData: RequestData = "RequestData".asInstanceOf[RequestData]
  @scala.inline
  def RequestTelemetryDocument: RequestTelemetryDocument = "RequestTelemetryDocument".asInstanceOf[RequestTelemetryDocument]
  @scala.inline
  def Trace: Trace = "Trace".asInstanceOf[Trace]
  @scala.inline
  def TraceTelemetryDocument: TraceTelemetryDocument = "TraceTelemetryDocument".asInstanceOf[TraceTelemetryDocument]
  @scala.inline
  def authorization: authorization = "authorization".asInstanceOf[authorization]
  @scala.inline
  def endpointsuffix: endpointsuffix = "endpointsuffix".asInstanceOf[endpointsuffix]
  @scala.inline
  def httpsColonSlashSlashdcDotservicesDotvisualstudioDotcom: httpsColonSlashSlashdcDotservicesDotvisualstudioDotcom = "https://dc.services.visualstudio.com".asInstanceOf[httpsColonSlashSlashdcDotservicesDotvisualstudioDotcom]
  @scala.inline
  def httpsColonSlashSlashrtDotservicesDotvisualstudioDotcom: httpsColonSlashSlashrtDotservicesDotvisualstudioDotcom = "https://rt.services.visualstudio.com".asInstanceOf[httpsColonSlashSlashrtDotservicesDotvisualstudioDotcom]
  @scala.inline
  def ingestionendpoint: ingestionendpoint = "ingestionendpoint".asInstanceOf[ingestionendpoint]
  @scala.inline
  def instrumentationkey: instrumentationkey = "instrumentationkey".asInstanceOf[instrumentationkey]
  @scala.inline
  def liveendpoint: liveendpoint = "liveendpoint".asInstanceOf[liveendpoint]
  @scala.inline
  def location: location = "location".asInstanceOf[location]
  @scala.inline
  def rtDotservicesDotvisualstudioDotcom: rtDotservicesDotvisualstudioDotcom = "rt.services.visualstudio.com".asInstanceOf[rtDotservicesDotvisualstudioDotcom]
}

