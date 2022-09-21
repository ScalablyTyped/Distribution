package typings.awsSdk.alexaforbusinessMod

import typings.awsSdk.configBaseMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlexaForBusiness extends Service {
  
  /**
    * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
    */
  def approveSkill(): Request[ApproveSkillResponse, AWSError] = js.native
  def approveSkill(callback: js.Function2[/* err */ AWSError, /* data */ ApproveSkillResponse, Unit]): Request[ApproveSkillResponse, AWSError] = js.native
  /**
    * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
    */
  def approveSkill(params: ApproveSkillRequest): Request[ApproveSkillResponse, AWSError] = js.native
  def approveSkill(
    params: ApproveSkillRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ApproveSkillResponse, Unit]
  ): Request[ApproveSkillResponse, AWSError] = js.native
  
  /**
    * Associates a contact with a given address book.
    */
  def associateContactWithAddressBook(): Request[AssociateContactWithAddressBookResponse, AWSError] = js.native
  def associateContactWithAddressBook(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateContactWithAddressBookResponse, Unit]
  ): Request[AssociateContactWithAddressBookResponse, AWSError] = js.native
  /**
    * Associates a contact with a given address book.
    */
  def associateContactWithAddressBook(params: AssociateContactWithAddressBookRequest): Request[AssociateContactWithAddressBookResponse, AWSError] = js.native
  def associateContactWithAddressBook(
    params: AssociateContactWithAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateContactWithAddressBookResponse, Unit]
  ): Request[AssociateContactWithAddressBookResponse, AWSError] = js.native
  
  /**
    * Associates a device with the specified network profile.
    */
  def associateDeviceWithNetworkProfile(): Request[AssociateDeviceWithNetworkProfileResponse, AWSError] = js.native
  def associateDeviceWithNetworkProfile(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithNetworkProfileResponse, Unit]
  ): Request[AssociateDeviceWithNetworkProfileResponse, AWSError] = js.native
  /**
    * Associates a device with the specified network profile.
    */
  def associateDeviceWithNetworkProfile(params: AssociateDeviceWithNetworkProfileRequest): Request[AssociateDeviceWithNetworkProfileResponse, AWSError] = js.native
  def associateDeviceWithNetworkProfile(
    params: AssociateDeviceWithNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithNetworkProfileResponse, Unit]
  ): Request[AssociateDeviceWithNetworkProfileResponse, AWSError] = js.native
  
  /**
    * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
    */
  def associateDeviceWithRoom(): Request[AssociateDeviceWithRoomResponse, AWSError] = js.native
  def associateDeviceWithRoom(callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithRoomResponse, Unit]): Request[AssociateDeviceWithRoomResponse, AWSError] = js.native
  /**
    * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
    */
  def associateDeviceWithRoom(params: AssociateDeviceWithRoomRequest): Request[AssociateDeviceWithRoomResponse, AWSError] = js.native
  def associateDeviceWithRoom(
    params: AssociateDeviceWithRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateDeviceWithRoomResponse, Unit]
  ): Request[AssociateDeviceWithRoomResponse, AWSError] = js.native
  
  /**
    * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
    */
  def associateSkillGroupWithRoom(): Request[AssociateSkillGroupWithRoomResponse, AWSError] = js.native
  def associateSkillGroupWithRoom(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillGroupWithRoomResponse, Unit]): Request[AssociateSkillGroupWithRoomResponse, AWSError] = js.native
  /**
    * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
    */
  def associateSkillGroupWithRoom(params: AssociateSkillGroupWithRoomRequest): Request[AssociateSkillGroupWithRoomResponse, AWSError] = js.native
  def associateSkillGroupWithRoom(
    params: AssociateSkillGroupWithRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillGroupWithRoomResponse, Unit]
  ): Request[AssociateSkillGroupWithRoomResponse, AWSError] = js.native
  
  /**
    * Associates a skill with a skill group.
    */
  def associateSkillWithSkillGroup(): Request[AssociateSkillWithSkillGroupResponse, AWSError] = js.native
  def associateSkillWithSkillGroup(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillWithSkillGroupResponse, Unit]): Request[AssociateSkillWithSkillGroupResponse, AWSError] = js.native
  /**
    * Associates a skill with a skill group.
    */
  def associateSkillWithSkillGroup(params: AssociateSkillWithSkillGroupRequest): Request[AssociateSkillWithSkillGroupResponse, AWSError] = js.native
  def associateSkillWithSkillGroup(
    params: AssociateSkillWithSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillWithSkillGroupResponse, Unit]
  ): Request[AssociateSkillWithSkillGroupResponse, AWSError] = js.native
  
  /**
    * Makes a private skill available for enrolled users to enable on their devices.
    */
  def associateSkillWithUsers(): Request[AssociateSkillWithUsersResponse, AWSError] = js.native
  def associateSkillWithUsers(callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillWithUsersResponse, Unit]): Request[AssociateSkillWithUsersResponse, AWSError] = js.native
  /**
    * Makes a private skill available for enrolled users to enable on their devices.
    */
  def associateSkillWithUsers(params: AssociateSkillWithUsersRequest): Request[AssociateSkillWithUsersResponse, AWSError] = js.native
  def associateSkillWithUsers(
    params: AssociateSkillWithUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociateSkillWithUsersResponse, Unit]
  ): Request[AssociateSkillWithUsersResponse, AWSError] = js.native
  
  @JSName("config")
  var config_AlexaForBusiness: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Creates an address book with the specified details.
    */
  def createAddressBook(): Request[CreateAddressBookResponse, AWSError] = js.native
  def createAddressBook(callback: js.Function2[/* err */ AWSError, /* data */ CreateAddressBookResponse, Unit]): Request[CreateAddressBookResponse, AWSError] = js.native
  /**
    * Creates an address book with the specified details.
    */
  def createAddressBook(params: CreateAddressBookRequest): Request[CreateAddressBookResponse, AWSError] = js.native
  def createAddressBook(
    params: CreateAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAddressBookResponse, Unit]
  ): Request[CreateAddressBookResponse, AWSError] = js.native
  
  /**
    * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
    */
  def createBusinessReportSchedule(): Request[CreateBusinessReportScheduleResponse, AWSError] = js.native
  def createBusinessReportSchedule(callback: js.Function2[/* err */ AWSError, /* data */ CreateBusinessReportScheduleResponse, Unit]): Request[CreateBusinessReportScheduleResponse, AWSError] = js.native
  /**
    * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
    */
  def createBusinessReportSchedule(params: CreateBusinessReportScheduleRequest): Request[CreateBusinessReportScheduleResponse, AWSError] = js.native
  def createBusinessReportSchedule(
    params: CreateBusinessReportScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBusinessReportScheduleResponse, Unit]
  ): Request[CreateBusinessReportScheduleResponse, AWSError] = js.native
  
  /**
    * Adds a new conference provider under the user's AWS account.
    */
  def createConferenceProvider(): Request[CreateConferenceProviderResponse, AWSError] = js.native
  def createConferenceProvider(callback: js.Function2[/* err */ AWSError, /* data */ CreateConferenceProviderResponse, Unit]): Request[CreateConferenceProviderResponse, AWSError] = js.native
  /**
    * Adds a new conference provider under the user's AWS account.
    */
  def createConferenceProvider(params: CreateConferenceProviderRequest): Request[CreateConferenceProviderResponse, AWSError] = js.native
  def createConferenceProvider(
    params: CreateConferenceProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateConferenceProviderResponse, Unit]
  ): Request[CreateConferenceProviderResponse, AWSError] = js.native
  
  /**
    * Creates a contact with the specified details.
    */
  def createContact(): Request[CreateContactResponse, AWSError] = js.native
  def createContact(callback: js.Function2[/* err */ AWSError, /* data */ CreateContactResponse, Unit]): Request[CreateContactResponse, AWSError] = js.native
  /**
    * Creates a contact with the specified details.
    */
  def createContact(params: CreateContactRequest): Request[CreateContactResponse, AWSError] = js.native
  def createContact(
    params: CreateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateContactResponse, Unit]
  ): Request[CreateContactResponse, AWSError] = js.native
  
  /**
    * Creates a gateway group with the specified details.
    */
  def createGatewayGroup(): Request[CreateGatewayGroupResponse, AWSError] = js.native
  def createGatewayGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayGroupResponse, Unit]): Request[CreateGatewayGroupResponse, AWSError] = js.native
  /**
    * Creates a gateway group with the specified details.
    */
  def createGatewayGroup(params: CreateGatewayGroupRequest): Request[CreateGatewayGroupResponse, AWSError] = js.native
  def createGatewayGroup(
    params: CreateGatewayGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateGatewayGroupResponse, Unit]
  ): Request[CreateGatewayGroupResponse, AWSError] = js.native
  
  /**
    * Creates a network profile with the specified details.
    */
  def createNetworkProfile(): Request[CreateNetworkProfileResponse, AWSError] = js.native
  def createNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkProfileResponse, Unit]): Request[CreateNetworkProfileResponse, AWSError] = js.native
  /**
    * Creates a network profile with the specified details.
    */
  def createNetworkProfile(params: CreateNetworkProfileRequest): Request[CreateNetworkProfileResponse, AWSError] = js.native
  def createNetworkProfile(
    params: CreateNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateNetworkProfileResponse, Unit]
  ): Request[CreateNetworkProfileResponse, AWSError] = js.native
  
  /**
    * Creates a new room profile with the specified details.
    */
  def createProfile(): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]): Request[CreateProfileResponse, AWSError] = js.native
  /**
    * Creates a new room profile with the specified details.
    */
  def createProfile(params: CreateProfileRequest): Request[CreateProfileResponse, AWSError] = js.native
  def createProfile(
    params: CreateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProfileResponse, Unit]
  ): Request[CreateProfileResponse, AWSError] = js.native
  
  /**
    * Creates a room with the specified details.
    */
  def createRoom(): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]): Request[CreateRoomResponse, AWSError] = js.native
  /**
    * Creates a room with the specified details.
    */
  def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(
    params: CreateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]
  ): Request[CreateRoomResponse, AWSError] = js.native
  
  /**
    * Creates a skill group with a specified name and description.
    */
  def createSkillGroup(): Request[CreateSkillGroupResponse, AWSError] = js.native
  def createSkillGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateSkillGroupResponse, Unit]): Request[CreateSkillGroupResponse, AWSError] = js.native
  /**
    * Creates a skill group with a specified name and description.
    */
  def createSkillGroup(params: CreateSkillGroupRequest): Request[CreateSkillGroupResponse, AWSError] = js.native
  def createSkillGroup(
    params: CreateSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateSkillGroupResponse, Unit]
  ): Request[CreateSkillGroupResponse, AWSError] = js.native
  
  /**
    * Creates a user.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  
  /**
    * Deletes an address book by the address book ARN.
    */
  def deleteAddressBook(): Request[DeleteAddressBookResponse, AWSError] = js.native
  def deleteAddressBook(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAddressBookResponse, Unit]): Request[DeleteAddressBookResponse, AWSError] = js.native
  /**
    * Deletes an address book by the address book ARN.
    */
  def deleteAddressBook(params: DeleteAddressBookRequest): Request[DeleteAddressBookResponse, AWSError] = js.native
  def deleteAddressBook(
    params: DeleteAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAddressBookResponse, Unit]
  ): Request[DeleteAddressBookResponse, AWSError] = js.native
  
  /**
    * Deletes the recurring report delivery schedule with the specified schedule ARN.
    */
  def deleteBusinessReportSchedule(): Request[DeleteBusinessReportScheduleResponse, AWSError] = js.native
  def deleteBusinessReportSchedule(callback: js.Function2[/* err */ AWSError, /* data */ DeleteBusinessReportScheduleResponse, Unit]): Request[DeleteBusinessReportScheduleResponse, AWSError] = js.native
  /**
    * Deletes the recurring report delivery schedule with the specified schedule ARN.
    */
  def deleteBusinessReportSchedule(params: DeleteBusinessReportScheduleRequest): Request[DeleteBusinessReportScheduleResponse, AWSError] = js.native
  def deleteBusinessReportSchedule(
    params: DeleteBusinessReportScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteBusinessReportScheduleResponse, Unit]
  ): Request[DeleteBusinessReportScheduleResponse, AWSError] = js.native
  
  /**
    * Deletes a conference provider.
    */
  def deleteConferenceProvider(): Request[DeleteConferenceProviderResponse, AWSError] = js.native
  def deleteConferenceProvider(callback: js.Function2[/* err */ AWSError, /* data */ DeleteConferenceProviderResponse, Unit]): Request[DeleteConferenceProviderResponse, AWSError] = js.native
  /**
    * Deletes a conference provider.
    */
  def deleteConferenceProvider(params: DeleteConferenceProviderRequest): Request[DeleteConferenceProviderResponse, AWSError] = js.native
  def deleteConferenceProvider(
    params: DeleteConferenceProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteConferenceProviderResponse, Unit]
  ): Request[DeleteConferenceProviderResponse, AWSError] = js.native
  
  /**
    * Deletes a contact by the contact ARN.
    */
  def deleteContact(): Request[DeleteContactResponse, AWSError] = js.native
  def deleteContact(callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactResponse, Unit]): Request[DeleteContactResponse, AWSError] = js.native
  /**
    * Deletes a contact by the contact ARN.
    */
  def deleteContact(params: DeleteContactRequest): Request[DeleteContactResponse, AWSError] = js.native
  def deleteContact(
    params: DeleteContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteContactResponse, Unit]
  ): Request[DeleteContactResponse, AWSError] = js.native
  
  /**
    * Removes a device from Alexa For Business.
    */
  def deleteDevice(): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]): Request[DeleteDeviceResponse, AWSError] = js.native
  /**
    * Removes a device from Alexa For Business.
    */
  def deleteDevice(params: DeleteDeviceRequest): Request[DeleteDeviceResponse, AWSError] = js.native
  def deleteDevice(
    params: DeleteDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceResponse, Unit]
  ): Request[DeleteDeviceResponse, AWSError] = js.native
  
  /**
    * When this action is called for a specified shared device, it allows authorized users to delete the device's entire previous history of voice input data and associated response data. This action can be called once every 24 hours for a specific shared device.
    */
  def deleteDeviceUsageData(): Request[DeleteDeviceUsageDataResponse, AWSError] = js.native
  def deleteDeviceUsageData(callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceUsageDataResponse, Unit]): Request[DeleteDeviceUsageDataResponse, AWSError] = js.native
  /**
    * When this action is called for a specified shared device, it allows authorized users to delete the device's entire previous history of voice input data and associated response data. This action can be called once every 24 hours for a specific shared device.
    */
  def deleteDeviceUsageData(params: DeleteDeviceUsageDataRequest): Request[DeleteDeviceUsageDataResponse, AWSError] = js.native
  def deleteDeviceUsageData(
    params: DeleteDeviceUsageDataRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteDeviceUsageDataResponse, Unit]
  ): Request[DeleteDeviceUsageDataResponse, AWSError] = js.native
  
  /**
    * Deletes a gateway group.
    */
  def deleteGatewayGroup(): Request[DeleteGatewayGroupResponse, AWSError] = js.native
  def deleteGatewayGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayGroupResponse, Unit]): Request[DeleteGatewayGroupResponse, AWSError] = js.native
  /**
    * Deletes a gateway group.
    */
  def deleteGatewayGroup(params: DeleteGatewayGroupRequest): Request[DeleteGatewayGroupResponse, AWSError] = js.native
  def deleteGatewayGroup(
    params: DeleteGatewayGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteGatewayGroupResponse, Unit]
  ): Request[DeleteGatewayGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a network profile by the network profile ARN.
    */
  def deleteNetworkProfile(): Request[DeleteNetworkProfileResponse, AWSError] = js.native
  def deleteNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkProfileResponse, Unit]): Request[DeleteNetworkProfileResponse, AWSError] = js.native
  /**
    * Deletes a network profile by the network profile ARN.
    */
  def deleteNetworkProfile(params: DeleteNetworkProfileRequest): Request[DeleteNetworkProfileResponse, AWSError] = js.native
  def deleteNetworkProfile(
    params: DeleteNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteNetworkProfileResponse, Unit]
  ): Request[DeleteNetworkProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a room profile by the profile ARN.
    */
  def deleteProfile(): Request[DeleteProfileResponse, AWSError] = js.native
  def deleteProfile(callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileResponse, Unit]): Request[DeleteProfileResponse, AWSError] = js.native
  /**
    * Deletes a room profile by the profile ARN.
    */
  def deleteProfile(params: DeleteProfileRequest): Request[DeleteProfileResponse, AWSError] = js.native
  def deleteProfile(
    params: DeleteProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteProfileResponse, Unit]
  ): Request[DeleteProfileResponse, AWSError] = js.native
  
  /**
    * Deletes a room by the room ARN.
    */
  def deleteRoom(): Request[DeleteRoomResponse, AWSError] = js.native
  def deleteRoom(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoomResponse, Unit]): Request[DeleteRoomResponse, AWSError] = js.native
  /**
    * Deletes a room by the room ARN.
    */
  def deleteRoom(params: DeleteRoomRequest): Request[DeleteRoomResponse, AWSError] = js.native
  def deleteRoom(
    params: DeleteRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoomResponse, Unit]
  ): Request[DeleteRoomResponse, AWSError] = js.native
  
  /**
    * Deletes room skill parameter details by room, skill, and parameter key ID.
    */
  def deleteRoomSkillParameter(): Request[DeleteRoomSkillParameterResponse, AWSError] = js.native
  def deleteRoomSkillParameter(callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoomSkillParameterResponse, Unit]): Request[DeleteRoomSkillParameterResponse, AWSError] = js.native
  /**
    * Deletes room skill parameter details by room, skill, and parameter key ID.
    */
  def deleteRoomSkillParameter(params: DeleteRoomSkillParameterRequest): Request[DeleteRoomSkillParameterResponse, AWSError] = js.native
  def deleteRoomSkillParameter(
    params: DeleteRoomSkillParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteRoomSkillParameterResponse, Unit]
  ): Request[DeleteRoomSkillParameterResponse, AWSError] = js.native
  
  /**
    * Unlinks a third-party account from a skill.
    */
  def deleteSkillAuthorization(): Request[DeleteSkillAuthorizationResponse, AWSError] = js.native
  def deleteSkillAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSkillAuthorizationResponse, Unit]): Request[DeleteSkillAuthorizationResponse, AWSError] = js.native
  /**
    * Unlinks a third-party account from a skill.
    */
  def deleteSkillAuthorization(params: DeleteSkillAuthorizationRequest): Request[DeleteSkillAuthorizationResponse, AWSError] = js.native
  def deleteSkillAuthorization(
    params: DeleteSkillAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSkillAuthorizationResponse, Unit]
  ): Request[DeleteSkillAuthorizationResponse, AWSError] = js.native
  
  /**
    * Deletes a skill group by skill group ARN.
    */
  def deleteSkillGroup(): Request[DeleteSkillGroupResponse, AWSError] = js.native
  def deleteSkillGroup(callback: js.Function2[/* err */ AWSError, /* data */ DeleteSkillGroupResponse, Unit]): Request[DeleteSkillGroupResponse, AWSError] = js.native
  /**
    * Deletes a skill group by skill group ARN.
    */
  def deleteSkillGroup(params: DeleteSkillGroupRequest): Request[DeleteSkillGroupResponse, AWSError] = js.native
  def deleteSkillGroup(
    params: DeleteSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteSkillGroupResponse, Unit]
  ): Request[DeleteSkillGroupResponse, AWSError] = js.native
  
  /**
    * Deletes a specified user by user ARN and enrollment ARN.
    */
  def deleteUser(): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]): Request[DeleteUserResponse, AWSError] = js.native
  /**
    * Deletes a specified user by user ARN and enrollment ARN.
    */
  def deleteUser(params: DeleteUserRequest): Request[DeleteUserResponse, AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteUserResponse, Unit]
  ): Request[DeleteUserResponse, AWSError] = js.native
  
  /**
    * Disassociates a contact from a given address book.
    */
  def disassociateContactFromAddressBook(): Request[DisassociateContactFromAddressBookResponse, AWSError] = js.native
  def disassociateContactFromAddressBook(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateContactFromAddressBookResponse, Unit]
  ): Request[DisassociateContactFromAddressBookResponse, AWSError] = js.native
  /**
    * Disassociates a contact from a given address book.
    */
  def disassociateContactFromAddressBook(params: DisassociateContactFromAddressBookRequest): Request[DisassociateContactFromAddressBookResponse, AWSError] = js.native
  def disassociateContactFromAddressBook(
    params: DisassociateContactFromAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateContactFromAddressBookResponse, Unit]
  ): Request[DisassociateContactFromAddressBookResponse, AWSError] = js.native
  
  /**
    * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
    */
  def disassociateDeviceFromRoom(): Request[DisassociateDeviceFromRoomResponse, AWSError] = js.native
  def disassociateDeviceFromRoom(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDeviceFromRoomResponse, Unit]): Request[DisassociateDeviceFromRoomResponse, AWSError] = js.native
  /**
    * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
    */
  def disassociateDeviceFromRoom(params: DisassociateDeviceFromRoomRequest): Request[DisassociateDeviceFromRoomResponse, AWSError] = js.native
  def disassociateDeviceFromRoom(
    params: DisassociateDeviceFromRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateDeviceFromRoomResponse, Unit]
  ): Request[DisassociateDeviceFromRoomResponse, AWSError] = js.native
  
  /**
    * Disassociates a skill from a skill group.
    */
  def disassociateSkillFromSkillGroup(): Request[DisassociateSkillFromSkillGroupResponse, AWSError] = js.native
  def disassociateSkillFromSkillGroup(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillFromSkillGroupResponse, Unit]
  ): Request[DisassociateSkillFromSkillGroupResponse, AWSError] = js.native
  /**
    * Disassociates a skill from a skill group.
    */
  def disassociateSkillFromSkillGroup(params: DisassociateSkillFromSkillGroupRequest): Request[DisassociateSkillFromSkillGroupResponse, AWSError] = js.native
  def disassociateSkillFromSkillGroup(
    params: DisassociateSkillFromSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillFromSkillGroupResponse, Unit]
  ): Request[DisassociateSkillFromSkillGroupResponse, AWSError] = js.native
  
  /**
    * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
    */
  def disassociateSkillFromUsers(): Request[DisassociateSkillFromUsersResponse, AWSError] = js.native
  def disassociateSkillFromUsers(callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillFromUsersResponse, Unit]): Request[DisassociateSkillFromUsersResponse, AWSError] = js.native
  /**
    * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
    */
  def disassociateSkillFromUsers(params: DisassociateSkillFromUsersRequest): Request[DisassociateSkillFromUsersResponse, AWSError] = js.native
  def disassociateSkillFromUsers(
    params: DisassociateSkillFromUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillFromUsersResponse, Unit]
  ): Request[DisassociateSkillFromUsersResponse, AWSError] = js.native
  
  /**
    * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
    */
  def disassociateSkillGroupFromRoom(): Request[DisassociateSkillGroupFromRoomResponse, AWSError] = js.native
  def disassociateSkillGroupFromRoom(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillGroupFromRoomResponse, Unit]
  ): Request[DisassociateSkillGroupFromRoomResponse, AWSError] = js.native
  /**
    * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
    */
  def disassociateSkillGroupFromRoom(params: DisassociateSkillGroupFromRoomRequest): Request[DisassociateSkillGroupFromRoomResponse, AWSError] = js.native
  def disassociateSkillGroupFromRoom(
    params: DisassociateSkillGroupFromRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociateSkillGroupFromRoomResponse, Unit]
  ): Request[DisassociateSkillGroupFromRoomResponse, AWSError] = js.native
  
  /**
    * Forgets smart home appliances associated to a room.
    */
  def forgetSmartHomeAppliances(): Request[ForgetSmartHomeAppliancesResponse, AWSError] = js.native
  def forgetSmartHomeAppliances(callback: js.Function2[/* err */ AWSError, /* data */ ForgetSmartHomeAppliancesResponse, Unit]): Request[ForgetSmartHomeAppliancesResponse, AWSError] = js.native
  /**
    * Forgets smart home appliances associated to a room.
    */
  def forgetSmartHomeAppliances(params: ForgetSmartHomeAppliancesRequest): Request[ForgetSmartHomeAppliancesResponse, AWSError] = js.native
  def forgetSmartHomeAppliances(
    params: ForgetSmartHomeAppliancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ForgetSmartHomeAppliancesResponse, Unit]
  ): Request[ForgetSmartHomeAppliancesResponse, AWSError] = js.native
  
  /**
    * Gets address the book details by the address book ARN.
    */
  def getAddressBook(): Request[GetAddressBookResponse, AWSError] = js.native
  def getAddressBook(callback: js.Function2[/* err */ AWSError, /* data */ GetAddressBookResponse, Unit]): Request[GetAddressBookResponse, AWSError] = js.native
  /**
    * Gets address the book details by the address book ARN.
    */
  def getAddressBook(params: GetAddressBookRequest): Request[GetAddressBookResponse, AWSError] = js.native
  def getAddressBook(
    params: GetAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAddressBookResponse, Unit]
  ): Request[GetAddressBookResponse, AWSError] = js.native
  
  /**
    * Retrieves the existing conference preferences.
    */
  def getConferencePreference(): Request[GetConferencePreferenceResponse, AWSError] = js.native
  def getConferencePreference(callback: js.Function2[/* err */ AWSError, /* data */ GetConferencePreferenceResponse, Unit]): Request[GetConferencePreferenceResponse, AWSError] = js.native
  /**
    * Retrieves the existing conference preferences.
    */
  def getConferencePreference(params: GetConferencePreferenceRequest): Request[GetConferencePreferenceResponse, AWSError] = js.native
  def getConferencePreference(
    params: GetConferencePreferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConferencePreferenceResponse, Unit]
  ): Request[GetConferencePreferenceResponse, AWSError] = js.native
  
  /**
    * Gets details about a specific conference provider.
    */
  def getConferenceProvider(): Request[GetConferenceProviderResponse, AWSError] = js.native
  def getConferenceProvider(callback: js.Function2[/* err */ AWSError, /* data */ GetConferenceProviderResponse, Unit]): Request[GetConferenceProviderResponse, AWSError] = js.native
  /**
    * Gets details about a specific conference provider.
    */
  def getConferenceProvider(params: GetConferenceProviderRequest): Request[GetConferenceProviderResponse, AWSError] = js.native
  def getConferenceProvider(
    params: GetConferenceProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetConferenceProviderResponse, Unit]
  ): Request[GetConferenceProviderResponse, AWSError] = js.native
  
  /**
    * Gets the contact details by the contact ARN.
    */
  def getContact(): Request[GetContactResponse, AWSError] = js.native
  def getContact(callback: js.Function2[/* err */ AWSError, /* data */ GetContactResponse, Unit]): Request[GetContactResponse, AWSError] = js.native
  /**
    * Gets the contact details by the contact ARN.
    */
  def getContact(params: GetContactRequest): Request[GetContactResponse, AWSError] = js.native
  def getContact(
    params: GetContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetContactResponse, Unit]
  ): Request[GetContactResponse, AWSError] = js.native
  
  /**
    * Gets the details of a device by device ARN.
    */
  def getDevice(): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]): Request[GetDeviceResponse, AWSError] = js.native
  /**
    * Gets the details of a device by device ARN.
    */
  def getDevice(params: GetDeviceRequest): Request[GetDeviceResponse, AWSError] = js.native
  def getDevice(
    params: GetDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetDeviceResponse, Unit]
  ): Request[GetDeviceResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of a gateway.
    */
  def getGateway(): Request[GetGatewayResponse, AWSError] = js.native
  def getGateway(callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayResponse, Unit]): Request[GetGatewayResponse, AWSError] = js.native
  /**
    * Retrieves the details of a gateway.
    */
  def getGateway(params: GetGatewayRequest): Request[GetGatewayResponse, AWSError] = js.native
  def getGateway(
    params: GetGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayResponse, Unit]
  ): Request[GetGatewayResponse, AWSError] = js.native
  
  /**
    * Retrieves the details of a gateway group.
    */
  def getGatewayGroup(): Request[GetGatewayGroupResponse, AWSError] = js.native
  def getGatewayGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayGroupResponse, Unit]): Request[GetGatewayGroupResponse, AWSError] = js.native
  /**
    * Retrieves the details of a gateway group.
    */
  def getGatewayGroup(params: GetGatewayGroupRequest): Request[GetGatewayGroupResponse, AWSError] = js.native
  def getGatewayGroup(
    params: GetGatewayGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetGatewayGroupResponse, Unit]
  ): Request[GetGatewayGroupResponse, AWSError] = js.native
  
  /**
    * Retrieves the configured values for the user enrollment invitation email template.
    */
  def getInvitationConfiguration(): Request[GetInvitationConfigurationResponse, AWSError] = js.native
  def getInvitationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationConfigurationResponse, Unit]): Request[GetInvitationConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the configured values for the user enrollment invitation email template.
    */
  def getInvitationConfiguration(params: GetInvitationConfigurationRequest): Request[GetInvitationConfigurationResponse, AWSError] = js.native
  def getInvitationConfiguration(
    params: GetInvitationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetInvitationConfigurationResponse, Unit]
  ): Request[GetInvitationConfigurationResponse, AWSError] = js.native
  
  /**
    * Gets the network profile details by the network profile ARN.
    */
  def getNetworkProfile(): Request[GetNetworkProfileResponse, AWSError] = js.native
  def getNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkProfileResponse, Unit]): Request[GetNetworkProfileResponse, AWSError] = js.native
  /**
    * Gets the network profile details by the network profile ARN.
    */
  def getNetworkProfile(params: GetNetworkProfileRequest): Request[GetNetworkProfileResponse, AWSError] = js.native
  def getNetworkProfile(
    params: GetNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetNetworkProfileResponse, Unit]
  ): Request[GetNetworkProfileResponse, AWSError] = js.native
  
  /**
    * Gets the details of a room profile by profile ARN.
    */
  def getProfile(): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]): Request[GetProfileResponse, AWSError] = js.native
  /**
    * Gets the details of a room profile by profile ARN.
    */
  def getProfile(params: GetProfileRequest): Request[GetProfileResponse, AWSError] = js.native
  def getProfile(
    params: GetProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProfileResponse, Unit]
  ): Request[GetProfileResponse, AWSError] = js.native
  
  /**
    * Gets room details by room ARN.
    */
  def getRoom(): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]): Request[GetRoomResponse, AWSError] = js.native
  /**
    * Gets room details by room ARN.
    */
  def getRoom(params: GetRoomRequest): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(
    params: GetRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]
  ): Request[GetRoomResponse, AWSError] = js.native
  
  /**
    * Gets room skill parameter details by room, skill, and parameter key ARN.
    */
  def getRoomSkillParameter(): Request[GetRoomSkillParameterResponse, AWSError] = js.native
  def getRoomSkillParameter(callback: js.Function2[/* err */ AWSError, /* data */ GetRoomSkillParameterResponse, Unit]): Request[GetRoomSkillParameterResponse, AWSError] = js.native
  /**
    * Gets room skill parameter details by room, skill, and parameter key ARN.
    */
  def getRoomSkillParameter(params: GetRoomSkillParameterRequest): Request[GetRoomSkillParameterResponse, AWSError] = js.native
  def getRoomSkillParameter(
    params: GetRoomSkillParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoomSkillParameterResponse, Unit]
  ): Request[GetRoomSkillParameterResponse, AWSError] = js.native
  
  /**
    * Gets skill group details by skill group ARN.
    */
  def getSkillGroup(): Request[GetSkillGroupResponse, AWSError] = js.native
  def getSkillGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetSkillGroupResponse, Unit]): Request[GetSkillGroupResponse, AWSError] = js.native
  /**
    * Gets skill group details by skill group ARN.
    */
  def getSkillGroup(params: GetSkillGroupRequest): Request[GetSkillGroupResponse, AWSError] = js.native
  def getSkillGroup(
    params: GetSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetSkillGroupResponse, Unit]
  ): Request[GetSkillGroupResponse, AWSError] = js.native
  
  /**
    * Lists the details of the schedules that a user configured. A download URL of the report associated with each schedule is returned every time this action is called. A new download URL is returned each time, and is valid for 24 hours.
    */
  def listBusinessReportSchedules(): Request[ListBusinessReportSchedulesResponse, AWSError] = js.native
  def listBusinessReportSchedules(callback: js.Function2[/* err */ AWSError, /* data */ ListBusinessReportSchedulesResponse, Unit]): Request[ListBusinessReportSchedulesResponse, AWSError] = js.native
  /**
    * Lists the details of the schedules that a user configured. A download URL of the report associated with each schedule is returned every time this action is called. A new download URL is returned each time, and is valid for 24 hours.
    */
  def listBusinessReportSchedules(params: ListBusinessReportSchedulesRequest): Request[ListBusinessReportSchedulesResponse, AWSError] = js.native
  def listBusinessReportSchedules(
    params: ListBusinessReportSchedulesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBusinessReportSchedulesResponse, Unit]
  ): Request[ListBusinessReportSchedulesResponse, AWSError] = js.native
  
  /**
    * Lists conference providers under a specific AWS account.
    */
  def listConferenceProviders(): Request[ListConferenceProvidersResponse, AWSError] = js.native
  def listConferenceProviders(callback: js.Function2[/* err */ AWSError, /* data */ ListConferenceProvidersResponse, Unit]): Request[ListConferenceProvidersResponse, AWSError] = js.native
  /**
    * Lists conference providers under a specific AWS account.
    */
  def listConferenceProviders(params: ListConferenceProvidersRequest): Request[ListConferenceProvidersResponse, AWSError] = js.native
  def listConferenceProviders(
    params: ListConferenceProvidersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListConferenceProvidersResponse, Unit]
  ): Request[ListConferenceProvidersResponse, AWSError] = js.native
  
  /**
    * Lists the device event history, including device connection status, for up to 30 days.
    */
  def listDeviceEvents(): Request[ListDeviceEventsResponse, AWSError] = js.native
  def listDeviceEvents(callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceEventsResponse, Unit]): Request[ListDeviceEventsResponse, AWSError] = js.native
  /**
    * Lists the device event history, including device connection status, for up to 30 days.
    */
  def listDeviceEvents(params: ListDeviceEventsRequest): Request[ListDeviceEventsResponse, AWSError] = js.native
  def listDeviceEvents(
    params: ListDeviceEventsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDeviceEventsResponse, Unit]
  ): Request[ListDeviceEventsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
    */
  def listGatewayGroups(): Request[ListGatewayGroupsResponse, AWSError] = js.native
  def listGatewayGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayGroupsResponse, Unit]): Request[ListGatewayGroupsResponse, AWSError] = js.native
  /**
    * Retrieves a list of gateway group summaries. Use GetGatewayGroup to retrieve details of a specific gateway group.
    */
  def listGatewayGroups(params: ListGatewayGroupsRequest): Request[ListGatewayGroupsResponse, AWSError] = js.native
  def listGatewayGroups(
    params: ListGatewayGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewayGroupsResponse, Unit]
  ): Request[ListGatewayGroupsResponse, AWSError] = js.native
  
  /**
    * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that gateway group ARN.
    */
  def listGateways(): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]): Request[ListGatewaysResponse, AWSError] = js.native
  /**
    * Retrieves a list of gateway summaries. Use GetGateway to retrieve details of a specific gateway. An optional gateway group ARN can be provided to only retrieve gateway summaries of gateways that are associated with that gateway group ARN.
    */
  def listGateways(params: ListGatewaysRequest): Request[ListGatewaysResponse, AWSError] = js.native
  def listGateways(
    params: ListGatewaysRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListGatewaysResponse, Unit]
  ): Request[ListGatewaysResponse, AWSError] = js.native
  
  /**
    * Lists all enabled skills in a specific skill group.
    */
  def listSkills(): Request[ListSkillsResponse, AWSError] = js.native
  def listSkills(callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsResponse, Unit]): Request[ListSkillsResponse, AWSError] = js.native
  /**
    * Lists all enabled skills in a specific skill group.
    */
  def listSkills(params: ListSkillsRequest): Request[ListSkillsResponse, AWSError] = js.native
  def listSkills(
    params: ListSkillsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsResponse, Unit]
  ): Request[ListSkillsResponse, AWSError] = js.native
  
  /**
    * Lists all categories in the Alexa skill store.
    */
  def listSkillsStoreCategories(): Request[ListSkillsStoreCategoriesResponse, AWSError] = js.native
  def listSkillsStoreCategories(callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsStoreCategoriesResponse, Unit]): Request[ListSkillsStoreCategoriesResponse, AWSError] = js.native
  /**
    * Lists all categories in the Alexa skill store.
    */
  def listSkillsStoreCategories(params: ListSkillsStoreCategoriesRequest): Request[ListSkillsStoreCategoriesResponse, AWSError] = js.native
  def listSkillsStoreCategories(
    params: ListSkillsStoreCategoriesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsStoreCategoriesResponse, Unit]
  ): Request[ListSkillsStoreCategoriesResponse, AWSError] = js.native
  
  /**
    * Lists all skills in the Alexa skill store by category.
    */
  def listSkillsStoreSkillsByCategory(): Request[ListSkillsStoreSkillsByCategoryResponse, AWSError] = js.native
  def listSkillsStoreSkillsByCategory(
    callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsStoreSkillsByCategoryResponse, Unit]
  ): Request[ListSkillsStoreSkillsByCategoryResponse, AWSError] = js.native
  /**
    * Lists all skills in the Alexa skill store by category.
    */
  def listSkillsStoreSkillsByCategory(params: ListSkillsStoreSkillsByCategoryRequest): Request[ListSkillsStoreSkillsByCategoryResponse, AWSError] = js.native
  def listSkillsStoreSkillsByCategory(
    params: ListSkillsStoreSkillsByCategoryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSkillsStoreSkillsByCategoryResponse, Unit]
  ): Request[ListSkillsStoreSkillsByCategoryResponse, AWSError] = js.native
  
  /**
    * Lists all of the smart home appliances associated with a room.
    */
  def listSmartHomeAppliances(): Request[ListSmartHomeAppliancesResponse, AWSError] = js.native
  def listSmartHomeAppliances(callback: js.Function2[/* err */ AWSError, /* data */ ListSmartHomeAppliancesResponse, Unit]): Request[ListSmartHomeAppliancesResponse, AWSError] = js.native
  /**
    * Lists all of the smart home appliances associated with a room.
    */
  def listSmartHomeAppliances(params: ListSmartHomeAppliancesRequest): Request[ListSmartHomeAppliancesResponse, AWSError] = js.native
  def listSmartHomeAppliances(
    params: ListSmartHomeAppliancesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListSmartHomeAppliancesResponse, Unit]
  ): Request[ListSmartHomeAppliancesResponse, AWSError] = js.native
  
  /**
    * Lists all tags for the specified resource.
    */
  def listTags(): Request[ListTagsResponse, AWSError] = js.native
  def listTags(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]): Request[ListTagsResponse, AWSError] = js.native
  /**
    * Lists all tags for the specified resource.
    */
  def listTags(params: ListTagsRequest): Request[ListTagsResponse, AWSError] = js.native
  def listTags(
    params: ListTagsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsResponse, Unit]
  ): Request[ListTagsResponse, AWSError] = js.native
  
  /**
    * Sets the conference preferences on a specific conference provider at the account level.
    */
  def putConferencePreference(): Request[PutConferencePreferenceResponse, AWSError] = js.native
  def putConferencePreference(callback: js.Function2[/* err */ AWSError, /* data */ PutConferencePreferenceResponse, Unit]): Request[PutConferencePreferenceResponse, AWSError] = js.native
  /**
    * Sets the conference preferences on a specific conference provider at the account level.
    */
  def putConferencePreference(params: PutConferencePreferenceRequest): Request[PutConferencePreferenceResponse, AWSError] = js.native
  def putConferencePreference(
    params: PutConferencePreferenceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutConferencePreferenceResponse, Unit]
  ): Request[PutConferencePreferenceResponse, AWSError] = js.native
  
  /**
    * Configures the email template for the user enrollment invitation with the specified attributes.
    */
  def putInvitationConfiguration(): Request[PutInvitationConfigurationResponse, AWSError] = js.native
  def putInvitationConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutInvitationConfigurationResponse, Unit]): Request[PutInvitationConfigurationResponse, AWSError] = js.native
  /**
    * Configures the email template for the user enrollment invitation with the specified attributes.
    */
  def putInvitationConfiguration(params: PutInvitationConfigurationRequest): Request[PutInvitationConfigurationResponse, AWSError] = js.native
  def putInvitationConfiguration(
    params: PutInvitationConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutInvitationConfigurationResponse, Unit]
  ): Request[PutInvitationConfigurationResponse, AWSError] = js.native
  
  /**
    * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
    */
  def putRoomSkillParameter(): Request[PutRoomSkillParameterResponse, AWSError] = js.native
  def putRoomSkillParameter(callback: js.Function2[/* err */ AWSError, /* data */ PutRoomSkillParameterResponse, Unit]): Request[PutRoomSkillParameterResponse, AWSError] = js.native
  /**
    * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
    */
  def putRoomSkillParameter(params: PutRoomSkillParameterRequest): Request[PutRoomSkillParameterResponse, AWSError] = js.native
  def putRoomSkillParameter(
    params: PutRoomSkillParameterRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutRoomSkillParameterResponse, Unit]
  ): Request[PutRoomSkillParameterResponse, AWSError] = js.native
  
  /**
    * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
    */
  def putSkillAuthorization(): Request[PutSkillAuthorizationResponse, AWSError] = js.native
  def putSkillAuthorization(callback: js.Function2[/* err */ AWSError, /* data */ PutSkillAuthorizationResponse, Unit]): Request[PutSkillAuthorizationResponse, AWSError] = js.native
  /**
    * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
    */
  def putSkillAuthorization(params: PutSkillAuthorizationRequest): Request[PutSkillAuthorizationResponse, AWSError] = js.native
  def putSkillAuthorization(
    params: PutSkillAuthorizationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutSkillAuthorizationResponse, Unit]
  ): Request[PutSkillAuthorizationResponse, AWSError] = js.native
  
  /**
    * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
    */
  def registerAVSDevice(): Request[RegisterAVSDeviceResponse, AWSError] = js.native
  def registerAVSDevice(callback: js.Function2[/* err */ AWSError, /* data */ RegisterAVSDeviceResponse, Unit]): Request[RegisterAVSDeviceResponse, AWSError] = js.native
  /**
    * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
    */
  def registerAVSDevice(params: RegisterAVSDeviceRequest): Request[RegisterAVSDeviceResponse, AWSError] = js.native
  def registerAVSDevice(
    params: RegisterAVSDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegisterAVSDeviceResponse, Unit]
  ): Request[RegisterAVSDeviceResponse, AWSError] = js.native
  
  /**
    * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
    */
  def rejectSkill(): Request[RejectSkillResponse, AWSError] = js.native
  def rejectSkill(callback: js.Function2[/* err */ AWSError, /* data */ RejectSkillResponse, Unit]): Request[RejectSkillResponse, AWSError] = js.native
  /**
    * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
    */
  def rejectSkill(params: RejectSkillRequest): Request[RejectSkillResponse, AWSError] = js.native
  def rejectSkill(
    params: RejectSkillRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RejectSkillResponse, Unit]
  ): Request[RejectSkillResponse, AWSError] = js.native
  
  /**
    * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers. To query ResolveRoom from an Alexa skill, the skill ID needs to be authorized. When the skill is using an AWS Lambda function, the skill is automatically authorized when you publish your skill as a private skill to your AWS account. Skills that are hosted using a custom web service must be manually authorized. To get your skill authorized, contact AWS Support with your AWS account ID that queries the ResolveRoom API and skill ID. 
    */
  def resolveRoom(): Request[ResolveRoomResponse, AWSError] = js.native
  def resolveRoom(callback: js.Function2[/* err */ AWSError, /* data */ ResolveRoomResponse, Unit]): Request[ResolveRoomResponse, AWSError] = js.native
  /**
    * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers. To query ResolveRoom from an Alexa skill, the skill ID needs to be authorized. When the skill is using an AWS Lambda function, the skill is automatically authorized when you publish your skill as a private skill to your AWS account. Skills that are hosted using a custom web service must be manually authorized. To get your skill authorized, contact AWS Support with your AWS account ID that queries the ResolveRoom API and skill ID. 
    */
  def resolveRoom(params: ResolveRoomRequest): Request[ResolveRoomResponse, AWSError] = js.native
  def resolveRoom(
    params: ResolveRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResolveRoomResponse, Unit]
  ): Request[ResolveRoomResponse, AWSError] = js.native
  
  /**
    * Revokes an invitation and invalidates the enrollment URL.
    */
  def revokeInvitation(): Request[RevokeInvitationResponse, AWSError] = js.native
  def revokeInvitation(callback: js.Function2[/* err */ AWSError, /* data */ RevokeInvitationResponse, Unit]): Request[RevokeInvitationResponse, AWSError] = js.native
  /**
    * Revokes an invitation and invalidates the enrollment URL.
    */
  def revokeInvitation(params: RevokeInvitationRequest): Request[RevokeInvitationResponse, AWSError] = js.native
  def revokeInvitation(
    params: RevokeInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RevokeInvitationResponse, Unit]
  ): Request[RevokeInvitationResponse, AWSError] = js.native
  
  /**
    * Searches address books and lists the ones that meet a set of filter and sort criteria.
    */
  def searchAddressBooks(): Request[SearchAddressBooksResponse, AWSError] = js.native
  def searchAddressBooks(callback: js.Function2[/* err */ AWSError, /* data */ SearchAddressBooksResponse, Unit]): Request[SearchAddressBooksResponse, AWSError] = js.native
  /**
    * Searches address books and lists the ones that meet a set of filter and sort criteria.
    */
  def searchAddressBooks(params: SearchAddressBooksRequest): Request[SearchAddressBooksResponse, AWSError] = js.native
  def searchAddressBooks(
    params: SearchAddressBooksRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAddressBooksResponse, Unit]
  ): Request[SearchAddressBooksResponse, AWSError] = js.native
  
  /**
    * Searches contacts and lists the ones that meet a set of filter and sort criteria.
    */
  def searchContacts(): Request[SearchContactsResponse, AWSError] = js.native
  def searchContacts(callback: js.Function2[/* err */ AWSError, /* data */ SearchContactsResponse, Unit]): Request[SearchContactsResponse, AWSError] = js.native
  /**
    * Searches contacts and lists the ones that meet a set of filter and sort criteria.
    */
  def searchContacts(params: SearchContactsRequest): Request[SearchContactsResponse, AWSError] = js.native
  def searchContacts(
    params: SearchContactsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchContactsResponse, Unit]
  ): Request[SearchContactsResponse, AWSError] = js.native
  
  /**
    * Searches devices and lists the ones that meet a set of filter criteria.
    */
  def searchDevices(): Request[SearchDevicesResponse, AWSError] = js.native
  def searchDevices(callback: js.Function2[/* err */ AWSError, /* data */ SearchDevicesResponse, Unit]): Request[SearchDevicesResponse, AWSError] = js.native
  /**
    * Searches devices and lists the ones that meet a set of filter criteria.
    */
  def searchDevices(params: SearchDevicesRequest): Request[SearchDevicesResponse, AWSError] = js.native
  def searchDevices(
    params: SearchDevicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchDevicesResponse, Unit]
  ): Request[SearchDevicesResponse, AWSError] = js.native
  
  /**
    * Searches network profiles and lists the ones that meet a set of filter and sort criteria.
    */
  def searchNetworkProfiles(): Request[SearchNetworkProfilesResponse, AWSError] = js.native
  def searchNetworkProfiles(callback: js.Function2[/* err */ AWSError, /* data */ SearchNetworkProfilesResponse, Unit]): Request[SearchNetworkProfilesResponse, AWSError] = js.native
  /**
    * Searches network profiles and lists the ones that meet a set of filter and sort criteria.
    */
  def searchNetworkProfiles(params: SearchNetworkProfilesRequest): Request[SearchNetworkProfilesResponse, AWSError] = js.native
  def searchNetworkProfiles(
    params: SearchNetworkProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchNetworkProfilesResponse, Unit]
  ): Request[SearchNetworkProfilesResponse, AWSError] = js.native
  
  /**
    * Searches room profiles and lists the ones that meet a set of filter criteria.
    */
  def searchProfiles(): Request[SearchProfilesResponse, AWSError] = js.native
  def searchProfiles(callback: js.Function2[/* err */ AWSError, /* data */ SearchProfilesResponse, Unit]): Request[SearchProfilesResponse, AWSError] = js.native
  /**
    * Searches room profiles and lists the ones that meet a set of filter criteria.
    */
  def searchProfiles(params: SearchProfilesRequest): Request[SearchProfilesResponse, AWSError] = js.native
  def searchProfiles(
    params: SearchProfilesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchProfilesResponse, Unit]
  ): Request[SearchProfilesResponse, AWSError] = js.native
  
  /**
    * Searches rooms and lists the ones that meet a set of filter and sort criteria.
    */
  def searchRooms(): Request[SearchRoomsResponse, AWSError] = js.native
  def searchRooms(callback: js.Function2[/* err */ AWSError, /* data */ SearchRoomsResponse, Unit]): Request[SearchRoomsResponse, AWSError] = js.native
  /**
    * Searches rooms and lists the ones that meet a set of filter and sort criteria.
    */
  def searchRooms(params: SearchRoomsRequest): Request[SearchRoomsResponse, AWSError] = js.native
  def searchRooms(
    params: SearchRoomsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchRoomsResponse, Unit]
  ): Request[SearchRoomsResponse, AWSError] = js.native
  
  /**
    * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
    */
  def searchSkillGroups(): Request[SearchSkillGroupsResponse, AWSError] = js.native
  def searchSkillGroups(callback: js.Function2[/* err */ AWSError, /* data */ SearchSkillGroupsResponse, Unit]): Request[SearchSkillGroupsResponse, AWSError] = js.native
  /**
    * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
    */
  def searchSkillGroups(params: SearchSkillGroupsRequest): Request[SearchSkillGroupsResponse, AWSError] = js.native
  def searchSkillGroups(
    params: SearchSkillGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchSkillGroupsResponse, Unit]
  ): Request[SearchSkillGroupsResponse, AWSError] = js.native
  
  /**
    * Searches users and lists the ones that meet a set of filter and sort criteria.
    */
  def searchUsers(): Request[SearchUsersResponse, AWSError] = js.native
  def searchUsers(callback: js.Function2[/* err */ AWSError, /* data */ SearchUsersResponse, Unit]): Request[SearchUsersResponse, AWSError] = js.native
  /**
    * Searches users and lists the ones that meet a set of filter and sort criteria.
    */
  def searchUsers(params: SearchUsersRequest): Request[SearchUsersResponse, AWSError] = js.native
  def searchUsers(
    params: SearchUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchUsersResponse, Unit]
  ): Request[SearchUsersResponse, AWSError] = js.native
  
  /**
    * Triggers an asynchronous flow to send text, SSML, or audio announcements to rooms that are identified by a search or filter. 
    */
  def sendAnnouncement(): Request[SendAnnouncementResponse, AWSError] = js.native
  def sendAnnouncement(callback: js.Function2[/* err */ AWSError, /* data */ SendAnnouncementResponse, Unit]): Request[SendAnnouncementResponse, AWSError] = js.native
  /**
    * Triggers an asynchronous flow to send text, SSML, or audio announcements to rooms that are identified by a search or filter. 
    */
  def sendAnnouncement(params: SendAnnouncementRequest): Request[SendAnnouncementResponse, AWSError] = js.native
  def sendAnnouncement(
    params: SendAnnouncementRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendAnnouncementResponse, Unit]
  ): Request[SendAnnouncementResponse, AWSError] = js.native
  
  /**
    * Sends an enrollment invitation email with a URL to a user. The URL is valid for 30 days or until you call this operation again, whichever comes first. 
    */
  def sendInvitation(): Request[SendInvitationResponse, AWSError] = js.native
  def sendInvitation(callback: js.Function2[/* err */ AWSError, /* data */ SendInvitationResponse, Unit]): Request[SendInvitationResponse, AWSError] = js.native
  /**
    * Sends an enrollment invitation email with a URL to a user. The URL is valid for 30 days or until you call this operation again, whichever comes first. 
    */
  def sendInvitation(params: SendInvitationRequest): Request[SendInvitationResponse, AWSError] = js.native
  def sendInvitation(
    params: SendInvitationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SendInvitationResponse, Unit]
  ): Request[SendInvitationResponse, AWSError] = js.native
  
  /**
    * Resets a device and its account to the known default settings. This clears all information and settings set by previous users in the following ways:   Bluetooth - This unpairs all bluetooth devices paired with your echo device.   Volume - This resets the echo device's volume to the default value.   Notifications - This clears all notifications from your echo device.   Lists - This clears all to-do items from your echo device.   Settings - This internally syncs the room's profile (if the device is assigned to a room), contacts, address books, delegation access for account linking, and communications (if enabled on the room profile).  
    */
  def startDeviceSync(): Request[StartDeviceSyncResponse, AWSError] = js.native
  def startDeviceSync(callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceSyncResponse, Unit]): Request[StartDeviceSyncResponse, AWSError] = js.native
  /**
    * Resets a device and its account to the known default settings. This clears all information and settings set by previous users in the following ways:   Bluetooth - This unpairs all bluetooth devices paired with your echo device.   Volume - This resets the echo device's volume to the default value.   Notifications - This clears all notifications from your echo device.   Lists - This clears all to-do items from your echo device.   Settings - This internally syncs the room's profile (if the device is assigned to a room), contacts, address books, delegation access for account linking, and communications (if enabled on the room profile).  
    */
  def startDeviceSync(params: StartDeviceSyncRequest): Request[StartDeviceSyncResponse, AWSError] = js.native
  def startDeviceSync(
    params: StartDeviceSyncRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartDeviceSyncResponse, Unit]
  ): Request[StartDeviceSyncResponse, AWSError] = js.native
  
  /**
    * Initiates the discovery of any smart home appliances associated with the room.
    */
  def startSmartHomeApplianceDiscovery(): Request[StartSmartHomeApplianceDiscoveryResponse, AWSError] = js.native
  def startSmartHomeApplianceDiscovery(
    callback: js.Function2[/* err */ AWSError, /* data */ StartSmartHomeApplianceDiscoveryResponse, Unit]
  ): Request[StartSmartHomeApplianceDiscoveryResponse, AWSError] = js.native
  /**
    * Initiates the discovery of any smart home appliances associated with the room.
    */
  def startSmartHomeApplianceDiscovery(params: StartSmartHomeApplianceDiscoveryRequest): Request[StartSmartHomeApplianceDiscoveryResponse, AWSError] = js.native
  def startSmartHomeApplianceDiscovery(
    params: StartSmartHomeApplianceDiscoveryRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ StartSmartHomeApplianceDiscoveryResponse, Unit]
  ): Request[StartSmartHomeApplianceDiscoveryResponse, AWSError] = js.native
  
  /**
    * Adds metadata tags to a specified resource.
    */
  def tagResource(): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]): Request[TagResourceResponse, AWSError] = js.native
  /**
    * Adds metadata tags to a specified resource.
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResponse, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResponse, Unit]
  ): Request[TagResourceResponse, AWSError] = js.native
  
  /**
    * Removes metadata tags from a specified resource.
    */
  def untagResource(): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]): Request[UntagResourceResponse, AWSError] = js.native
  /**
    * Removes metadata tags from a specified resource.
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResponse, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResponse, Unit]
  ): Request[UntagResourceResponse, AWSError] = js.native
  
  /**
    * Updates address book details by the address book ARN.
    */
  def updateAddressBook(): Request[UpdateAddressBookResponse, AWSError] = js.native
  def updateAddressBook(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAddressBookResponse, Unit]): Request[UpdateAddressBookResponse, AWSError] = js.native
  /**
    * Updates address book details by the address book ARN.
    */
  def updateAddressBook(params: UpdateAddressBookRequest): Request[UpdateAddressBookResponse, AWSError] = js.native
  def updateAddressBook(
    params: UpdateAddressBookRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAddressBookResponse, Unit]
  ): Request[UpdateAddressBookResponse, AWSError] = js.native
  
  /**
    * Updates the configuration of the report delivery schedule with the specified schedule ARN.
    */
  def updateBusinessReportSchedule(): Request[UpdateBusinessReportScheduleResponse, AWSError] = js.native
  def updateBusinessReportSchedule(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBusinessReportScheduleResponse, Unit]): Request[UpdateBusinessReportScheduleResponse, AWSError] = js.native
  /**
    * Updates the configuration of the report delivery schedule with the specified schedule ARN.
    */
  def updateBusinessReportSchedule(params: UpdateBusinessReportScheduleRequest): Request[UpdateBusinessReportScheduleResponse, AWSError] = js.native
  def updateBusinessReportSchedule(
    params: UpdateBusinessReportScheduleRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBusinessReportScheduleResponse, Unit]
  ): Request[UpdateBusinessReportScheduleResponse, AWSError] = js.native
  
  /**
    * Updates an existing conference provider's settings.
    */
  def updateConferenceProvider(): Request[UpdateConferenceProviderResponse, AWSError] = js.native
  def updateConferenceProvider(callback: js.Function2[/* err */ AWSError, /* data */ UpdateConferenceProviderResponse, Unit]): Request[UpdateConferenceProviderResponse, AWSError] = js.native
  /**
    * Updates an existing conference provider's settings.
    */
  def updateConferenceProvider(params: UpdateConferenceProviderRequest): Request[UpdateConferenceProviderResponse, AWSError] = js.native
  def updateConferenceProvider(
    params: UpdateConferenceProviderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateConferenceProviderResponse, Unit]
  ): Request[UpdateConferenceProviderResponse, AWSError] = js.native
  
  /**
    * Updates the contact details by the contact ARN.
    */
  def updateContact(): Request[UpdateContactResponse, AWSError] = js.native
  def updateContact(callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResponse, Unit]): Request[UpdateContactResponse, AWSError] = js.native
  /**
    * Updates the contact details by the contact ARN.
    */
  def updateContact(params: UpdateContactRequest): Request[UpdateContactResponse, AWSError] = js.native
  def updateContact(
    params: UpdateContactRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateContactResponse, Unit]
  ): Request[UpdateContactResponse, AWSError] = js.native
  
  /**
    * Updates the device name by device ARN.
    */
  def updateDevice(): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]): Request[UpdateDeviceResponse, AWSError] = js.native
  /**
    * Updates the device name by device ARN.
    */
  def updateDevice(params: UpdateDeviceRequest): Request[UpdateDeviceResponse, AWSError] = js.native
  def updateDevice(
    params: UpdateDeviceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateDeviceResponse, Unit]
  ): Request[UpdateDeviceResponse, AWSError] = js.native
  
  /**
    * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGateway(): Request[UpdateGatewayResponse, AWSError] = js.native
  def updateGateway(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayResponse, Unit]): Request[UpdateGatewayResponse, AWSError] = js.native
  /**
    * Updates the details of a gateway. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGateway(params: UpdateGatewayRequest): Request[UpdateGatewayResponse, AWSError] = js.native
  def updateGateway(
    params: UpdateGatewayRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayResponse, Unit]
  ): Request[UpdateGatewayResponse, AWSError] = js.native
  
  /**
    * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGatewayGroup(): Request[UpdateGatewayGroupResponse, AWSError] = js.native
  def updateGatewayGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayGroupResponse, Unit]): Request[UpdateGatewayGroupResponse, AWSError] = js.native
  /**
    * Updates the details of a gateway group. If any optional field is not provided, the existing corresponding value is left unmodified.
    */
  def updateGatewayGroup(params: UpdateGatewayGroupRequest): Request[UpdateGatewayGroupResponse, AWSError] = js.native
  def updateGatewayGroup(
    params: UpdateGatewayGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateGatewayGroupResponse, Unit]
  ): Request[UpdateGatewayGroupResponse, AWSError] = js.native
  
  /**
    * Updates a network profile by the network profile ARN.
    */
  def updateNetworkProfile(): Request[UpdateNetworkProfileResponse, AWSError] = js.native
  def updateNetworkProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkProfileResponse, Unit]): Request[UpdateNetworkProfileResponse, AWSError] = js.native
  /**
    * Updates a network profile by the network profile ARN.
    */
  def updateNetworkProfile(params: UpdateNetworkProfileRequest): Request[UpdateNetworkProfileResponse, AWSError] = js.native
  def updateNetworkProfile(
    params: UpdateNetworkProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateNetworkProfileResponse, Unit]
  ): Request[UpdateNetworkProfileResponse, AWSError] = js.native
  
  /**
    * Updates an existing room profile by room profile ARN.
    */
  def updateProfile(): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]): Request[UpdateProfileResponse, AWSError] = js.native
  /**
    * Updates an existing room profile by room profile ARN.
    */
  def updateProfile(params: UpdateProfileRequest): Request[UpdateProfileResponse, AWSError] = js.native
  def updateProfile(
    params: UpdateProfileRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProfileResponse, Unit]
  ): Request[UpdateProfileResponse, AWSError] = js.native
  
  /**
    * Updates room details by room ARN.
    */
  def updateRoom(): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]): Request[UpdateRoomResponse, AWSError] = js.native
  /**
    * Updates room details by room ARN.
    */
  def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(
    params: UpdateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]
  ): Request[UpdateRoomResponse, AWSError] = js.native
  
  /**
    * Updates skill group details by skill group ARN.
    */
  def updateSkillGroup(): Request[UpdateSkillGroupResponse, AWSError] = js.native
  def updateSkillGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateSkillGroupResponse, Unit]): Request[UpdateSkillGroupResponse, AWSError] = js.native
  /**
    * Updates skill group details by skill group ARN.
    */
  def updateSkillGroup(params: UpdateSkillGroupRequest): Request[UpdateSkillGroupResponse, AWSError] = js.native
  def updateSkillGroup(
    params: UpdateSkillGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateSkillGroupResponse, Unit]
  ): Request[UpdateSkillGroupResponse, AWSError] = js.native
}
