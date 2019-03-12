package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/alexaforbusiness", "AlexaForBusiness")
@js.native
object AlexaForBusinessNs extends js.Object {
  trait AddressBook extends js.Object {
    /**
      * The ARN of the address book.
      */
    var AddressBookArn: js.UndefOr[Arn] = js.undefined
    /**
      * The description of the address book.
      */
    var Description: js.UndefOr[AddressBookDescription] = js.undefined
    /**
      * The name of the address book.
      */
    var Name: js.UndefOr[AddressBookName] = js.undefined
  }
  
  trait AddressBookData extends js.Object {
    /**
      * The ARN of the address book.
      */
    var AddressBookArn: js.UndefOr[Arn] = js.undefined
    /**
      * The description of the address book.
      */
    var Description: js.UndefOr[AddressBookDescription] = js.undefined
    /**
      * The name of the address book.
      */
    var Name: js.UndefOr[AddressBookName] = js.undefined
  }
  
  trait ApproveSkillRequest extends js.Object {
    /**
      * The unique identifier of the skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait ApproveSkillResponse extends js.Object
  
  trait AssociateContactWithAddressBookRequest extends js.Object {
    /**
      * The ARN of the address book with which to associate the contact.
      */
    var AddressBookArn: Arn
    /**
      * The ARN of the contact to associate with an address book.
      */
    var ContactArn: Arn
  }
  
  trait AssociateContactWithAddressBookResponse extends js.Object
  
  trait AssociateDeviceWithRoomRequest extends js.Object {
    /**
      * The ARN of the device to associate to a room. Required.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of the room with which to associate the device. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait AssociateDeviceWithRoomResponse extends js.Object
  
  trait AssociateSkillGroupWithRoomRequest extends js.Object {
    /**
      * The ARN of the room with which to associate the skill group. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of the skill group to associate with a room. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait AssociateSkillGroupWithRoomResponse extends js.Object
  
  trait AssociateSkillWithSkillGroupRequest extends js.Object {
    /**
      * The ARN of the skill group to associate the skill to. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * The unique identifier of the skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait AssociateSkillWithSkillGroupResponse extends js.Object
  
  trait AssociateSkillWithUsersRequest extends js.Object {
    /**
      * The private skill ID you want to make available to enrolled users.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait AssociateSkillWithUsersResponse extends js.Object
  
  trait AuthorizationResult
    extends /* key */ org.scalablytyped.runtime.StringDictionary[Value]
  
  trait BusinessReport extends js.Object {
    /**
      * The time of report delivery.
      */
    var DeliveryTime: js.UndefOr[Timestamp] = js.undefined
    /**
      * The download link where a user can download the report.
      */
    var DownloadUrl: js.UndefOr[BusinessReportDownloadUrl] = js.undefined
    /**
      * The failure code.
      */
    var FailureCode: js.UndefOr[BusinessReportFailureCode] = js.undefined
    /**
      * The S3 location of the output reports.
      */
    var S3Location: js.UndefOr[BusinessReportS3Location] = js.undefined
    /**
      * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
      */
    var Status: js.UndefOr[BusinessReportStatus] = js.undefined
  }
  
  trait BusinessReportContentRange extends js.Object {
    /**
      * The interval of the content range.
      */
    var Interval: js.UndefOr[BusinessReportInterval] = js.undefined
  }
  
  trait BusinessReportRecurrence extends js.Object {
    /**
      * The start date.
      */
    var StartDate: js.UndefOr[_Date] = js.undefined
  }
  
  trait BusinessReportS3Location extends js.Object {
    /**
      * The S3 bucket name of the output reports.
      */
    var BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
    /**
      * The path of the business report.
      */
    var Path: js.UndefOr[BusinessReportS3Path] = js.undefined
  }
  
  trait BusinessReportSchedule extends js.Object {
    /**
      * The content range of the reports.
      */
    var ContentRange: js.UndefOr[BusinessReportContentRange] = js.undefined
    /**
      * The format of the generated report (individual CSV files or zipped files of individual files).
      */
    var Format: js.UndefOr[BusinessReportFormat] = js.undefined
    /**
      * The details of the last business report delivery for a specified time interval.
      */
    var LastBusinessReport: js.UndefOr[BusinessReport] = js.undefined
    /**
      * The recurrence of the reports.
      */
    var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
    /**
      * The S3 bucket name of the output reports.
      */
    var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
    /**
      * The S3 key where the report is delivered.
      */
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The ARN of the business report schedule.
      */
    var ScheduleArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name identifier of the schedule.
      */
    var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
  }
  
