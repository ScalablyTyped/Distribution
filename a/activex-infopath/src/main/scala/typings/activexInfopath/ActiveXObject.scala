package typings.activexInfopath

import typings.activexInfopath.InfoPath.ApplicationEvents
import typings.activexInfopath.InfoPath.Button
import typings.activexInfopath.InfoPath.DataDOM
import typings.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeArgNames
import typings.activexInfopath.InfoPath.EventHelperTypes.ButtonInvokeParameter
import typings.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeArgNames
import typings.activexInfopath.InfoPath.EventHelperTypes.DataDOMInvokeParameter
import typings.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeArgNames
import typings.activexInfopath.InfoPath.EventHelperTypes.XDocumentInvokeParameter
import typings.activexInfopath.InfoPath.XDocument
import typings.activexInfopath.activexInfopathStrings.AddRef
import typings.activexInfopath.activexInfopathStrings.GetIDsOfNames
import typings.activexInfopath.activexInfopathStrings.GetTypeInfo
import typings.activexInfopath.activexInfopathStrings.GetTypeInfoCount
import typings.activexInfopath.activexInfopathStrings.Invoke
import typings.activexInfopath.activexInfopathStrings.NewXDocument
import typings.activexInfopath.activexInfopathStrings.OnAfterChange
import typings.activexInfopath.activexInfopathStrings.OnAfterImport
import typings.activexInfopath.activexInfopathStrings.OnBeforeChange
import typings.activexInfopath.activexInfopathStrings.OnClick
import typings.activexInfopath.activexInfopathStrings.OnContextChange
import typings.activexInfopath.activexInfopathStrings.OnLoad
import typings.activexInfopath.activexInfopathStrings.OnMergeRequest
import typings.activexInfopath.activexInfopathStrings.OnSaveRequest
import typings.activexInfopath.activexInfopathStrings.OnSign
import typings.activexInfopath.activexInfopathStrings.OnSubmitRequest
import typings.activexInfopath.activexInfopathStrings.OnSwitchView
import typings.activexInfopath.activexInfopathStrings.OnValidate
import typings.activexInfopath.activexInfopathStrings.OnVersionUpgrade
import typings.activexInfopath.activexInfopathStrings.QueryInterface
import typings.activexInfopath.activexInfopathStrings.Quit
import typings.activexInfopath.activexInfopathStrings.Release
import typings.activexInfopath.activexInfopathStrings.WindowActivate
import typings.activexInfopath.activexInfopathStrings.WindowDeactivate
import typings.activexInfopath.activexInfopathStrings.WindowSize
import typings.activexInfopath.activexInfopathStrings.XDocumentBeforeClose
import typings.activexInfopath.activexInfopathStrings.XDocumentBeforePrint
import typings.activexInfopath.activexInfopathStrings.XDocumentBeforeSave
import typings.activexInfopath.activexInfopathStrings.XDocumentChange
import typings.activexInfopath.activexInfopathStrings.XDocumentOpen
import typings.activexInfopath.activexInfopathStrings.cNames
import typings.activexInfopath.activexInfopathStrings.itinfo
import typings.activexInfopath.activexInfopathStrings.lcid
import typings.activexInfopath.activexInfopathStrings.pDataDOMEvent
import typings.activexInfopath.activexInfopathStrings.pDocument
import typings.activexInfopath.activexInfopathStrings.pEvent
import typings.activexInfopath.activexInfopathStrings.pWindow
import typings.activexInfopath.activexInfopathStrings.pctinfo
import typings.activexInfopath.activexInfopathStrings.pfCancel
import typings.activexInfopath.activexInfopathStrings.pptinfo
import typings.activexInfopath.activexInfopathStrings.ppvObj
import typings.activexInfopath.activexInfopathStrings.rgdispid
import typings.activexInfopath.activexInfopathStrings.rgszNames
import typings.activexInfopath.activexInfopathStrings.riid
import typings.activexInfopath.anon.CNames
import typings.activexInfopath.anon.Itinfo
import typings.activexInfopath.anon.PDataDOMEvent
import typings.activexInfopath.anon.PDocument
import typings.activexInfopath.anon.PEvent
import typings.activexInfopath.anon.PEventDocContextChangeEventObject
import typings.activexInfopath.anon.PEventDocEventObject
import typings.activexInfopath.anon.PEventDocReturnEventObject
import typings.activexInfopath.anon.PEventMergeEventObject
import typings.activexInfopath.anon.PEventSaveEventObject
import typings.activexInfopath.anon.PEventSignEventObject
import typings.activexInfopath.anon.PEventVersionUpgradeEventObject
import typings.activexInfopath.anon.PWindow
import typings.activexInfopath.anon.Pctinfo
import typings.activexInfopath.anon.PfCancel
import typings.activexInfopath.anon.PpvObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: ApplicationEvents,
    event: NewXDocument,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowActivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowDeactivate,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: WindowSize,
    argNames: js.Tuple2[pDocument, pWindow],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PWindow, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeClose,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforePrint,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentBeforeSave,
    argNames: js.Tuple2[pDocument, pfCancel],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PfCancel, Unit]
  ): Unit = js.native
  def on(
    obj: ApplicationEvents,
    event: XDocumentOpen,
    argNames: js.Array[pDocument],
    handler: js.ThisFunction1[/* this */ ApplicationEvents, /* parameter */ PDocument, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: OnClick,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ PEvent, Unit]
  ): Unit = js.native
  def on(
    obj: Button,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnAfterChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnBeforeChange,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: OnValidate,
    argNames: js.Array[pDataDOMEvent],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PDataDOMEvent, Unit]
  ): Unit = js.native
  def on(
    obj: DataDOM,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnAfterImport,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnContextChange,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocContextChangeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnLoad,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnMergeRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventMergeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSaveRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventSaveEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSign,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventSignEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSubmitRequest,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocReturnEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnSwitchView,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventDocEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: OnVersionUpgrade,
    argNames: js.Array[pEvent],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PEventVersionUpgradeEventObject, Unit]
  ): Unit = js.native
  def on(
    obj: XDocument,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ PpvObj, Unit]
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
    argNames: ButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Button, /* parameter */ ButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: DataDOM,
    event: Invoke,
    argNames: DataDOMInvokeArgNames,
    handler: js.ThisFunction1[/* this */ DataDOM, /* parameter */ DataDOMInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: XDocument,
    event: Invoke,
    argNames: XDocumentInvokeArgNames,
    handler: js.ThisFunction1[/* this */ XDocument, /* parameter */ XDocumentInvokeParameter, Unit]
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
