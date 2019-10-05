package typings.activexDashInfopath

import typings.activexDashInfopath.InfoPath.ApplicationEvents
import typings.activexDashInfopath.InfoPath.Button
import typings.activexDashInfopath.InfoPath.DataDOM
import typings.activexDashInfopath.InfoPath.EventHelperTypes.Button_Invoke_ArgNames
import typings.activexDashInfopath.InfoPath.EventHelperTypes.Button_Invoke_Parameter
import typings.activexDashInfopath.InfoPath.EventHelperTypes.DataDOM_Invoke_ArgNames
import typings.activexDashInfopath.InfoPath.EventHelperTypes.DataDOM_Invoke_Parameter
import typings.activexDashInfopath.InfoPath.EventHelperTypes.XDocument_Invoke_ArgNames
import typings.activexDashInfopath.InfoPath.EventHelperTypes.XDocument_Invoke_Parameter
import typings.activexDashInfopath.InfoPath.XDocument
import typings.activexDashInfopath.activexDashInfopathStrings.AddRef
import typings.activexDashInfopath.activexDashInfopathStrings.GetIDsOfNames
import typings.activexDashInfopath.activexDashInfopathStrings.GetTypeInfo
import typings.activexDashInfopath.activexDashInfopathStrings.GetTypeInfoCount
import typings.activexDashInfopath.activexDashInfopathStrings.Invoke
import typings.activexDashInfopath.activexDashInfopathStrings.NewXDocument
import typings.activexDashInfopath.activexDashInfopathStrings.OnAfterChange
import typings.activexDashInfopath.activexDashInfopathStrings.OnAfterImport
import typings.activexDashInfopath.activexDashInfopathStrings.OnBeforeChange
import typings.activexDashInfopath.activexDashInfopathStrings.OnClick
import typings.activexDashInfopath.activexDashInfopathStrings.OnContextChange
import typings.activexDashInfopath.activexDashInfopathStrings.OnLoad
import typings.activexDashInfopath.activexDashInfopathStrings.OnMergeRequest
import typings.activexDashInfopath.activexDashInfopathStrings.OnSaveRequest
import typings.activexDashInfopath.activexDashInfopathStrings.OnSign
import typings.activexDashInfopath.activexDashInfopathStrings.OnSubmitRequest
import typings.activexDashInfopath.activexDashInfopathStrings.OnSwitchView
import typings.activexDashInfopath.activexDashInfopathStrings.OnValidate
import typings.activexDashInfopath.activexDashInfopathStrings.OnVersionUpgrade
import typings.activexDashInfopath.activexDashInfopathStrings.QueryInterface
import typings.activexDashInfopath.activexDashInfopathStrings.Quit
import typings.activexDashInfopath.activexDashInfopathStrings.Release
import typings.activexDashInfopath.activexDashInfopathStrings.WindowActivate
import typings.activexDashInfopath.activexDashInfopathStrings.WindowDeactivate
import typings.activexDashInfopath.activexDashInfopathStrings.WindowSize
import typings.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforeClose
import typings.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforePrint
import typings.activexDashInfopath.activexDashInfopathStrings.XDocumentBeforeSave
import typings.activexDashInfopath.activexDashInfopathStrings.XDocumentChange
import typings.activexDashInfopath.activexDashInfopathStrings.XDocumentOpen
import typings.activexDashInfopath.activexDashInfopathStrings.cNames
import typings.activexDashInfopath.activexDashInfopathStrings.itinfo
import typings.activexDashInfopath.activexDashInfopathStrings.lcid
import typings.activexDashInfopath.activexDashInfopathStrings.pDataDOMEvent
import typings.activexDashInfopath.activexDashInfopathStrings.pDocument
import typings.activexDashInfopath.activexDashInfopathStrings.pEvent
import typings.activexDashInfopath.activexDashInfopathStrings.pWindow
import typings.activexDashInfopath.activexDashInfopathStrings.pctinfo
import typings.activexDashInfopath.activexDashInfopathStrings.pfCancel
import typings.activexDashInfopath.activexDashInfopathStrings.pptinfo
import typings.activexDashInfopath.activexDashInfopathStrings.ppvObj
import typings.activexDashInfopath.activexDashInfopathStrings.rgdispid
import typings.activexDashInfopath.activexDashInfopathStrings.rgszNames
import typings.activexDashInfopath.activexDashInfopathStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: ApplicationEvents,
    event: NewXDocument,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowDeactivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowSize,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeClose,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforePrint,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocumentPfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ Anon_PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_PEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnBeforeChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnLoad,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSubmitRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: Button,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: DataDOM,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: XDocument,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Button,
    event: Invoke,
    argNames: Button_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Button_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: DataDOM,
    event: Invoke,
    argNames: DataDOM_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ DataDOM_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: XDocument,
    event: Invoke,
    argNames: XDocument_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ XDocument_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: ApplicationEvents,
    event: Quit,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: Button,
    event: Release,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: DataDOM,
    event: Release,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: XDocument,
    event: Release,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_XDocumentChange(
    obj: ApplicationEvents,
    event: XDocumentChange,
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ js.Object, Unit]
  ): Unit = js.native
}

