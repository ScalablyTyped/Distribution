package typings
package activexDashWordLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObject extends js.Object {
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentBeforeClose,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentBeforePrint,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentBeforeSave,
    argNames: js.Tuple3[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.SaveAsUI, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelDoc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentOpen,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentSync,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.SyncEventType
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocSyncEventType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.EPostageInsert,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.EPostagePropertyDialog,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.GetIDsOfNames,
    argNames: js.Tuple5[
      activexDashWordLib.activexDashWordLibStrings.riid, 
      activexDashWordLib.activexDashWordLibStrings.rgszNames, 
      activexDashWordLib.activexDashWordLibStrings.cNames, 
      activexDashWordLib.activexDashWordLibStrings.lcid, 
      activexDashWordLib.activexDashWordLibStrings.rgdispid
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CNames, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.GetTypeInfoCount,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.pctinfo],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Pctinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.GetTypeInfo,
    argNames: js.Tuple3[
      activexDashWordLib.activexDashWordLibStrings.itinfo, 
      activexDashWordLib.activexDashWordLibStrings.lcid, 
      activexDashWordLib.activexDashWordLibStrings.pptinfo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Itinfo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeAfterMerge,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.DocResult
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocDocResult, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeAfterRecordMerge,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeBeforeMerge,
    argNames: js.Tuple4[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.StartRecord, 
      activexDashWordLib.activexDashWordLibStrings.EndRecord, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelDocEndRecord, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeBeforeRecordMerge,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Cancel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeDataSourceLoad,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeDataSourceValidate2,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Handled
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocHandledBoolean, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeDataSourceValidate,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Handled
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocHandled, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeWizardSendToCustom,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.MailMergeWizardStateChange,
    argNames: js.Tuple4[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.FromState, 
      activexDashWordLib.activexDashWordLibStrings.ToState, 
      activexDashWordLib.activexDashWordLibStrings.Handled
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocFromState, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.NewDocument,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Doc],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Doc, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowActivate,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.PvWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_PvWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[
      activexDashWordLib.activexDashWordLibStrings.PvWindow, 
      activexDashWordLib.activexDashWordLibStrings.CloseReason, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelCloseReason, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.PvWindow, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelPvWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowDeactivate,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.PvWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_PvWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowOpen,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.PvWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_PvWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.ProtectedViewWindowSize,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.PvWindow],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_PvWindow, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.QueryInterface,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.riid, 
      activexDashWordLib.activexDashWordLibStrings.ppvObj
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_PpvObj, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowActivate,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowBeforeDoubleClick,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Sel, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelSel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowBeforeRightClick,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Sel, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_CancelSel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowDeactivate,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowSelectionChange,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.Sel],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_Sel, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.WindowSize,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.Doc, 
      activexDashWordLib.activexDashWordLibStrings.Wn
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_DocWn, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.XMLSelectionChange,
    argNames: js.Tuple4[
      activexDashWordLib.activexDashWordLibStrings.Sel, 
      activexDashWordLib.activexDashWordLibStrings.OldXMLNode, 
      activexDashWordLib.activexDashWordLibStrings.NewXMLNode, 
      activexDashWordLib.activexDashWordLibStrings.Reason
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_NewXMLNode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.XMLValidationError,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.XMLNode],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ Anon_XMLNode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.BuildingBlockInsert,
    argNames: js.Tuple5[
      activexDashWordLib.activexDashWordLibStrings.Range, 
      activexDashWordLib.activexDashWordLibStrings.Name, 
      activexDashWordLib.activexDashWordLibStrings.Category, 
      activexDashWordLib.activexDashWordLibStrings.BlockType, 
      activexDashWordLib.activexDashWordLibStrings.Template
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_BlockType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlAfterAdd,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.NewContentControl, 
      activexDashWordLib.activexDashWordLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_InUndoRedo, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlBeforeContentUpdate,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.ContentControl, 
      activexDashWordLib.activexDashWordLibStrings.Content
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_Content, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlBeforeDelete,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.OldContentControl, 
      activexDashWordLib.activexDashWordLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_InUndoRedoOldContentControl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlBeforeStoreUpdate,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.ContentControl, 
      activexDashWordLib.activexDashWordLibStrings.Content
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_Content, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlOnEnter,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.ContentControl],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_ContentControl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.ContentControlOnExit,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.ContentControl, 
      activexDashWordLib.activexDashWordLibStrings.Cancel
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_CancelContentControl, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.Sync,
    argNames: js.Array[activexDashWordLib.activexDashWordLibStrings.SyncEventType],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_SyncEventType, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.XMLAfterInsert,
    argNames: js.Tuple2[
      activexDashWordLib.activexDashWordLibStrings.NewXMLNode, 
      activexDashWordLib.activexDashWordLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_InUndoRedoNewXMLNode, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def on(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.XMLBeforeDelete,
    argNames: js.Tuple3[
      activexDashWordLib.activexDashWordLibStrings.DeletedRange, 
      activexDashWordLib.activexDashWordLibStrings.OldXMLNode, 
      activexDashWordLib.activexDashWordLibStrings.InUndoRedo
    ],
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Document, 
      /* parameter */ Anon_DeletedRange, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_AddRef(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.AddRef,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Close(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.Close,
    handler: js.ThisFunction1[/* this */ activexDashWordLib.WordNs.Document, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_DocumentChange(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.DocumentChange,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_EPostageInsertEx(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.EPostageInsertEx,
    argNames: activexDashWordLib.WordNs.EventHelperTypesNs.Application_EPostageInsertEx_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ activexDashWordLib.WordNs.EventHelperTypesNs.Application_EPostageInsertEx_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_GotFocus(
    obj: activexDashWordLib.WordNs.OLEControl,
    event: activexDashWordLib.activexDashWordLibStrings.GotFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.OLEControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.Invoke,
    argNames: activexDashWordLib.WordNs.EventHelperTypesNs.Application_Invoke_ArgNames,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ activexDashWordLib.WordNs.EventHelperTypesNs.Application_Invoke_Parameter, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_LostFocus(
    obj: activexDashWordLib.WordNs.OLEControl,
    event: activexDashWordLib.activexDashWordLibStrings.LostFocus,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.OLEControl, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_New(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.New,
    handler: js.ThisFunction1[/* this */ activexDashWordLib.WordNs.Document, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Open(
    obj: activexDashWordLib.WordNs.Document,
    event: activexDashWordLib.activexDashWordLibStrings.Open,
    handler: js.ThisFunction1[/* this */ activexDashWordLib.WordNs.Document, /* parameter */ js.Object, scala.Unit]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Quit(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.Quit,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Release(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.Release,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("on")
  def on_Startup(
    obj: activexDashWordLib.WordNs.Application,
    event: activexDashWordLib.activexDashWordLibStrings.Startup,
    handler: js.ThisFunction1[
      /* this */ activexDashWordLib.WordNs.Application, 
      /* parameter */ js.Object, 
      scala.Unit
    ]
  ): scala.Unit = js.native
  @JSName("set")
  def set_ActiveWritingStyle(
    obj: activexDashWordLib.WordNs.Document,
    propertyName: activexDashWordLib.activexDashWordLibStrings.ActiveWritingStyle,
    parameterTypes: js.Array[_],
    newValue: java.lang.String
  ): scala.Unit = js.native
  @JSName("set")
  def set_Compatibility(
    obj: activexDashWordLib.WordNs.Document,
    propertyName: activexDashWordLib.activexDashWordLibStrings.Compatibility,
    parameterTypes: js.Array[activexDashWordLib.WordNs.WdCompatibility],
    newValue: scala.Boolean
  ): scala.Unit = js.native
  @JSName("set")
  def set_PrivateProfileString(
    obj: activexDashWordLib.WordNs.System,
    propertyName: activexDashWordLib.activexDashWordLibStrings.PrivateProfileString,
    parameterTypes: js.Tuple3[java.lang.String, java.lang.String, java.lang.String],
    newValue: java.lang.String
  ): scala.Unit = js.native
}

