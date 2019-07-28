package typings.activexDashOutlook.OutlookNs

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.MeetingItem")
@js.native
class MeetingItem protected () extends js.Object {
  val Actions: typings.activexDashOutlook.OutlookNs.Actions = js.native
  val Application: typings.activexDashOutlook.OutlookNs.Application = js.native
  val Attachments: typings.activexDashOutlook.OutlookNs.Attachments = js.native
  var AutoForwarded: Boolean = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  val Conflicts: typings.activexDashOutlook.OutlookNs.Conflicts = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  var DeferredDeliveryTime: VarDate = js.native
  var DeleteAfterSubmit: Boolean = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: String = js.native
  var ExpiryTime: VarDate = js.native
  var FlagDueBy: VarDate = js.native
  var FlagIcon: OlFlagIcon = js.native
  var FlagRequest: String = js.native
  var FlagStatus: OlFlagStatus = js.native
  val FormDescription: typings.activexDashOutlook.OutlookNs.FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: Boolean = js.native
  val IsLatestVersion: Boolean = js.native
  val ItemProperties: typings.activexDashOutlook.OutlookNs.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typings.activexDashOutlook.OutlookNs.Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  val MeetingWorkspaceURL: String = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NoAging: Boolean = js.native
  var OriginatorDeliveryReportRequested: Boolean = js.native
  var `Outlook.MeetingItem_typekey`: MeetingItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexDashOutlook.OutlookNs.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  var ReceivedTime: VarDate = js.native
  val Recipients: typings.activexDashOutlook.OutlookNs.Recipients = js.native
  var ReminderSet: Boolean = js.native
  var ReminderTime: VarDate = js.native
  val ReplyRecipients: typings.activexDashOutlook.OutlookNs.Recipients = js.native
  val RetentionExpirationDate: VarDate = js.native
  val RetentionPolicyName: String = js.native
  var SaveSentMessageFolder: Folder = js.native
  val Saved: Boolean = js.native
  var SendUsingAccount: Account = js.native
  val SenderEmailAddress: String = js.native
  val SenderEmailType: String = js.native
  val SenderName: String = js.native
  var Sensitivity: OlSensitivity = js.native
  val Sent: Boolean = js.native
  val SentOn: VarDate = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Subject: String = js.native
  val Submitted: Boolean = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typings.activexDashOutlook.OutlookNs.UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def Forward(): MeetingItem = js.native
  def GetAssociatedAppointment(AddToCalendar: Boolean): AppointmentItem = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Reply(): MailItem = js.native
  def ReplyAll(): MailItem = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def Send(): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
}

