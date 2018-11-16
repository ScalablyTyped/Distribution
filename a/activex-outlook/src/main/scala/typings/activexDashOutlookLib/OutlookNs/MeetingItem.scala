package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.MeetingItem")
@js.native
class MeetingItem protected () extends js.Object {
  val Actions: Actions = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  var AutoForwarded: scala.Boolean = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  val Conflicts: Conflicts = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: stdLib.VarDate = js.native
  var DeferredDeliveryTime: stdLib.VarDate = js.native
  var DeleteAfterSubmit: scala.Boolean = js.native
  val DownloadState: OlDownloadState = js.native
  val EntryID: java.lang.String = js.native
  var ExpiryTime: stdLib.VarDate = js.native
  var FlagDueBy: stdLib.VarDate = js.native
  var FlagIcon: OlFlagIcon = js.native
  var FlagRequest: java.lang.String = js.native
  var FlagStatus: OlFlagStatus = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  var Importance: OlImportance = js.native
  val IsConflict: scala.Boolean = js.native
  val IsLatestVersion: scala.Boolean = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: stdLib.VarDate = js.native
  val Links: Links = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  val MeetingWorkspaceURL: java.lang.String = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var OriginatorDeliveryReportRequested: scala.Boolean = js.native
  var `Outlook.MeetingItem_typekey`: MeetingItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  var ReceivedTime: stdLib.VarDate = js.native
  val Recipients: Recipients = js.native
  var ReminderSet: scala.Boolean = js.native
  var ReminderTime: stdLib.VarDate = js.native
  val ReplyRecipients: Recipients = js.native
  val RetentionExpirationDate: stdLib.VarDate = js.native
  val RetentionPolicyName: java.lang.String = js.native
  var SaveSentMessageFolder: Folder = js.native
  val Saved: scala.Boolean = js.native
  var SendUsingAccount: Account = js.native
  val SenderEmailAddress: java.lang.String = js.native
  val SenderEmailType: java.lang.String = js.native
  val SenderName: java.lang.String = js.native
  var Sensitivity: OlSensitivity = js.native
  val Sent: scala.Boolean = js.native
  val SentOn: stdLib.VarDate = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Subject: java.lang.String = js.native
  val Submitted: scala.Boolean = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def Forward(): MeetingItem = js.native
  def GetAssociatedAppointment(AddToCalendar: scala.Boolean): AppointmentItem = js.native
  def GetConversation(): Conversation = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Reply(): MailItem = js.native
  def ReplyAll(): MailItem = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def Send(): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
}

