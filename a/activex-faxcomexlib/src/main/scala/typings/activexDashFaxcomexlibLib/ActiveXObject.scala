package typings
package activexDashFaxcomexlibLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.riid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.rgszNames, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.cNames, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lcid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.itinfo, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lcid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobChanged,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pJobStatus
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobIdPFaxAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingMessageAdded,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.fAddedToReceiveFolder
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrMessageId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingMessageRemoved,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.fRemovedFromReceiveFolder
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrMessageIdFRemovedFromReceiveFolder, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobChanged,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pJobStatus
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobIdPFaxAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrJobId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingMessageAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrMessageIdPFaxAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingMessageRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxAccount, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_BstrMessageIdPFaxAccount, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnServerShutDown,
    argNames: js.Array[activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_PFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.riid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnActivityLoggingConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnDevicesConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnEventLoggingConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnGeneralServerConfigChanged | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingArchiveConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutboundRoutingGroupsConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutboundRoutingRulesConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingArchiveConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingQueueConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnReceiptOptionsChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnSecurityConfigChange | activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnServerShutDown,
    argNames: js.Array[activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_PFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.riid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.rgszNames, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.cNames, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lcid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.itinfo, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lcid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobChanged,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pJobStatus
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServerPJobStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingJobRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingMessageAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrMessageIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnIncomingMessageRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrMessageIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnNewCall,
    argNames: js.Tuple4[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lCallId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lDeviceId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrCallerId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrCallerId, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobChanged,
    argNames: js.Tuple3[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pJobStatus
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServerPJobStatus, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingJobRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrJobId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrJobIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingMessageAdded,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrMessageIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnOutgoingMessageRemoved,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bstrMessageId
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BstrMessageIdPFaxServer, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnQueuesStatusChange,
    argNames: js.Tuple4[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bOutgoingQueueBlocked, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bOutgoingQueuePaused, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.bIncomingQueueBlocked
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_BIncomingQueueBlocked, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnServerActivityChange,
    argNames: js.Tuple5[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.pFaxServer, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lIncomingMessages, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lRoutingMessages, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lOutgoingMessages, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.lQueuedMessages
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_LIncomingMessages, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.riid, 
      activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.Invoke,
    argNames: activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxAccount_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxAccount_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.Invoke,
    argNames: activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxServer_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxServer_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnDeviceStatusChange(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.OnDeviceStatusChange,
    argNames: activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxServer_OnDeviceStatusChange_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.EventHelperTypesNs.FaxServer_OnDeviceStatusChange_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxAccount, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer,
    event: activexDashFaxcomexlibLib.activexDashFaxcomexlibLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashFaxcomexlibLib.FAXCOMEXLibNs.FaxServer, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

