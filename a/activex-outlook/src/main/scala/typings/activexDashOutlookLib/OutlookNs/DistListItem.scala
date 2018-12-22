package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.DistListItem")
@js.native
class DistListItem protected () extends js.Object {
  val Actions: Actions = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val CheckSum: scala.Double = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  val Conflicts: Conflicts = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: activexDashInteropLib.VarDate = js.native
  var DLName: java.lang.String = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: java.lang.String = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: scala.Boolean = js.native
  val IsMarkedAsTask: scala.Boolean = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: activexDashInteropLib.VarDate = js.native
  val Links: Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  val MemberCount: scala.Double = js.native
  var Members: js.Any = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var OneOffMembers: js.Any = js.native
  var `Outlook.DistListItem_typekey`: DistListItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  var ReminderOverrideDefault: scala.Boolean = js.native
  var ReminderPlaySound: scala.Boolean = js.native
  var ReminderSet: scala.Boolean = js.native
  var ReminderSoundFile: java.lang.String = js.native
  var ReminderTime: activexDashInteropLib.VarDate = js.native
  val Saved: scala.Boolean = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Subject: java.lang.String = js.native
  var TaskCompletedDate: activexDashInteropLib.VarDate = js.native
  var TaskDueDate: activexDashInteropLib.VarDate = js.native
  var TaskStartDate: activexDashInteropLib.VarDate = js.native
  var TaskSubject: java.lang.String = js.native
  var ToDoTaskOrdinal: activexDashInteropLib.VarDate = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def AddMember(Recipient: Recipient): scala.Unit = js.native
  def AddMembers(Recipients: Recipients): scala.Unit = js.native
  def ClearTaskFlag(): scala.Unit = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def GetConversation(): Conversation = js.native
  def GetMember(Index: scala.Double): Recipient = js.native
  def MarkAsTask(MarkInterval: OlMarkInterval): scala.Unit = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def RemoveMember(Recipient: Recipient): scala.Unit = js.native
  def RemoveMembers(Recipients: Recipients): scala.Unit = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
}

