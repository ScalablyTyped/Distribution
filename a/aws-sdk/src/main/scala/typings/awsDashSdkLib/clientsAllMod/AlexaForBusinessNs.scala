package typings
package awsDashSdkLib.clientsAllMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/all", "AlexaForBusiness")
@js.native
object AlexaForBusinessNs extends js.Object {
  @js.native
  class Types ()
    extends awsDashSdkLib.clientsAlexaforbusinessMod.Types {
    /**
       * Constructs a service object. This object has one method for each API operation.
       */
    def this(options: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientConfiguration) = this()
  }
  
  val TypesNs: this.type = js.native
  @JSName("AlexaForBusiness")
  @js.native
  object AlexaForBusinessNs extends js.Object {
    
    trait AddressBook extends js.Object {
      /**
           * The ARN of the address book.
           */
      var AddressBookArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The description of the address book.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookDescription
          ] = js.undefined
      /**
           * The name of the address book.
           */
      var Name: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookName] = js.undefined
    }
    
    
    trait AddressBookData extends js.Object {
      /**
           * The ARN of the address book.
           */
      var AddressBookArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The description of the address book.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookDescription
          ] = js.undefined
      /**
           * The name of the address book.
           */
      var Name: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookName] = js.undefined
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
      var AddressBookArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The ARN of the contact to associate with an address book.
           */
      var ContactArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait AssociateContactWithAddressBookResponse extends js.Object
    
    
    trait AssociateDeviceWithRoomRequest extends js.Object {
      /**
           * The ARN of the device to associate to a room. Required.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The ARN of the room with which to associate the device. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait AssociateDeviceWithRoomResponse extends js.Object
    
    
    trait AssociateSkillGroupWithRoomRequest extends js.Object {
      /**
           * The ARN of the room with which to associate the skill group. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The ARN of the skill group to associate with a room. Required.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait AssociateSkillGroupWithRoomResponse extends js.Object
    
    
    trait AssociateSkillWithSkillGroupRequest extends js.Object {
      /**
           * The ARN of the skill group to associate the skill to. Required.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The unique identifier of the skill.
           */
      var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
    }
    
    
    trait AssociateSkillWithSkillGroupResponse extends js.Object
    
    
    trait AssociateSkillWithUsersRequest extends js.Object {
      /**
           * The ARN of the organization.
           */
      var OrganizationArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The private skill ID you want to make available to enrolled users.&gt;
           */
      var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
    }
    
    
    trait AssociateSkillWithUsersResponse extends js.Object
    
    
    trait AuthorizationResult
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Value]
    
    
    trait BusinessReport extends js.Object {
      /**
           * The time of report delivery.
           */
      var DeliveryTime: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timestamp] = js.undefined
      /**
           * The download link where a user can download the report.
           */
      var DownloadUrl: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportDownloadUrl
          ] = js.undefined
      /**
           * The failure code.
           */
      var FailureCode: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportFailureCode
          ] = js.undefined
      /**
           * The S3 location of the output reports.
           */
      var S3Location: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportS3Location
          ] = js.undefined
      /**
           * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
           */
      var Status: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportStatus] = js.undefined
    }
    
    
    trait BusinessReportContentRange extends js.Object {
      /**
           * The interval of the content range.
           */
      var Interval: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportInterval
          ] = js.undefined
    }
    
    
    trait BusinessReportRecurrence extends js.Object {
      /**
           * The start date.
           */
      var StartDate: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs._Date] = js.undefined
    }
    
    
    trait BusinessReportS3Location extends js.Object {
      /**
           * The S3 bucket name of the output reports.
           */
      var BucketName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CustomerS3BucketName] = js.undefined
      /**
           * The path of the business report.
           */
      var Path: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportS3Path] = js.undefined
    }
    
    
    trait BusinessReportSchedule extends js.Object {
      /**
           * The content range of the reports.
           */
      var ContentRange: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportContentRange
          ] = js.undefined
      /**
           * The format of the generated report (individual CSV files or zipped files of individual files).
           */
      var Format: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportFormat] = js.undefined
      /**
           * The details of the last business report delivery for a specified time interval.
           */
      var LastBusinessReport: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReport] = js.undefined
      /**
           * The recurrence of the reports.
           */
      var Recurrence: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportRecurrence
          ] = js.undefined
      /**
           * The S3 bucket name of the output reports.
           */
      var S3BucketName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CustomerS3BucketName] = js.undefined
      /**
           * The S3 key where the report is delivered.
           */
      var S3KeyPrefix: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.S3KeyPrefix] = js.undefined
      /**
           * The ARN of the business report schedule.
           */
      var ScheduleArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name identifier of the schedule.
           */
      var ScheduleName: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportScheduleName
          ] = js.undefined
    }
    
    
    trait Category extends js.Object {
      /**
           * The ID of the skill store category.
           */
      var CategoryId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CategoryId] = js.undefined
      /**
           * The name of the skill store category.
           */
      var CategoryName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CategoryName] = js.undefined
    }
    
    
    trait ClientApiVersions extends js.Object {
      /**
           * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
           */
      var apiVersion: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.apiVersion] = js.undefined
    }
    
    
    trait ConferencePreference extends js.Object {
      /**
           * The ARN of the default conference provider.
           */
      var DefaultConferenceProviderArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait ConferenceProvider extends js.Object {
      /**
           * The ARN of the newly created conference provider.
           */
      var Arn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The IP endpoint and protocol for calling.
           */
      var IPDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.IPDialIn] = js.undefined
      /**
           * The meeting settings for the conference provider.
           */
      var MeetingSetting: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MeetingSetting] = js.undefined
      /**
           * The name of the conference provider.
           */
      var Name: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderName
          ] = js.undefined
      /**
           * The information for PSTN conferencing.
           */
      var PSTNDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PSTNDialIn] = js.undefined
      /**
           * The type of conference providers.
           */
      var Type: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderType
          ] = js.undefined
    }
    
    
    trait Contact extends js.Object {
      /**
           * The ARN of the contact.
           */
      var ContactArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of the contact to display on the console.
           */
      var DisplayName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The first name of the contact, used to call the contact on the device.
           */
      var FirstName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The last name of the contact, used to call the contact on the device.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The phone number of the contact.
           */
      var PhoneNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.E164PhoneNumber] = js.undefined
    }
    
    
    trait ContactData extends js.Object {
      /**
           * The ARN of the contact.
           */
      var ContactArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of the contact to display on the console.
           */
      var DisplayName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The first name of the contact, used to call the contact on the device.
           */
      var FirstName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The last name of the contact, used to call the contact on the device.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The phone number of the contact.
           */
      var PhoneNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.E164PhoneNumber] = js.undefined
    }
    
    
    trait CreateAddressBookRequest extends js.Object {
      /**
           * A unique, user-specified identifier for the request that ensures idempotency.
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The description of the address book.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookDescription
          ] = js.undefined
      /**
           * The name of the address book.
           */
      var Name: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookName
    }
    
    
    trait CreateAddressBookResponse extends js.Object {
      /**
           * The ARN of the newly created address book.
           */
      var AddressBookArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateBusinessReportScheduleRequest extends js.Object {
      /**
           * The client request token.
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The content range of the reports.
           */
      var ContentRange: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportContentRange
      /**
           * The format of the generated report (individual CSV files or zipped files of individual files).
           */
      var Format: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportFormat
      /**
           * The recurrence of the reports.
           */
      var Recurrence: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportRecurrence
          ] = js.undefined
      /**
           * The S3 bucket name of the output reports.
           */
      var S3BucketName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CustomerS3BucketName] = js.undefined
      /**
           * The S3 key where the report is delivered.
           */
      var S3KeyPrefix: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.S3KeyPrefix] = js.undefined
      /**
           * The name identifier of the schedule.
           */
      var ScheduleName: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportScheduleName
          ] = js.undefined
    }
    
    
    trait CreateBusinessReportScheduleResponse extends js.Object {
      /**
           * The ARN of the business report schedule.
           */
      var ScheduleArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateConferenceProviderRequest extends js.Object {
      /**
           * The request token of the client.
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
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
      var IPDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.IPDialIn] = js.undefined
      /**
           * The meeting settings for the conference provider.
           */
      var MeetingSetting: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MeetingSetting
      /**
           * The information for PSTN conferencing.
           */
      var PSTNDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PSTNDialIn] = js.undefined
    }
    
    
    trait CreateConferenceProviderResponse extends js.Object {
      /**
           * The ARN of the newly-created conference provider.
           */
      var ConferenceProviderArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateContactRequest extends js.Object {
      /**
           * A unique, user-specified identifier for this request that ensures idempotency.
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The name of the contact to display on the console.
           */
      var DisplayName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The first name of the contact that is used to call the contact on the device.
           */
      var FirstName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName
      /**
           * The last name of the contact that is used to call the contact on the device.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The phone number of the contact in E.164 format.
           */
      var PhoneNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.E164PhoneNumber] = js.undefined
    }
    
    
    trait CreateContactResponse extends js.Object {
      /**
           * The ARN of the newly created address book.
           */
      var ContactArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateProfileRequest extends js.Object {
      /**
           * The valid address for the room.
           */
      var Address: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Address
      /**
           * The user-specified token that is used during the creation of a profile.
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The distance unit to be used by devices in the profile.
           */
      var DistanceUnit: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DistanceUnit
      /**
           * The maximum volume limit for a room profile.
           */
      var MaxVolumeLimit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxVolumeLimit] = js.undefined
      /**
           * Whether PSTN calling is enabled.
           */
      var PSTNEnabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The name of a room profile.
           */
      var ProfileName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName
      /**
           * Whether room profile setup is enabled.
           */
      var SetupModeDisabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
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
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateRoomRequest extends js.Object {
      /**
           * A unique, user-specified identifier for this request that ensures idempotency. 
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The description for the room.
           */
      var Description: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomDescription] = js.undefined
      /**
           * The profile ARN for the room.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The calendar ARN for the room.
           */
      var ProviderCalendarId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProviderCalendarId] = js.undefined
      /**
           * The name for the room.
           */
      var RoomName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName
      /**
           * The tags for the room.
           */
      var Tags: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagList] = js.undefined
    }
    
    
    trait CreateRoomResponse extends js.Object {
      /**
           * The ARN of the newly created room in the response.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateSkillGroupRequest extends js.Object {
      /**
           * A unique, user-specified identifier for this request that ensures idempotency. 
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The description for the skill group.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupDescription
          ] = js.undefined
      /**
           * The name for the skill group.
           */
      var SkillGroupName: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupName
    }
    
    
    trait CreateSkillGroupResponse extends js.Object {
      /**
           * The ARN of the newly created skill group in the response.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait CreateUserRequest extends js.Object {
      /**
           * A unique, user-specified identifier for this request that ensures idempotency. 
           */
      var ClientRequestToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientRequestToken] = js.undefined
      /**
           * The email address for the user.
           */
      var Email: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Email] = js.undefined
      /**
           * The first name for the user.
           */
      var FirstName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.user_FirstName] = js.undefined
      /**
           * The last name for the user.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.user_LastName] = js.undefined
      /**
           * The tags for the user.
           */
      var Tags: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagList] = js.undefined
      /**
           * The ARN for the user.
           */
      var UserId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.user_UserId
    }
    
    
    trait CreateUserResponse extends js.Object {
      /**
           * The ARN of the newly created user in the response.
           */
      var UserArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DeleteAddressBookRequest extends js.Object {
      /**
           * The ARN of the address book to delete.
           */
      var AddressBookArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DeleteAddressBookResponse extends js.Object
    
    
    trait DeleteBusinessReportScheduleRequest extends js.Object {
      /**
           * The ARN of the business report schedule.
           */
      var ScheduleArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DeleteBusinessReportScheduleResponse extends js.Object
    
    
    trait DeleteConferenceProviderRequest extends js.Object {
      /**
           * The ARN of the conference provider.
           */
      var ConferenceProviderArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DeleteConferenceProviderResponse extends js.Object
    
    
    trait DeleteContactRequest extends js.Object {
      /**
           * The ARN of the contact to delete.
           */
      var ContactArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DeleteContactResponse extends js.Object
    
    
    trait DeleteDeviceRequest extends js.Object {
      /**
           * The ARN of the device for which to request details.
           */
      var DeviceArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DeleteDeviceResponse extends js.Object
    
    
    trait DeleteProfileRequest extends js.Object {
      /**
           * The ARN of the room profile to delete. Required.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DeleteProfileResponse extends js.Object
    
    
    trait DeleteRoomRequest extends js.Object {
      /**
           * The ARN of the room to delete. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DeleteRoomResponse extends js.Object
    
    
    trait DeleteRoomSkillParameterRequest extends js.Object {
      /**
           * The room skill parameter key for which to remove details.
           */
      var ParameterKey: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameterKey
      /**
           * The ARN of the room from which to remove the room skill parameter details.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var UserArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DeleteUserResponse extends js.Object
    
    
    trait DeveloperInfo extends js.Object {
      /**
           * The name of the developer.
           */
      var DeveloperName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeveloperName] = js.undefined
      /**
           * The email of the developer.
           */
      var Email: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Email] = js.undefined
      /**
           * The URL of the privacy policy.
           */
      var PrivacyPolicy: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PrivacyPolicy] = js.undefined
      /**
           * The website of the developer.
           */
      var Url: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Url] = js.undefined
    }
    
    
    trait Device extends js.Object {
      /**
           * The ARN of a device.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a device.
           */
      var DeviceName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceName] = js.undefined
      /**
           * The serial number of a device.
           */
      var DeviceSerialNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceSerialNumber] = js.undefined
      /**
           * The status of a device. If the status is not READY, check the DeviceStatusInfo value for details.
           */
      var DeviceStatus: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatus] = js.undefined
      /**
           * Detailed information about a device's status.
           */
      var DeviceStatusInfo: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatusInfo] = js.undefined
      /**
           * The type of a device.
           */
      var DeviceType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceType] = js.undefined
      /**
           * The MAC address of a device.
           */
      var MacAddress: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MacAddress] = js.undefined
      /**
           * The room ARN of a device.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The software version of a device.
           */
      var SoftwareVersion: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SoftwareVersion] = js.undefined
    }
    
    
    trait DeviceData extends js.Object {
      /**
           * The ARN of a device.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a device.
           */
      var DeviceName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceName] = js.undefined
      /**
           * The serial number of a device.
           */
      var DeviceSerialNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceSerialNumber] = js.undefined
      /**
           * The status of a device.
           */
      var DeviceStatus: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatus] = js.undefined
      /**
           * Detailed information about a device's status.
           */
      var DeviceStatusInfo: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatusInfo] = js.undefined
      /**
           * The type of a device.
           */
      var DeviceType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceType] = js.undefined
      /**
           * The MAC address of a device.
           */
      var MacAddress: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MacAddress] = js.undefined
      /**
           * The room ARN associated with a device.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of the room associated with a device.
           */
      var RoomName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName] = js.undefined
      /**
           * The software version of a device.
           */
      var SoftwareVersion: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SoftwareVersion] = js.undefined
    }
    
    
    trait DeviceEvent extends js.Object {
      /**
           * The time (in epoch) when the event occurred. 
           */
      var Timestamp: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timestamp] = js.undefined
      /**
           * The type of device event.
           */
      var Type: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceEventType] = js.undefined
      /**
           * The value of the event.
           */
      var Value: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceEventValue] = js.undefined
    }
    
    
    trait DeviceStatusDetail extends js.Object {
      /**
           * The device status detail code.
           */
      var Code: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatusDetailCode
          ] = js.undefined
    }
    
    
    trait DeviceStatusInfo extends js.Object {
      /**
           * The latest available information about the connection status of a device. 
           */
      var ConnectionStatus: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConnectionStatus] = js.undefined
      /**
           * One or more device status detail descriptions.
           */
      var DeviceStatusDetails: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatusDetails] = js.undefined
    }
    
    
    trait DisassociateContactFromAddressBookRequest extends js.Object {
      /**
           * The ARN of the address from which to disassociate the contact.
           */
      var AddressBookArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The ARN of the contact to disassociate from an address book.
           */
      var ContactArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait DisassociateContactFromAddressBookResponse extends js.Object
    
    
    trait DisassociateDeviceFromRoomRequest extends js.Object {
      /**
           * The ARN of the device to disassociate from a room. Required.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DisassociateDeviceFromRoomResponse extends js.Object
    
    
    trait DisassociateSkillFromSkillGroupRequest extends js.Object {
      /**
           * The unique identifier of a skill. Required.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The ARN of a skill group to associate to a skill.
           */
      var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
    }
    
    
    trait DisassociateSkillFromSkillGroupResponse extends js.Object
    
    
    trait DisassociateSkillFromUsersRequest extends js.Object {
      /**
           * The ARN of the organization.
           */
      var OrganizationArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The ARN of the skill group to disassociate from a room. Required.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait DisassociateSkillGroupFromRoomResponse extends js.Object
    
    
    trait Filter extends js.Object {
      /**
           * The key of a filter.
           */
      var Key: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterKey
      /**
           * The values of a filter.
           */
      var Values: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterValueList
    }
    
    
    trait ForgetSmartHomeAppliancesRequest extends js.Object {
      /**
           * The room that the appliances are associated with.
           */
      var RoomArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait ForgetSmartHomeAppliancesResponse extends js.Object
    
    
    trait GetAddressBookRequest extends js.Object {
      /**
           * The ARN of the address book for which to request details.
           */
      var AddressBookArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait GetAddressBookResponse extends js.Object {
      /**
           * The details of the requested address book.
           */
      var AddressBook: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBook] = js.undefined
    }
    
    
    trait GetConferencePreferenceRequest extends js.Object
    
    
    trait GetConferencePreferenceResponse extends js.Object {
      /**
           * The conference preference.
           */
      var Preference: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferencePreference] = js.undefined
    }
    
    
    trait GetConferenceProviderRequest extends js.Object {
      /**
           * The ARN of the newly created conference provider.
           */
      var ConferenceProviderArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait GetConferenceProviderResponse extends js.Object {
      /**
           * The conference provider.
           */
      var ConferenceProvider: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProvider] = js.undefined
    }
    
    
    trait GetContactRequest extends js.Object {
      /**
           * The ARN of the contact for which to request details.
           */
      var ContactArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait GetContactResponse extends js.Object {
      /**
           * The details of the requested contact.
           */
      var Contact: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Contact] = js.undefined
    }
    
    
    trait GetDeviceRequest extends js.Object {
      /**
           * The ARN of the device for which to request details. Required.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait GetDeviceResponse extends js.Object {
      /**
           * The details of the device requested. Required.
           */
      var Device: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Device] = js.undefined
    }
    
    
    trait GetProfileRequest extends js.Object {
      /**
           * The ARN of the room profile for which to request details. Required.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait GetProfileResponse extends js.Object {
      /**
           * The details of the room profile requested. Required.
           */
      var Profile: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Profile] = js.undefined
    }
    
    
    trait GetRoomRequest extends js.Object {
      /**
           * The ARN of the room for which to request details. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait GetRoomResponse extends js.Object {
      /**
           * The details of the room requested.
           */
      var Room: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Room] = js.undefined
    }
    
    
    trait GetRoomSkillParameterRequest extends js.Object {
      /**
           * The room skill parameter key for which to get details. Required.
           */
      var ParameterKey: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameterKey
      /**
           * The ARN of the room from which to get the room skill parameter details. 
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The ARN of the skill from which to get the room skill parameter details. Required.
           */
      var SkillId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId
    }
    
    
    trait GetRoomSkillParameterResponse extends js.Object {
      /**
           * The details of the room skill parameter requested. Required.
           */
      var RoomSkillParameter: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameter] = js.undefined
    }
    
    
    trait GetSkillGroupRequest extends js.Object {
      /**
           * The ARN of the skill group for which to get details. Required.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait GetSkillGroupResponse extends js.Object {
      /**
           * The details of the skill group requested. Required.
           */
      var SkillGroup: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroup] = js.undefined
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
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * The token used to list the remaining schedules from the previous API call.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListBusinessReportSchedulesResponse extends js.Object {
      /**
           * The schedule of the reports.
           */
      var BusinessReportSchedules: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportScheduleList
          ] = js.undefined
      /**
           * The token used to list the remaining schedules from the previous API call.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListConferenceProvidersRequest extends js.Object {
      /**
           * The maximum number of conference providers to be returned, per paginated calls.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListConferenceProvidersResponse extends js.Object {
      /**
           * The conference providers.
           */
      var ConferenceProviders: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProvidersList
          ] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListDeviceEventsRequest extends js.Object {
      /**
           * The ARN of a device.
           */
      var DeviceArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The event type to filter device events. If EventType isn't specified, this returns a list of all device events in reverse chronological order. If EventType is specified, this returns a list of device events for that EventType in reverse chronological order. 
           */
      var EventType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceEventType] = js.undefined
      /**
           * The maximum number of results to include in the response. The default value is 50. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults. When the end of results is reached, the response has a value of null.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListDeviceEventsResponse extends js.Object {
      /**
           * The device events requested for the device ARN.
           */
      var DeviceEvents: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceEventList] = js.undefined
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListSkillsRequest extends js.Object {
      /**
           * Whether the skill is enabled under the user's account, or if it requires linking to be used.
           */
      var EnablementType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnablementTypeFilter] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillListMaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The ARN of the skill group for which to list enabled skills.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * Whether the skill is publicly available or is a private skill.
           */
      var SkillType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillTypeFilter] = js.undefined
    }
    
    
    trait ListSkillsResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The list of enabled skills requested. Required.
           */
      var SkillSummaries: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillSummaryList] = js.undefined
    }
    
    
    trait ListSkillsStoreCategoriesRequest extends js.Object {
      /**
           * The maximum number of categories returned, per paginated calls.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListSkillsStoreCategoriesResponse extends js.Object {
      /**
           * The list of categories.
           */
      var CategoryList: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CategoryList] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListSkillsStoreSkillsByCategoryRequest extends js.Object {
      /**
           * The category ID for which the skills are being retrieved from the skill store.
           */
      var CategoryId: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CategoryId
      /**
           * The maximum number of skills returned per paginated calls.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillListMaxResults] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListSkillsStoreSkillsByCategoryResponse extends js.Object {
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The skill store skills.
           */
      var SkillsStoreSkills: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillsStoreSkillList] = js.undefined
    }
    
    
    trait ListSmartHomeAppliancesRequest extends js.Object {
      /**
           * The maximum number of appliances to be returned, per paginated calls.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The room that the appliances are associated with.
           */
      var RoomArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait ListSmartHomeAppliancesResponse extends js.Object {
      /**
           * The tokens used for pagination.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The smart home appliances.
           */
      var SmartHomeAppliances: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SmartHomeApplianceList
          ] = js.undefined
    }
    
    
    trait ListTagsRequest extends js.Object {
      /**
           * The ARN of the specified resource for which to list tags.
           */
      var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. 
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
    }
    
    
    trait ListTagsResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The tags requested for the specified resource.
           */
      var Tags: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagList] = js.undefined
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
      var PhoneNumber: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.OutboundPhoneNumber
    }
    
    
    trait Profile extends js.Object {
      /**
           * The address of a room profile.
           */
      var Address: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Address] = js.undefined
      /**
           * The ARN of the address book.
           */
      var AddressBookArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The distance unit of a room profile.
           */
      var DistanceUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DistanceUnit] = js.undefined
      /**
           * Retrieves if the profile is default or not.
           */
      var IsDefault: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The max volume limit of a room profile.
           */
      var MaxVolumeLimit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxVolumeLimit] = js.undefined
      /**
           * The PSTN setting of a room profile.
           */
      var PSTNEnabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The ARN of a room profile.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a room profile.
           */
      var ProfileName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName] = js.undefined
      /**
           * The setup mode of a room profile.
           */
      var SetupModeDisabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The temperature unit of a room profile.
           */
      var TemperatureUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TemperatureUnit] = js.undefined
      /**
           * The time zone of a room profile.
           */
      var Timezone: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timezone] = js.undefined
      /**
           * The wake word of a room profile.
           */
      var WakeWord: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.WakeWord] = js.undefined
    }
    
    
    trait ProfileData extends js.Object {
      /**
           * The address of a room profile.
           */
      var Address: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Address] = js.undefined
      /**
           * The distance unit of a room profile.
           */
      var DistanceUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DistanceUnit] = js.undefined
      /**
           * Retrieves if the profile data is default or not.
           */
      var IsDefault: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The ARN of a room profile.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a room profile.
           */
      var ProfileName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName] = js.undefined
      /**
           * The temperature unit of a room profile.
           */
      var TemperatureUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TemperatureUnit] = js.undefined
      /**
           * The timezone of a room profile.
           */
      var Timezone: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timezone] = js.undefined
      /**
           * The wake word of a room profile.
           */
      var WakeWord: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.WakeWord] = js.undefined
    }
    
    
    trait PutConferencePreferenceRequest extends js.Object {
      /**
           * The conference preference of a specific conference provider.
           */
      var ConferencePreference: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferencePreference
    }
    
    
    trait PutConferencePreferenceResponse extends js.Object
    
    
    trait PutRoomSkillParameterRequest extends js.Object {
      /**
           * The ARN of the room associated with the room skill parameter. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var DeviceSerialNumber: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceSerialNumberForAVS
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
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
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
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of the room from which the skill request was invoked.
           */
      var RoomName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName] = js.undefined
      /**
           * Response to get the room profile request. Required.
           */
      var RoomSkillParameters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameters] = js.undefined
    }
    
    
    trait Reviews
      extends /* key */ org.scalablytyped.runtime.StringDictionary[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ReviewValue]
    
    
    trait RevokeInvitationRequest extends js.Object {
      /**
           * The ARN of the enrollment invitation to revoke. Required.
           */
      var EnrollmentId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnrollmentId] = js.undefined
      /**
           * The ARN of the user for whom to revoke an enrollment invitation. Required.
           */
      var UserArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait RevokeInvitationResponse extends js.Object
    
    
    trait Room extends js.Object {
      /**
           * The description of a room.
           */
      var Description: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomDescription] = js.undefined
      /**
           * The profile ARN of a room.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The provider calendar ARN of a room.
           */
      var ProviderCalendarId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProviderCalendarId] = js.undefined
      /**
           * The ARN of a room.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a room.
           */
      var RoomName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName] = js.undefined
    }
    
    
    trait RoomData extends js.Object {
      /**
           * The description of a room.
           */
      var Description: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomDescription] = js.undefined
      /**
           * The profile ARN of a room.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The profile name of a room.
           */
      var ProfileName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName] = js.undefined
      /**
           * The provider calendar ARN of a room.
           */
      var ProviderCalendarId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProviderCalendarId] = js.undefined
      /**
           * The ARN of a room.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a room.
           */
      var RoomName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName] = js.undefined
    }
    
    
    trait RoomSkillParameter extends js.Object {
      /**
           * The parameter key of a room skill parameter. ParameterKey is an enumerated type that only takes “DEFAULT” or “SCOPE” as valid values.
           */
      var ParameterKey: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameterKey
      /**
           * The parameter value of a room skill parameter.
           */
      var ParameterValue: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameterValue
    }
    
    
    trait SearchAddressBooksRequest extends js.Object {
      /**
           * The filters to use to list a specified set of address books. The supported filter key is AddressBookName.
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of address books. The supported sort key is AddressBookName.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchAddressBooksResponse extends js.Object {
      /**
           * The address books that meet the specified set of filter criteria, in sort order.
           */
      var AddressBooks: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookDataList] = js.undefined
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The total number of address books returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchContactsRequest extends js.Object {
      /**
           * The filters to use to list a specified set of address books. The supported filter keys are DisplayName, FirstName, LastName, and AddressBookArns.
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response only includes results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of contacts. The supported sort keys are DisplayName, FirstName, and LastName.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchContactsResponse extends js.Object {
      /**
           * The contacts that meet the specified set of filter criteria, in sort order.
           */
      var Contacts: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactDataList] = js.undefined
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The total number of contacts returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchDevicesRequest extends js.Object {
      /**
           * The filters to use to list a specified set of devices. Supported filter keys are DeviceName, DeviceStatus, DeviceStatusDetailCode, RoomName, DeviceType, DeviceSerialNumber, UnassociatedOnly, and ConnectionStatus (ONLINE and OFFLINE).
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of devices. Supported sort keys are DeviceName, DeviceStatus, RoomName, DeviceType, DeviceSerialNumber, and ConnectionStatus.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchDevicesResponse extends js.Object {
      /**
           * The devices that meet the specified set of filter criteria, in sort order.
           */
      var Devices: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceDataList] = js.undefined
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The total number of devices returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchProfilesRequest extends js.Object {
      /**
           * The filters to use to list a specified set of room profiles. Supported filter keys are ProfileName and Address. Required. 
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of room profiles. Supported sort keys are ProfileName and Address.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchProfilesResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The profiles that meet the specified set of filter criteria, in sort order.
           */
      var Profiles: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileDataList] = js.undefined
      /**
           * The total number of room profiles returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchRoomsRequest extends js.Object {
      /**
           * The filters to use to list a specified set of rooms. The supported filter keys are RoomName and ProfileName.
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of rooms. The supported sort keys are RoomName and ProfileName.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchRoomsResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The rooms that meet the specified set of filter criteria, in sort order.
           */
      var Rooms: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomDataList] = js.undefined
      /**
           * The total number of rooms returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchSkillGroupsRequest extends js.Object {
      /**
           * The filters to use to list a specified set of skill groups. The supported filter key is SkillGroupName. 
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. 
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the specified set of skill groups. The supported sort key is SkillGroupName. 
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchSkillGroupsResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The skill groups that meet the filter criteria, in sort order.
           */
      var SkillGroups: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupDataList] = js.undefined
      /**
           * The total number of skill groups returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
    }
    
    
    trait SearchUsersRequest extends js.Object {
      /**
           * The filters to use for listing a specific set of users. Required. Supported filter keys are UserId, FirstName, LastName, Email, and EnrollmentStatus.
           */
      var Filters: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterList] = js.undefined
      /**
           * The maximum number of results to include in the response. If more results exist than the specified MaxResults value, a token is included in the response so that the remaining results can be retrieved. Required.
           */
      var MaxResults: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxResults] = js.undefined
      /**
           * An optional token returned from a prior request. Use this token for pagination of results from this action. If this parameter is specified, the response includes only results beyond the token, up to the value specified by MaxResults. Required.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The sort order to use in listing the filtered set of users. Required. Supported sort keys are UserId, FirstName, LastName, Email, and EnrollmentStatus.
           */
      var SortCriteria: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortList] = js.undefined
    }
    
    
    trait SearchUsersResponse extends js.Object {
      /**
           * The token returned to indicate that there is more data available.
           */
      var NextToken: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NextToken] = js.undefined
      /**
           * The total number of users returned.
           */
      var TotalCount: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TotalCount] = js.undefined
      /**
           * The users that meet the specified set of filter criteria, in sort order.
           */
      var Users: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UserDataList] = js.undefined
    }
    
    
    trait SendInvitationRequest extends js.Object {
      /**
           * The ARN of the user to whom to send an invitation. Required.
           */
      var UserArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait SendInvitationResponse extends js.Object
    
    
    trait SkillDetails extends js.Object {
      /**
           * The details about what the skill supports organized as bullet points.
           */
      var BulletPoints: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BulletPoints] = js.undefined
      /**
           * The details about the developer that published the skill.
           */
      var DeveloperInfo: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeveloperInfo] = js.undefined
      /**
           * The URL of the end user license agreement.
           */
      var EndUserLicenseAgreement: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EndUserLicenseAgreement
          ] = js.undefined
      /**
           * The generic keywords associated with the skill that can be used to find a skill.
           */
      var GenericKeywords: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GenericKeywords] = js.undefined
      /**
           * The phrase used to trigger the skill.
           */
      var InvocationPhrase: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.InvocationPhrase] = js.undefined
      /**
           * The updates added in bullet points.
           */
      var NewInThisVersionBulletPoints: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.NewInThisVersionBulletPoints
          ] = js.undefined
      /**
           * The description of the product.
           */
      var ProductDescription: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProductDescription] = js.undefined
      /**
           * The date when the skill was released.
           */
      var ReleaseDate: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ReleaseDate] = js.undefined
      /**
           * The list of reviews for the skill, including Key and Value pair.
           */
      var Reviews: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Reviews] = js.undefined
      /**
           * The types of skills.
           */
      var SkillTypes: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillTypes] = js.undefined
    }
    
    
    trait SkillGroup extends js.Object {
      /**
           * The description of a skill group.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupDescription
          ] = js.undefined
      /**
           * The ARN of a skill group.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The name of a skill group.
           */
      var SkillGroupName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupName] = js.undefined
    }
    
    
    trait SkillGroupData extends js.Object {
      /**
           * The description of a skill group.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupDescription
          ] = js.undefined
      /**
           * The skill group ARN of a skill group.
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The skill group name of a skill group.
           */
      var SkillGroupName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupName] = js.undefined
    }
    
    
    trait SkillSummary extends js.Object {
      /**
           * Whether the skill is enabled under the user's account, or if it requires linking to be used.
           */
      var EnablementType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnablementType] = js.undefined
      /**
           * The ARN of the skill summary.
           */
      var SkillId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId] = js.undefined
      /**
           * The name of the skill.
           */
      var SkillName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillName] = js.undefined
      /**
           * Whether the skill is publicly available or is a private skill.
           */
      var SkillType: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillType] = js.undefined
      /**
           * Linking support for a skill.
           */
      var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    
    trait SkillsStoreSkill extends js.Object {
      /**
           * The URL where the skill icon resides.
           */
      var IconUrl: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.IconUrl] = js.undefined
      /**
           * Sample utterances that interact with the skill.
           */
      var SampleUtterances: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SampleUtterances] = js.undefined
      /**
           * Short description about the skill.
           */
      var ShortDescription: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ShortDescription] = js.undefined
      /**
           * Information about the skill.
           */
      var SkillDetails: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillDetails] = js.undefined
      /**
           * The ARN of the skill.
           */
      var SkillId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillId] = js.undefined
      /**
           * The name of the skill.
           */
      var SkillName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillName] = js.undefined
      /**
           * Linking support for a skill.
           */
      var SupportsLinking: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    
    trait SmartHomeAppliance extends js.Object {
      /**
           * The description of the smart home appliance.
           */
      var Description: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApplianceDescription] = js.undefined
      /**
           * The friendly name of the smart home appliance.
           */
      var FriendlyName: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApplianceFriendlyName
          ] = js.undefined
      /**
           * The name of the manufacturer of the smart home appliance.
           */
      var ManufacturerName: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApplianceManufacturerName
          ] = js.undefined
    }
    
    
    trait Sort extends js.Object {
      /**
           * The sort key of a sort object.
           */
      var Key: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortKey
      /**
           * The sort value of a sort object.
           */
      var Value: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SortValue
    }
    
    
    trait StartDeviceSyncRequest extends js.Object {
      /**
           * The ARN of the device to sync. Required.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * Request structure to start the device sync. Required.
           */
      var Features: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Features
      /**
           * The ARN of the room with which the device to sync is associated. Required.
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    
    trait StartDeviceSyncResponse extends js.Object
    
    
    trait StartSmartHomeApplianceDiscoveryRequest extends js.Object {
      /**
           * The room where smart home appliance discovery was initiated.
           */
      var RoomArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
    }
    
    
    trait StartSmartHomeApplianceDiscoveryResponse extends js.Object
    
    
    trait Tag extends js.Object {
      /**
           * The key of a tag. Tag keys are case-sensitive. 
           */
      var Key: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagKey
      /**
           * The value of a tag. Tag values are case-sensitive and can be null.
           */
      var Value: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagValue
    }
    
    
    trait TagResourceRequest extends js.Object {
      /**
           * The ARN of the resource to which to add metadata tags. Required. 
           */
      var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The tags to be added to the specified resource. Do not provide system tags. Required. 
           */
      var Tags: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagList
    }
    
    
    trait TagResourceResponse extends js.Object
    
    
    trait UntagResourceRequest extends js.Object {
      /**
           * The ARN of the resource from which to remove metadata tags. Required. 
           */
      var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The tags to be removed from the specified resource. Do not provide system tags. Required. 
           */
      var TagKeys: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagKeyList
    }
    
    
    trait UntagResourceResponse extends js.Object
    
    
    trait UpdateAddressBookRequest extends js.Object {
      /**
           * The ARN of the room to update.
           */
      var AddressBookArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The updated description of the room.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookDescription
          ] = js.undefined
      /**
           * The updated name of the room.
           */
      var Name: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookName] = js.undefined
    }
    
    
    trait UpdateAddressBookResponse extends js.Object
    
    
    trait UpdateBusinessReportScheduleRequest extends js.Object {
      /**
           * The format of the generated report (individual CSV files or zipped files of individual files).
           */
      var Format: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportFormat] = js.undefined
      /**
           * The recurrence of the reports.
           */
      var Recurrence: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportRecurrence
          ] = js.undefined
      /**
           * The S3 location of the output reports.
           */
      var S3BucketName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CustomerS3BucketName] = js.undefined
      /**
           * The S3 key where the report is delivered.
           */
      var S3KeyPrefix: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.S3KeyPrefix] = js.undefined
      /**
           * The ARN of the business report schedule.
           */
      var ScheduleArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The name identifier of the schedule.
           */
      var ScheduleName: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportScheduleName
          ] = js.undefined
    }
    
    
    trait UpdateBusinessReportScheduleResponse extends js.Object
    
    
    trait UpdateConferenceProviderRequest extends js.Object {
      /**
           * The ARN of the conference provider.
           */
      var ConferenceProviderArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The type of the conference provider.
           */
      var ConferenceProviderType: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProviderType
      /**
           * The IP endpoint and protocol for calling.
           */
      var IPDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.IPDialIn] = js.undefined
      /**
           * The meeting settings for the conference provider.
           */
      var MeetingSetting: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MeetingSetting
      /**
           * The information for PSTN conferencing.
           */
      var PSTNDialIn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PSTNDialIn] = js.undefined
    }
    
    
    trait UpdateConferenceProviderResponse extends js.Object
    
    
    trait UpdateContactRequest extends js.Object {
      /**
           * The ARN of the contact to update.
           */
      var ContactArn: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn
      /**
           * The updated display name of the contact.
           */
      var DisplayName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The updated first name of the contact.
           */
      var FirstName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The updated last name of the contact.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactName] = js.undefined
      /**
           * The updated phone number of the contact.
           */
      var PhoneNumber: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.E164PhoneNumber] = js.undefined
    }
    
    
    trait UpdateContactResponse extends js.Object
    
    
    trait UpdateDeviceRequest extends js.Object {
      /**
           * The ARN of the device to update. Required.
           */
      var DeviceArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The updated device name. Required.
           */
      var DeviceName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceName] = js.undefined
    }
    
    
    trait UpdateDeviceResponse extends js.Object
    
    
    trait UpdateProfileRequest extends js.Object {
      /**
           * The updated address for the room profile.
           */
      var Address: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Address] = js.undefined
      /**
           * The updated distance unit for the room profile.
           */
      var DistanceUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DistanceUnit] = js.undefined
      /**
           * Sets the profile as default if selected. If this is missing, no update is done to the default status.
           */
      var IsDefault: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The updated maximum volume limit for the room profile.
           */
      var MaxVolumeLimit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.MaxVolumeLimit] = js.undefined
      /**
           * Whether the PSTN setting of the room profile is enabled.
           */
      var PSTNEnabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The ARN of the room profile to update. Required.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The updated name for the room profile.
           */
      var ProfileName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileName] = js.undefined
      /**
           * Whether the setup mode of the profile is enabled.
           */
      var SetupModeDisabled: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Boolean] = js.undefined
      /**
           * The updated temperature unit for the room profile.
           */
      var TemperatureUnit: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TemperatureUnit] = js.undefined
      /**
           * The updated timezone for the room profile.
           */
      var Timezone: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Timezone] = js.undefined
      /**
           * The updated wake word for the room profile.
           */
      var WakeWord: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.WakeWord] = js.undefined
    }
    
    
    trait UpdateProfileResponse extends js.Object
    
    
    trait UpdateRoomRequest extends js.Object {
      /**
           * The updated description for the room.
           */
      var Description: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomDescription] = js.undefined
      /**
           * The updated profile ARN for the room.
           */
      var ProfileArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The updated provider calendar ARN for the room.
           */
      var ProviderCalendarId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProviderCalendarId] = js.undefined
      /**
           * The ARN of the room to update. 
           */
      var RoomArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The updated name for the room.
           */
      var RoomName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomName] = js.undefined
    }
    
    
    trait UpdateRoomResponse extends js.Object
    
    
    trait UpdateSkillGroupRequest extends js.Object {
      /**
           * The updated description for the skill group.
           */
      var Description: js.UndefOr[
            awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupDescription
          ] = js.undefined
      /**
           * The ARN of the skill group to update. 
           */
      var SkillGroupArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
      /**
           * The updated name for the skill group.
           */
      var SkillGroupName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupName] = js.undefined
    }
    
    
    trait UpdateSkillGroupResponse extends js.Object
    
    
    trait UserData extends js.Object {
      /**
           * The email of a user.
           */
      var Email: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Email] = js.undefined
      /**
           * The enrollment ARN of a user.
           */
      var EnrollmentId: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnrollmentId] = js.undefined
      /**
           * The enrollment status of a user.
           */
      var EnrollmentStatus: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.EnrollmentStatus] = js.undefined
      /**
           * The first name of a user.
           */
      var FirstName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.user_FirstName] = js.undefined
      /**
           * The last name of a user.
           */
      var LastName: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.user_LastName] = js.undefined
      /**
           * The ARN of a user.
           */
      var UserArn: js.UndefOr[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Arn] = js.undefined
    }
    
    val TypesNs: this.type = js.native
    type Address = java.lang.String
    type AddressBookDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AddressBookData]
    type AddressBookDescription = java.lang.String
    type AddressBookName = java.lang.String
    type AmazonId = java.lang.String
    type ApplianceDescription = java.lang.String
    type ApplianceFriendlyName = java.lang.String
    type ApplianceManufacturerName = java.lang.String
    type Arn = java.lang.String
    type Boolean = scala.Boolean
    type BulletPoint = java.lang.String
    type BulletPoints = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BulletPoint]
    type BusinessReportDownloadUrl = java.lang.String
    type BusinessReportFailureCode = awsDashSdkLib.awsDashSdkLibStrings.ACCESS_DENIED | awsDashSdkLib.awsDashSdkLibStrings.NO_SUCH_BUCKET | awsDashSdkLib.awsDashSdkLibStrings.INTERNAL_FAILURE | java.lang.String
    type BusinessReportFormat = awsDashSdkLib.awsDashSdkLibStrings.CSV | awsDashSdkLib.awsDashSdkLibStrings.CSV_ZIP | java.lang.String
    type BusinessReportInterval = awsDashSdkLib.awsDashSdkLibStrings.ONE_DAY | awsDashSdkLib.awsDashSdkLibStrings.ONE_WEEK | java.lang.String
    type BusinessReportS3Path = java.lang.String
    type BusinessReportScheduleList = js.Array[
        awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BusinessReportSchedule
      ]
    type BusinessReportScheduleName = java.lang.String
    type BusinessReportStatus = awsDashSdkLib.awsDashSdkLibStrings.RUNNING | awsDashSdkLib.awsDashSdkLibStrings.SUCCEEDED | awsDashSdkLib.awsDashSdkLibStrings.FAILED | java.lang.String
    type CategoryId = scala.Double
    type CategoryList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Category]
    type CategoryName = java.lang.String
    type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientApiVersions
    type ClientId = java.lang.String
    type ClientRequestToken = java.lang.String
    type CommsProtocol = awsDashSdkLib.awsDashSdkLibStrings.SIP | awsDashSdkLib.awsDashSdkLibStrings.SIPS | awsDashSdkLib.awsDashSdkLibStrings.H323 | java.lang.String
    type ConferenceProviderName = java.lang.String
    type ConferenceProviderType = awsDashSdkLib.awsDashSdkLibStrings.CHIME | awsDashSdkLib.awsDashSdkLibStrings.BLUEJEANS | awsDashSdkLib.awsDashSdkLibStrings.FUZE | awsDashSdkLib.awsDashSdkLibStrings.GOOGLE_HANGOUTS | awsDashSdkLib.awsDashSdkLibStrings.POLYCOM | awsDashSdkLib.awsDashSdkLibStrings.RINGCENTRAL | awsDashSdkLib.awsDashSdkLibStrings.SKYPE_FOR_BUSINESS | awsDashSdkLib.awsDashSdkLibStrings.WEBEX | awsDashSdkLib.awsDashSdkLibStrings.ZOOM | awsDashSdkLib.awsDashSdkLibStrings.CUSTOM | java.lang.String
    type ConferenceProvidersList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ConferenceProvider]
    type ConnectionStatus = awsDashSdkLib.awsDashSdkLibStrings.ONLINE | awsDashSdkLib.awsDashSdkLibStrings.OFFLINE | java.lang.String
    type ContactDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ContactData]
    type ContactName = java.lang.String
    type CountryCode = java.lang.String
    type CustomerS3BucketName = java.lang.String
    type DeveloperName = java.lang.String
    type DeviceDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceData]
    type DeviceEventList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceEvent]
    type DeviceEventType = awsDashSdkLib.awsDashSdkLibStrings.CONNECTION_STATUS | awsDashSdkLib.awsDashSdkLibStrings.DEVICE_STATUS | java.lang.String
    type DeviceEventValue = java.lang.String
    type DeviceName = java.lang.String
    type DeviceSerialNumber = java.lang.String
    type DeviceSerialNumberForAVS = java.lang.String
    type DeviceStatus = awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.WAS_OFFLINE | awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERED | java.lang.String
    type DeviceStatusDetailCode = awsDashSdkLib.awsDashSdkLibStrings.DEVICE_SOFTWARE_UPDATE_NEEDED | awsDashSdkLib.awsDashSdkLibStrings.DEVICE_WAS_OFFLINE | java.lang.String
    type DeviceStatusDetails = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeviceStatusDetail]
    type DeviceType = java.lang.String
    type DistanceUnit = awsDashSdkLib.awsDashSdkLibStrings.METRIC | awsDashSdkLib.awsDashSdkLibStrings.IMPERIAL | java.lang.String
    type E164PhoneNumber = java.lang.String
    type Email = java.lang.String
    type EnablementType = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.PENDING | java.lang.String
    type EnablementTypeFilter = awsDashSdkLib.awsDashSdkLibStrings.ENABLED | awsDashSdkLib.awsDashSdkLibStrings.PENDING | java.lang.String
    type EndUserLicenseAgreement = java.lang.String
    type Endpoint = java.lang.String
    type EnrollmentId = java.lang.String
    type EnrollmentStatus = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.REGISTERED | awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATING | awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERING | java.lang.String
    type Feature = awsDashSdkLib.awsDashSdkLibStrings.BLUETOOTH | awsDashSdkLib.awsDashSdkLibStrings.VOLUME | awsDashSdkLib.awsDashSdkLibStrings.NOTIFICATIONS | awsDashSdkLib.awsDashSdkLibStrings.LISTS | awsDashSdkLib.awsDashSdkLibStrings.SKILLS | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
    type Features = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Feature]
    type FilterKey = java.lang.String
    type FilterList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Filter]
    type FilterValue = java.lang.String
    type FilterValueList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.FilterValue]
    type GenericKeyword = java.lang.String
    type GenericKeywords = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GenericKeyword]
    type IconUrl = java.lang.String
    type InvocationPhrase = java.lang.String
    type Key = java.lang.String
    type MacAddress = java.lang.String
    type MaxResults = scala.Double
    type MaxVolumeLimit = scala.Double
    type NewInThisVersionBulletPoints = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.BulletPoint]
    type NextToken = java.lang.String
    type OneClickIdDelay = java.lang.String
    type OneClickPinDelay = java.lang.String
    type OutboundPhoneNumber = java.lang.String
    type PrivacyPolicy = java.lang.String
    type ProductDescription = java.lang.String
    type ProductId = java.lang.String
    type ProfileDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ProfileData]
    type ProfileName = java.lang.String
    type ProviderCalendarId = java.lang.String
    type ReleaseDate = java.lang.String
    type RequirePin = awsDashSdkLib.awsDashSdkLibStrings.YES | awsDashSdkLib.awsDashSdkLibStrings.NO | awsDashSdkLib.awsDashSdkLibStrings.OPTIONAL | java.lang.String
    type ReviewKey = java.lang.String
    type ReviewValue = java.lang.String
    type RoomDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomData]
    type RoomDescription = java.lang.String
    type RoomName = java.lang.String
    type RoomSkillParameterKey = java.lang.String
    type RoomSkillParameterValue = java.lang.String
    type RoomSkillParameters = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RoomSkillParameter]
    type S3KeyPrefix = java.lang.String
    type SampleUtterances = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Utterance]
    type ShortDescription = java.lang.String
    type SkillGroupDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillGroupData]
    type SkillGroupDescription = java.lang.String
    type SkillGroupName = java.lang.String
    type SkillId = java.lang.String
    type SkillListMaxResults = scala.Double
    type SkillName = java.lang.String
    type SkillStoreType = java.lang.String
    type SkillSummaryList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillSummary]
    type SkillType = awsDashSdkLib.awsDashSdkLibStrings.PUBLIC | awsDashSdkLib.awsDashSdkLibStrings.PRIVATE | java.lang.String
    type SkillTypeFilter = awsDashSdkLib.awsDashSdkLibStrings.PUBLIC | awsDashSdkLib.awsDashSdkLibStrings.PRIVATE | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
    type SkillTypes = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillStoreType]
    type SkillsStoreSkillList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SkillsStoreSkill]
    type SmartHomeApplianceList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SmartHomeAppliance]
    type SoftwareVersion = java.lang.String
    type SortKey = java.lang.String
    type SortList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Sort]
    type SortValue = awsDashSdkLib.awsDashSdkLibStrings.ASC | awsDashSdkLib.awsDashSdkLibStrings.DESC | java.lang.String
    type TagKey = java.lang.String
    type TagKeyList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagKey]
    type TagList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.Tag]
    type TagValue = java.lang.String
    type TemperatureUnit = awsDashSdkLib.awsDashSdkLibStrings.FAHRENHEIT | awsDashSdkLib.awsDashSdkLibStrings.CELSIUS | java.lang.String
    type Timestamp = stdLib.Date
    type Timezone = java.lang.String
    type TotalCount = scala.Double
    type Url = java.lang.String
    type UserCode = java.lang.String
    type UserDataList = js.Array[awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UserData]
    type UserId = java.lang.String
    type Utterance = java.lang.String
    type Value = java.lang.String
    type WakeWord = awsDashSdkLib.awsDashSdkLibStrings.ALEXA | awsDashSdkLib.awsDashSdkLibStrings.AMAZON | awsDashSdkLib.awsDashSdkLibStrings.ECHO | awsDashSdkLib.awsDashSdkLibStrings.COMPUTER | java.lang.String
    type _Date = java.lang.String
    type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-09` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
    type user_FirstName = java.lang.String
    type user_LastName = java.lang.String
    type user_UserId = java.lang.String
  }
  
}

