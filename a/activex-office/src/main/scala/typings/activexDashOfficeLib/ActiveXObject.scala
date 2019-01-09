package typings
package activexDashOfficeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Click,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.Ctrl, 
      activexDashOfficeLib.activexDashOfficeLibStrings.CancelDefault
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ Anon_CancelDefault, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Change,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.Ctrl],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ Anon_Ctrl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.DockPositionStateChange,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.CustomTaskPaneInst],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_CustomTaskPaneInst, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.VisibleStateChange,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.CustomTaskPaneInst],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ Anon_CustomTaskPaneInst, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.NodeAfterDelete,
    argNames: js.Tuple4[
      activexDashOfficeLib.activexDashOfficeLibStrings.OldNode, 
      activexDashOfficeLib.activexDashOfficeLibStrings.OldParentNode, 
      activexDashOfficeLib.activexDashOfficeLibStrings.OldNextSibling, 
      activexDashOfficeLib.activexDashOfficeLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_InUndoRedo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.NodeAfterInsert,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.NewNode, 
      activexDashOfficeLib.activexDashOfficeLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_InUndoRedoNewNode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.NodeAfterReplace,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.OldNode, 
      activexDashOfficeLib.activexDashOfficeLibStrings.NewNode, 
      activexDashOfficeLib.activexDashOfficeLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_InUndoRedoNewNodeOldNode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgszNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.cNames, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashOfficeLib.activexDashOfficeLibStrings.itinfo, 
      activexDashOfficeLib.activexDashOfficeLibStrings.lcid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.PartAfterAdd,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.NewPart],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_NewPart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.PartAfterLoad,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.Part],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_Part, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.PartBeforeDelete,
    argNames: js.Array[activexDashOfficeLib.activexDashOfficeLibStrings.OldPart],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_OldPart, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashOfficeLib.activexDashOfficeLibStrings.riid, 
      activexDashOfficeLib.activexDashOfficeLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_EnvelopeHide(
    obj: activexDashOfficeLib.OfficeNs.MsoEnvelope,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.EnvelopeHide,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.MsoEnvelope, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_EnvelopeShow(
    obj: activexDashOfficeLib.OfficeNs.MsoEnvelope,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.EnvelopeShow,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.MsoEnvelope, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBarButton_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBarButton_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBarComboBox_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBarComboBox_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBars_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CommandBars_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomTaskPane_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomTaskPane_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomXMLPart_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomXMLPart_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Invoke,
    argNames: activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomXMLParts_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ activexDashOfficeLib.OfficeNs.EventHelperTypesNs.CustomXMLParts_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_OnUpdate(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.OnUpdate,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarButton, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBarComboBox, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CommandBars,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CommandBars, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CustomTaskPane,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomTaskPane, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLPart,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLPart, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashOfficeLib.OfficeNs.CustomXMLParts,
    event: activexDashOfficeLib.activexDashOfficeLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashOfficeLib.OfficeNs.CustomXMLParts, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("set")
  def set_List(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    propertyName: activexDashOfficeLib.activexDashOfficeLibStrings.List,
    parameterTypes: js.Array[scala.Double],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_accName(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    propertyName: activexDashOfficeLib.activexDashOfficeLibStrings.accName,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_accName(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    propertyName: activexDashOfficeLib.activexDashOfficeLibStrings.accName,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_accValue(
    obj: activexDashOfficeLib.OfficeNs.CommandBarButton,
    propertyName: activexDashOfficeLib.activexDashOfficeLibStrings.accValue,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_accValue(
    obj: activexDashOfficeLib.OfficeNs.CommandBarComboBox,
    propertyName: activexDashOfficeLib.activexDashOfficeLibStrings.accValue,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
}

