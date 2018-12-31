package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.Application")
@js.native
class Application protected () extends js.Object {
  val AnswerWizard: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.AnswerWizard */ js.Any = js.native
  val Application: Application = js.native
  val Assistance: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.IAssistance */ js.Any = js.native
  val Assistant: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.Assistant */ js.Any = js.native
  val COMAddIns: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.COMAddIns */ js.Any = js.native
  val Class: OlObjectClass = js.native
  val DefaultProfileName: java.lang.String = js.native
  val Explorers: Explorers = js.native
  var FeatureInstall: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.MsoFeatureInstall */ js.Any = js.native
  val Inspectors: Inspectors = js.native
  val IsTrusted: scala.Boolean = js.native
  val LanguageSettings: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.LanguageSettings */ js.Any = js.native
  val Name: java.lang.String = js.native
  var `Outlook.Application_typekey`: Application = js.native
  val Parent: js.Any = js.native
  val PickerDialog: /* import warning: QualifyReferences.resolveTypeRef Couldn't qualify Office.PickerDialog */ js.Any = js.native
  val ProductCode: java.lang.String = js.native
  val Reminders: Reminders = js.native
  val Session: NameSpace = js.native
  val TimeZones: TimeZones = js.native
  val Version: java.lang.String = js.native
  def ActiveExplorer(): Explorer = js.native
  def ActiveInspector(): Inspector = js.native
  def ActiveWindow(): js.Any = js.native
  def AdvancedSearch(Scope: java.lang.String): Search = js.native
  def AdvancedSearch(Scope: java.lang.String, Filter: js.Any): Search = js.native
  def AdvancedSearch(Scope: java.lang.String, Filter: js.Any, SearchSubFolders: js.Any): Search = js.native
  def AdvancedSearch(Scope: java.lang.String, Filter: js.Any, SearchSubFolders: js.Any, Tag: js.Any): Search = js.native
  def CopyFile(FilePath: java.lang.String, DestFolderPath: java.lang.String): js.Any = js.native
  def CreateItem(ItemType: OlItemType): ContactItem = js.native
  def CreateItemFromTemplate(TemplatePath: java.lang.String): js.Any = js.native
  def CreateItemFromTemplate(TemplatePath: java.lang.String, InFolder: js.Any): js.Any = js.native
  @JSName("CreateItem")
  def CreateItem_AppointmentItem(ItemType: OlItemType): AppointmentItem = js.native
  @JSName("CreateItem")
  def CreateItem_DistListItem(ItemType: OlItemType): DistListItem = js.native
  @JSName("CreateItem")
  def CreateItem_JournalItem(ItemType: OlItemType): JournalItem = js.native
  @JSName("CreateItem")
  def CreateItem_MailItem(ItemType: OlItemType): MailItem = js.native
  @JSName("CreateItem")
  def CreateItem_MobileItem(ItemType: OlItemType): MobileItem = js.native
  @JSName("CreateItem")
  def CreateItem_NoteItem(ItemType: OlItemType): NoteItem = js.native
  @JSName("CreateItem")
  def CreateItem_PostItem(ItemType: OlItemType): PostItem = js.native
  @JSName("CreateItem")
  def CreateItem_TaskItem(ItemType: OlItemType): TaskItem = js.native
  def CreateObject(ObjectName: java.lang.String): js.Any = js.native
  def GetNamespace(Type: java.lang.String): NameSpace = js.native
  def GetNewNickNames(pvar: js.Any): scala.Unit = js.native
  def GetObjectReference(Item: js.Any, ReferenceType: OlReferenceType): js.Any = js.native
  def IsSearchSynchronous(LookInFolders: java.lang.String): scala.Boolean = js.native
  def Quit(): scala.Unit = js.native
  def RefreshFormRegionDefinition(RegionName: java.lang.String): scala.Unit = js.native
}

