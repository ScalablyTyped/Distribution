package typings.activexDashWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Documents")
@js.native
class Documents protected () extends js.Object {
  val Application: typings.activexDashWord.Word.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  val Parent: js.Any = js.native
  @JSName("Word.Documents_typekey")
  var WordDotDocuments_typekey: Documents = js.native
  def Add(): Document = js.native
  def Add(Template: String): Document = js.native
  def Add(Template: String, NewTemplate: Boolean): Document = js.native
  def Add(Template: String, NewTemplate: Boolean, DocumentType: WdNewDocumentType): Document = js.native
  def Add(Template: String, NewTemplate: Boolean, DocumentType: WdNewDocumentType, Visible: Boolean): Document = js.native
  /** @param string [PostID=''] */
  def AddBlogDocument(ProviderID: String, PostURL: String, BlogName: String): Document = js.native
  def AddBlogDocument(ProviderID: String, PostURL: String, BlogName: String, PostID: String): Document = js.native
  def AddOld(): Document = js.native
  def AddOld(Template: js.Any): Document = js.native
  def AddOld(Template: js.Any, NewTemplate: js.Any): Document = js.native
  def CanCheckOut(FileName: String): Boolean = js.native
  def CheckOut(FileName: String): Unit = js.native
  def Close(): Unit = js.native
  def Close(SaveChanges: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any): Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any, RouteDocument: js.Any): Unit = js.native
  def Item(Index: String): Document = js.native
  def Item(Index: Double): Document = js.native
  def Open(
    FileName: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    Visible: js.UndefOr[js.Any],
    OpenAndRepair: js.UndefOr[js.Any],
    DocumentDirection: js.UndefOr[js.Any],
    NoEncodingDialog: js.UndefOr[js.Any],
    XMLTransform: js.UndefOr[js.Any]
  ): Document = js.native
  def Open2000(
    FileName: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    Visible: js.UndefOr[js.Any]
  ): Document = js.native
  def Open2002(
    FileName: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    Visible: js.UndefOr[js.Any],
    OpenAndRepair: js.UndefOr[js.Any],
    DocumentDirection: js.UndefOr[js.Any],
    NoEncodingDialog: js.UndefOr[js.Any]
  ): Document = js.native
  def OpenNoRepairDialog(
    FileName: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any],
    Encoding: js.UndefOr[js.Any],
    Visible: js.UndefOr[js.Any],
    OpenAndRepair: js.UndefOr[js.Any],
    DocumentDirection: js.UndefOr[js.Any],
    NoEncodingDialog: js.UndefOr[js.Any],
    XMLTransform: js.UndefOr[js.Any]
  ): Document = js.native
  def OpenOld(
    FileName: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Format: js.UndefOr[js.Any]
  ): Document = js.native
  def Save(): Unit = js.native
  def Save(NoPrompt: js.Any): Unit = js.native
  def Save(NoPrompt: js.Any, OriginalFormat: js.Any): Unit = js.native
}

