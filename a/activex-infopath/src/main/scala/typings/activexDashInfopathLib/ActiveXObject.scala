package typings
package activexDashInfopathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.NewXDocument,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pDocument],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.WindowActivate,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pWindow
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.WindowDeactivate,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pWindow
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.WindowSize,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pWindow
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.XDocumentBeforeClose,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pfCancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PfCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.XDocumentBeforePrint,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pfCancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PfCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.XDocumentBeforeSave,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.pDocument, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pfCancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PfCancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.XDocumentOpen,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pDocument],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ Anon_PDocument, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgszNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.cNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashInfopathLib.activexDashInfopathLibStrings.itinfo, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnClick,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ Anon_PEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgszNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.cNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashInfopathLib.activexDashInfopathLibStrings.itinfo, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnAfterChange,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pDataDOMEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_PDataDOMEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnBeforeChange,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pDataDOMEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_PDataDOMEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnValidate,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pDataDOMEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_PDataDOMEvent, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgszNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.cNames, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_Rgdispid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashInfopathLib.activexDashInfopathLibStrings.itinfo, 
      activexDashInfopathLib.activexDashInfopathLibStrings.lcid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_Lcid, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnAfterImport,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventDocEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnContextChange,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventDocContextChangeEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnLoad,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventDocReturnEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnMergeRequest,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventMergeEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnSaveRequest,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventSaveEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnSign,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventSignEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnSubmitRequest,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventDocReturnEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnSwitchView,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventDocEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.OnVersionUpgrade,
    argNames: js.Array[activexDashInfopathLib.activexDashInfopathLibStrings.pEvent],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PEventVersionUpgradeEventObject, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashInfopathLib.activexDashInfopathLibStrings.riid, 
      activexDashInfopathLib.activexDashInfopathLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Invoke,
    argNames: activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.Button_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.Button_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Invoke,
    argNames: activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.DataDOM_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.DataDOM_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Invoke,
    argNames: activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.XDocument_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ activexDashInfopathLib.InfoPathNs.EventHelperTypesNs.XDocument_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Quit,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashInfopathLib.InfoPathNs.Button,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.Button, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashInfopathLib.InfoPathNs.DataDOM,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.DataDOM, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashInfopathLib.InfoPathNs.XDocument,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.XDocument, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_XDocumentChange(
    obj: activexDashInfopathLib.InfoPathNs.ApplicationEvents,
    event: activexDashInfopathLib.activexDashInfopathLibStrings.XDocumentChange,
    handler: js.ThisFunction1[
      /* this */ activexDashInfopathLib.InfoPathNs.ApplicationEvents, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
}

