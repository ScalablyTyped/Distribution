package typings.activexDashOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AppointmentItem")
@js.native
class AppointmentItem protected () extends js.Object {
  val Actions: typings.activexDashOutlook.Outlook.Actions = js.native
  var AllDayEvent: Boolean = js.native
  val Application: typings.activexDashOutlook.Outlook.Application = js.native
  val Attachments: typings.activexDashOutlook.Outlook.Attachments = js.native
  val AutoResolvedWinner: Boolean = js.native
  var BillingInformation: String = js.native
  var Body: String = js.native
  var BusyStatus: OlBusyStatus = js.native
  var Categories: String = js.native
  val Class: OlObjectClass = js.native
  var Companies: String = js.native
  var ConferenceServerAllowExternal: Boolean = js.native
  var ConferenceServerPassword: String = js.native
  val Conflicts: typings.activexDashOutlook.Outlook.Conflicts = js.native
  val ConversationID: String = js.native
  val ConversationIndex: String = js.native
  val ConversationTopic: String = js.native
  val CreationTime: VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  var Duration: Double = js.native
  var End: VarDate = js.native
  var EndInEndTimeZone: VarDate = js.native
  var EndTimeZone: TimeZone = js.native
  var EndUTC: VarDate = js.native
  val EntryID: String = js.native
  var ForceUpdateToAllAttendees: Boolean = js.native
  val FormDescription: typings.activexDashOutlook.Outlook.FormDescription = js.native
  val GetInspector: Inspector = js.native
  val GlobalAppointmentID: String = js.native
  var Importance: OlImportance = js.native
  var InternetCodepage: Double = js.native
  val IsConflict: Boolean = js.native
  var IsOnlineMeeting: Boolean = js.native
  val IsRecurring: Boolean = js.native
  val ItemProperties: typings.activexDashOutlook.Outlook.ItemProperties = js.native
  val LastModificationTime: VarDate = js.native
  val Links: typings.activexDashOutlook.Outlook.Links = js.native
  var Location: String = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MeetingStatus: OlMeetingStatus = js.native
  val MeetingWorkspaceURL: String = js.native
  var MessageClass: String = js.native
  var Mileage: String = js.native
  var NetMeetingAutoStart: Boolean = js.native
  var NetMeetingDocPathName: String = js.native
  var NetMeetingOrganizerAlias: String = js.native
  var NetMeetingServer: String = js.native
  var NetMeetingType: OlNetMeetingType = js.native
  var NetShowURL: String = js.native
  var NoAging: Boolean = js.native
  var OptionalAttendees: String = js.native
  val Organizer: String = js.native
  @JSName("Outlook.AppointmentItem_typekey")
  var OutlookDotAppointmentItem_typekey: AppointmentItem = js.native
  val OutlookInternalVersion: Double = js.native
  val OutlookVersion: String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: typings.activexDashOutlook.Outlook.PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val Recipients: typings.activexDashOutlook.Outlook.Recipients = js.native
  val RecurrenceState: OlRecurrenceState = js.native
  var ReminderMinutesBeforeStart: Double = js.native
  var ReminderOverrideDefault: Boolean = js.native
  var ReminderPlaySound: Boolean = js.native
  var ReminderSet: Boolean = js.native
  var ReminderSoundFile: String = js.native
  var ReplyTime: VarDate = js.native
  var RequiredAttendees: String = js.native
  var Resources: String = js.native
  var ResponseRequested: Boolean = js.native
  val ResponseStatus: OlResponseStatus = js.native
  val Saved: Boolean = js.native
  var SendUsingAccount: Account = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: Double = js.native
  var Start: VarDate = js.native
  var StartInStartTimeZone: VarDate = js.native
  var StartTimeZone: TimeZone = js.native
  var StartUTC: VarDate = js.native
  var Subject: String = js.native
  var UnRead: Boolean = js.native
  val UserProperties: typings.activexDashOutlook.Outlook.UserProperties = js.native
  def ClearRecurrencePattern(): Unit = js.native
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  def Copy(): js.Any = js.native
  def CopyTo(DestinationFolder: Folder, CopyOptions: OlAppointmentCopyOptions): AppointmentItem = js.native
  def Delete(): Unit = js.native
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  def ForwardAsVcal(): MailItem = js.native
  def GetConversation(): Conversation = js.native
  def GetOrganizer(): AddressEntry = js.native
  def GetRecurrencePattern(): RecurrencePattern = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): Unit = js.native
  def Respond(Response: OlMeetingResponse): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: js.Any): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: js.Any, fAdditionalTextDialog: js.Any): MeetingItem = js.native
  def Save(): Unit = js.native
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  def Send(): Unit = js.native
  def ShowCategoriesDialog(): Unit = js.native
}

