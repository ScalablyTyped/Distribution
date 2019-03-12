package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.MailMerge")
@js.native
class MailMerge protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  val DataSource: MailMergeDataSource = js.native
  var Destination: WdMailMergeDestination = js.native
  val Fields: MailMergeFields = js.native
  var HighlightMergeFields: scala.Boolean = js.native
  var MailAddressFieldName: java.lang.String = js.native
  var MailAsAttachment: scala.Boolean = js.native
  var MailFormat: WdMailMergeMailFormat = js.native
  var MailSubject: java.lang.String = js.native
  var MainDocumentType: WdMailMergeMainDocType = js.native
  val Parent: js.Any = js.native
  var ShowSendToCustom: java.lang.String = js.native
  val State: WdMailMergeState = js.native
  var SuppressBlankLines: scala.Boolean = js.native
  var ViewMailMergeFieldCodes: scala.Double = js.native
  var WizardState: scala.Double = js.native
  var `Word.MailMerge_typekey`: MailMerge = js.native
  def Check(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def CreateHeaderSource(Name: java.lang.String): scala.Unit = js.native
  def CreateHeaderSource(Name: java.lang.String, PasswordDocument: js.Any): scala.Unit = js.native
  def CreateHeaderSource(Name: java.lang.String, PasswordDocument: js.Any, WritePasswordDocument: js.Any): scala.Unit = js.native
  def CreateHeaderSource(
    Name: java.lang.String,
    PasswordDocument: js.Any,
    WritePasswordDocument: js.Any,
    HeaderRecord: js.Any
  ): scala.Unit = js.native
  def EditDataSource(): scala.Unit = js.native
  def EditHeaderSource(): scala.Unit = js.native
  def EditMainDocument(): scala.Unit = js.native
  def Execute(): scala.Unit = js.native
  def Execute(Pause: js.Any): scala.Unit = js.native
  def OpenDataSource(
    Name: java.lang.String,
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
  ): scala.Unit = js.native
  def OpenDataSource2000(
    Name: java.lang.String,
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
  ): scala.Unit = js.native
  def OpenHeaderSource(
    Name: java.lang.String,
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
  ): scala.Unit = js.native
  def OpenHeaderSource2000(
    Name: java.lang.String,
    Format: js.UndefOr[js.Any],
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    AddToRecentFiles: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def ShowWizard(
    InitialState: js.Any,
    ShowDocumentStep: js.UndefOr[js.Any],
    ShowTemplateStep: js.UndefOr[js.Any],
    ShowDataStep: js.UndefOr[js.Any],
    ShowWriteStep: js.UndefOr[js.Any],
    ShowPreviewStep: js.UndefOr[js.Any],
    ShowMergeStep: js.UndefOr[js.Any]
  ): scala.Unit = js.native
  def UseAddressBook(Type: java.lang.String): scala.Unit = js.native
}

