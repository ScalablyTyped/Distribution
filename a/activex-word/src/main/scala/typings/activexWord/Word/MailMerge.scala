package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailMerge extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def Check(): Unit = js.native
  
  def CreateDataSource(
    Name: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    HeaderRecord: js.UndefOr[Any],
    MSQuery: js.UndefOr[Any],
    SQLStatement: js.UndefOr[Any],
    SQLStatement1: js.UndefOr[Any],
    Connection: js.UndefOr[Any],
    LinkToSource: js.UndefOr[Any]
  ): Unit = js.native
  
  def CreateHeaderSource(Name: String): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Any, WritePasswordDocument: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Any, WritePasswordDocument: Any, HeaderRecord: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Any, WritePasswordDocument: Unit, HeaderRecord: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Unit, WritePasswordDocument: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Unit, WritePasswordDocument: Any, HeaderRecord: Any): Unit = js.native
  def CreateHeaderSource(Name: String, PasswordDocument: Unit, WritePasswordDocument: Unit, HeaderRecord: Any): Unit = js.native
  
  val Creator: Double = js.native
  
  val DataSource: MailMergeDataSource = js.native
  
  var Destination: WdMailMergeDestination = js.native
  
  def EditDataSource(): Unit = js.native
  
  def EditHeaderSource(): Unit = js.native
  
  def EditMainDocument(): Unit = js.native
  
  def Execute(): Unit = js.native
  def Execute(Pause: Any): Unit = js.native
  
  val Fields: MailMergeFields = js.native
  
  var HighlightMergeFields: Boolean = js.native
  
  var MailAddressFieldName: String = js.native
  
  var MailAsAttachment: Boolean = js.native
  
  var MailFormat: WdMailMergeMailFormat = js.native
  
  var MailSubject: String = js.native
  
  var MainDocumentType: WdMailMergeMainDocType = js.native
  
  def OpenDataSource(
    Name: String,
    Format: js.UndefOr[Any],
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    LinkToSource: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Connection: js.UndefOr[Any],
    SQLStatement: js.UndefOr[Any],
    SQLStatement1: js.UndefOr[Any],
    OpenExclusive: js.UndefOr[Any],
    SubType: js.UndefOr[Any]
  ): Unit = js.native
  
  def OpenDataSource2000(
    Name: String,
    Format: js.UndefOr[Any],
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    LinkToSource: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    Connection: js.UndefOr[Any],
    SQLStatement: js.UndefOr[Any],
    SQLStatement1: js.UndefOr[Any]
  ): Unit = js.native
  
  def OpenHeaderSource(
    Name: String,
    Format: js.UndefOr[Any],
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any],
    OpenExclusive: js.UndefOr[Any]
  ): Unit = js.native
  
  def OpenHeaderSource2000(
    Name: String,
    Format: js.UndefOr[Any],
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    AddToRecentFiles: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any]
  ): Unit = js.native
  
  val Parent: Any = js.native
  
  var ShowSendToCustom: String = js.native
  
  def ShowWizard(
    InitialState: Any,
    ShowDocumentStep: js.UndefOr[Any],
    ShowTemplateStep: js.UndefOr[Any],
    ShowDataStep: js.UndefOr[Any],
    ShowWriteStep: js.UndefOr[Any],
    ShowPreviewStep: js.UndefOr[Any],
    ShowMergeStep: js.UndefOr[Any]
  ): Unit = js.native
  
  val State: WdMailMergeState = js.native
  
  var SuppressBlankLines: Boolean = js.native
  
  def UseAddressBook(Type: String): Unit = js.native
  
  var ViewMailMergeFieldCodes: Double = js.native
  
  var WizardState: Double = js.native
  
  /* private */ @JSName("Word.MailMerge_typekey")
  var WordDotMailMerge_typekey: MailMerge = js.native
}
