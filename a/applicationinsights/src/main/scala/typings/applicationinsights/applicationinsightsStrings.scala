package typings.applicationinsights

import typings.applicationinsights.outDeclarationsContractsConstantsMod.ConnectionStringKey
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeKeys
import typings.applicationinsights.outDeclarationsContractsTelemetryTypesTelemetryTypeMod.TelemetryTypeValues
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object applicationinsightsStrings {
  @js.native
  sealed trait Dependency extends TelemetryTypeKeys
  
  @js.native
  sealed trait Event extends TelemetryTypeKeys
  
  @js.native
  sealed trait EventData extends TelemetryTypeValues
  
  @js.native
  sealed trait Exception extends TelemetryTypeKeys
  
  @js.native
  sealed trait ExceptionData extends TelemetryTypeValues
  
  @js.native
  sealed trait MessageData extends TelemetryTypeValues
  
  @js.native
  sealed trait Metric extends TelemetryTypeKeys
  
  @js.native
  sealed trait MetricData extends TelemetryTypeValues
  
  @js.native
  sealed trait RemoteDependencyData extends TelemetryTypeValues
  
  @js.native
  sealed trait Request extends TelemetryTypeKeys
  
  @js.native
  sealed trait RequestData extends TelemetryTypeValues
  
  @js.native
  sealed trait Trace extends TelemetryTypeKeys
  
  @js.native
  sealed trait authorization extends ConnectionStringKey
  
  @js.native
  sealed trait endpointsuffix extends ConnectionStringKey
  
  @js.native
  sealed trait ingestionendpoint extends ConnectionStringKey
  
  @js.native
  sealed trait instrumentationkey extends ConnectionStringKey
  
  @js.native
  sealed trait liveendpoint extends ConnectionStringKey
  
  @js.native
  sealed trait location extends ConnectionStringKey
  
  @scala.inline
  def Dependency: Dependency = "Dependency".asInstanceOf[Dependency]
  @scala.inline
  def Event: Event = "Event".asInstanceOf[Event]
  @scala.inline
  def EventData: EventData = "EventData".asInstanceOf[EventData]
  @scala.inline
  def Exception: Exception = "Exception".asInstanceOf[Exception]
  @scala.inline
  def ExceptionData: ExceptionData = "ExceptionData".asInstanceOf[ExceptionData]
  @scala.inline
  def MessageData: MessageData = "MessageData".asInstanceOf[MessageData]
  @scala.inline
  def Metric: Metric = "Metric".asInstanceOf[Metric]
  @scala.inline
  def MetricData: MetricData = "MetricData".asInstanceOf[MetricData]
  @scala.inline
  def RemoteDependencyData: RemoteDependencyData = "RemoteDependencyData".asInstanceOf[RemoteDependencyData]
  @scala.inline
  def Request: Request = "Request".asInstanceOf[Request]
  @scala.inline
  def RequestData: RequestData = "RequestData".asInstanceOf[RequestData]
  @scala.inline
  def Trace: Trace = "Trace".asInstanceOf[Trace]
  @scala.inline
  def authorization: authorization = "authorization".asInstanceOf[authorization]
  @scala.inline
  def endpointsuffix: endpointsuffix = "endpointsuffix".asInstanceOf[endpointsuffix]
  @scala.inline
  def ingestionendpoint: ingestionendpoint = "ingestionendpoint".asInstanceOf[ingestionendpoint]
  @scala.inline
  def instrumentationkey: instrumentationkey = "instrumentationkey".asInstanceOf[instrumentationkey]
  @scala.inline
  def liveendpoint: liveendpoint = "liveendpoint".asInstanceOf[liveendpoint]
  @scala.inline
  def location: location = "location".asInstanceOf[location]
}

