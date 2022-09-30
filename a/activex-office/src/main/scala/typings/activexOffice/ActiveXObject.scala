package typings.activexOffice

import typings.activexOffice.Office.CommandBarButton
import typings.activexOffice.Office.CommandBarComboBox
import typings.activexOffice.Office.CommandBars
import typings.activexOffice.Office.CustomTaskPane
import typings.activexOffice.Office.CustomXMLPart
import typings.activexOffice.Office.CustomXMLParts
import typings.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarButtonInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarComboBoxInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CommandBarsInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CommandBarsInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomTaskPaneInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartInvokeParameter
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeArgNames
import typings.activexOffice.Office.EventHelperTypes.CustomXMLPartsInvokeParameter
import typings.activexOffice.Office.MsoEnvelope
import typings.activexOffice.activexOfficeStrings.AddRef
import typings.activexOffice.activexOfficeStrings.CancelDefault
import typings.activexOffice.activexOfficeStrings.Change
import typings.activexOffice.activexOfficeStrings.Click
import typings.activexOffice.activexOfficeStrings.Ctrl
import typings.activexOffice.activexOfficeStrings.CustomTaskPaneInst
import typings.activexOffice.activexOfficeStrings.DockPositionStateChange
import typings.activexOffice.activexOfficeStrings.EnvelopeHide
import typings.activexOffice.activexOfficeStrings.EnvelopeShow
import typings.activexOffice.activexOfficeStrings.GetIDsOfNames
import typings.activexOffice.activexOfficeStrings.GetTypeInfo
import typings.activexOffice.activexOfficeStrings.GetTypeInfoCount
import typings.activexOffice.activexOfficeStrings.InUndoRedo
import typings.activexOffice.activexOfficeStrings.Invoke
import typings.activexOffice.activexOfficeStrings.NewNode
import typings.activexOffice.activexOfficeStrings.NewPart
import typings.activexOffice.activexOfficeStrings.NodeAfterDelete
import typings.activexOffice.activexOfficeStrings.NodeAfterInsert
import typings.activexOffice.activexOfficeStrings.NodeAfterReplace
import typings.activexOffice.activexOfficeStrings.OldNextSibling
import typings.activexOffice.activexOfficeStrings.OldNode
import typings.activexOffice.activexOfficeStrings.OldParentNode
import typings.activexOffice.activexOfficeStrings.OldPart
import typings.activexOffice.activexOfficeStrings.OnUpdate
import typings.activexOffice.activexOfficeStrings.Part
import typings.activexOffice.activexOfficeStrings.PartAfterAdd
import typings.activexOffice.activexOfficeStrings.PartAfterLoad
import typings.activexOffice.activexOfficeStrings.PartBeforeDelete
import typings.activexOffice.activexOfficeStrings.QueryInterface
import typings.activexOffice.activexOfficeStrings.Release
import typings.activexOffice.activexOfficeStrings.VisibleStateChange
import typings.activexOffice.activexOfficeStrings.accName
import typings.activexOffice.activexOfficeStrings.accValue
import typings.activexOffice.activexOfficeStrings.cNames
import typings.activexOffice.activexOfficeStrings.itinfo
import typings.activexOffice.activexOfficeStrings.lcid
import typings.activexOffice.activexOfficeStrings.pctinfo
import typings.activexOffice.activexOfficeStrings.pptinfo
import typings.activexOffice.activexOfficeStrings.ppvObj
import typings.activexOffice.activexOfficeStrings.rgdispid
import typings.activexOffice.activexOfficeStrings.rgszNames
import typings.activexOffice.activexOfficeStrings.riid
import typings.activexOffice.anon.CNames
import typings.activexOffice.anon.Itinfo
import typings.activexOffice.anon.Pctinfo
import typings.activexOffice.anon.PpvObj
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: CommandBarButton,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: Click,
    argNames: js.Tuple2[Ctrl, CancelDefault],
    handler: js.ThisFunction1[
      /* this */ CommandBarButton, 
      /* parameter */ typings.activexOffice.anon.CancelDefault, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarButton,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: Change,
    argNames: js.Array[Ctrl],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ typings.activexOffice.anon.Ctrl, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBarComboBox,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBarComboBox, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: AddRef | OnUpdate | Release,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CommandBars,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: DockPositionStateChange | VisibleStateChange,
    argNames: js.Array[CustomTaskPaneInst],
    handler: js.ThisFunction1[
      /* this */ CustomTaskPane, 
      /* parameter */ typings.activexOffice.anon.CustomTaskPaneInst, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomTaskPane,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterDelete,
    argNames: js.Tuple4[OldNode, OldParentNode, OldNextSibling, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ CustomXMLPart, 
      /* parameter */ typings.activexOffice.anon.InUndoRedo, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterInsert,
    argNames: js.Tuple2[NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ typings.activexOffice.anon.NewNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: NodeAfterReplace,
    argNames: js.Tuple3[OldNode, NewNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ typings.activexOffice.anon.OldNode, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLPart,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: AddRef | Release,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterAdd,
    argNames: js.Array[NewPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ typings.activexOffice.anon.NewPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartAfterLoad,
    argNames: js.Array[Part],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ typings.activexOffice.anon.Part, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: PartBeforeDelete,
    argNames: js.Array[OldPart],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ typings.activexOffice.anon.OldPart, Unit]
  ): Unit = js.native
  def on(
    obj: CustomXMLParts,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: MsoEnvelope,
    event: EnvelopeHide | EnvelopeShow,
    handler: js.ThisFunction1[/* this */ MsoEnvelope, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarButton,
    event: Invoke,
    argNames: CommandBarButtonInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBarButton, /* parameter */ CommandBarButtonInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBarComboBox,
    event: Invoke,
    argNames: CommandBarComboBoxInvokeArgNames,
    handler: js.ThisFunction1[
      /* this */ CommandBarComboBox, 
      /* parameter */ CommandBarComboBoxInvokeParameter, 
      Unit
    ]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CommandBars,
    event: Invoke,
    argNames: CommandBarsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CommandBars, /* parameter */ CommandBarsInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomTaskPane,
    event: Invoke,
    argNames: CustomTaskPaneInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomTaskPane, /* parameter */ CustomTaskPaneInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLPart,
    event: Invoke,
    argNames: CustomXMLPartInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLPart, /* parameter */ CustomXMLPartInvokeParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: CustomXMLParts,
    event: Invoke,
    argNames: CustomXMLPartsInvokeArgNames,
    handler: js.ThisFunction1[/* this */ CustomXMLParts, /* parameter */ CustomXMLPartsInvokeParameter, Unit]
  ): Unit = js.native
  
  def set(
    obj: CommandBarButton,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  def set(
    obj: CommandBarComboBox,
    propertyName: accName | accValue,
    parameterTypes: js.Array[Any],
    newValue: String
  ): Unit = js.native
  @JSName("set")
  def set_List(
    obj: CommandBarComboBox,
    propertyName: typings.activexOffice.activexOfficeStrings.List,
    parameterTypes: js.Array[Double],
    newValue: String
  ): Unit = js.native
}
