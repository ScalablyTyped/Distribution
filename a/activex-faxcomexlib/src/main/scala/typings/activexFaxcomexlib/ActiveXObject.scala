package typings.activexFaxcomexlib

import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeArgNames
import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxAccountInvokeParameter
import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeArgNames
import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerInvokeParameter
import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeArgNames
import typings.activexFaxcomexlib.FAXCOMEXLib.EventHelperTypes.FaxServerOnDeviceStatusChangeParameter
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxAccount
import typings.activexFaxcomexlib.FAXCOMEXLib.FaxServer
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.AddRef
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.GetIDsOfNames
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfo
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.GetTypeInfoCount
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.Invoke
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnActivityLoggingConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnDeviceStatusChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnDevicesConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnEventLoggingConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnGeneralServerConfigChanged
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingArchiveConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobAdded
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobChanged
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingJobRemoved
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageAdded
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnIncomingMessageRemoved
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnNewCall
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingGroupsConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutboundRoutingRulesConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingArchiveConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobAdded
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobChanged
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingJobRemoved
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageAdded
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingMessageRemoved
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnOutgoingQueueConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnQueuesStatusChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnReceiptOptionsChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnSecurityConfigChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerActivityChange
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.OnServerShutDown
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.QueryInterface
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.Release
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bIncomingQueueBlocked
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueueBlocked
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bOutgoingQueuePaused
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bstrCallerId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bstrJobId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.bstrMessageId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.cNames
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.fAddedToReceiveFolder
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.fRemovedFromReceiveFolder
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.itinfo
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lCallId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lDeviceId
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lIncomingMessages
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lOutgoingMessages
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lQueuedMessages
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lRoutingMessages
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.lcid
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxAccount
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pFaxServer
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pJobStatus
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pctinfo
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.pptinfo
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.ppvObj
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.rgdispid
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.rgszNames
import typings.activexFaxcomexlib.activexFaxcomexlibStrings.riid
import typings.activexFaxcomexlib.anon.BIncomingQueueBlocked
import typings.activexFaxcomexlib.anon.BstrCallerId
import typings.activexFaxcomexlib.anon.BstrJobId
import typings.activexFaxcomexlib.anon.BstrJobIdPFaxServer
import typings.activexFaxcomexlib.anon.BstrMessageId
import typings.activexFaxcomexlib.anon.BstrMessageIdPFaxAccount
import typings.activexFaxcomexlib.anon.BstrMessageIdPFaxServer
import typings.activexFaxcomexlib.anon.CNames
import typings.activexFaxcomexlib.anon.FRemovedFromReceiveFolder
import typings.activexFaxcomexlib.anon.Itinfo
import typings.activexFaxcomexlib.anon.LIncomingMessages
import typings.activexFaxcomexlib.anon.PFaxAccount
import typings.activexFaxcomexlib.anon.PFaxServer
import typings.activexFaxcomexlib.anon.PJobStatus
import typings.activexFaxcomexlib.anon.Pctinfo
import typings.activexFaxcomexlib.anon.PpvObj
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: FaxAccount,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fAddedToReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrMessageId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple3[pFaxAccount, bstrMessageId, fRemovedFromReceiveFolder],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FRemovedFromReceiveFolder, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxAccount, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrJobId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxAccount, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ BstrMessageIdPFaxAccount, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxAccount,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnActivityLoggingConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnDevicesConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnEventLoggingConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnGeneralServerConfigChanged,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingArchiveConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnIncomingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnNewCall,
    argNames: js.Tuple4[pFaxServer, lCallId, lDeviceId, bstrCallerId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrCallerId, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutboundRoutingGroupsConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutboundRoutingRulesConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingArchiveConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobAdded,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobChanged,
    argNames: js.Tuple3[pFaxServer, bstrJobId, pJobStatus],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PJobStatus, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingJobRemoved,
    argNames: js.Tuple2[pFaxServer, bstrJobId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrJobIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageAdded,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingMessageRemoved,
    argNames: js.Tuple2[pFaxServer, bstrMessageId],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BstrMessageIdPFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnOutgoingQueueConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnQueuesStatusChange,
    argNames: js.Tuple4[pFaxServer, bOutgoingQueueBlocked, bOutgoingQueuePaused, bIncomingQueueBlocked],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ BIncomingQueueBlocked, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnReceiptOptionsChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnSecurityConfigChange,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnServerActivityChange,
    argNames: js.Tuple5[pFaxServer, lIncomingMessages, lRoutingMessages, lOutgoingMessages, lQueuedMessages],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ LIncomingMessages, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: OnServerShutDown,
    argNames: js.Array[pFaxServer],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PFaxServer, Unit]
  ): Unit = js.native
  def on(
    obj: FaxServer,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: FaxAccount,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: FaxServer,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxAccount,
    event: Invoke,
    argNames: FaxAccountInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ FaxAccountInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: FaxServer,
    event: Invoke,
    argNames: FaxServerInvokeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnDeviceStatusChange(
    obj: FaxServer,
    event: OnDeviceStatusChange,
    argNames: FaxServerOnDeviceStatusChangeArgNames,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ FaxServerOnDeviceStatusChangeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: FaxAccount,
    event: Release,
    handler: js.ThisFunction1[/* this */ FaxAccount, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: FaxServer,
    event: Release,
    handler: js.ThisFunction1[/* this */ FaxServer, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

