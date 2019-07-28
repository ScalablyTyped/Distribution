package typings.activexDashOffice

import typings.activexDashOffice.OfficeNs.CommandBarButton
import typings.activexDashOffice.OfficeNs.CommandBarComboBox
import typings.activexDashOffice.OfficeNs.CommandBars
import typings.activexDashOffice.OfficeNs.CustomTaskPane
import typings.activexDashOffice.OfficeNs.CustomXMLPart
import typings.activexDashOffice.OfficeNs.CustomXMLParts
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBarButton_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBarButton_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBarComboBox_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBarComboBox_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBars_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CommandBars_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomTaskPane_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomTaskPane_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomXMLPart_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomXMLPart_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomXMLParts_Invoke_ArgNames
import typings.activexDashOffice.OfficeNs.EventHelperTypesNs.CustomXMLParts_Invoke_Parameter
import typings.activexDashOffice.OfficeNs.MsoEnvelope
import typings.activexDashOffice.activexDashOfficeStrings.AddRef
import typings.activexDashOffice.activexDashOfficeStrings.CancelDefault
import typings.activexDashOffice.activexDashOfficeStrings.Change
import typings.activexDashOffice.activexDashOfficeStrings.Click
import typings.activexDashOffice.activexDashOfficeStrings.Ctrl
import typings.activexDashOffice.activexDashOfficeStrings.CustomTaskPaneInst
import typings.activexDashOffice.activexDashOfficeStrings.DockPositionStateChange
import typings.activexDashOffice.activexDashOfficeStrings.EnvelopeHide
import typings.activexDashOffice.activexDashOfficeStrings.EnvelopeShow
import typings.activexDashOffice.activexDashOfficeStrings.GetIDsOfNames
import typings.activexDashOffice.activexDashOfficeStrings.GetTypeInfo
import typings.activexDashOffice.activexDashOfficeStrings.GetTypeInfoCount
import typings.activexDashOffice.activexDashOfficeStrings.InUndoRedo
import typings.activexDashOffice.activexDashOfficeStrings.Invoke
import typings.activexDashOffice.activexDashOfficeStrings.List
import typings.activexDashOffice.activexDashOfficeStrings.NewNode
import typings.activexDashOffice.activexDashOfficeStrings.NewPart
import typings.activexDashOffice.activexDashOfficeStrings.NodeAfterDelete
import typings.activexDashOffice.activexDashOfficeStrings.NodeAfterInsert
import typings.activexDashOffice.activexDashOfficeStrings.NodeAfterReplace
import typings.activexDashOffice.activexDashOfficeStrings.OldNextSibling
import typings.activexDashOffice.activexDashOfficeStrings.OldNode
import typings.activexDashOffice.activexDashOfficeStrings.OldParentNode
import typings.activexDashOffice.activexDashOfficeStrings.OldPart
import typings.activexDashOffice.activexDashOfficeStrings.OnUpdate
import typings.activexDashOffice.activexDashOfficeStrings.Part
import typings.activexDashOffice.activexDashOfficeStrings.PartAfterAdd
import typings.activexDashOffice.activexDashOfficeStrings.PartAfterLoad
import typings.activexDashOffice.activexDashOfficeStrings.PartBeforeDelete
import typings.activexDashOffice.activexDashOfficeStrings.QueryInterface
import typings.activexDashOffice.activexDashOfficeStrings.Release
import typings.activexDashOffice.activexDashOfficeStrings.VisibleStateChange
import typings.activexDashOffice.activexDashOfficeStrings.accName
import typings.activexDashOffice.activexDashOfficeStrings.accValue
import typings.activexDashOffice.activexDashOfficeStrings.cNames
import typings.activexDashOffice.activexDashOfficeStrings.itinfo
import typings.activexDashOffice.activexDashOfficeStrings.lcid
import typings.activexDashOffice.activexDashOfficeStrings.pctinfo
import typings.activexDashOffice.activexDashOfficeStrings.pptinfo
import typings.activexDashOffice.activexDashOfficeStrings.ppvObj
import typings.activexDashOffice.activexDashOfficeStrings.rgdispid
import typings.activexDashOffice.activexDashOfficeStrings.rgszNames
import typings.activexDashOffice.activexDashOfficeStrings.riid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_CancelDefault, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Ctrl, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Anon_CustomTaskPaneInst, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedoNewNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_InUndoRedoNewNodeOldNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_NewPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_Part, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_OldPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Anon_PpvObj, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarButton,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBarComboBox,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CommandBars,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomTaskPane,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLPart,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: CustomXMLParts,
    event: AddRef,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeHide(
    obj: MsoEnvelope,
    event: EnvelopeHide,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EnvelopeShow(
    obj: MsoEnvelope,
    event: EnvelopeShow,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarButton,
    event: Invoke,
    argNames: CommandBarButton_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CommandBarButton_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarComboBox,
    event: Invoke,
    argNames: CommandBarComboBox_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ CommandBarComboBox_Invoke_Parameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBars,
    event: Invoke,
    argNames: CommandBars_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CommandBars_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomTaskPane,
    event: Invoke,
    argNames: CustomTaskPane_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CustomTaskPane_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLPart,
    event: Invoke,
    argNames: CustomXMLPart_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CustomXMLPart_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLParts,
    event: Invoke,
    argNames: CustomXMLParts_Invoke_ArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CustomXMLParts_Invoke_Parameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_OnUpdate(
    obj: CommandBars,
    event: OnUpdate,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarButton,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBarComboBox,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CommandBars,
    event: Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomTaskPane,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLPart,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Release(
    obj: CustomXMLParts,
    event: Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("set")
  def set_List(obj: CommandBarComboBox, propertyName: List, parameterTypes: js.Array[Double], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarButton, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accName(obj: CommandBarComboBox, propertyName: accName, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarButton, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
  @JSName("set")
  def set_accValue(obj: CommandBarComboBox, propertyName: accValue, parameterTypes: js.Array[_], newValue: String): Unit = js.native
}