  trait Category extends js.Object {
    /**
      * The ID of the skill store category.
      */
    var CategoryId: js.UndefOr[CategoryId] = js.undefined
    /**
      * The name of the skill store category.
      */
    var CategoryName: js.UndefOr[CategoryName] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ConferencePreference extends js.Object {
    /**
      * The ARN of the default conference provider.
      */
    var DefaultConferenceProviderArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait ConferenceProvider extends js.Object {
    /**
      * The ARN of the newly created conference provider.
      */
    var Arn: js.UndefOr[Arn] = js.undefined
    /**
      * The IP endpoint and protocol for calling.
      */
    var IPDialIn: js.UndefOr[IPDialIn] = js.undefined
    /**
      * The meeting settings for the conference provider.
      */
    var MeetingSetting: js.UndefOr[MeetingSetting] = js.undefined
    /**
      * The name of the conference provider.
      */
    var Name: js.UndefOr[ConferenceProviderName] = js.undefined
    /**
      * The information for PSTN conferencing.
      */
    var PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
    /**
      * The type of conference providers.
      */
    var Type: js.UndefOr[ConferenceProviderType] = js.undefined
  }
  
  trait Contact extends js.Object {
    /**
      * The ARN of the contact.
      */
    var ContactArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the contact to display on the console.
      */
    var DisplayName: js.UndefOr[ContactName] = js.undefined
    /**
      * The first name of the contact, used to call the contact on the device.
      */
    var FirstName: js.UndefOr[ContactName] = js.undefined
    /**
      * The last name of the contact, used to call the contact on the device.
      */
    var LastName: js.UndefOr[ContactName] = js.undefined
    /**
      * The phone number of the contact.
      */
    var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  }
  
  trait ContactData extends js.Object {
    /**
      * The ARN of the contact.
      */
    var ContactArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the contact to display on the console.
      */
    var DisplayName: js.UndefOr[ContactName] = js.undefined
    /**
      * The first name of the contact, used to call the contact on the device.
      */
    var FirstName: js.UndefOr[ContactName] = js.undefined
    /**
      * The last name of the contact, used to call the contact on the device.
      */
    var LastName: js.UndefOr[ContactName] = js.undefined
    /**
      * The phone number of the contact.
      */
    var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  }
  
  trait CreateAddressBookRequest extends js.Object {
    /**
      * A unique, user-specified identifier for the request that ensures idempotency.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The description of the address book.
      */
    var Description: js.UndefOr[AddressBookDescription] = js.undefined
    /**
      * The name of the address book.
      */
    var Name: AddressBookName
  }
  
  trait CreateAddressBookResponse extends js.Object {
    /**
      * The ARN of the newly created address book.
      */
    var AddressBookArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateBusinessReportScheduleRequest extends js.Object {
    /**
      * The client request token.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The content range of the reports.
      */
    var ContentRange: BusinessReportContentRange
    /**
      * The format of the generated report (individual CSV files or zipped files of individual files).
      */
    var Format: BusinessReportFormat
    /**
      * The recurrence of the reports. If this isn't specified, the report will only be delivered one time when the API is called. 
      */
    var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
    /**
      * The S3 bucket name of the output reports. If this isn't specified, the report can be retrieved from a download link by calling ListBusinessReportSchedule. 
      */
    var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
    /**
      * The S3 key where the report is delivered.
      */
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The name identifier of the schedule.
      */
    var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
  }
  
  trait CreateBusinessReportScheduleResponse extends js.Object {
    /**
      * The ARN of the business report schedule.
      */
    var ScheduleArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateConferenceProviderRequest extends js.Object {
    /**
      * The request token of the client.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The name of the conference provider.
      */
    var ConferenceProviderName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderName
    /**
      * Represents a type within a list of predefined types.
      */
    var ConferenceProviderType: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderType
    /**
      * The IP endpoint and protocol for calling.
      */
    var IPDialIn: js.UndefOr[IPDialIn] = js.undefined
    /**
      * The meeting settings for the conference provider.
      */
    var MeetingSetting: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MeetingSetting
    /**
      * The information for PSTN conferencing.
      */
    var PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
  }
  
  trait CreateConferenceProviderResponse extends js.Object {
    /**
      * The ARN of the newly-created conference provider.
      */
    var ConferenceProviderArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateContactRequest extends js.Object {
    /**
      * A unique, user-specified identifier for this request that ensures idempotency.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The name of the contact to display on the console.
      */
    var DisplayName: js.UndefOr[ContactName] = js.undefined
    /**
      * The first name of the contact that is used to call the contact on the device.
      */
    var FirstName: ContactName
    /**
      * The last name of the contact that is used to call the contact on the device.
      */
    var LastName: js.UndefOr[ContactName] = js.undefined
    /**
      * The phone number of the contact in E.164 format.
      */
    var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  }
  
  trait CreateContactResponse extends js.Object {
    /**
      * The ARN of the newly created address book.
      */
    var ContactArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateProfileRequest extends js.Object {
    /**
      * The valid address for the room.
      */
    var Address: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Address
    /**
      * The user-specified token that is used during the creation of a profile.
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The distance unit to be used by devices in the profile.
      */
    var DistanceUnit: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DistanceUnit
    /**
      * The maximum volume limit for a room profile.
      */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
      * Whether PSTN calling is enabled.
      */
    var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The name of a room profile.
      */
    var ProfileName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName
    /**
      * Whether room profile setup is enabled.
      */
    var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The temperature unit to be used by devices in the profile.
      */
    var TemperatureUnit: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TemperatureUnit
    /**
      * The time zone used by a room profile.
      */
    var Timezone: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timezone
    /**
      * A wake word for Alexa, Echo, Amazon, or a computer.
      */
    var WakeWord: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.WakeWord
  }
  
  trait CreateProfileResponse extends js.Object {
    /**
      * The ARN of the newly created room profile in the response.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateRoomRequest extends js.Object {
    /**
      * A unique, user-specified identifier for this request that ensures idempotency. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The description for the room.
      */
    var Description: js.UndefOr[RoomDescription] = js.undefined
    /**
      * The profile ARN for the room.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The calendar ARN for the room.
      */
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
    /**
      * The name for the room.
      */
    var RoomName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName
    /**
      * The tags for the room.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait CreateRoomResponse extends js.Object {
    /**
      * The ARN of the newly created room in the response.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateSkillGroupRequest extends js.Object {
    /**
      * A unique, user-specified identifier for this request that ensures idempotency. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The description for the skill group.
      */
    var Description: js.UndefOr[SkillGroupDescription] = js.undefined
    /**
      * The name for the skill group.
      */
    var SkillGroupName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupName
  }
  
  trait CreateSkillGroupResponse extends js.Object {
    /**
      * The ARN of the newly created skill group in the response.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait CreateUserRequest extends js.Object {
    /**
      * A unique, user-specified identifier for this request that ensures idempotency. 
      */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
      * The email address for the user.
      */
    var Email: js.UndefOr[Email] = js.undefined
    /**
      * The first name for the user.
      */
    var FirstName: js.UndefOr[user_FirstName] = js.undefined
    /**
      * The last name for the user.
      */
    var LastName: js.UndefOr[user_LastName] = js.undefined
    /**
      * The tags for the user.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
    /**
      * The ARN for the user.
      */
    var UserId: user_UserId
  }
  
  trait CreateUserResponse extends js.Object {
    /**
      * The ARN of the newly created user in the response.
      */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DeleteAddressBookRequest extends js.Object {
    /**
      * The ARN of the address book to delete.
      */
    var AddressBookArn: Arn
  }
  
  trait DeleteAddressBookResponse extends js.Object
  
  trait DeleteBusinessReportScheduleRequest extends js.Object {
    /**
      * The ARN of the business report schedule.
      */
    var ScheduleArn: Arn
  }
  
  trait DeleteBusinessReportScheduleResponse extends js.Object
  
  trait DeleteConferenceProviderRequest extends js.Object {
    /**
      * The ARN of the conference provider.
      */
    var ConferenceProviderArn: Arn
  }
  
  trait DeleteConferenceProviderResponse extends js.Object
  
  trait DeleteContactRequest extends js.Object {
    /**
      * The ARN of the contact to delete.
      */
    var ContactArn: Arn
  }
  
  trait DeleteContactResponse extends js.Object
  
  trait DeleteDeviceRequest extends js.Object {
    /**
      * The ARN of the device for which to request details.
      */
    var DeviceArn: Arn
  }
  
  trait DeleteDeviceResponse extends js.Object
  
  trait DeleteProfileRequest extends js.Object {
    /**
      * The ARN of the room profile to delete. Required.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DeleteProfileResponse extends js.Object
  
  trait DeleteRoomRequest extends js.Object {
    /**
      * The ARN of the room to delete. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DeleteRoomResponse extends js.Object
  
  trait DeleteRoomSkillParameterRequest extends js.Object {
    /**
      * The room skill parameter key for which to remove details.
      */
    var ParameterKey: RoomSkillParameterKey
    /**
      * The ARN of the room from which to remove the room skill parameter details.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ID of the skill from which to remove the room skill parameter details.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait DeleteRoomSkillParameterResponse extends js.Object
  
  trait DeleteSkillAuthorizationRequest extends js.Object {
    /**
      * The room that the skill is authorized for.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The unique identifier of a skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait DeleteSkillAuthorizationResponse extends js.Object
  
  trait DeleteSkillGroupRequest extends js.Object {
    /**
      * The ARN of the skill group to delete. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DeleteSkillGroupResponse extends js.Object
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The ARN of the user's enrollment in the organization. Required.
      */
    var EnrollmentId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnrollmentId
    /**
      * The ARN of the user to delete in the organization. Required.
      */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DeleteUserResponse extends js.Object
  
  trait DeveloperInfo extends js.Object {
    /**
      * The name of the developer.
      */
    var DeveloperName: js.UndefOr[DeveloperName] = js.undefined
    /**
      * The email of the developer.
      */
    var Email: js.UndefOr[Email] = js.undefined
    /**
      * The URL of the privacy policy.
      */
    var PrivacyPolicy: js.UndefOr[PrivacyPolicy] = js.undefined
    /**
      * The website of the developer.
      */
    var Url: js.UndefOr[Url] = js.undefined
  }
  
  trait Device extends js.Object {
    /**
      * The ARN of a device.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a device.
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
    /**
      * The serial number of a device.
      */
    var DeviceSerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined
    /**
      * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
      */
    var DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined
    /**
      * Detailed information about a device's status.
      */
    var DeviceStatusInfo: js.UndefOr[DeviceStatusInfo] = js.undefined
    /**
      * The type of a device.
      */
    var DeviceType: js.UndefOr[DeviceType] = js.undefined
    /**
      * The MAC address of a device.
      */
    var MacAddress: js.UndefOr[MacAddress] = js.undefined
    /**
      * The room ARN of a device.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The software version of a device.
      */
    var SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined
  }
  
  trait DeviceData extends js.Object {
    /**
      * The ARN of a device.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a device.
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
    /**
      * The serial number of a device.
      */
    var DeviceSerialNumber: js.UndefOr[DeviceSerialNumber] = js.undefined
    /**
      * The status of a device.
      */
    var DeviceStatus: js.UndefOr[DeviceStatus] = js.undefined
    /**
      * Detailed information about a device's status.
      */
    var DeviceStatusInfo: js.UndefOr[DeviceStatusInfo] = js.undefined
    /**
      * The type of a device.
      */
    var DeviceType: js.UndefOr[DeviceType] = js.undefined
    /**
      * The MAC address of a device.
      */
    var MacAddress: js.UndefOr[MacAddress] = js.undefined
    /**
      * The room ARN associated with a device.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the room associated with a device.
      */
    var RoomName: js.UndefOr[RoomName] = js.undefined
    /**
      * The software version of a device.
      */
    var SoftwareVersion: js.UndefOr[SoftwareVersion] = js.undefined
  }
  
  trait DeviceEvent extends js.Object {
    /**
      * The time (in epoch) when the event occurred. 
      */
    var Timestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * The type of device event.
      */
    var Type: js.UndefOr[DeviceEventType] = js.undefined
    /**
      * The value of the event.
      */
    var Value: js.UndefOr[DeviceEventValue] = js.undefined
  }
  
  trait DeviceStatusDetail extends js.Object {
    /**
      * The device status detail code.
      */
    var Code: js.UndefOr[DeviceStatusDetailCode] = js.undefined
  }
  
  trait DeviceStatusInfo extends js.Object {
    /**
      * The latest available information about the connection status of a device. 
      */
    var ConnectionStatus: js.UndefOr[ConnectionStatus] = js.undefined
    /**
      * One or more device status detail descriptions.
      */
    var DeviceStatusDetails: js.UndefOr[DeviceStatusDetails] = js.undefined
  }
  
  trait DisassociateContactFromAddressBookRequest extends js.Object {
    /**
      * The ARN of the address from which to disassociate the contact.
      */
    var AddressBookArn: Arn
    /**
      * The ARN of the contact to disassociate from an address book.
      */
    var ContactArn: Arn
  }
  
  trait DisassociateContactFromAddressBookResponse extends js.Object
  
  trait DisassociateDeviceFromRoomRequest extends js.Object {
    /**
      * The ARN of the device to disassociate from a room. Required.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DisassociateDeviceFromRoomResponse extends js.Object
  
  trait DisassociateSkillFromSkillGroupRequest extends js.Object {
    /**
      * The unique identifier of a skill. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of a skill group to associate to a skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait DisassociateSkillFromSkillGroupResponse extends js.Object
  
  trait DisassociateSkillFromUsersRequest extends js.Object {
    /**
      *  The private skill ID you want to make unavailable for enrolled users.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait DisassociateSkillFromUsersResponse extends js.Object
  
  trait DisassociateSkillGroupFromRoomRequest extends js.Object {
    /**
      * The ARN of the room from which the skill group is to be disassociated. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of the skill group to disassociate from a room. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait DisassociateSkillGroupFromRoomResponse extends js.Object
  
  trait Filter extends js.Object {
    /**
      * The key of a filter.
      */
    var Key: FilterKey
    /**
      * The values of a filter.
      */
    var Values: FilterValueList
  }
  
  trait ForgetSmartHomeAppliancesRequest extends js.Object {
    /**
      * The room that the appliances are associated with.
      */
    var RoomArn: Arn
  }
  
  trait ForgetSmartHomeAppliancesResponse extends js.Object
  
  trait GetAddressBookRequest extends js.Object {
    /**
      * The ARN of the address book for which to request details.
      */
    var AddressBookArn: Arn
  }
  
  trait GetAddressBookResponse extends js.Object {
    /**
      * The details of the requested address book.
      */
    var AddressBook: js.UndefOr[AddressBook] = js.undefined
  }
  
  trait GetConferencePreferenceRequest extends js.Object
  
  trait GetConferencePreferenceResponse extends js.Object {
    /**
      * The conference preference.
      */
    var Preference: js.UndefOr[ConferencePreference] = js.undefined
  }
  
  trait GetConferenceProviderRequest extends js.Object {
    /**
      * The ARN of the newly created conference provider.
      */
    var ConferenceProviderArn: Arn
  }
  
  trait GetConferenceProviderResponse extends js.Object {
    /**
      * The conference provider.
      */
    var ConferenceProvider: js.UndefOr[ConferenceProvider] = js.undefined
  }
  
  trait GetContactRequest extends js.Object {
    /**
      * The ARN of the contact for which to request details.
      */
    var ContactArn: Arn
  }
  
  trait GetContactResponse extends js.Object {
    /**
      * The details of the requested contact.
      */
    var Contact: js.UndefOr[Contact] = js.undefined
  }
  
  trait GetDeviceRequest extends js.Object {
    /**
      * The ARN of the device for which to request details. Required.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait GetDeviceResponse extends js.Object {
    /**
      * The details of the device requested. Required.
      */
    var Device: js.UndefOr[Device] = js.undefined
  }
  
  trait GetInvitationConfigurationRequest extends js.Object
  
  trait GetInvitationConfigurationResponse extends js.Object {
    /**
      * The email ID of the organization or individual contact that the enrolled user can use. 
      */
    var ContactEmail: js.UndefOr[Email] = js.undefined
    /**
      * The name of the organization sending the enrollment invite to a user.
      */
    var OrganizationName: js.UndefOr[OrganizationName] = js.undefined
    /**
      * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
      */
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
  }
  
  trait GetProfileRequest extends js.Object {
    /**
      * The ARN of the room profile for which to request details. Required.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait GetProfileResponse extends js.Object {
    /**
      * The details of the room profile requested. Required.
      */
    var Profile: js.UndefOr[Profile] = js.undefined
  }
  
  trait GetRoomRequest extends js.Object {
    /**
      * The ARN of the room for which to request details. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait GetRoomResponse extends js.Object {
    /**
      * The details of the room requested.
      */
    var Room: js.UndefOr[Room] = js.undefined
  }
  
  trait GetRoomSkillParameterRequest extends js.Object {
    /**
      * The room skill parameter key for which to get details. Required.
      */
    var ParameterKey: RoomSkillParameterKey
    /**
      * The ARN of the room from which to get the room skill parameter details. 
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The ARN of the skill from which to get the room skill parameter details. Required.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait GetRoomSkillParameterResponse extends js.Object {
    /**
      * The details of the room skill parameter requested. Required.
      */
    var RoomSkillParameter: js.UndefOr[RoomSkillParameter] = js.undefined
  }
  
  trait GetSkillGroupRequest extends js.Object {
    /**
      * The ARN of the skill group for which to get details. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait GetSkillGroupResponse extends js.Object {
    /**
      * The details of the skill group requested. Required.
      */
    var SkillGroup: js.UndefOr[SkillGroup] = js.undefined
  }
  
  trait IPDialIn extends js.Object {
    /**
      * The protocol, including SIP, SIPS, and H323.
      */
    var CommsProtocol: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CommsProtocol
    /**
      * The IP address.
      */
    var Endpoint: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Endpoint
  }
  
  trait ListBusinessReportSchedulesRequest extends js.Object {
    /**
      * The maximum number of schedules listed in the call.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The token used to list the remaining schedules from the previous API call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListBusinessReportSchedulesResponse extends js.Object {
    /**
      * The schedule of the reports.
      */
    var BusinessReportSchedules: js.UndefOr[BusinessReportScheduleList] = js.undefined
    /**
      * The token used to list the remaining schedules from the previous API call.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListConferenceProvidersRequest extends js.Object {
    /**
      * The maximum number of conference providers to be returned, per paginated calls.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListConferenceProvidersResponse extends js.Object {
    /**
      * The conference providers.
      */
    var ConferenceProviders: js.UndefOr[ConferenceProvidersList] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeviceEventsRequest extends js.Object {
    /**
      * The ARN of a device.
      */
    var DeviceArn: Arn
    /**
      * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in reverse chronological order. If EventType is specified, this returns a list of device events for that EventType in reverse chronological order. 
      */
    var EventType: js.UndefOr[DeviceEventType] = js.undefined
    /**
      * The maximum number of results to include in the response. The default value is 50. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults. When the end of results is reached, the response has a value of null.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListDeviceEventsResponse extends js.Object {
    /**
      * The device events requested for the device ARN.
      */
    var DeviceEvents: js.UndefOr[DeviceEventList] = js.undefined
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSkillsRequest extends js.Object {
    /**
      * Whether the skill is enabled under the user's account, or if it requires linking to be used.
      */
    var EnablementType: js.UndefOr[EnablementTypeFilter] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. Required.
      */
    var MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The ARN of the skill group for which to list enabled skills. Required.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * Whether the skill is publicly available or is a private skill.
      */
    var SkillType: js.UndefOr[SkillTypeFilter] = js.undefined
  }
  
  trait ListSkillsResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The list of enabled skills requested. Required.
      */
    var SkillSummaries: js.UndefOr[SkillSummaryList] = js.undefined
  }
  
  trait ListSkillsStoreCategoriesRequest extends js.Object {
    /**
      * The maximum number of categories returned, per paginated calls.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSkillsStoreCategoriesResponse extends js.Object {
    /**
      * The list of categories.
      */
    var CategoryList: js.UndefOr[CategoryList] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
    /**
      * The category ID for which the skills are being retrieved from the skill store.
      */
    var CategoryId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CategoryId
    /**
      * The maximum number of skills returned per paginated calls.
      */
    var MaxResults: js.UndefOr[SkillListMaxResults] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The skill store skills.
      */
    var SkillsStoreSkills: js.UndefOr[SkillsStoreSkillList] = js.undefined
  }
  
  trait ListSmartHomeAppliancesRequest extends js.Object {
    /**
      * The maximum number of appliances to be returned, per paginated calls.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The room that the appliances are associated with.
      */
    var RoomArn: Arn
  }
  
  trait ListSmartHomeAppliancesResponse extends js.Object {
    /**
      * The tokens used for pagination.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The smart home appliances.
      */
    var SmartHomeAppliances: js.UndefOr[SmartHomeApplianceList] = js.undefined
  }
  
  trait ListTagsRequest extends js.Object {
    /**
      * The ARN of the specified resource for which to list tags.
      */
    var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. 
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
  }
  
  trait ListTagsResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The tags requested for the specified resource.
      */
    var Tags: js.UndefOr[TagList] = js.undefined
  }
  
  trait MeetingSetting extends js.Object {
    /**
      * The values that indicate whether the pin is always required.
      */
    var RequirePin: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RequirePin
  }
  
  trait PSTNDialIn extends js.Object {
    /**
      * The zip code.
      */
    var CountryCode: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CountryCode
    /**
      * The delay duration before Alexa enters the conference ID with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
      */
    var OneClickIdDelay: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.OneClickIdDelay
    /**
      * The delay duration before Alexa enters the conference pin with dual-tone multi-frequency (DTMF). Each number on the dial pad corresponds to a DTMF tone, which is how we send data over the telephone network.
      */
    var OneClickPinDelay: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.OneClickPinDelay
    /**
      * The phone number to call to join the conference.
      */
    var PhoneNumber: OutboundPhoneNumber
  }
  
  trait Profile extends js.Object {
    /**
      * The address of a room profile.
      */
    var Address: js.UndefOr[Address] = js.undefined
    /**
      * The ARN of the address book.
      */
    var AddressBookArn: js.UndefOr[Arn] = js.undefined
    /**
      * The distance unit of a room profile.
      */
    var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
    /**
      * Retrieves if the profile is default or not.
      */
    var IsDefault: js.UndefOr[Boolean] = js.undefined
    /**
      * The max volume limit of a room profile.
      */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
      * The PSTN setting of a room profile.
      */
    var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The ARN of a room profile.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a room profile.
      */
    var ProfileName: js.UndefOr[ProfileName] = js.undefined
    /**
      * The setup mode of a room profile.
      */
    var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The temperature unit of a room profile.
      */
    var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
    /**
      * The time zone of a room profile.
      */
    var Timezone: js.UndefOr[Timezone] = js.undefined
    /**
      * The wake word of a room profile.
      */
    var WakeWord: js.UndefOr[WakeWord] = js.undefined
  }
  
  trait ProfileData extends js.Object {
    /**
      * The address of a room profile.
      */
    var Address: js.UndefOr[Address] = js.undefined
    /**
      * The distance unit of a room profile.
      */
    var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
    /**
      * Retrieves if the profile data is default or not.
      */
    var IsDefault: js.UndefOr[Boolean] = js.undefined
    /**
      * The ARN of a room profile.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a room profile.
      */
    var ProfileName: js.UndefOr[ProfileName] = js.undefined
    /**
      * The temperature unit of a room profile.
      */
    var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
    /**
      * The timezone of a room profile.
      */
    var Timezone: js.UndefOr[Timezone] = js.undefined
    /**
      * The wake word of a room profile.
      */
    var WakeWord: js.UndefOr[WakeWord] = js.undefined
  }
  
  trait PutConferencePreferenceRequest extends js.Object {
    /**
      * The conference preference of a specific conference provider.
      */
    var ConferencePreference: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferencePreference
  }
  
  trait PutConferencePreferenceResponse extends js.Object
  
  trait PutInvitationConfigurationRequest extends js.Object {
    /**
      * The email ID of the organization or individual contact that the enrolled user can use. 
      */
    var ContactEmail: js.UndefOr[Email] = js.undefined
    /**
      * The name of the organization sending the enrollment invite to a user.
      */
    var OrganizationName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.OrganizationName
    /**
      * The list of private skill IDs that you want to recommend to the user to enable in the invitation.
      */
    var PrivateSkillIds: js.UndefOr[ShortSkillIdList] = js.undefined
  }
  
  trait PutInvitationConfigurationResponse extends js.Object
  
  trait PutRoomSkillParameterRequest extends js.Object {
    /**
      * The ARN of the room associated with the room skill parameter. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated room skill parameter. Required.
      */
    var RoomSkillParameter: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameter
    /**
      * The ARN of the skill associated with the room skill parameter. Required.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait PutRoomSkillParameterResponse extends js.Object
  
  trait PutSkillAuthorizationRequest extends js.Object {
    /**
      * The authorization result specific to OAUTH code grant output. "Code” must be populated in the AuthorizationResult map to establish the authorization.
      */
    var AuthorizationResult: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AuthorizationResult
    /**
      * The room that the skill is authorized for.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The unique identifier of a skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait PutSkillAuthorizationResponse extends js.Object
  
  trait RegisterAVSDeviceRequest extends js.Object {
    /**
      * The device type ID for your AVS device generated by Amazon when the OEM creates a new product on Amazon's Developer Console.
      */
    var AmazonId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AmazonId
    /**
      * The client ID of the OEM used for code-based linking authorization on an AVS device.
      */
    var ClientId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientId
    /**
      * The key generated by the OEM that uniquely identifies a specified instance of your AVS device.
      */
    var DeviceSerialNumber: DeviceSerialNumberForAVS
    /**
      * The product ID used to identify your AVS device during authorization.
      */
    var ProductId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProductId
    /**
      * The code that is obtained after your AVS device has made a POST request to LWA as a part of the Device Authorization Request component of the OAuth code-based linking specification.
      */
    var UserCode: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UserCode
  }
  
  trait RegisterAVSDeviceResponse extends js.Object {
    /**
      * The ARN of the device.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait RejectSkillRequest extends js.Object {
    /**
      * The unique identifier of the skill.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
  }
  
  trait RejectSkillResponse extends js.Object
  
  trait ResolveRoomRequest extends js.Object {
    /**
      * The ARN of the skill that was requested. Required.
      */
    var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
    /**
      * The ARN of the user. Required.
      */
    var UserId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UserId
  }
  
  trait ResolveRoomResponse extends js.Object {
    /**
      * The ARN of the room from which the skill request was invoked.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of the room from which the skill request was invoked.
      */
    var RoomName: js.UndefOr[RoomName] = js.undefined
    /**
      * Response to get the room profile request. Required.
      */
    var RoomSkillParameters: js.UndefOr[RoomSkillParameters] = js.undefined
  }
  
  trait Reviews
    extends /* key */ org.scalablytyped.runtime.StringDictionary[ReviewValue]
  
  trait RevokeInvitationRequest extends js.Object {
    /**
      * The ARN of the enrollment invitation to revoke. Required.
      */
    var EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined
    /**
      * The ARN of the user for whom to revoke an enrollment invitation. Required.
      */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait RevokeInvitationResponse extends js.Object
  
  trait Room extends js.Object {
    /**
      * The description of a room.
      */
    var Description: js.UndefOr[RoomDescription] = js.undefined
    /**
      * The profile ARN of a room.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The provider calendar ARN of a room.
      */
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
    /**
      * The ARN of a room.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a room.
      */
    var RoomName: js.UndefOr[RoomName] = js.undefined
  }
  
  trait RoomData extends js.Object {
    /**
      * The description of a room.
      */
    var Description: js.UndefOr[RoomDescription] = js.undefined
    /**
      * The profile ARN of a room.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The profile name of a room.
      */
    var ProfileName: js.UndefOr[ProfileName] = js.undefined
    /**
      * The provider calendar ARN of a room.
      */
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
    /**
      * The ARN of a room.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a room.
      */
    var RoomName: js.UndefOr[RoomName] = js.undefined
  }
  
  trait RoomSkillParameter extends js.Object {
    /**
      * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
      */
    var ParameterKey: RoomSkillParameterKey
    /**
      * The parameter value of a room skill parameter.
      */
    var ParameterValue: RoomSkillParameterValue
  }
  
  trait SearchAddressBooksRequest extends js.Object {
    /**
      * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchAddressBooksResponse extends js.Object {
    /**
      * The address books that meet the specified set of filter criteria, in sort order.
      */
    var AddressBooks: js.UndefOr[AddressBookDataList] = js.undefined
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The total number of address books returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchContactsRequest extends js.Object {
    /**
      * The filters to use to list a specified set of address books. The supported filter keys are DisplayName, FirstName, LastName, and AddressBookArns.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of contacts. The supported sort keys are DisplayName, FirstName, and LastName.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchContactsResponse extends js.Object {
    /**
      * The contacts that meet the specified set of filter criteria, in sort order.
      */
    var Contacts: js.UndefOr[ContactDataList] = js.undefined
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The total number of contacts returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchDevicesRequest extends js.Object {
    /**
      * The filters to use to list a specified set of devices. Supported filter keys are DeviceName, DeviceStatus, DeviceStatusDetailCode, RoomName, DeviceType, DeviceSerialNumber, UnassociatedOnly, and ConnectionStatus (ONLINE and OFFLINE).
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of devices. Supported sort keys are DeviceName, DeviceStatus, RoomName, DeviceType, DeviceSerialNumber, and ConnectionStatus.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchDevicesResponse extends js.Object {
    /**
      * The devices that meet the specified set of filter criteria, in sort order.
      */
    var Devices: js.UndefOr[DeviceDataList] = js.undefined
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The total number of devices returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchProfilesRequest extends js.Object {
    /**
      * The filters to use to list a specified set of room profiles. Supported filter keys are ProfileName and Address. Required. 
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of room profiles. Supported sort keys are ProfileName and Address.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchProfilesResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The profiles that meet the specified set of filter criteria, in sort order.
      */
    var Profiles: js.UndefOr[ProfileDataList] = js.undefined
    /**
      * The total number of room profiles returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchRoomsRequest extends js.Object {
    /**
      * The filters to use to list a specified set of rooms. The supported filter keys are RoomName and ProfileName.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of rooms. The supported sort keys are RoomName and ProfileName.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchRoomsResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The rooms that meet the specified set of filter criteria, in sort order.
      */
    var Rooms: js.UndefOr[RoomDataList] = js.undefined
    /**
      * The total number of rooms returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchSkillGroupsRequest extends js.Object {
    /**
      * The filters to use to list a specified set of skill groups. The supported filter key is SkillGroupName. 
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the specified set of skill groups. The supported sort key is SkillGroupName. 
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchSkillGroupsResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The skill groups that meet the filter criteria, in sort order.
      */
    var SkillGroups: js.UndefOr[SkillGroupDataList] = js.undefined
    /**
      * The total number of skill groups returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
  }
  
  trait SearchUsersRequest extends js.Object {
    /**
      * The filters to use for listing a specific set of users. Required. Supported filter keys are UserId, FirstName, LastName, Email, and EnrollmentStatus.
      */
    var Filters: js.UndefOr[FilterList] = js.undefined
    /**
      * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. Required.
      */
    var MaxResults: js.UndefOr[MaxResults] = js.undefined
    /**
      * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The sort order to use in listing the filtered set of users. Required. Supported sort keys are UserId, FirstName, LastName, Email, and EnrollmentStatus.
      */
    var SortCriteria: js.UndefOr[SortList] = js.undefined
  }
  
  trait SearchUsersResponse extends js.Object {
    /**
      * The token returned to indicate that there is more data available.
      */
    var NextToken: js.UndefOr[NextToken] = js.undefined
    /**
      * The total number of users returned.
      */
    var TotalCount: js.UndefOr[TotalCount] = js.undefined
    /**
      * The users that meet the specified set of filter criteria, in sort order.
      */
    var Users: js.UndefOr[UserDataList] = js.undefined
  }
  
  trait SendInvitationRequest extends js.Object {
    /**
      * The ARN of the user to whom to send an invitation. Required.
      */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait SendInvitationResponse extends js.Object
  
  trait SkillDetails extends js.Object {
    /**
      * The details about what the skill supports organized as bullet points.
      */
    var BulletPoints: js.UndefOr[BulletPoints] = js.undefined
    /**
      * The details about the developer that published the skill.
      */
    var DeveloperInfo: js.UndefOr[DeveloperInfo] = js.undefined
    /**
      * The URL of the end user license agreement.
      */
    var EndUserLicenseAgreement: js.UndefOr[EndUserLicenseAgreement] = js.undefined
    /**
      * The generic keywords associated with the skill that can be used to find a skill.
      */
    var GenericKeywords: js.UndefOr[GenericKeywords] = js.undefined
    /**
      * The phrase used to trigger the skill.
      */
    var InvocationPhrase: js.UndefOr[InvocationPhrase] = js.undefined
    /**
      * The updates added in bullet points.
      */
    var NewInThisVersionBulletPoints: js.UndefOr[NewInThisVersionBulletPoints] = js.undefined
    /**
      * The description of the product.
      */
    var ProductDescription: js.UndefOr[ProductDescription] = js.undefined
    /**
      * The date when the skill was released.
      */
    var ReleaseDate: js.UndefOr[ReleaseDate] = js.undefined
    /**
      * The list of reviews for the skill, including Key and Value pair.
      */
    var Reviews: js.UndefOr[Reviews] = js.undefined
    /**
      * The types of skills.
      */
    var SkillTypes: js.UndefOr[SkillTypes] = js.undefined
  }
  
  trait SkillGroup extends js.Object {
    /**
      * The description of a skill group.
      */
    var Description: js.UndefOr[SkillGroupDescription] = js.undefined
    /**
      * The ARN of a skill group.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * The name of a skill group.
      */
    var SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
  }
  
  trait SkillGroupData extends js.Object {
    /**
      * The description of a skill group.
      */
    var Description: js.UndefOr[SkillGroupDescription] = js.undefined
    /**
      * The skill group ARN of a skill group.
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * The skill group name of a skill group.
      */
    var SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
  }
  
  trait SkillSummary extends js.Object {
    /**
      * Whether the skill is enabled under the user's account, or if it requires linking to be used.
      */
    var EnablementType: js.UndefOr[EnablementType] = js.undefined
    /**
      * The ARN of the skill summary.
      */
    var SkillId: js.UndefOr[SkillId] = js.undefined
    /**
      * The name of the skill.
      */
    var SkillName: js.UndefOr[SkillName] = js.undefined
    /**
      * Whether the skill is publicly available or is a private skill.
      */
    var SkillType: js.UndefOr[SkillType] = js.undefined
    /**
      * Linking support for a skill.
      */
    var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait SkillsStoreSkill extends js.Object {
    /**
      * The URL where the skill icon resides.
      */
    var IconUrl: js.UndefOr[IconUrl] = js.undefined
    /**
      * Sample utterances that interact with the skill.
      */
    var SampleUtterances: js.UndefOr[SampleUtterances] = js.undefined
    /**
      * Short description about the skill.
      */
    var ShortDescription: js.UndefOr[ShortDescription] = js.undefined
    /**
      * Information about the skill.
      */
    var SkillDetails: js.UndefOr[SkillDetails] = js.undefined
    /**
      * The ARN of the skill.
      */
    var SkillId: js.UndefOr[SkillId] = js.undefined
    /**
      * The name of the skill.
      */
    var SkillName: js.UndefOr[SkillName] = js.undefined
    /**
      * Linking support for a skill.
      */
    var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait SmartHomeAppliance extends js.Object {
    /**
      * The description of the smart home appliance.
      */
    var Description: js.UndefOr[ApplianceDescription] = js.undefined
    /**
      * The friendly name of the smart home appliance.
      */
    var FriendlyName: js.UndefOr[ApplianceFriendlyName] = js.undefined
    /**
      * The name of the manufacturer of the smart home appliance.
      */
    var ManufacturerName: js.UndefOr[ApplianceManufacturerName] = js.undefined
  }
  
  trait Sort extends js.Object {
    /**
      * The sort key of a sort object.
      */
    var Key: SortKey
    /**
      * The sort value of a sort object.
      */
    var Value: SortValue
  }
  
  trait StartDeviceSyncRequest extends js.Object {
    /**
      * The ARN of the device to sync. Required.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
    /**
      * Request structure to start the device sync. Required.
      */
    var Features: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Features
    /**
      * The ARN of the room with which the device to sync is associated. Required.
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait StartDeviceSyncResponse extends js.Object
  
  trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
    /**
      * The room where smart home appliance discovery was initiated.
      */
    var RoomArn: Arn
  }
  
  trait StartSmartHomeApplianceDiscoveryResponse extends js.Object
  
  trait Tag extends js.Object {
    /**
      * The key of a tag. Tag keys are case-sensitive. 
      */
    var Key: TagKey
    /**
      * The value of a tag. Tag values are case-sensitive and can be null.
      */
    var Value: TagValue
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The ARN of the resource to which to add metadata tags. Required. 
      */
    var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    /**
      * The tags to be added to the specified resource. Do not provide system tags. Required. 
      */
    var Tags: TagList
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
      */
    def approveSkill(): awsDashSdkLib.libRequestMod.Request[ApproveSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def approveSkill(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApproveSkillResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApproveSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
      */
    def approveSkill(params: ApproveSkillRequest): awsDashSdkLib.libRequestMod.Request[ApproveSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def approveSkill(
      params: ApproveSkillRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ApproveSkillResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ApproveSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a contact with a given address book.
      */
    def associateContactWithAddressBook(): awsDashSdkLib.libRequestMod.Request[AssociateContactWithAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateContactWithAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateContactWithAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateContactWithAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a contact with a given address book.
      */
    def associateContactWithAddressBook(params: AssociateContactWithAddressBookRequest): awsDashSdkLib.libRequestMod.Request[AssociateContactWithAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateContactWithAddressBook(
      params: AssociateContactWithAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateContactWithAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateContactWithAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
      */
    def associateDeviceWithRoom(): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateDeviceWithRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDeviceWithRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
      */
    def associateDeviceWithRoom(params: AssociateDeviceWithRoomRequest): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateDeviceWithRoom(
      params: AssociateDeviceWithRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateDeviceWithRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateDeviceWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
      */
    def associateSkillGroupWithRoom(): awsDashSdkLib.libRequestMod.Request[AssociateSkillGroupWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillGroupWithRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillGroupWithRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillGroupWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
      */
    def associateSkillGroupWithRoom(params: AssociateSkillGroupWithRoomRequest): awsDashSdkLib.libRequestMod.Request[AssociateSkillGroupWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillGroupWithRoom(
      params: AssociateSkillGroupWithRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillGroupWithRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillGroupWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a skill with a skill group.
      */
    def associateSkillWithSkillGroup(): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillWithSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillWithSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Associates a skill with a skill group.
      */
    def associateSkillWithSkillGroup(params: AssociateSkillWithSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillWithSkillGroup(
      params: AssociateSkillWithSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillWithSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a private skill available for enrolled users to enable on their devices.
      */
    def associateSkillWithUsers(): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillWithUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillWithUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a private skill available for enrolled users to enable on their devices.
      */
    def associateSkillWithUsers(params: AssociateSkillWithUsersRequest): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def associateSkillWithUsers(
      params: AssociateSkillWithUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillWithUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillWithUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an address book with the specified details.
      */
    def createAddressBook(): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates an address book with the specified details.
      */
    def createAddressBook(params: CreateAddressBookRequest): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createAddressBook(
      params: CreateAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
      */
    def createBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[CreateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBusinessReportSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
      */
    def createBusinessReportSchedule(params: CreateBusinessReportScheduleRequest): awsDashSdkLib.libRequestMod.Request[CreateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createBusinessReportSchedule(
      params: CreateBusinessReportScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new conference provider under the user's AWS account.
      */
    def createConferenceProvider(): awsDashSdkLib.libRequestMod.Request[CreateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConferenceProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds a new conference provider under the user's AWS account.
      */
    def createConferenceProvider(params: CreateConferenceProviderRequest): awsDashSdkLib.libRequestMod.Request[CreateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createConferenceProvider(
      params: CreateConferenceProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a contact with the specified details.
      */
    def createContact(): awsDashSdkLib.libRequestMod.Request[CreateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a contact with the specified details.
      */
    def createContact(params: CreateContactRequest): awsDashSdkLib.libRequestMod.Request[CreateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createContact(
      params: CreateContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new room profile with the specified details.
      */
    def createProfile(): awsDashSdkLib.libRequestMod.Request[CreateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a new room profile with the specified details.
      */
    def createProfile(params: CreateProfileRequest): awsDashSdkLib.libRequestMod.Request[CreateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createProfile(
      params: CreateProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a room with the specified details.
      */
    def createRoom(): awsDashSdkLib.libRequestMod.Request[CreateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a room with the specified details.
      */
    def createRoom(params: CreateRoomRequest): awsDashSdkLib.libRequestMod.Request[CreateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createRoom(
      params: CreateRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a skill group with a specified name and description.
      */
    def createSkillGroup(): awsDashSdkLib.libRequestMod.Request[CreateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a skill group with a specified name and description.
      */
    def createSkillGroup(params: CreateSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createSkillGroup(
      params: CreateSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a user.
      */
    def createUser(): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Creates a user.
      */
    def createUser(params: CreateUserRequest): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def createUser(
      params: CreateUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an address book by the address book ARN.
      */
    def deleteAddressBook(): awsDashSdkLib.libRequestMod.Request[DeleteAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes an address book by the address book ARN.
      */
    def deleteAddressBook(params: DeleteAddressBookRequest): awsDashSdkLib.libRequestMod.Request[DeleteAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteAddressBook(
      params: DeleteAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the recurring report delivery schedule with the specified schedule ARN.
      */
    def deleteBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[DeleteBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBusinessReportSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes the recurring report delivery schedule with the specified schedule ARN.
      */
    def deleteBusinessReportSchedule(params: DeleteBusinessReportScheduleRequest): awsDashSdkLib.libRequestMod.Request[DeleteBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteBusinessReportSchedule(
      params: DeleteBusinessReportScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a conference provider.
      */
    def deleteConferenceProvider(): awsDashSdkLib.libRequestMod.Request[DeleteConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConferenceProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a conference provider.
      */
    def deleteConferenceProvider(params: DeleteConferenceProviderRequest): awsDashSdkLib.libRequestMod.Request[DeleteConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteConferenceProvider(
      params: DeleteConferenceProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a contact by the contact ARN.
      */
    def deleteContact(): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a contact by the contact ARN.
      */
    def deleteContact(params: DeleteContactRequest): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteContact(
      params: DeleteContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a device from Alexa For Business.
      */
    def deleteDevice(): awsDashSdkLib.libRequestMod.Request[DeleteDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes a device from Alexa For Business.
      */
    def deleteDevice(params: DeleteDeviceRequest): awsDashSdkLib.libRequestMod.Request[DeleteDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteDevice(
      params: DeleteDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a room profile by the profile ARN.
      */
    def deleteProfile(): awsDashSdkLib.libRequestMod.Request[DeleteProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a room profile by the profile ARN.
      */
    def deleteProfile(params: DeleteProfileRequest): awsDashSdkLib.libRequestMod.Request[DeleteProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteProfile(
      params: DeleteProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a room by the room ARN.
      */
    def deleteRoom(): awsDashSdkLib.libRequestMod.Request[DeleteRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a room by the room ARN.
      */
    def deleteRoom(params: DeleteRoomRequest): awsDashSdkLib.libRequestMod.Request[DeleteRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoom(
      params: DeleteRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes room skill parameter details by room, skill, and parameter key ID.
      */
    def deleteRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[DeleteRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoomSkillParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes room skill parameter details by room, skill, and parameter key ID.
      */
    def deleteRoomSkillParameter(params: DeleteRoomSkillParameterRequest): awsDashSdkLib.libRequestMod.Request[DeleteRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteRoomSkillParameter(
      params: DeleteRoomSkillParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a third-party account from a skill.
      */
    def deleteSkillAuthorization(): awsDashSdkLib.libRequestMod.Request[DeleteSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSkillAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSkillAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Unlinks a third-party account from a skill.
      */
    def deleteSkillAuthorization(params: DeleteSkillAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[DeleteSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSkillAuthorization(
      params: DeleteSkillAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSkillAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a skill group by skill group ARN.
      */
    def deleteSkillGroup(): awsDashSdkLib.libRequestMod.Request[DeleteSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a skill group by skill group ARN.
      */
    def deleteSkillGroup(params: DeleteSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteSkillGroup(
      params: DeleteSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified user by user ARN and enrollment ARN.
      */
    def deleteUser(): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Deletes a specified user by user ARN and enrollment ARN.
      */
    def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def deleteUser(
      params: DeleteUserRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteUserResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a contact from a given address book.
      */
    def disassociateContactFromAddressBook(): awsDashSdkLib.libRequestMod.Request[DisassociateContactFromAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateContactFromAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateContactFromAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateContactFromAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a contact from a given address book.
      */
    def disassociateContactFromAddressBook(params: DisassociateContactFromAddressBookRequest): awsDashSdkLib.libRequestMod.Request[DisassociateContactFromAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateContactFromAddressBook(
      params: DisassociateContactFromAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateContactFromAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateContactFromAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
      */
    def disassociateDeviceFromRoom(): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateDeviceFromRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDeviceFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
      */
    def disassociateDeviceFromRoom(params: DisassociateDeviceFromRoomRequest): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateDeviceFromRoom(
      params: DisassociateDeviceFromRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDeviceFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill from a skill group.
      */
    def disassociateSkillFromSkillGroup(): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillFromSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillFromSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill from a skill group.
      */
    def disassociateSkillFromSkillGroup(params: DisassociateSkillFromSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillFromSkillGroup(
      params: DisassociateSkillFromSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillFromSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
      */
    def disassociateSkillFromUsers(): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillFromUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillFromUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
      */
    def disassociateSkillFromUsers(params: DisassociateSkillFromUsersRequest): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillFromUsers(
      params: DisassociateSkillFromUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillFromUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillFromUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
      */
    def disassociateSkillGroupFromRoom(): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillGroupFromRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillGroupFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
      */
    def disassociateSkillGroupFromRoom(params: DisassociateSkillGroupFromRoomRequest): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def disassociateSkillGroupFromRoom(
      params: DisassociateSkillGroupFromRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillGroupFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Forgets smart home appliances associated to a room.
      */
    def forgetSmartHomeAppliances(): awsDashSdkLib.libRequestMod.Request[ForgetSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def forgetSmartHomeAppliances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ForgetSmartHomeAppliancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ForgetSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Forgets smart home appliances associated to a room.
      */
    def forgetSmartHomeAppliances(params: ForgetSmartHomeAppliancesRequest): awsDashSdkLib.libRequestMod.Request[ForgetSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def forgetSmartHomeAppliances(
      params: ForgetSmartHomeAppliancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ForgetSmartHomeAppliancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ForgetSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets address the book details by the address book ARN.
      */
    def getAddressBook(): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets address the book details by the address book ARN.
      */
    def getAddressBook(params: GetAddressBookRequest): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getAddressBook(
      params: GetAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the existing conference preferences.
      */
    def getConferencePreference(): awsDashSdkLib.libRequestMod.Request[GetConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConferencePreference(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConferencePreferenceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the existing conference preferences.
      */
    def getConferencePreference(params: GetConferencePreferenceRequest): awsDashSdkLib.libRequestMod.Request[GetConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConferencePreference(
      params: GetConferencePreferenceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConferencePreferenceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a specific conference provider.
      */
    def getConferenceProvider(): awsDashSdkLib.libRequestMod.Request[GetConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConferenceProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets details about a specific conference provider.
      */
    def getConferenceProvider(params: GetConferenceProviderRequest): awsDashSdkLib.libRequestMod.Request[GetConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getConferenceProvider(
      params: GetConferenceProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the contact details by the contact ARN.
      */
    def getContact(): awsDashSdkLib.libRequestMod.Request[GetContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the contact details by the contact ARN.
      */
    def getContact(params: GetContactRequest): awsDashSdkLib.libRequestMod.Request[GetContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getContact(
      params: GetContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the details of a device by device ARN.
      */
    def getDevice(): awsDashSdkLib.libRequestMod.Request[GetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the details of a device by device ARN.
      */
    def getDevice(params: GetDeviceRequest): awsDashSdkLib.libRequestMod.Request[GetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getDevice(
      params: GetDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the configured values for the user enrollment invitation email template.
      */
    def getInvitationConfiguration(): awsDashSdkLib.libRequestMod.Request[GetInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvitationConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Retrieves the configured values for the user enrollment invitation email template.
      */
    def getInvitationConfiguration(params: GetInvitationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getInvitationConfiguration(
      params: GetInvitationConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetInvitationConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the details of a room profile by profile ARN.
      */
    def getProfile(): awsDashSdkLib.libRequestMod.Request[GetProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets the details of a room profile by profile ARN.
      */
    def getProfile(params: GetProfileRequest): awsDashSdkLib.libRequestMod.Request[GetProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getProfile(
      params: GetProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets room details by room ARN.
      */
    def getRoom(): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRoom(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoomResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets room details by room ARN.
      */
    def getRoom(params: GetRoomRequest): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRoom(
      params: GetRoomRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoomResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets room skill parameter details by room, skill, and parameter key ARN.
      */
    def getRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[GetRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRoomSkillParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets room skill parameter details by room, skill, and parameter key ARN.
      */
    def getRoomSkillParameter(params: GetRoomSkillParameterRequest): awsDashSdkLib.libRequestMod.Request[GetRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getRoomSkillParameter(
      params: GetRoomSkillParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets skill group details by skill group ARN.
      */
    def getSkillGroup(): awsDashSdkLib.libRequestMod.Request[GetSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Gets skill group details by skill group ARN.
      */
    def getSkillGroup(params: GetSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[GetSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def getSkillGroup(
      params: GetSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the details of the schedules that a user configured.
      */
    def listBusinessReportSchedules(): awsDashSdkLib.libRequestMod.Request[ListBusinessReportSchedulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBusinessReportSchedules(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBusinessReportSchedulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBusinessReportSchedulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the details of the schedules that a user configured.
      */
    def listBusinessReportSchedules(params: ListBusinessReportSchedulesRequest): awsDashSdkLib.libRequestMod.Request[ListBusinessReportSchedulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listBusinessReportSchedules(
      params: ListBusinessReportSchedulesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListBusinessReportSchedulesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListBusinessReportSchedulesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists conference providers under a specific AWS account.
      */
    def listConferenceProviders(): awsDashSdkLib.libRequestMod.Request[ListConferenceProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConferenceProviders(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConferenceProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConferenceProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists conference providers under a specific AWS account.
      */
    def listConferenceProviders(params: ListConferenceProvidersRequest): awsDashSdkLib.libRequestMod.Request[ListConferenceProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listConferenceProviders(
      params: ListConferenceProvidersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListConferenceProvidersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListConferenceProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the device event history, including device connection status, for up to 30 days.
      */
    def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeviceEvents(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeviceEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists the device event history, including device connection status, for up to 30 days.
      */
    def listDeviceEvents(params: ListDeviceEventsRequest): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listDeviceEvents(
      params: ListDeviceEventsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListDeviceEventsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all enabled skills in a specific skill group.
      */
    def listSkills(): awsDashSdkLib.libRequestMod.Request[ListSkillsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkills(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all enabled skills in a specific skill group.
      */
    def listSkills(params: ListSkillsRequest): awsDashSdkLib.libRequestMod.Request[ListSkillsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkills(
      params: ListSkillsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all categories in the Alexa skill store.
      */
    def listSkillsStoreCategories(): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkillsStoreCategories(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsStoreCategoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all categories in the Alexa skill store.
      */
    def listSkillsStoreCategories(params: ListSkillsStoreCategoriesRequest): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkillsStoreCategories(
      params: ListSkillsStoreCategoriesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsStoreCategoriesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreCategoriesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all skills in the Alexa skill store by category.
      */
    def listSkillsStoreSkillsByCategory(): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreSkillsByCategoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkillsStoreSkillsByCategory(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsStoreSkillsByCategoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreSkillsByCategoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all skills in the Alexa skill store by category.
      */
    def listSkillsStoreSkillsByCategory(params: ListSkillsStoreSkillsByCategoryRequest): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreSkillsByCategoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSkillsStoreSkillsByCategory(
      params: ListSkillsStoreSkillsByCategoryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsStoreSkillsByCategoryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsStoreSkillsByCategoryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the smart home appliances associated with a room.
      */
    def listSmartHomeAppliances(): awsDashSdkLib.libRequestMod.Request[ListSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSmartHomeAppliances(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSmartHomeAppliancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all of the smart home appliances associated with a room.
      */
    def listSmartHomeAppliances(params: ListSmartHomeAppliancesRequest): awsDashSdkLib.libRequestMod.Request[ListSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listSmartHomeAppliances(
      params: ListSmartHomeAppliancesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSmartHomeAppliancesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSmartHomeAppliancesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags for the specified resource.
      */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Lists all tags for the specified resource.
      */
    def listTags(params: ListTagsRequest): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the conference preferences on a specific conference provider at the account level.
      */
    def putConferencePreference(): awsDashSdkLib.libRequestMod.Request[PutConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConferencePreference(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConferencePreferenceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sets the conference preferences on a specific conference provider at the account level.
      */
    def putConferencePreference(params: PutConferencePreferenceRequest): awsDashSdkLib.libRequestMod.Request[PutConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putConferencePreference(
      params: PutConferencePreferenceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutConferencePreferenceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutConferencePreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures the email template for the user enrollment invitation with the specified attributes.
      */
    def putInvitationConfiguration(): awsDashSdkLib.libRequestMod.Request[PutInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putInvitationConfiguration(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutInvitationConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Configures the email template for the user enrollment invitation with the specified attributes.
      */
    def putInvitationConfiguration(params: PutInvitationConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putInvitationConfiguration(
      params: PutInvitationConfigurationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutInvitationConfigurationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutInvitationConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
      */
    def putRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRoomSkillParameter(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
      */
    def putRoomSkillParameter(params: PutRoomSkillParameterRequest): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putRoomSkillParameter(
      params: PutRoomSkillParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
      */
    def putSkillAuthorization(): awsDashSdkLib.libRequestMod.Request[PutSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSkillAuthorization(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSkillAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
      */
    def putSkillAuthorization(params: PutSkillAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[PutSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def putSkillAuthorization(
      params: PutSkillAuthorizationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutSkillAuthorizationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutSkillAuthorizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
      */
    def registerAVSDevice(): awsDashSdkLib.libRequestMod.Request[RegisterAVSDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerAVSDevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterAVSDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterAVSDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
      */
    def registerAVSDevice(params: RegisterAVSDeviceRequest): awsDashSdkLib.libRequestMod.Request[RegisterAVSDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerAVSDevice(
      params: RegisterAVSDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterAVSDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterAVSDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
      */
    def rejectSkill(): awsDashSdkLib.libRequestMod.Request[RejectSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectSkill(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectSkillResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
      */
    def rejectSkill(params: RejectSkillRequest): awsDashSdkLib.libRequestMod.Request[RejectSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def rejectSkill(
      params: RejectSkillRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RejectSkillResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RejectSkillResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
      */
    def resolveRoom(): awsDashSdkLib.libRequestMod.Request[ResolveRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
      */
    def resolveRoom(params: ResolveRoomRequest): awsDashSdkLib.libRequestMod.Request[ResolveRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveRoom(
      params: ResolveRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes an invitation and invalidates the enrollment URL.
      */
    def revokeInvitation(): awsDashSdkLib.libRequestMod.Request[RevokeInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeInvitation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Revokes an invitation and invalidates the enrollment URL.
      */
    def revokeInvitation(params: RevokeInvitationRequest): awsDashSdkLib.libRequestMod.Request[RevokeInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def revokeInvitation(
      params: RevokeInvitationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RevokeInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RevokeInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches address books and lists the ones that meet a set of filter and sort criteria.
      */
    def searchAddressBooks(): awsDashSdkLib.libRequestMod.Request[SearchAddressBooksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchAddressBooks(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchAddressBooksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchAddressBooksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches address books and lists the ones that meet a set of filter and sort criteria.
      */
    def searchAddressBooks(params: SearchAddressBooksRequest): awsDashSdkLib.libRequestMod.Request[SearchAddressBooksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchAddressBooks(
      params: SearchAddressBooksRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchAddressBooksResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchAddressBooksResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches contacts and lists the ones that meet a set of filter and sort criteria.
      */
    def searchContacts(): awsDashSdkLib.libRequestMod.Request[SearchContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchContacts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchContactsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches contacts and lists the ones that meet a set of filter and sort criteria.
      */
    def searchContacts(params: SearchContactsRequest): awsDashSdkLib.libRequestMod.Request[SearchContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchContacts(
      params: SearchContactsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchContactsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchContactsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches devices and lists the ones that meet a set of filter criteria.
      */
    def searchDevices(): awsDashSdkLib.libRequestMod.Request[SearchDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchDevices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchDevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches devices and lists the ones that meet a set of filter criteria.
      */
    def searchDevices(params: SearchDevicesRequest): awsDashSdkLib.libRequestMod.Request[SearchDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchDevices(
      params: SearchDevicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchDevicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches room profiles and lists the ones that meet a set of filter criteria.
      */
    def searchProfiles(): awsDashSdkLib.libRequestMod.Request[SearchProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchProfiles(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches room profiles and lists the ones that meet a set of filter criteria.
      */
    def searchProfiles(params: SearchProfilesRequest): awsDashSdkLib.libRequestMod.Request[SearchProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchProfiles(
      params: SearchProfilesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchProfilesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchProfilesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches rooms and lists the ones that meet a set of filter and sort criteria.
      */
    def searchRooms(): awsDashSdkLib.libRequestMod.Request[SearchRoomsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchRooms(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchRoomsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchRoomsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches rooms and lists the ones that meet a set of filter and sort criteria.
      */
    def searchRooms(params: SearchRoomsRequest): awsDashSdkLib.libRequestMod.Request[SearchRoomsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchRooms(
      params: SearchRoomsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchRoomsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchRoomsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
      */
    def searchSkillGroups(): awsDashSdkLib.libRequestMod.Request[SearchSkillGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchSkillGroups(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchSkillGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchSkillGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
      */
    def searchSkillGroups(params: SearchSkillGroupsRequest): awsDashSdkLib.libRequestMod.Request[SearchSkillGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchSkillGroups(
      params: SearchSkillGroupsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchSkillGroupsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchSkillGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches users and lists the ones that meet a set of filter and sort criteria.
      */
    def searchUsers(): awsDashSdkLib.libRequestMod.Request[SearchUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchUsers(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Searches users and lists the ones that meet a set of filter and sort criteria.
      */
    def searchUsers(params: SearchUsersRequest): awsDashSdkLib.libRequestMod.Request[SearchUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def searchUsers(
      params: SearchUsersRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SearchUsersResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SearchUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
      */
    def sendInvitation(): awsDashSdkLib.libRequestMod.Request[SendInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendInvitation(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
      */
    def sendInvitation(params: SendInvitationRequest): awsDashSdkLib.libRequestMod.Request[SendInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def sendInvitation(
      params: SendInvitationRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ SendInvitationResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[SendInvitationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
      */
    def startDeviceSync(): awsDashSdkLib.libRequestMod.Request[StartDeviceSyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startDeviceSync(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDeviceSyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDeviceSyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
      */
    def startDeviceSync(params: StartDeviceSyncRequest): awsDashSdkLib.libRequestMod.Request[StartDeviceSyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startDeviceSync(
      params: StartDeviceSyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDeviceSyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDeviceSyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates the discovery of any smart home appliances associated with the room.
      */
    def startSmartHomeApplianceDiscovery(): awsDashSdkLib.libRequestMod.Request[StartSmartHomeApplianceDiscoveryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSmartHomeApplianceDiscovery(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSmartHomeApplianceDiscoveryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSmartHomeApplianceDiscoveryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Initiates the discovery of any smart home appliances associated with the room.
      */
    def startSmartHomeApplianceDiscovery(params: StartSmartHomeApplianceDiscoveryRequest): awsDashSdkLib.libRequestMod.Request[StartSmartHomeApplianceDiscoveryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def startSmartHomeApplianceDiscovery(
      params: StartSmartHomeApplianceDiscoveryRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartSmartHomeApplianceDiscoveryResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartSmartHomeApplianceDiscoveryResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds metadata tags to a specified resource.
      */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Adds metadata tags to a specified resource.
      */
    def tagResource(params: TagResourceRequest): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def tagResource(
      params: TagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ TagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from a specified resource.
      */
    def untagResource(): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Removes metadata tags from a specified resource.
      */
    def untagResource(params: UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def untagResource(
      params: UntagResourceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UntagResourceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UntagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates address book details by the address book ARN.
      */
    def updateAddressBook(): awsDashSdkLib.libRequestMod.Request[UpdateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAddressBook(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates address book details by the address book ARN.
      */
    def updateAddressBook(params: UpdateAddressBookRequest): awsDashSdkLib.libRequestMod.Request[UpdateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateAddressBook(
      params: UpdateAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration of the report delivery schedule with the specified schedule ARN.
      */
    def updateBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[UpdateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBusinessReportSchedule(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the configuration of the report delivery schedule with the specified schedule ARN.
      */
    def updateBusinessReportSchedule(params: UpdateBusinessReportScheduleRequest): awsDashSdkLib.libRequestMod.Request[UpdateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateBusinessReportSchedule(
      params: UpdateBusinessReportScheduleRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateBusinessReportScheduleResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateBusinessReportScheduleResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing conference provider's settings.
      */
    def updateConferenceProvider(): awsDashSdkLib.libRequestMod.Request[UpdateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConferenceProvider(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing conference provider's settings.
      */
    def updateConferenceProvider(params: UpdateConferenceProviderRequest): awsDashSdkLib.libRequestMod.Request[UpdateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateConferenceProvider(
      params: UpdateConferenceProviderRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateConferenceProviderResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateConferenceProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the contact details by the contact ARN.
      */
    def updateContact(): awsDashSdkLib.libRequestMod.Request[UpdateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContact(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the contact details by the contact ARN.
      */
    def updateContact(params: UpdateContactRequest): awsDashSdkLib.libRequestMod.Request[UpdateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateContact(
      params: UpdateContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the device name by device ARN.
      */
    def updateDevice(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDevice(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates the device name by device ARN.
      */
    def updateDevice(params: UpdateDeviceRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateDevice(
      params: UpdateDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing room profile by room profile ARN.
      */
    def updateProfile(): awsDashSdkLib.libRequestMod.Request[UpdateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateProfile(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates an existing room profile by room profile ARN.
      */
    def updateProfile(params: UpdateProfileRequest): awsDashSdkLib.libRequestMod.Request[UpdateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateProfile(
      params: UpdateProfileRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateProfileResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates room details by room ARN.
      */
    def updateRoom(): awsDashSdkLib.libRequestMod.Request[UpdateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoom(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates room details by room ARN.
      */
    def updateRoom(params: UpdateRoomRequest): awsDashSdkLib.libRequestMod.Request[UpdateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateRoom(
      params: UpdateRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates skill group details by skill group ARN.
      */
    def updateSkillGroup(): awsDashSdkLib.libRequestMod.Request[UpdateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSkillGroup(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Updates skill group details by skill group ARN.
      */
    def updateSkillGroup(params: UpdateSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def updateSkillGroup(
      params: UpdateSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The ARN of the resource from which to remove metadata tags. Required. 
      */
    var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    /**
      * The tags to be removed from the specified resource. Do not provide system tags. Required. 
      */
    var TagKeys: TagKeyList
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateAddressBookRequest extends js.Object {
    /**
      * The ARN of the room to update.
      */
    var AddressBookArn: Arn
    /**
      * The updated description of the room.
      */
    var Description: js.UndefOr[AddressBookDescription] = js.undefined
    /**
      * The updated name of the room.
      */
    var Name: js.UndefOr[AddressBookName] = js.undefined
  }
  
  trait UpdateAddressBookResponse extends js.Object
  
  trait UpdateBusinessReportScheduleRequest extends js.Object {
    /**
      * The format of the generated report (individual CSV files or zipped files of individual files).
      */
    var Format: js.UndefOr[BusinessReportFormat] = js.undefined
    /**
      * The recurrence of the reports.
      */
    var Recurrence: js.UndefOr[BusinessReportRecurrence] = js.undefined
    /**
      * The S3 location of the output reports.
      */
    var S3BucketName: js.UndefOr[CustomerS3BucketName] = js.undefined
    /**
      * The S3 key where the report is delivered.
      */
    var S3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.undefined
    /**
      * The ARN of the business report schedule.
      */
    var ScheduleArn: Arn
    /**
      * The name identifier of the schedule.
      */
    var ScheduleName: js.UndefOr[BusinessReportScheduleName] = js.undefined
  }
  
  trait UpdateBusinessReportScheduleResponse extends js.Object
  
  trait UpdateConferenceProviderRequest extends js.Object {
    /**
      * The ARN of the conference provider.
      */
    var ConferenceProviderArn: Arn
    /**
      * The type of the conference provider.
      */
    var ConferenceProviderType: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderType
    /**
      * The IP endpoint and protocol for calling.
      */
    var IPDialIn: js.UndefOr[IPDialIn] = js.undefined
    /**
      * The meeting settings for the conference provider.
      */
    var MeetingSetting: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MeetingSetting
    /**
      * The information for PSTN conferencing.
      */
    var PSTNDialIn: js.UndefOr[PSTNDialIn] = js.undefined
  }
  
  trait UpdateConferenceProviderResponse extends js.Object
  
  trait UpdateContactRequest extends js.Object {
    /**
      * The ARN of the contact to update.
      */
    var ContactArn: Arn
    /**
      * The updated display name of the contact.
      */
    var DisplayName: js.UndefOr[ContactName] = js.undefined
    /**
      * The updated first name of the contact.
      */
    var FirstName: js.UndefOr[ContactName] = js.undefined
    /**
      * The updated last name of the contact.
      */
    var LastName: js.UndefOr[ContactName] = js.undefined
    /**
      * The updated phone number of the contact.
      */
    var PhoneNumber: js.UndefOr[E164PhoneNumber] = js.undefined
  }
  
  trait UpdateContactResponse extends js.Object
  
  trait UpdateDeviceRequest extends js.Object {
    /**
      * The ARN of the device to update. Required.
      */
    var DeviceArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated device name. Required.
      */
    var DeviceName: js.UndefOr[DeviceName] = js.undefined
  }
  
  trait UpdateDeviceResponse extends js.Object
  
  trait UpdateProfileRequest extends js.Object {
    /**
      * The updated address for the room profile.
      */
    var Address: js.UndefOr[Address] = js.undefined
    /**
      * The updated distance unit for the room profile.
      */
    var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
    /**
      * Sets the profile as default if selected. If this is missing, no update is done to the default status.
      */
    var IsDefault: js.UndefOr[Boolean] = js.undefined
    /**
      * The updated maximum volume limit for the room profile.
      */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
      * Whether the PSTN setting of the room profile is enabled.
      */
    var PSTNEnabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The ARN of the room profile to update. Required.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated name for the room profile.
      */
    var ProfileName: js.UndefOr[ProfileName] = js.undefined
    /**
      * Whether the setup mode of the profile is enabled.
      */
    var SetupModeDisabled: js.UndefOr[Boolean] = js.undefined
    /**
      * The updated temperature unit for the room profile.
      */
    var TemperatureUnit: js.UndefOr[TemperatureUnit] = js.undefined
    /**
      * The updated timezone for the room profile.
      */
    var Timezone: js.UndefOr[Timezone] = js.undefined
    /**
      * The updated wake word for the room profile.
      */
    var WakeWord: js.UndefOr[WakeWord] = js.undefined
  }
  
  trait UpdateProfileResponse extends js.Object
  
  trait UpdateRoomRequest extends js.Object {
    /**
      * The updated description for the room.
      */
    var Description: js.UndefOr[RoomDescription] = js.undefined
    /**
      * The updated profile ARN for the room.
      */
    var ProfileArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated provider calendar ARN for the room.
      */
    var ProviderCalendarId: js.UndefOr[ProviderCalendarId] = js.undefined
    /**
      * The ARN of the room to update. 
      */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated name for the room.
      */
    var RoomName: js.UndefOr[RoomName] = js.undefined
  }
  
  trait UpdateRoomResponse extends js.Object
  
  trait UpdateSkillGroupRequest extends js.Object {
    /**
      * The updated description for the skill group.
      */
    var Description: js.UndefOr[SkillGroupDescription] = js.undefined
    /**
      * The ARN of the skill group to update. 
      */
    var SkillGroupArn: js.UndefOr[Arn] = js.undefined
    /**
      * The updated name for the skill group.
      */
    var SkillGroupName: js.UndefOr[SkillGroupName] = js.undefined
  }
  
  trait UpdateSkillGroupResponse extends js.Object
  
  trait UserData extends js.Object {
    /**
      * The email of a user.
      */
    var Email: js.UndefOr[Email] = js.undefined
    /**
      * The enrollment ARN of a user.
      */
    var EnrollmentId: js.UndefOr[EnrollmentId] = js.undefined
    /**
      * The enrollment status of a user.
      */
    var EnrollmentStatus: js.UndefOr[EnrollmentStatus] = js.undefined
    /**
      * The first name of a user.
      */
    var FirstName: js.UndefOr[user_FirstName] = js.undefined
    /**
      * The last name of a user.
      */
    var LastName: js.UndefOr[user_LastName] = js.undefined
    /**
      * The ARN of a user.
      */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  trait _BusinessReportFailureCode extends js.Object
  
  trait _BusinessReportFormat extends js.Object
  
  trait _BusinessReportInterval extends js.Object
  
  trait _BusinessReportStatus extends js.Object
  
  trait _CommsProtocol extends js.Object
  
  trait _ConferenceProviderType extends js.Object
  
  trait _ConnectionStatus extends js.Object
  
  trait _DeviceEventType extends js.Object
  
  trait _DeviceStatus extends js.Object
  
  trait _DeviceStatusDetailCode extends js.Object
  
  trait _DistanceUnit extends js.Object
  
  trait _EnablementType extends js.Object
  
  trait _EnablementTypeFilter extends js.Object
  
  trait _EnrollmentStatus extends js.Object
  
  trait _Feature extends js.Object
  
  trait _RequirePin extends js.Object
  
  trait _SkillType extends js.Object
  
  trait _SkillTypeFilter extends js.Object
  
  trait _SortValue extends js.Object
  
  trait _TemperatureUnit extends js.Object
  
  trait _WakeWord extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Address = java.lang.String
  type AddressBookDataList = js.Array[AddressBookData]
  type AddressBookDescription = java.lang.String
  type AddressBookName = java.lang.String
  type AmazonId = java.lang.String
  type ApplianceDescription = java.lang.String
  type ApplianceFriendlyName = java.lang.String
  type ApplianceManufacturerName = java.lang.String
  type Arn = java.lang.String
  type Boolean = scala.Boolean
  type BulletPoint = java.lang.String
  type BulletPoints = js.Array[BulletPoint]
  type BusinessReportDownloadUrl = java.lang.String
  type BusinessReportFailureCode = _BusinessReportFailureCode | java.lang.String
  type BusinessReportFormat = _BusinessReportFormat | java.lang.String
  type BusinessReportInterval = _BusinessReportInterval | java.lang.String
  type BusinessReportS3Path = java.lang.String
  type BusinessReportScheduleList = js.Array[BusinessReportSchedule]
  type BusinessReportScheduleName = java.lang.String
  type BusinessReportStatus = _BusinessReportStatus | java.lang.String
  type CategoryId = scala.Double
  type CategoryList = js.Array[Category]
  type CategoryName = java.lang.String
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientId = java.lang.String
  type ClientRequestToken = java.lang.String
  type CommsProtocol = _CommsProtocol | java.lang.String
  type ConferenceProviderName = java.lang.String
  type ConferenceProviderType = _ConferenceProviderType | java.lang.String
  type ConferenceProvidersList = js.Array[ConferenceProvider]
  type ConnectionStatus = _ConnectionStatus | java.lang.String
  type ContactDataList = js.Array[ContactData]
  type ContactName = java.lang.String
  type CountryCode = java.lang.String
  type CustomerS3BucketName = java.lang.String
  type DeveloperName = java.lang.String
  type DeviceDataList = js.Array[DeviceData]
  type DeviceEventList = js.Array[DeviceEvent]
  type DeviceEventType = _DeviceEventType | java.lang.String
  type DeviceEventValue = java.lang.String
  type DeviceName = java.lang.String
  type DeviceSerialNumber = java.lang.String
  type DeviceSerialNumberForAVS = java.lang.String
  type DeviceStatus = _DeviceStatus | java.lang.String
  type DeviceStatusDetailCode = _DeviceStatusDetailCode | java.lang.String
  type DeviceStatusDetails = js.Array[DeviceStatusDetail]
  type DeviceType = java.lang.String
  type DistanceUnit = _DistanceUnit | java.lang.String
  type E164PhoneNumber = java.lang.String
  type Email = java.lang.String
  type EnablementType = _EnablementType | java.lang.String
  type EnablementTypeFilter = _EnablementTypeFilter | java.lang.String
  type EndUserLicenseAgreement = java.lang.String
  type Endpoint = java.lang.String
  type EnrollmentId = java.lang.String
  type EnrollmentStatus = _EnrollmentStatus | java.lang.String
  type Feature = _Feature | java.lang.String
  type Features = js.Array[Feature]
  type FilterKey = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type GenericKeyword = java.lang.String
  type GenericKeywords = js.Array[GenericKeyword]
  type IconUrl = java.lang.String
  type InvocationPhrase = java.lang.String
  type Key = java.lang.String
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type MaxVolumeLimit = scala.Double
  type NewInThisVersionBulletPoints = js.Array[BulletPoint]
  type NextToken = java.lang.String
  type OneClickIdDelay = java.lang.String
  type OneClickPinDelay = java.lang.String
  type OrganizationName = java.lang.String
  type OutboundPhoneNumber = java.lang.String
  type PrivacyPolicy = java.lang.String
  type ProductDescription = java.lang.String
  type ProductId = java.lang.String
  type ProfileDataList = js.Array[ProfileData]
  type ProfileName = java.lang.String
  type ProviderCalendarId = java.lang.String
  type ReleaseDate = java.lang.String
  type RequirePin = _RequirePin | java.lang.String
  type ReviewKey = java.lang.String
  type ReviewValue = java.lang.String
  type RoomDataList = js.Array[RoomData]
  type RoomDescription = java.lang.String
  type RoomName = java.lang.String
  type RoomSkillParameterKey = java.lang.String
  type RoomSkillParameterValue = java.lang.String
  type RoomSkillParameters = js.Array[RoomSkillParameter]
  type S3KeyPrefix = java.lang.String
  type SampleUtterances = js.Array[Utterance]
  type ShortDescription = java.lang.String
  type ShortSkillIdList = js.Array[SkillId]
  type SkillGroupDataList = js.Array[SkillGroupData]
  type SkillGroupDescription = java.lang.String
  type SkillGroupName = java.lang.String
  type SkillId = java.lang.String
  type SkillListMaxResults = scala.Double
  type SkillName = java.lang.String
  type SkillStoreType = java.lang.String
  type SkillSummaryList = js.Array[SkillSummary]
  type SkillType = _SkillType | java.lang.String
  type SkillTypeFilter = _SkillTypeFilter | java.lang.String
  type SkillTypes = js.Array[SkillStoreType]
  type SkillsStoreSkillList = js.Array[SkillsStoreSkill]
  type SmartHomeApplianceList = js.Array[SmartHomeAppliance]
  type SoftwareVersion = java.lang.String
  type SortKey = java.lang.String
  type SortList = js.Array[Sort]
  type SortValue = _SortValue | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TemperatureUnit = _TemperatureUnit | java.lang.String
  type Timestamp = stdLib.Date
  type Timezone = java.lang.String
  type TotalCount = scala.Double
  type Url = java.lang.String
  type UserCode = java.lang.String
  type UserDataList = js.Array[UserData]
  type UserId = java.lang.String
  type Utterance = java.lang.String
  type Value = java.lang.String
  type WakeWord = _WakeWord | java.lang.String
  type _Date = java.lang.String
  type apiVersion = _apiVersion | java.lang.String
  type user_FirstName = java.lang.String
  type user_LastName = java.lang.String
  type user_UserId = java.lang.String
}

