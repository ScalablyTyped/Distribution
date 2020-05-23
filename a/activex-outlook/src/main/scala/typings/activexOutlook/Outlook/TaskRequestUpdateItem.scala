package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TaskRequestUpdateItem extends js.Object {
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  val Application: typings.activexOutlook.Outlook.Application = js.native
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  val Conflicts: typings.activexOutlook.Outlook.Conflicts = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: String = js.native
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: Boolean = js.native
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typings.activexOutlook.Outlook.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  @JSName("Outlook.TaskRequestUpdateItem_typekey")
  var OutlookDotTaskRequestUpdateItem_typekey: TaskRequestUpdateItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val Saved: Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def GetAssociatedTask(AddToTaskList: Boolean): TaskItem = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
}

