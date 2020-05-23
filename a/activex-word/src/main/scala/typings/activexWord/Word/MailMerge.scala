package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MailMerge extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val DataSource: MailMergeDataSource = js.native
  var Destination: WdMailMergeDestination = js.native
  val Fields: MailMergeFields = js.native
  var HighlightMergeFields: Boolean = js.native
  var MailAddressFieldName: String = js.native
  var MailAsAttachment: Boolean = js.native
  var MailFormat: WdMailMergeMailFormat = js.native
  var MailSubject: String = js.native
  var MainDocumentType: WdMailMergeMainDocType = js.native
  val Parent: js.Any = js.native
  var ShowSendToCustom: String = js.native
  val State: WdMailMergeState = js.native
  var SuppressBlankLines: Boolean = js.native
  var ViewMailMergeFieldCodes: Double = js.native
  var WizardState: Double = js.native
  @JSName("Word.MailMerge_typekey")
  var WordDotMailMerge_typekey: MailMerge = js.native
  def Check(): Unit = js.native
  def CreateDataSource(
    Name: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    HeaderRecord: js.UndefOr[js.Any],
    MSQuery: js.UndefOr[js.Any],
    SQLStatement: js.UndefOr[js.Any],
    SQLStatement1: js.UndefOr[js.Any],
    Connection: js.UndefOr[js.Any],
    LinkToSource: js.UndefOr[js.Any]
  ): Unit = js.native
  def CreateHeaderSource(Name: String): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: js.Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: js.Any, WritePasswordDocument: js.Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: js.Any, WritePasswordDocument: js.Any, HeaderRecord: js.Any): Unit = js.native
  def EditDataSource(): Unit = js.native
  def EditHeaderSource(): Unit = js.native
  def EditMainDocument(): Unit = js.native
  def Execute(): Unit = js.native
  def Execute(Pause: js.Any): Unit = js.native
  def OpenDataSource(
    Name: String,
    Format: js.UndefOr[js.Any],
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    LinkToSource: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Connection: js.UndefOr[js.Any],
    SQLStatement: js.UndefOr[js.Any],
    SQLStatement1: js.UndefOr[js.Any],
    OpenExclusive: js.UndefOr[js.Any],
    SubType: js.UndefOr[js.Any]
  ): Unit = js.native
  def OpenDataSource2000(
    Name: String,
    Format: js.UndefOr[js.Any],
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    LinkToSource: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    Connection: js.UndefOr[js.Any],
    SQLStatement: js.UndefOr[js.Any],
    SQLStatement1: js.UndefOr[js.Any]
  ): Unit = js.native
  def OpenHeaderSource(
    Name: String,
    Format: js.UndefOr[js.Any],
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any],
    OpenExclusive: js.UndefOr[js.Any]
  ): Unit = js.native
  def OpenHeaderSource2000(
    Name: String,
    Format: js.UndefOr[js.Any],
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any]
  ): Unit = js.native
  def ShowWizard(
    InitialState: js.Any,
    ShowDocumentStep: js.UndefOr[js.Any],
    ShowTemplateStep: js.UndefOr[js.Any],
    ShowDataStep: js.UndefOr[js.Any],
    ShowWriteStep: js.UndefOr[js.Any],
    ShowPreviewStep: js.UndefOr[js.Any],
    ShowMergeStep: js.UndefOr[js.Any]
  ): Unit = js.native
  def UseAddressBook(Type: String): Unit = js.native
}

