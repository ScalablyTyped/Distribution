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
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
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
    var PhoneNumber: E164PhoneNumber
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
    var Address: Address
    /**
         * The user-specified token that is used during the creation of a profile.
         */
    var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
    /**
         * The distance unit to be used by devices in the profile.
         */
    var DistanceUnit: DistanceUnit
    /**
         * The maximum volume limit for a room profile.
         */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
         * Whether PSTN calling is enabled.
         */
    var PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The name of a room profile.
         */
    var ProfileName: ProfileName
    /**
         * Whether room profile setup is enabled.
         */
    var SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The temperature unit to be used by devices in the profile.
         */
    var TemperatureUnit: TemperatureUnit
    /**
         * The time zone used by a room profile.
         */
    var Timezone: Timezone
    /**
         * A wake word for Alexa, Echo, Amazon, or a computer.
         */
    var WakeWord: WakeWord
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
    var RoomName: RoomName
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
    var SkillGroupName: SkillGroupName
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
  
  
  trait DeleteContactRequest extends js.Object {
    /**
         * The ARN of the contact to delete.
         */
    var ContactArn: Arn
  }
  
  
  trait DeleteContactResponse extends js.Object
  
  
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
    var SkillId: SkillId
  }
  
  
  trait DeleteRoomSkillParameterResponse extends js.Object
  
  
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
    var EnrollmentId: EnrollmentId
    /**
         * The ARN of the user to delete in the organization. Required.
         */
    var UserArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait DeleteUserResponse extends js.Object
  
  
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
    var SkillId: SkillId
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
  
  
  trait ListTagsRequest extends js.Object {
    /**
         * The ARN of the specified resource for which to list tags.
         */
    var Arn: Arn
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
  
  
  trait Profile extends js.Object {
    /**
         * The address of a room profile.
         */
    var Address: js.UndefOr[Address] = js.undefined
    /**
         * The distance unit of a room profile.
         */
    var DistanceUnit: js.UndefOr[DistanceUnit] = js.undefined
    /**
         * The max volume limit of a room profile.
         */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
         * The PSTN setting of a room profile.
         */
    var PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
    var SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined
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
  
  
  trait PutRoomSkillParameterRequest extends js.Object {
    /**
         * The ARN of the room associated with the room skill parameter. Required.
         */
    var RoomArn: js.UndefOr[Arn] = js.undefined
    /**
         * The updated room skill parameter. Required.
         */
    var RoomSkillParameter: RoomSkillParameter
    /**
         * The ARN of the skill associated with the room skill parameter. Required.
         */
    var SkillId: SkillId
  }
  
  
  trait PutRoomSkillParameterResponse extends js.Object
  
  
  trait ResolveRoomRequest extends js.Object {
    /**
         * The ARN of the skill that was requested. Required.
         */
    var SkillId: SkillId
    /**
         * The ARN of the user. Required.
         */
    var UserId: UserId
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
         * The ARN of the skill summary.
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
    var Features: Features
    /**
         * The ARN of the room with which the device to sync is associated. Required.
         */
    var RoomArn: js.UndefOr[Arn] = js.undefined
  }
  
  
  trait StartDeviceSyncResponse extends js.Object
  
  
  trait Tag extends js.Object {
    /**
         * The key of a tag. Tag keys are case-sensitive. 
         */
    var Key: js.UndefOr[TagKey] = js.undefined
    /**
         * The value of a tag. Tag values are case-sensitive and can be null.
         */
    var Value: js.UndefOr[TagValue] = js.undefined
  }
  
  
  trait TagResourceRequest extends js.Object {
    /**
         * The ARN of the resource to which to add metadata tags. Required. 
         */
    var Arn: Arn
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
       * Associates a contact with a given address book.
       */
    def associateContactWithAddressBook(): awsDashSdkLib.libRequestMod.Request[AssociateContactWithAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Associates a contact with a given address book.
       */
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
    /**
       * Associates a contact with a given address book.
       */
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
    /**
       * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
       */
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
    /**
       * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
       */
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
    /**
       * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
       */
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
    /**
       * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
       */
    def associateSkillGroupWithRoom(
      params: AssociateSkillGroupWithRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ AssociateSkillGroupWithRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[AssociateSkillGroupWithRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address book with the specified details.
       */
    def createAddressBook(): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates an address book with the specified details.
       */
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
    /**
       * Creates an address book with the specified details.
       */
    def createAddressBook(
      params: CreateAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ CreateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[CreateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a contact with the specified details.
       */
    def createContact(): awsDashSdkLib.libRequestMod.Request[CreateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Creates a contact with the specified details.
       */
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
    /**
       * Creates a contact with the specified details.
       */
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
    /**
       * Creates a new room profile with the specified details.
       */
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
    /**
       * Creates a new room profile with the specified details.
       */
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
    /**
       * Creates a room with the specified details.
       */
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
    /**
       * Creates a room with the specified details.
       */
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
    /**
       * Creates a skill group with a specified name and description.
       */
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
    /**
       * Creates a skill group with a specified name and description.
       */
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
    /**
       * Creates a user.
       */
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
    /**
       * Creates a user.
       */
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
    /**
       * Deletes an address book by the address book ARN.
       */
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
    /**
       * Deletes an address book by the address book ARN.
       */
    def deleteAddressBook(
      params: DeleteAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a contact by the contact ARN.
       */
    def deleteContact(): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a contact by the contact ARN.
       */
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
    /**
       * Deletes a contact by the contact ARN.
       */
    def deleteContact(
      params: DeleteContactRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteContactResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a room profile by the profile ARN.
       */
    def deleteProfile(): awsDashSdkLib.libRequestMod.Request[DeleteProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a room profile by the profile ARN.
       */
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
    /**
       * Deletes a room profile by the profile ARN.
       */
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
    /**
       * Deletes a room by the room ARN.
       */
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
    /**
       * Deletes a room by the room ARN.
       */
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
    /**
       * Deletes room skill parameter details by room, skill, and parameter key ID.
       */
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
    /**
       * Deletes room skill parameter details by room, skill, and parameter key ID.
       */
    def deleteRoomSkillParameter(
      params: DeleteRoomSkillParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DeleteRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DeleteRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a skill group by skill group ARN.
       */
    def deleteSkillGroup(): awsDashSdkLib.libRequestMod.Request[DeleteSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Deletes a skill group by skill group ARN.
       */
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
    /**
       * Deletes a skill group by skill group ARN.
       */
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
    /**
       * Deletes a specified user by user ARN and enrollment ARN.
       */
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
    /**
       * Deletes a specified user by user ARN and enrollment ARN.
       */
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
    /**
       * Disassociates a contact from a given address book.
       */
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
    /**
       * Disassociates a contact from a given address book.
       */
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
    /**
       * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
       */
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
    /**
       * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
       */
    def disassociateDeviceFromRoom(
      params: DisassociateDeviceFromRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateDeviceFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateDeviceFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
       */
    def disassociateSkillGroupFromRoom(): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
       */
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
    /**
       * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
       */
    def disassociateSkillGroupFromRoom(
      params: DisassociateSkillGroupFromRoomRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DisassociateSkillGroupFromRoomResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DisassociateSkillGroupFromRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets address the book details by the address book ARN.
       */
    def getAddressBook(): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets address the book details by the address book ARN.
       */
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
    /**
       * Gets address the book details by the address book ARN.
       */
    def getAddressBook(
      params: GetAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the contact details by the contact ARN.
       */
    def getContact(): awsDashSdkLib.libRequestMod.Request[GetContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the contact details by the contact ARN.
       */
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
    /**
       * Gets the contact details by the contact ARN.
       */
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
    /**
       * Gets the details of a device by device ARN.
       */
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
    /**
       * Gets the details of a device by device ARN.
       */
    def getDevice(
      params: GetDeviceRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetDeviceResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the details of a room profile by profile ARN.
       */
    def getProfile(): awsDashSdkLib.libRequestMod.Request[GetProfileResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets the details of a room profile by profile ARN.
       */
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
    /**
       * Gets the details of a room profile by profile ARN.
       */
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
    /**
       * Gets room details by room ARN.
       */
    def getRoom(
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoomResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets room details by room ARN.
       */
    def getRoom(params: GetRoomRequest): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets room details by room ARN.
       */
    def getRoom(
      params: GetRoomRequest,
      callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetRoomResponse, scala.Unit]
    ): awsDashSdkLib.libRequestMod.Request[GetRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets room skill parameter details by room, skill, and parameter key ARN.
       */
    def getRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[GetRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Gets room skill parameter details by room, skill, and parameter key ARN.
       */
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
    /**
       * Gets room skill parameter details by room, skill, and parameter key ARN.
       */
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
    /**
       * Gets skill group details by skill group ARN.
       */
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
    /**
       * Gets skill group details by skill group ARN.
       */
    def getSkillGroup(
      params: GetSkillGroupRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetSkillGroupResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetSkillGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the device event history, including device connection status, for up to 30 days.
       */
    def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[ListDeviceEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists the device event history, including device connection status, for up to 30 days.
       */
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
    /**
       * Lists the device event history, including device connection status, for up to 30 days.
       */
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
    /**
       * Lists all enabled skills in a specific skill group.
       */
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
    /**
       * Lists all enabled skills in a specific skill group.
       */
    def listSkills(
      params: ListSkillsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListSkillsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListSkillsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags for the specified resource.
       */
    def listTags(): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Lists all tags for the specified resource.
       */
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
    /**
       * Lists all tags for the specified resource.
       */
    def listTags(
      params: ListTagsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ListTagsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ListTagsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
       */
    def putRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
       */
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
    /**
       * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
       */
    def putRoomSkillParameter(
      params: PutRoomSkillParameterRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ PutRoomSkillParameterResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[PutRoomSkillParameterResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
       */
    def resolveRoom(): awsDashSdkLib.libRequestMod.Request[ResolveRoomResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
       */
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
    /**
       * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
       */
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
    /**
       * Revokes an invitation and invalidates the enrollment URL.
       */
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
    /**
       * Revokes an invitation and invalidates the enrollment URL.
       */
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
    /**
       * Searches address books and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches address books and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches contacts and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches contacts and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches devices and lists the ones that meet a set of filter criteria.
       */
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
    /**
       * Searches devices and lists the ones that meet a set of filter criteria.
       */
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
    /**
       * Searches room profiles and lists the ones that meet a set of filter criteria.
       */
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
    /**
       * Searches room profiles and lists the ones that meet a set of filter criteria.
       */
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
    /**
       * Searches rooms and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches rooms and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches users and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Searches users and lists the ones that meet a set of filter and sort criteria.
       */
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
    /**
       * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
       */
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
    /**
       * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
       */
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
    /**
       * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
       */
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
    /**
       * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
       */
    def startDeviceSync(
      params: StartDeviceSyncRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ StartDeviceSyncResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[StartDeviceSyncResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to a specified resource.
       */
    def tagResource(): awsDashSdkLib.libRequestMod.Request[TagResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Adds metadata tags to a specified resource.
       */
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
    /**
       * Adds metadata tags to a specified resource.
       */
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
    /**
       * Removes metadata tags from a specified resource.
       */
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
    /**
       * Removes metadata tags from a specified resource.
       */
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
    /**
       * Updates address book details by the address book ARN.
       */
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
    /**
       * Updates address book details by the address book ARN.
       */
    def updateAddressBook(
      params: UpdateAddressBookRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ UpdateAddressBookResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[UpdateAddressBookResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the contact details by the contact ARN.
       */
    def updateContact(): awsDashSdkLib.libRequestMod.Request[UpdateContactResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Updates the contact details by the contact ARN.
       */
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
    /**
       * Updates the contact details by the contact ARN.
       */
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
    /**
       * Updates the device name by device ARN.
       */
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
    /**
       * Updates the device name by device ARN.
       */
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
    /**
       * Updates an existing room profile by room profile ARN.
       */
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
    /**
       * Updates an existing room profile by room profile ARN.
       */
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
    /**
       * Updates room details by room ARN.
       */
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
    /**
       * Updates room details by room ARN.
       */
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
    /**
       * Updates skill group details by skill group ARN.
       */
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
    /**
       * Updates skill group details by skill group ARN.
       */
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
    var Arn: Arn
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
         * The updated maximum volume limit for the room profile.
         */
    var MaxVolumeLimit: js.UndefOr[MaxVolumeLimit] = js.undefined
    /**
         * Whether the PSTN setting of the room profile is enabled.
         */
    var PSTNEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
    var SetupModeDisabled: js.UndefOr[scala.Boolean] = js.undefined
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
  
  val TypesNs: this.type = js.native
  type Address = java.lang.String
  type AddressBookDataList = js.Array[AddressBookData]
  type AddressBookDescription = java.lang.String
  type AddressBookName = java.lang.String
  type Arn = java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type ConnectionStatus = awsDashSdkLib.awsDashSdkLibStrings.ONLINE | awsDashSdkLib.awsDashSdkLibStrings.OFFLINE | java.lang.String
  type ContactDataList = js.Array[ContactData]
  type ContactName = java.lang.String
  type DeviceDataList = js.Array[DeviceData]
  type DeviceEventList = js.Array[DeviceEvent]
  type DeviceEventType = awsDashSdkLib.awsDashSdkLibStrings.CONNECTION_STATUS | awsDashSdkLib.awsDashSdkLibStrings.DEVICE_STATUS | java.lang.String
  type DeviceEventValue = java.lang.String
  type DeviceName = java.lang.String
  type DeviceSerialNumber = java.lang.String
  type DeviceStatus = awsDashSdkLib.awsDashSdkLibStrings.READY | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.WAS_OFFLINE | awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERED | java.lang.String
  type DeviceStatusDetailCode = awsDashSdkLib.awsDashSdkLibStrings.DEVICE_SOFTWARE_UPDATE_NEEDED | awsDashSdkLib.awsDashSdkLibStrings.DEVICE_WAS_OFFLINE | java.lang.String
  type DeviceStatusDetails = js.Array[DeviceStatusDetail]
  type DeviceType = java.lang.String
  type DistanceUnit = awsDashSdkLib.awsDashSdkLibStrings.METRIC | awsDashSdkLib.awsDashSdkLibStrings.IMPERIAL | java.lang.String
  type E164PhoneNumber = java.lang.String
  type Email = java.lang.String
  type EnrollmentId = java.lang.String
  type EnrollmentStatus = awsDashSdkLib.awsDashSdkLibStrings.INITIALIZED | awsDashSdkLib.awsDashSdkLibStrings.PENDING | awsDashSdkLib.awsDashSdkLibStrings.REGISTERED | awsDashSdkLib.awsDashSdkLibStrings.DISASSOCIATING | awsDashSdkLib.awsDashSdkLibStrings.DEREGISTERING | java.lang.String
  type Feature = awsDashSdkLib.awsDashSdkLibStrings.BLUETOOTH | awsDashSdkLib.awsDashSdkLibStrings.VOLUME | awsDashSdkLib.awsDashSdkLibStrings.NOTIFICATIONS | awsDashSdkLib.awsDashSdkLibStrings.LISTS | awsDashSdkLib.awsDashSdkLibStrings.SKILLS | awsDashSdkLib.awsDashSdkLibStrings.ALL | java.lang.String
  type Features = js.Array[Feature]
  type FilterKey = java.lang.String
  type FilterList = js.Array[Filter]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type MacAddress = java.lang.String
  type MaxResults = scala.Double
  type MaxVolumeLimit = scala.Double
  type NextToken = java.lang.String
  type ProfileDataList = js.Array[ProfileData]
  type ProfileName = java.lang.String
  type ProviderCalendarId = java.lang.String
  type RoomDataList = js.Array[RoomData]
  type RoomDescription = java.lang.String
  type RoomName = java.lang.String
  type RoomSkillParameterKey = java.lang.String
  type RoomSkillParameterValue = java.lang.String
  type RoomSkillParameters = js.Array[RoomSkillParameter]
  type SkillGroupDataList = js.Array[SkillGroupData]
  type SkillGroupDescription = java.lang.String
  type SkillGroupName = java.lang.String
  type SkillId = java.lang.String
  type SkillListMaxResults = scala.Double
  type SkillName = java.lang.String
  type SkillSummaryList = js.Array[SkillSummary]
  type SoftwareVersion = java.lang.String
  type SortKey = java.lang.String
  type SortList = js.Array[Sort]
  type SortValue = awsDashSdkLib.awsDashSdkLibStrings.ASC | awsDashSdkLib.awsDashSdkLibStrings.DESC | java.lang.String
  type TagKey = java.lang.String
  type TagKeyList = js.Array[TagKey]
  type TagList = js.Array[Tag]
  type TagValue = java.lang.String
  type TemperatureUnit = awsDashSdkLib.awsDashSdkLibStrings.FAHRENHEIT | awsDashSdkLib.awsDashSdkLibStrings.CELSIUS | java.lang.String
  type Timestamp = stdLib.Date
  type Timezone = java.lang.String
  type TotalCount = scala.Double
  type UserDataList = js.Array[UserData]
  type UserId = java.lang.String
  type WakeWord = awsDashSdkLib.awsDashSdkLibStrings.ALEXA | awsDashSdkLib.awsDashSdkLibStrings.AMAZON | awsDashSdkLib.awsDashSdkLibStrings.ECHO | awsDashSdkLib.awsDashSdkLibStrings.COMPUTER | java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-11-09` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
  type user_FirstName = java.lang.String
  type user_LastName = java.lang.String
  type user_UserId = java.lang.String
}

