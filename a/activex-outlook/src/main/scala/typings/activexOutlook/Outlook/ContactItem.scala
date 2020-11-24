package typings.activexOutlook.Outlook

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ContactItem extends js.Object {
  
  var Account: String = js.native
  
  val Actions: typings.activexOutlook.Outlook.Actions = js.native
  
  def AddBusinessCardLogoPicture(Path: String): Unit = js.native
  
  def AddPicture(Path: String): Unit = js.native
  
  var Anniversary: VarDate = js.native
  
  val Application: typings.activexOutlook.Outlook.Application = js.native
  
  var AssistantName: String = js.native
  
  var AssistantTelephoneNumber: String = js.native
  
  val Attachments: typings.activexOutlook.Outlook.Attachments = js.native
  
  val AutoResolvedWinner: Boolean = js.native
  
  var BillingInformation: String = js.native
  
  var Birthday: VarDate = js.native
  
  var Body: String = js.native
  
  var Business2TelephoneNumber: String = js.native
  
  var BusinessAddress: String = js.native
  
  var BusinessAddressCity: String = js.native
  
  var BusinessAddressCountry: String = js.native
  
  var BusinessAddressPostOfficeBox: String = js.native
  
  var BusinessAddressPostalCode: String = js.native
  
  var BusinessAddressState: String = js.native
  
  var BusinessAddressStreet: String = js.native
  
  var BusinessCardLayoutXml: String = js.native
  
  val BusinessCardType: OlBusinessCardType = js.native
  
  var BusinessFaxNumber: String = js.native
  
  var BusinessHomePage: String = js.native
  
  var BusinessTelephoneNumber: String = js.native
  
  var CallbackTelephoneNumber: String = js.native
  
  var CarTelephoneNumber: String = js.native
  
  var Categories: String = js.native
  
  var Children: String = js.native
  
  val Class: OlObjectClass = js.native
  
  def ClearTaskFlag(): Unit = js.native
  
  def Close(SaveMode: OlInspectorClose): Unit = js.native
  
  var Companies: String = js.native
  
  val CompanyAndFullName: String = js.native
  
  val CompanyLastFirstNoSpace: String = js.native
  
  val CompanyLastFirstSpaceOnly: String = js.native
  
  var CompanyMainTelephoneNumber: String = js.native
  
  var CompanyName: String = js.native
  
  var ComputerNetworkName: String = js.native
  
  val Conflicts: typings.activexOutlook.Outlook.Conflicts = js.native
  
  val ConversationID: String = js.native
  
  val ConversationIndex: String = js.native
  
  val ConversationTopic: String = js.native
  
  def Copy(): js.Any = js.native
  
  val CreationTime: VarDate = js.native
  
  var CustomerID: String = js.native
  
  def Delete(): Unit = js.native
  
  var Department: String = js.native
  
  def Display(): Unit = js.native
  def Display(Modal: js.Any): Unit = js.native
  
  val DownloadState: OlDownloadState = js.native
  
  var Email1Address: String = js.native
  
  var Email1AddressType: String = js.native
  
  var Email1DisplayName: String = js.native
  
  val Email1EntryID: String = js.native
  
  var Email2Address: String = js.native
  
  var Email2AddressType: String = js.native
  
  var Email2DisplayName: String = js.native
  
  val Email2EntryID: String = js.native
  
  var Email3Address: String = js.native
  
  var Email3AddressType: String = js.native
  
  var Email3DisplayName: String = js.native
  
  val Email3EntryID: String = js.native
  
  val EntryID: String = js.native
  
  var FTPSite: String = js.native
  
  var FileAs: String = js.native
  
  var FirstName: String = js.native
  
  val FormDescription: typings.activexOutlook.Outlook.FormDescription = js.native
  
  def ForwardAsBusinessCard(): MailItem = js.native
  
  def ForwardAsVcard(): MailItem = js.native
  
  var FullName: String = js.native
  
  val FullNameAndCompany: String = js.native
  
  var Gender: OlGender = js.native
  
  def GetConversation(): Conversation = js.native
  
  val GetInspector: Inspector = js.native
  
  var GovernmentIDNumber: String = js.native
  
  val HasPicture: Boolean = js.native
  
  var Hobby: String = js.native
  
  var Home2TelephoneNumber: String = js.native
  
  var HomeAddress: String = js.native
  
  var HomeAddressCity: String = js.native
  
  var HomeAddressCountry: String = js.native
  
  var HomeAddressPostOfficeBox: String = js.native
  
  var HomeAddressPostalCode: String = js.native
  
  var HomeAddressState: String = js.native
  
  var HomeAddressStreet: String = js.native
  
  var HomeFaxNumber: String = js.native
  
  var HomeTelephoneNumber: String = js.native
  
  var IMAddress: String = js.native
  
  var ISDNNumber: String = js.native
  
  var Importance: OlImportance = js.native
  
  var Initials: String = js.native
  
  var InternetFreeBusyAddress: String = js.native
  
  val IsConflict: Boolean = js.native
  
  val IsMarkedAsTask: Boolean = js.native
  
  val ItemProperties: typings.activexOutlook.Outlook.ItemProperties = js.native
  
  var JobTitle: String = js.native
  
  var Journal: Boolean = js.native
  
  var Language: String = js.native
  
  val LastFirstAndSuffix: String = js.native
  
  val LastFirstNoSpace: String = js.native
  
  val LastFirstNoSpaceAndSuffix: String = js.native
  
  val LastFirstNoSpaceCompany: String = js.native
  
  val LastFirstSpaceOnly: String = js.native
  
  val LastFirstSpaceOnlyCompany: String = js.native
  
  val LastModificationTime: VarDate = js.native
  
  var LastName: String = js.native
  
  val LastNameAndFirstName: String = js.native
  
  val Links: typings.activexOutlook.Outlook.Links = js.native
  
  val MAPIOBJECT: js.Any = js.native
  
  var MailingAddress: String = js.native
  
  var MailingAddressCity: String = js.native
  
  var MailingAddressCountry: String = js.native
  
  var MailingAddressPostOfficeBox: String = js.native
  
  var MailingAddressPostalCode: String = js.native
  
  var MailingAddressState: String = js.native
  
  var MailingAddressStreet: String = js.native
  
  var ManagerName: String = js.native
  
  def MarkAsTask(MarkInterval: OlMarkInterval): Unit = js.native
  
  var MarkForDownload: OlRemoteStatus = js.native
  
  var MessageClass: String = js.native
  
  var MiddleName: String = js.native
  
  var Mileage: String = js.native
  
  var MobileTelephoneNumber: String = js.native
  
  def Move(DestFldr: Folder): js.Any = js.native
  
  var NetMeetingAlias: String = js.native
  
  var NetMeetingServer: String = js.native
  
  var NickName: String = js.native
  
  var NoAging: Boolean = js.native
  
  var OfficeLocation: String = js.native
  
  var OrganizationalIDNumber: String = js.native
  
  var OtherAddress: String = js.native
  
  var OtherAddressCity: String = js.native
  
  var OtherAddressCountry: String = js.native
  
  var OtherAddressPostOfficeBox: String = js.native
  
  var OtherAddressPostalCode: String = js.native
  
  var OtherAddressState: String = js.native
  
  var OtherAddressStreet: String = js.native
  
  var OtherFaxNumber: String = js.native
  
  var OtherTelephoneNumber: String = js.native
  
  @JSName("Outlook.ContactItem_typekey")
  var OutlookDotContactItem_typekey: ContactItem = js.native
  
  val OutlookInternalVersion: Double = js.native
  
  val OutlookVersion: String = js.native
  
  var PagerNumber: String = js.native
  
  val Parent: js.Any = js.native
  
  var PersonalHomePage: String = js.native
  
  var PrimaryTelephoneNumber: String = js.native
  
  def PrintOut(): Unit = js.native
  
  var Profession: String = js.native
  
  val PropertyAccessor: typings.activexOutlook.Outlook.PropertyAccessor = js.native
  
  var RTFBody: js.Any = js.native
  
  var RadioTelephoneNumber: String = js.native
  
  var ReferredBy: String = js.native
  
  var ReminderOverrideDefault: Boolean = js.native
  
  var ReminderPlaySound: Boolean = js.native
  
  var ReminderSet: Boolean = js.native
  
  var ReminderSoundFile: String = js.native
  
  var ReminderTime: VarDate = js.native
  
  def RemovePicture(): Unit = js.native
  
  def ResetBusinessCard(): Unit = js.native
  
  def Save(): Unit = js.native
  
  def SaveAs(Path: String): Unit = js.native
  def SaveAs(Path: String, Type: js.Any): Unit = js.native
  
  def SaveBusinessCardImage(Path: String): Unit = js.native
  
  val Saved: Boolean = js.native
  
  var SelectedMailingAddress: OlMailingAddress = js.native
  
  var Sensitivity: OlSensitivity = js.native
  
  val Session: NameSpace = js.native
  
  def ShowBusinessCardEditor(): Unit = js.native
  
  def ShowCategoriesDialog(): Unit = js.native
  
  def ShowCheckPhoneDialog(PhoneNumber: OlContactPhoneNumber): Unit = js.native
  
  val Size: Double = js.native
  
  var Spouse: String = js.native
  
  var Subject: String = js.native
  
  var Suffix: String = js.native
  
  var TTYTDDTelephoneNumber: String = js.native
  
  var TaskCompletedDate: VarDate = js.native
  
  var TaskDueDate: VarDate = js.native
  
  var TaskStartDate: VarDate = js.native
  
  var TaskSubject: String = js.native
  
  var TelexNumber: String = js.native
  
  var Title: String = js.native
  
  var ToDoTaskOrdinal: VarDate = js.native
  
  var UnRead: Boolean = js.native
  
  var User1: String = js.native
  
  var User2: String = js.native
  
  var User3: String = js.native
  
  var User4: String = js.native
  
  var UserCertificate: String = js.native
  
  val UserProperties: typings.activexOutlook.Outlook.UserProperties = js.native
  
  var WebPage: String = js.native
  
  var YomiCompanyName: String = js.native
  
  var YomiFirstName: String = js.native
  
  var YomiLastName: String = js.native
}
