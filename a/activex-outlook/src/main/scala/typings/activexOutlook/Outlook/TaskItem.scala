package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskItem extends js.Object {
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  var ActualWork: Double = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var CardData: String = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  var Complete: Boolean = js.native
  val Conflicts: typings.activexOutlook.Outlook.Conflicts = js.native
  var ContactNames: String = js.native
  var Contacts: String = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  var DateCompleted: VarDate = js.native
  val DelegationState: OlTaskDelegationState = js.native
  val Delegator: String = js.native
  val DownloadState: OlDownloadState = js.native
  var DueDate: VarDate = js.native
  val EntryID: String = js.native
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  var InternetCodepage: Double = js.native
  val IsConflict: Boolean = js.native
  val IsRecurring: Boolean = js.native
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typings.activexOutlook.Outlook.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  var Ordinal: Double = js.native
  @JSName("Outlook.TaskItem_typekey")
  var OutlookDotTaskItem_typekey: TaskItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  var Owner: String = js.native
  val Ownership: OlTaskOwnership = js.native
  val Parent: js.Any = js.native
  var PercentComplete: Double = js.native
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val Recipients: typings.activexOutlook.Outlook.Recipients = js.native
  var ReminderOverrideDefault: Boolean = js.native
  var ReminderPlaySound: Boolean = js.native
  var ReminderSet: Boolean = js.native
  var ReminderSoundFile: String = js.native
  var ReminderTime: VarDate = js.native
  val ResponseState: OlTaskResponse = js.native
  var Role: String = js.native
  val Saved: Boolean = js.native
  var SchedulePlusPriority: String = js.native
  var SendUsingAccount: Account = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var StartDate: VarDate = js.native
  var Status: OlTaskStatus = js.native
  var StatusOnCompletionRecipients: String = js.native
  var StatusUpdateRecipients: String = js.native
  var Subject: String = js.native
  var TeamTask: Boolean = js.native
  var ToDoTaskOrdinal: VarDate = js.native
  var TotalWork: Double = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
  def Assign(): TaskItem = js.native
  def CancelResponseState(): Unit = js.native
  def ClearRecurrencePattern(): Unit = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def GetConversation(): Conversation = js.native
  def GetRecurrencePattern(): RecurrencePattern = js.native
  def MarkComplete(): Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Respond(Response: OlTaskResponse, fNoUI: js.Any, fAdditionalTextDialog: js.Any): TaskItem = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def Send(): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
  def SkipRecurrence(): Boolean = js.native
  def StatusReport(): js.Any = js.native
}

