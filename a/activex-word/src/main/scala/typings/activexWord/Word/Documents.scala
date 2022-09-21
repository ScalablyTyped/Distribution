package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Documents extends StObject {
  
  def Add(): Document = js.native
  def Add(Template: String): Document = js.native
  def Add(Template: String, NewTemplate: Boolean): Document = js.native
  def Add(Template: String, NewTemplate: Boolean, DocumentType: Unit, Visible: Boolean): Document = js.native
  def Add(Template: String, NewTemplate: Boolean, DocumentType: WdNewDocumentType): Document = js.native
  def Add(Template: String, NewTemplate: Boolean, DocumentType: WdNewDocumentType, Visible: Boolean): Document = js.native
  def Add(Template: String, NewTemplate: Unit, DocumentType: Unit, Visible: Boolean): Document = js.native
  def Add(Template: String, NewTemplate: Unit, DocumentType: WdNewDocumentType): Document = js.native
  def Add(Template: String, NewTemplate: Unit, DocumentType: WdNewDocumentType, Visible: Boolean): Document = js.native
  def Add(Template: Unit, NewTemplate: Boolean): Document = js.native
  def Add(Template: Unit, NewTemplate: Boolean, DocumentType: Unit, Visible: Boolean): Document = js.native
  def Add(Template: Unit, NewTemplate: Boolean, DocumentType: WdNewDocumentType): Document = js.native
  def Add(Template: Unit, NewTemplate: Boolean, DocumentType: WdNewDocumentType, Visible: Boolean): Document = js.native
  def Add(Template: Unit, NewTemplate: Unit, DocumentType: Unit, Visible: Boolean): Document = js.native
  def Add(Template: Unit, NewTemplate: Unit, DocumentType: WdNewDocumentType): Document = js.native
  def Add(Template: Unit, NewTemplate: Unit, DocumentType: WdNewDocumentType, Visible: Boolean): Document = js.native
  
  /** @param string [PostID=''] */
  def AddBlogDocument(ProviderID: String, PostURL: String, BlogName: String): Document = js.native
  def AddBlogDocument(ProviderID: String, PostURL: String, BlogName: String, PostID: String): Document = js.native
  
  def AddOld(): Document = js.native
  def AddOld(Template: Any): Document = js.native
  def AddOld(Template: Any, NewTemplate: Any): Document = js.native
  def AddOld(Template: Unit, NewTemplate: Any): Document = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def CanCheckOut(FileName: String): Boolean = js.native
  
  def CheckOut(FileName: String): Unit = js.native
  
  def Close(): Unit = js.native
  def Close(SaveChanges: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Any, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Any, OriginalFormat: Unit, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Any, RouteDocument: Any): Unit = js.native
  def Close(SaveChanges: Unit, OriginalFormat: Unit, RouteDocument: Any): Unit = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Item(Index: String): Document = js.native
  def Item(Index: Double): Document = js.native
  
  def Open(
    FileName: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    Visible: js.UndefOr[Any],
    OpenAndRepair: js.UndefOr[Any],
    DocumentDirection: js.UndefOr[Any],
    NoEncodingDialog: js.UndefOr[Any],
    XMLTransform: js.UndefOr[Any]
  ): Document = js.native
  
  def Open2000(
    FileName: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    Visible: js.UndefOr[Any]
  ): Document = js.native
  
  def Open2002(
    FileName: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    Visible: js.UndefOr[Any],
    OpenAndRepair: js.UndefOr[Any],
    DocumentDirection: js.UndefOr[Any],
    NoEncodingDialog: js.UndefOr[Any]
  ): Document = js.native
  
  def OpenNoRepairDialog(
    FileName: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Format: js.UndefOr[Any],
    Encoding: js.UndefOr[Any],
    Visible: js.UndefOr[Any],
    OpenAndRepair: js.UndefOr[Any],
    DocumentDirection: js.UndefOr[Any],
    NoEncodingDialog: js.UndefOr[Any],
    XMLTransform: js.UndefOr[Any]
  ): Document = js.native
  
  def OpenOld(
    FileName: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Format: js.UndefOr[Any]
  ): Document = js.native
  
  val Parent: Any = js.native
  
  def Save(): Unit = js.native
  def Save(NoPrompt: Any): Unit = js.native
  def Save(NoPrompt: Any, OriginalFormat: Any): Unit = js.native
  def Save(NoPrompt: Unit, OriginalFormat: Any): Unit = js.native
  
  /* private */ @JSName("Word.Documents_typekey")
  var WordDotDocuments_typekey: Documents = js.native
}
