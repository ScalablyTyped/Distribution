package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaForBusiness
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AlexaForBusiness: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
    * Creates a gateway group with the specified details.
    */
  def createGatewayGroup(): awsDashSdkLib.libRequestMod.Request[CreateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGatewayGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a gateway group with the specified details.
    */
  def createGatewayGroup(params: CreateGatewayGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGatewayGroup(
    params: CreateGatewayGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Deletes a gateway group.
    */
  def deleteGatewayGroup(): awsDashSdkLib.libRequestMod.Request[DeleteGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGatewayGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a gateway group.
    */
  def deleteGatewayGroup(params: DeleteGatewayGroupRequest): awsDashSdkLib.libRequestMod.Request[DeleteGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGatewayGroup(
    params: DeleteGatewayGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Retrieves the details of a gateway.
    */
  def getGateway(): awsDashSdkLib.libRequestMod.Request[GetGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the details of a gateway.
    */
  def getGateway(params: GetGatewayRequest): awsDashSdkLib.libRequestMod.Request[GetGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGateway(
    params: GetGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the details of a gateway group.
    */
  def getGatewayGroup(): awsDashSdkLib.libRequestMod.Request[GetGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves the details of a gateway group.
    */
  def getGatewayGroup(params: GetGatewayGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGatewayGroup(
    params: GetGatewayGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
    */
  def listGatewayGroups(): awsDashSdkLib.libRequestMod.Request[ListGatewayGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGatewayGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGatewayGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGatewayGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
    */
  def listGatewayGroups(params: ListGatewayGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGatewayGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGatewayGroups(
    params: ListGatewayGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGatewayGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGatewayGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that gateway group ARN.
    */
  def listGateways(): awsDashSdkLib.libRequestMod.Request[ListGatewaysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGateways(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGatewaysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGatewaysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that gateway group ARN.
    */
  def listGateways(params: ListGatewaysRequest): awsDashSdkLib.libRequestMod.Request[ListGatewaysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGateways(
    params: ListGatewaysRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGatewaysResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGatewaysResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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
    * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGateway(): awsDashSdkLib.libRequestMod.Request[UpdateGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGateway(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGateway(params: UpdateGatewayRequest): awsDashSdkLib.libRequestMod.Request[UpdateGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGateway(
    params: UpdateGatewayRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGatewayResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGatewayGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGatewayGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGatewayGroup(params: UpdateGatewayGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGatewayGroup(
    params: UpdateGatewayGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGatewayGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGatewayGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
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

