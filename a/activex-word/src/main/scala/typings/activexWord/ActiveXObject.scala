package typings.activexWord

import typings.activexWord.Word.Application
import typings.activexWord.Word.Document
import typings.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExArgNames
import typings.activexWord.Word.EventHelperTypes.ApplicationEPostageInsertExParameter
import typings.activexWord.Word.EventHelperTypes.ApplicationInvokeArgNames
import typings.activexWord.Word.EventHelperTypes.ApplicationInvokeParameter
import typings.activexWord.Word.OLEControl
import typings.activexWord.Word.System
import typings.activexWord.Word.WdCompatibility
import typings.activexWord.activexWordStrings.ActiveWritingStyle
import typings.activexWord.activexWordStrings.AddRef
import typings.activexWord.activexWordStrings.BlockType
import typings.activexWord.activexWordStrings.BuildingBlockInsert
import typings.activexWord.activexWordStrings.Cancel
import typings.activexWord.activexWordStrings.Category
import typings.activexWord.activexWordStrings.Close
import typings.activexWord.activexWordStrings.CloseReason
import typings.activexWord.activexWordStrings.Compatibility
import typings.activexWord.activexWordStrings.Content
import typings.activexWord.activexWordStrings.ContentControl
import typings.activexWord.activexWordStrings.ContentControlAfterAdd
import typings.activexWord.activexWordStrings.ContentControlBeforeContentUpdate
import typings.activexWord.activexWordStrings.ContentControlBeforeDelete
import typings.activexWord.activexWordStrings.ContentControlBeforeStoreUpdate
import typings.activexWord.activexWordStrings.ContentControlOnEnter
import typings.activexWord.activexWordStrings.ContentControlOnExit
import typings.activexWord.activexWordStrings.DeletedRange
import typings.activexWord.activexWordStrings.Doc
import typings.activexWord.activexWordStrings.DocResult
import typings.activexWord.activexWordStrings.DocumentBeforeClose
import typings.activexWord.activexWordStrings.DocumentBeforePrint
import typings.activexWord.activexWordStrings.DocumentBeforeSave
import typings.activexWord.activexWordStrings.DocumentChange
import typings.activexWord.activexWordStrings.DocumentOpen
import typings.activexWord.activexWordStrings.DocumentSync
import typings.activexWord.activexWordStrings.EPostageInsert
import typings.activexWord.activexWordStrings.EPostageInsertEx
import typings.activexWord.activexWordStrings.EPostagePropertyDialog
import typings.activexWord.activexWordStrings.EndRecord
import typings.activexWord.activexWordStrings.FromState
import typings.activexWord.activexWordStrings.GetIDsOfNames
import typings.activexWord.activexWordStrings.GetTypeInfo
import typings.activexWord.activexWordStrings.GetTypeInfoCount
import typings.activexWord.activexWordStrings.GotFocus
import typings.activexWord.activexWordStrings.Handled
import typings.activexWord.activexWordStrings.InUndoRedo
import typings.activexWord.activexWordStrings.Invoke
import typings.activexWord.activexWordStrings.LostFocus
import typings.activexWord.activexWordStrings.MailMergeAfterMerge
import typings.activexWord.activexWordStrings.MailMergeAfterRecordMerge
import typings.activexWord.activexWordStrings.MailMergeBeforeMerge
import typings.activexWord.activexWordStrings.MailMergeBeforeRecordMerge
import typings.activexWord.activexWordStrings.MailMergeDataSourceLoad
import typings.activexWord.activexWordStrings.MailMergeDataSourceValidate
import typings.activexWord.activexWordStrings.MailMergeDataSourceValidate2
import typings.activexWord.activexWordStrings.MailMergeWizardSendToCustom
import typings.activexWord.activexWordStrings.MailMergeWizardStateChange
import typings.activexWord.activexWordStrings.Name
import typings.activexWord.activexWordStrings.New
import typings.activexWord.activexWordStrings.NewContentControl
import typings.activexWord.activexWordStrings.NewDocument
import typings.activexWord.activexWordStrings.NewXMLNode
import typings.activexWord.activexWordStrings.OldContentControl
import typings.activexWord.activexWordStrings.OldXMLNode
import typings.activexWord.activexWordStrings.Open
import typings.activexWord.activexWordStrings.PrivateProfileString
import typings.activexWord.activexWordStrings.ProtectedViewWindowActivate
import typings.activexWord.activexWordStrings.ProtectedViewWindowBeforeClose
import typings.activexWord.activexWordStrings.ProtectedViewWindowBeforeEdit
import typings.activexWord.activexWordStrings.ProtectedViewWindowDeactivate
import typings.activexWord.activexWordStrings.ProtectedViewWindowOpen
import typings.activexWord.activexWordStrings.ProtectedViewWindowSize
import typings.activexWord.activexWordStrings.PvWindow
import typings.activexWord.activexWordStrings.QueryInterface
import typings.activexWord.activexWordStrings.Quit
import typings.activexWord.activexWordStrings.Range
import typings.activexWord.activexWordStrings.Reason
import typings.activexWord.activexWordStrings.Release
import typings.activexWord.activexWordStrings.SaveAsUI
import typings.activexWord.activexWordStrings.Sel
import typings.activexWord.activexWordStrings.StartRecord
import typings.activexWord.activexWordStrings.Startup
import typings.activexWord.activexWordStrings.Sync
import typings.activexWord.activexWordStrings.SyncEventType
import typings.activexWord.activexWordStrings.Template
import typings.activexWord.activexWordStrings.ToState
import typings.activexWord.activexWordStrings.WindowActivate
import typings.activexWord.activexWordStrings.WindowBeforeDoubleClick
import typings.activexWord.activexWordStrings.WindowBeforeRightClick
import typings.activexWord.activexWordStrings.WindowDeactivate
import typings.activexWord.activexWordStrings.WindowSelectionChange
import typings.activexWord.activexWordStrings.WindowSize
import typings.activexWord.activexWordStrings.Wn
import typings.activexWord.activexWordStrings.XMLAfterInsert
import typings.activexWord.activexWordStrings.XMLBeforeDelete
import typings.activexWord.activexWordStrings.XMLNode
import typings.activexWord.activexWordStrings.XMLSelectionChange
import typings.activexWord.activexWordStrings.XMLValidationError
import typings.activexWord.activexWordStrings.cNames
import typings.activexWord.activexWordStrings.itinfo
import typings.activexWord.activexWordStrings.lcid
import typings.activexWord.activexWordStrings.pctinfo
import typings.activexWord.activexWordStrings.pptinfo
import typings.activexWord.activexWordStrings.ppvObj
import typings.activexWord.activexWordStrings.rgdispid
import typings.activexWord.activexWordStrings.rgszNames
import typings.activexWord.activexWordStrings.riid
import typings.activexWord.anon.CNames
import typings.activexWord.anon.CancelContentControl
import typings.activexWord.anon.CancelPvWindow
import typings.activexWord.anon.DocDocument
import typings.activexWord.anon.DocHandled
import typings.activexWord.anon.InUndoRedoNewXMLNode
import typings.activexWord.anon.Itinfo
import typings.activexWord.anon.Pctinfo
import typings.activexWord.anon.PpvObj
import typings.activexWord.anon.SelSelection
import typings.activexWord.anon.SyncEventTypeMsoSyncEventType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObject extends StObject {
  
  def on(
    obj: Application,
    event: DocumentOpen | EPostageInsert | EPostagePropertyDialog | MailMergeAfterRecordMerge | MailMergeDataSourceLoad | MailMergeWizardSendToCustom | NewDocument | ProtectedViewWindowActivate | ProtectedViewWindowDeactivate | ProtectedViewWindowOpen | ProtectedViewWindowSize,
    argNames: js.Array[Doc | PvWindow],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ DocDocument) | (/* parameter */ typings.activexWord.anon.PvWindow), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeClose | DocumentBeforePrint | MailMergeBeforeRecordMerge | WindowActivate | WindowBeforeDoubleClick | WindowBeforeRightClick | WindowDeactivate | WindowSize,
    argNames: js.Tuple2[Doc | Sel, Cancel | Wn],
    handler: js.ThisFunction1[
      /* this */ Application, 
      (/* parameter */ typings.activexWord.anon.Cancel) | (/* parameter */ typings.activexWord.anon.Sel) | (/* parameter */ typings.activexWord.anon.Wn), 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Application,
    event: AddRef | DocumentChange | Quit | Release | Startup,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentBeforeSave,
    argNames: js.Tuple3[Doc, SaveAsUI, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.Doc, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: DocumentSync,
    argNames: js.Tuple2[Doc, SyncEventType],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.SyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetIDsOfNames,
    argNames: js.Tuple5[riid, rgszNames, cNames, lcid, rgdispid],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CNames, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfoCount,
    argNames: js.Array[pctinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Pctinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: GetTypeInfo,
    argNames: js.Tuple3[itinfo, lcid, pptinfo],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ Itinfo, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeAfterMerge,
    argNames: js.Tuple2[Doc, DocResult],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.DocResult, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeBeforeMerge,
    argNames: js.Tuple4[Doc, StartRecord, EndRecord, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.EndRecord, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate2,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ DocHandled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeDataSourceValidate,
    argNames: js.Tuple2[Doc, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.Handled, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: MailMergeWizardStateChange,
    argNames: js.Tuple4[Doc, FromState, ToState, Handled],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.FromState, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeClose,
    argNames: js.Tuple3[PvWindow, CloseReason, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.CloseReason, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: ProtectedViewWindowBeforeEdit,
    argNames: js.Tuple2[PvWindow, Cancel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ CancelPvWindow, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: QueryInterface,
    argNames: js.Tuple2[riid, ppvObj],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ PpvObj, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: WindowSelectionChange,
    argNames: js.Array[Sel],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ SelSelection, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLSelectionChange,
    argNames: js.Tuple4[Sel, OldXMLNode, NewXMLNode, Reason],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.NewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Application,
    event: XMLValidationError,
    argNames: js.Array[XMLNode],
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ typings.activexWord.anon.XMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeContentUpdate | ContentControlBeforeStoreUpdate,
    argNames: js.Tuple2[ContentControl, Content],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typings.activexWord.anon.Content, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Close | New | Open,
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: BuildingBlockInsert,
    argNames: js.Tuple5[Range, Name, Category, BlockType, Template],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typings.activexWord.anon.BlockType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlAfterAdd,
    argNames: js.Tuple2[NewContentControl, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typings.activexWord.anon.InUndoRedo, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlBeforeDelete,
    argNames: js.Tuple2[OldContentControl, InUndoRedo],
    handler: js.ThisFunction1[
      /* this */ Document, 
      /* parameter */ typings.activexWord.anon.OldContentControl, 
      Unit
    ]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnEnter,
    argNames: js.Array[ContentControl],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typings.activexWord.anon.ContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: ContentControlOnExit,
    argNames: js.Tuple2[ContentControl, Cancel],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ CancelContentControl, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: Sync,
    argNames: js.Array[SyncEventType],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ SyncEventTypeMsoSyncEventType, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLAfterInsert,
    argNames: js.Tuple2[NewXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ InUndoRedoNewXMLNode, Unit]
  ): Unit = js.native
  def on(
    obj: Document,
    event: XMLBeforeDelete,
    argNames: js.Tuple3[DeletedRange, OldXMLNode, InUndoRedo],
    handler: js.ThisFunction1[/* this */ Document, /* parameter */ typings.activexWord.anon.DeletedRange, Unit]
  ): Unit = js.native
  def on(
    obj: OLEControl,
    event: GotFocus | LostFocus,
    handler: js.ThisFunction1[/* this */ OLEControl, /* parameter */ js.Object, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_EPostageInsertEx(
    obj: Application,
    event: EPostageInsertEx,
    argNames: ApplicationEPostageInsertExArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationEPostageInsertExParameter, Unit]
  ): Unit = js.native
  @JSName("on")
  def on_Invoke(
    obj: Application,
    event: Invoke,
    argNames: ApplicationInvokeArgNames,
    handler: js.ThisFunction1[/* this */ Application, /* parameter */ ApplicationInvokeParameter, Unit]
  ): Unit = js.native
  
  @JSName("set")
  def set_ActiveWritingStyle(obj: Document, propertyName: ActiveWritingStyle, parameterTypes: js.Array[Any], newValue: String): Unit = js.native
  @JSName("set")
  def set_Compatibility(
    obj: Document,
    propertyName: Compatibility,
    parameterTypes: js.Array[WdCompatibility],
    newValue: Boolean
  ): Unit = js.native
  @JSName("set")
  def set_PrivateProfileString(
    obj: System,
    propertyName: PrivateProfileString,
    parameterTypes: js.Tuple3[String, String, String],
    newValue: String
  ): Unit = js.native
}
