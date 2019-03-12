package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Documents")
@js.native
class Documents protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  val Parent: js.Any = js.native
  var `Word.Documents_typekey`: Documents = js.native
  def Add(): Document = js.native
  def Add(Template: java.lang.String): Document = js.native
  def Add(Template: java.lang.String, NewTemplate: scala.Boolean): Document = js.native
  def Add(Template: java.lang.String, NewTemplate: scala.Boolean, DocumentType: WdNewDocumentType): Document = js.native
  def Add(
    Template: java.lang.String,
    NewTemplate: scala.Boolean,
    DocumentType: WdNewDocumentType,
    Visible: scala.Boolean
  ): Document = js.native
  /** @param string [PostID=''] */
  def AddBlogDocument(ProviderID: java.lang.String, PostURL: java.lang.String, BlogName: java.lang.String): Document = js.native
  def AddBlogDocument(
    ProviderID: java.lang.String,
    PostURL: java.lang.String,
    BlogName: java.lang.String,
    PostID: java.lang.String
  ): Document = js.native
  def AddOld(): Document = js.native
  def AddOld(Template: js.Any): Document = js.native
  def AddOld(Template: js.Any, NewTemplate: js.Any): Document = js.native
  def CanCheckOut(FileName: java.lang.String): scala.Boolean = js.native
  def CheckOut(FileName: java.lang.String): scala.Unit = js.native
  def Close(): scala.Unit = js.native
  def Close(SaveChanges: js.Any): scala.Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any): scala.Unit = js.native
  def Close(SaveChanges: js.Any, OriginalFormat: js.Any, RouteDocument: js.Any): scala.Unit = js.native
  def Item(Index: java.lang.String): Document = js.native
  def Item(Index: scala.Double): Document = js.native
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
  def Save(): scala.Unit = js.native
  def Save(NoPrompt: js.Any): scala.Unit = js.native
  def Save(NoPrompt: js.Any, OriginalFormat: js.Any): scala.Unit = js.native
}

