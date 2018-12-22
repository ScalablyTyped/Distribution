package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Outlook.AppointmentItem")
@js.native
class AppointmentItem protected () extends js.Object {
  val Actions: Actions = js.native
  var AllDayEvent: scala.Boolean = js.native
  val Application: Application = js.native
  val Attachments: Attachments = js.native
  val AutoResolvedWinner: scala.Boolean = js.native
  var BillingInformation: java.lang.String = js.native
  var Body: java.lang.String = js.native
  var BusyStatus: OlBusyStatus = js.native
  var Categories: java.lang.String = js.native
  val Class: OlObjectClass = js.native
  var Companies: java.lang.String = js.native
  var ConferenceServerAllowExternal: scala.Boolean = js.native
  var ConferenceServerPassword: java.lang.String = js.native
  val Conflicts: Conflicts = js.native
  val ConversationID: java.lang.String = js.native
  val ConversationIndex: java.lang.String = js.native
  val ConversationTopic: java.lang.String = js.native
  val CreationTime: activexDashInteropLib.VarDate = js.native
  val DownloadState: OlDownloadState = js.native
  var Duration: scala.Double = js.native
  var End: activexDashInteropLib.VarDate = js.native
  var EndInEndTimeZone: activexDashInteropLib.VarDate = js.native
  var EndTimeZone: TimeZone = js.native
  var EndUTC: activexDashInteropLib.VarDate = js.native
  val EntryID: java.lang.String = js.native
  var ForceUpdateToAllAttendees: scala.Boolean = js.native
  val FormDescription: FormDescription = js.native
  val GetInspector: Inspector = js.native
  val GlobalAppointmentID: java.lang.String = js.native
  var Importance: OlImportance = js.native
  var InternetCodepage: scala.Double = js.native
  val IsConflict: scala.Boolean = js.native
  var IsOnlineMeeting: scala.Boolean = js.native
  val IsRecurring: scala.Boolean = js.native
  val ItemProperties: ItemProperties = js.native
  val LastModificationTime: activexDashInteropLib.VarDate = js.native
  val Links: Links = js.native
  var Location: java.lang.String = js.native
  val MAPIOBJECT: js.Any = js.native
  var MarkForDownload: OlRemoteStatus = js.native
  var MeetingStatus: OlMeetingStatus = js.native
  val MeetingWorkspaceURL: java.lang.String = js.native
  var MessageClass: java.lang.String = js.native
  var Mileage: java.lang.String = js.native
  var NetMeetingAutoStart: scala.Boolean = js.native
  var NetMeetingDocPathName: java.lang.String = js.native
  var NetMeetingOrganizerAlias: java.lang.String = js.native
  var NetMeetingServer: java.lang.String = js.native
  var NetMeetingType: OlNetMeetingType = js.native
  var NetShowURL: java.lang.String = js.native
  var NoAging: scala.Boolean = js.native
  var OptionalAttendees: java.lang.String = js.native
  val Organizer: java.lang.String = js.native
  var `Outlook.AppointmentItem_typekey`: AppointmentItem = js.native
  val OutlookInternalVersion: scala.Double = js.native
  val OutlookVersion: java.lang.String = js.native
  val Parent: js.Any = js.native
  val PropertyAccessor: PropertyAccessor = js.native
  var RTFBody: js.Any = js.native
  val Recipients: Recipients = js.native
  val RecurrenceState: OlRecurrenceState = js.native
  var ReminderMinutesBeforeStart: scala.Double = js.native
  var ReminderOverrideDefault: scala.Boolean = js.native
  var ReminderPlaySound: scala.Boolean = js.native
  var ReminderSet: scala.Boolean = js.native
  var ReminderSoundFile: java.lang.String = js.native
  var ReplyTime: activexDashInteropLib.VarDate = js.native
  var RequiredAttendees: java.lang.String = js.native
  var Resources: java.lang.String = js.native
  var ResponseRequested: scala.Boolean = js.native
  val ResponseStatus: OlResponseStatus = js.native
  val Saved: scala.Boolean = js.native
  var SendUsingAccount: Account = js.native
  var Sensitivity: OlSensitivity = js.native
  val Session: NameSpace = js.native
  val Size: scala.Double = js.native
  var Start: activexDashInteropLib.VarDate = js.native
  var StartInStartTimeZone: activexDashInteropLib.VarDate = js.native
  var StartTimeZone: TimeZone = js.native
  var StartUTC: activexDashInteropLib.VarDate = js.native
  var Subject: java.lang.String = js.native
  var UnRead: scala.Boolean = js.native
  val UserProperties: UserProperties = js.native
  def ClearRecurrencePattern(): scala.Unit = js.native
  def Close(SaveMode: OlInspectorClose): scala.Unit = js.native
  def Copy(): js.Any = js.native
  def CopyTo(DestinationFolder: Folder, CopyOptions: OlAppointmentCopyOptions): AppointmentItem = js.native
  def Delete(): scala.Unit = js.native
  def Display(): scala.Unit = js.native
  def Display(Modal: js.Any): scala.Unit = js.native
  def ForwardAsVcal(): MailItem = js.native
  def GetConversation(): Conversation = js.native
  def GetOrganizer(): AddressEntry = js.native
  def GetRecurrencePattern(): RecurrencePattern = js.native
  def Move(DestFldr: Folder): js.Any = js.native
  def PrintOut(): scala.Unit = js.native
  def Respond(Response: OlMeetingResponse): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: js.Any): MeetingItem = js.native
  def Respond(Response: OlMeetingResponse, fNoUI: js.Any, fAdditionalTextDialog: js.Any): MeetingItem = js.native
  def Save(): scala.Unit = js.native
  def SaveAs(Path: java.lang.String): scala.Unit = js.native
  def SaveAs(Path: java.lang.String, Type: js.Any): scala.Unit = js.native
  def Send(): scala.Unit = js.native
  def ShowCategoriesDialog(): scala.Unit = js.native
}

