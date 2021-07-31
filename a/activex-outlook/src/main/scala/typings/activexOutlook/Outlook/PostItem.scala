package typings.activexOutlook.Outlook

import typings.std.VarDate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostItem extends StObject {
  
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Body: String = js.native
  
  var BodyFormat: OlBodyFormat = js.native
  
  var Categories: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearConversationIndex(): Unit = js.native
  
  def ClearTaskFlag(): Unit = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val Conflicts: typings.activexOutlook.Outlook.Conflicts = js.native
  
  val ConversationID: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): js.Any = js.native
  
  val CreationTime: VarDate = js.native
  
  def Delete(): Unit = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  val EntryID: String = js.native
  
  var ExpiryTime: VarDate = js.native
  
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  
  def Forward(): MailItem = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  var HTMLBody: String = js.native
  
  var Importance: OlImportance = js.native
  
  var InternetCodepage: Double = js.native
  
  val IsConflict: Boolean = js.native
  
  val IsMarkedAsTask: Boolean = js.native
  
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  
  val LastModificationTime: VarDate = js.native
  
  val Links: typings.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: js.Any = js.native
  
  def MarkAsTask(MarkInterval: OlMarkInterval): Unit = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  var Mileage: String = js.native
  
  def Move(DestFldr: Folder): js.Any = js.native
  
  var NoAging: Boolean = js.native
  
  @JSName("Outlook.PostItem_typekey")
  var OutlookDotPostItem_typekey: PostItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  val Parent: js.Any = js.native
  
  def Post(): Unit = js.native
  
  def PrintOut(): Unit = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: js.Any = js.native
  
  val ReceivedTime: VarDate = js.native
  
  var ReminderOverrideDefault: Boolean = js.native
  
  var ReminderPlaySound: Boolean = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderSoundFile: String = js.native
  
  var ReminderTime: VarDate = js.native
  
  def Reply(): MailItem = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  
  val Saved: Boolean = js.native
  
  val SenderEmailAddress: String = js.native
  
  val SenderEmailType: String = js.native
  
  val SenderName: String = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val SentOn: VarDate = js.native
  
  val Session: NameSpace = js.native
  
  def SetACLs(): Boolean = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  val Size: Double = js.native
  
  var Subject: String = js.native
  
  var TaskCompletedDate: VarDate = js.native
  
  var TaskDueDate: VarDate = js.native
  
  var TaskStartDate: VarDate = js.native
  
  var TaskSubject: String = js.native
  
  var ToDoTaskOrdinal: VarDate = js.native
  
  var UnRead: Boolean = js.native
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
}
