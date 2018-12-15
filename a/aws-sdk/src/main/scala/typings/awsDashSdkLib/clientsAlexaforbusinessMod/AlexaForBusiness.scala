package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlexaForBusiness
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_AlexaForBusiness: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ClientConfiguration = js.native
  /**
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
     */
  def approveSkill(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
     */
  def approveSkill(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
     */
  def approveSkill(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with the organization under the customer's AWS account. If a skill is private, the user implicitly accepts access to this skill during enablement.
     */
  def approveSkill(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ApproveSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a contact with a given address book.
     */
  def associateContactWithAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a contact with a given address book.
     */
  def associateContactWithAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a contact with a given address book.
     */
  def associateContactWithAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a contact with a given address book.
     */
  def associateContactWithAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateContactWithAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
     */
  def associateDeviceWithRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
     */
  def associateDeviceWithRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
     */
  def associateDeviceWithRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a device with a given room. This applies all the settings from the room profile to the device, and all the skills in any skill groups added to that room. This operation requires the device to be online, or else a manual sync is required. 
     */
  def associateDeviceWithRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateDeviceWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
     */
  def associateSkillGroupWithRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
     */
  def associateSkillGroupWithRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
     */
  def associateSkillGroupWithRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill group with a given room. This enables all skills in the associated skill group on all devices in the room.
     */
  def associateSkillGroupWithRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillGroupWithRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with a skill group.
     */
  def associateSkillWithSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with a skill group.
     */
  def associateSkillWithSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with a skill group.
     */
  def associateSkillWithSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Associates a skill with a skill group.
     */
  def associateSkillWithSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill available for enrolled users to enable on their devices.
     */
  def associateSkillWithUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill available for enrolled users to enable on their devices.
     */
  def associateSkillWithUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill available for enrolled users to enable on their devices.
     */
  def associateSkillWithUsers(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill available for enrolled users to enable on their devices.
     */
  def associateSkillWithUsers(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.AssociateSkillWithUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address book with the specified details.
     */
  def createAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address book with the specified details.
     */
  def createAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address book with the specified details.
     */
  def createAddressBook(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates an address book with the specified details.
     */
  def createAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
     */
  def createBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
     */
  def createBusinessReportSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
     */
  def createBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a recurring schedule for usage reports to deliver to the specified S3 location with a specified daily or weekly interval.
     */
  def createBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new conference provider under the user's AWS account.
     */
  def createConferenceProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new conference provider under the user's AWS account.
     */
  def createConferenceProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new conference provider under the user's AWS account.
     */
  def createConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds a new conference provider under the user's AWS account.
     */
  def createConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a contact with the specified details.
     */
  def createContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a contact with the specified details.
     */
  def createContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a contact with the specified details.
     */
  def createContact(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a contact with the specified details.
     */
  def createContact(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new room profile with the specified details.
     */
  def createProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new room profile with the specified details.
     */
  def createProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new room profile with the specified details.
     */
  def createProfile(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a new room profile with the specified details.
     */
  def createProfile(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a room with the specified details.
     */
  def createRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a room with the specified details.
     */
  def createRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a room with the specified details.
     */
  def createRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a room with the specified details.
     */
  def createRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a skill group with a specified name and description.
     */
  def createSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a skill group with a specified name and description.
     */
  def createSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a skill group with a specified name and description.
     */
  def createSkillGroup(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a skill group with a specified name and description.
     */
  def createSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user.
     */
  def createUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user.
     */
  def createUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user.
     */
  def createUser(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Creates a user.
     */
  def createUser(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.CreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an address book by the address book ARN.
     */
  def deleteAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an address book by the address book ARN.
     */
  def deleteAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an address book by the address book ARN.
     */
  def deleteAddressBook(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes an address book by the address book ARN.
     */
  def deleteAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     */
  def deleteBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     */
  def deleteBusinessReportSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     */
  def deleteBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the recurring report delivery schedule with the specified schedule ARN.
     */
  def deleteBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a conference provider.
     */
  def deleteConferenceProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a conference provider.
     */
  def deleteConferenceProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a conference provider.
     */
  def deleteConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a conference provider.
     */
  def deleteConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a contact by the contact ARN.
     */
  def deleteContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a contact by the contact ARN.
     */
  def deleteContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a contact by the contact ARN.
     */
  def deleteContact(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a contact by the contact ARN.
     */
  def deleteContact(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a device from Alexa For Business.
     */
  def deleteDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a device from Alexa For Business.
     */
  def deleteDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a device from Alexa For Business.
     */
  def deleteDevice(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes a device from Alexa For Business.
     */
  def deleteDevice(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room profile by the profile ARN.
     */
  def deleteProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room profile by the profile ARN.
     */
  def deleteProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room profile by the profile ARN.
     */
  def deleteProfile(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room profile by the profile ARN.
     */
  def deleteProfile(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room by the room ARN.
     */
  def deleteRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room by the room ARN.
     */
  def deleteRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room by the room ARN.
     */
  def deleteRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a room by the room ARN.
     */
  def deleteRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     */
  def deleteRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     */
  def deleteRoomSkillParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     */
  def deleteRoomSkillParameter(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes room skill parameter details by room, skill, and parameter key ID.
     */
  def deleteRoomSkillParameter(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unlinks a third-party account from a skill.
     */
  def deleteSkillAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unlinks a third-party account from a skill.
     */
  def deleteSkillAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unlinks a third-party account from a skill.
     */
  def deleteSkillAuthorization(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Unlinks a third-party account from a skill.
     */
  def deleteSkillAuthorization(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a skill group by skill group ARN.
     */
  def deleteSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a skill group by skill group ARN.
     */
  def deleteSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a skill group by skill group ARN.
     */
  def deleteSkillGroup(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a skill group by skill group ARN.
     */
  def deleteSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified user by user ARN and enrollment ARN.
     */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified user by user ARN and enrollment ARN.
     */
  def deleteUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified user by user ARN and enrollment ARN.
     */
  def deleteUser(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes a specified user by user ARN and enrollment ARN.
     */
  def deleteUser(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DeleteUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a contact from a given address book.
     */
  def disassociateContactFromAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a contact from a given address book.
     */
  def disassociateContactFromAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a contact from a given address book.
     */
  def disassociateContactFromAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a contact from a given address book.
     */
  def disassociateContactFromAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateContactFromAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
     */
  def disassociateDeviceFromRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
     */
  def disassociateDeviceFromRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
     */
  def disassociateDeviceFromRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a device from its current room. The device continues to be connected to the Wi-Fi network and is still registered to the account. The device settings and skills are removed from the room.
     */
  def disassociateDeviceFromRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateDeviceFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from a skill group.
     */
  def disassociateSkillFromSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from a skill group.
     */
  def disassociateSkillFromSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from a skill group.
     */
  def disassociateSkillFromSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from a skill group.
     */
  def disassociateSkillFromSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     */
  def disassociateSkillFromUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     */
  def disassociateSkillFromUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     */
  def disassociateSkillFromUsers(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Makes a private skill unavailable for enrolled users and prevents them from enabling it on their devices.
     */
  def disassociateSkillFromUsers(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillFromUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
     */
  def disassociateSkillGroupFromRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
     */
  def disassociateSkillGroupFromRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
     */
  def disassociateSkillGroupFromRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill group from a specified room. This disables all skills in the skill group on all devices in the room.
     */
  def disassociateSkillGroupFromRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.DisassociateSkillGroupFromRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Forgets smart home appliances associated to a room.
     */
  def forgetSmartHomeAppliances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Forgets smart home appliances associated to a room.
     */
  def forgetSmartHomeAppliances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Forgets smart home appliances associated to a room.
     */
  def forgetSmartHomeAppliances(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Forgets smart home appliances associated to a room.
     */
  def forgetSmartHomeAppliances(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ForgetSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets address the book details by the address book ARN.
     */
  def getAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets address the book details by the address book ARN.
     */
  def getAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets address the book details by the address book ARN.
     */
  def getAddressBook(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets address the book details by the address book ARN.
     */
  def getAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the existing conference preferences.
     */
  def getConferencePreference(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the existing conference preferences.
     */
  def getConferencePreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the existing conference preferences.
     */
  def getConferencePreference(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves the existing conference preferences.
     */
  def getConferencePreference(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a specific conference provider.
     */
  def getConferenceProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a specific conference provider.
     */
  def getConferenceProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a specific conference provider.
     */
  def getConferenceProvider(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets details about a specific conference provider.
     */
  def getConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the contact details by the contact ARN.
     */
  def getContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the contact details by the contact ARN.
     */
  def getContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the contact details by the contact ARN.
     */
  def getContact(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the contact details by the contact ARN.
     */
  def getContact(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a device by device ARN.
     */
  def getDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a device by device ARN.
     */
  def getDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a device by device ARN.
     */
  def getDevice(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a device by device ARN.
     */
  def getDevice(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a room profile by profile ARN.
     */
  def getProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a room profile by profile ARN.
     */
  def getProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a room profile by profile ARN.
     */
  def getProfile(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets the details of a room profile by profile ARN.
     */
  def getProfile(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room details by room ARN.
     */
  def getRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room details by room ARN.
     */
  def getRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room details by room ARN.
     */
  def getRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room details by room ARN.
     */
  def getRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     */
  def getRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     */
  def getRoomSkillParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     */
  def getRoomSkillParameter(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets room skill parameter details by room, skill, and parameter key ARN.
     */
  def getRoomSkillParameter(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets skill group details by skill group ARN.
     */
  def getSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets skill group details by skill group ARN.
     */
  def getSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets skill group details by skill group ARN.
     */
  def getSkillGroup(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Gets skill group details by skill group ARN.
     */
  def getSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.GetSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the details of the schedules that a user configured.
     */
  def listBusinessReportSchedules(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the details of the schedules that a user configured.
     */
  def listBusinessReportSchedules(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the details of the schedules that a user configured.
     */
  def listBusinessReportSchedules(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the details of the schedules that a user configured.
     */
  def listBusinessReportSchedules(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListBusinessReportSchedulesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists conference providers under a specific AWS account.
     */
  def listConferenceProviders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists conference providers under a specific AWS account.
     */
  def listConferenceProviders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists conference providers under a specific AWS account.
     */
  def listConferenceProviders(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists conference providers under a specific AWS account.
     */
  def listConferenceProviders(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListConferenceProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the device event history, including device connection status, for up to 30 days.
     */
  def listDeviceEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the device event history, including device connection status, for up to 30 days.
     */
  def listDeviceEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the device event history, including device connection status, for up to 30 days.
     */
  def listDeviceEvents(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the device event history, including device connection status, for up to 30 days.
     */
  def listDeviceEvents(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListDeviceEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all enabled skills in a specific skill group.
     */
  def listSkills(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all enabled skills in a specific skill group.
     */
  def listSkills(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all enabled skills in a specific skill group.
     */
  def listSkills(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all enabled skills in a specific skill group.
     */
  def listSkills(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all categories in the Alexa skill store.
     */
  def listSkillsStoreCategories(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all categories in the Alexa skill store.
     */
  def listSkillsStoreCategories(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all categories in the Alexa skill store.
     */
  def listSkillsStoreCategories(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all categories in the Alexa skill store.
     */
  def listSkillsStoreCategories(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreCategoriesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all skills in the Alexa skill store by category.
     */
  def listSkillsStoreSkillsByCategory(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all skills in the Alexa skill store by category.
     */
  def listSkillsStoreSkillsByCategory(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all skills in the Alexa skill store by category.
     */
  def listSkillsStoreSkillsByCategory(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all skills in the Alexa skill store by category.
     */
  def listSkillsStoreSkillsByCategory(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSkillsStoreSkillsByCategoryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the smart home appliances associated with a room.
     */
  def listSmartHomeAppliances(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the smart home appliances associated with a room.
     */
  def listSmartHomeAppliances(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the smart home appliances associated with a room.
     */
  def listSmartHomeAppliances(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all of the smart home appliances associated with a room.
     */
  def listSmartHomeAppliances(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListSmartHomeAppliancesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for the specified resource.
     */
  def listTags(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for the specified resource.
     */
  def listTags(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for the specified resource.
     */
  def listTags(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists all tags for the specified resource.
     */
  def listTags(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ListTagsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the conference preferences on a specific conference provider at the account level.
     */
  def putConferencePreference(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the conference preferences on a specific conference provider at the account level.
     */
  def putConferencePreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the conference preferences on a specific conference provider at the account level.
     */
  def putConferencePreference(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sets the conference preferences on a specific conference provider at the account level.
     */
  def putConferencePreference(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutConferencePreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
     */
  def putRoomSkillParameter(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
     */
  def putRoomSkillParameter(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
     */
  def putRoomSkillParameter(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room skill parameter details by room, skill, and parameter key ID. Not all skills have a room skill parameter.
     */
  def putRoomSkillParameter(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutRoomSkillParameterResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
     */
  def putSkillAuthorization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
     */
  def putSkillAuthorization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
     */
  def putSkillAuthorization(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Links a user's account to a third-party skill provider. If this API operation is called by an assumed IAM role, the skill being linked must be a private skill. Also, the skill must be owned by the AWS account that assumed the IAM role.
     */
  def putSkillAuthorization(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.PutSkillAuthorizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
     */
  def registerAVSDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
     */
  def registerAVSDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
     */
  def registerAVSDevice(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Registers an Alexa-enabled device built by an Original Equipment Manufacturer (OEM) using Alexa Voice Service (AVS).
     */
  def registerAVSDevice(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RegisterAVSDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
     */
  def rejectSkill(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
     */
  def rejectSkill(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
     */
  def rejectSkill(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Disassociates a skill from the organization under a user's AWS account. If the skill is a private skill, it moves to an AcceptStatus of PENDING. Any private or public skill that is rejected can be added later by calling the ApproveSkill API. 
     */
  def rejectSkill(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RejectSkillResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
     */
  def resolveRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
     */
  def resolveRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
     */
  def resolveRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Determines the details for the room from which a skill request was invoked. This operation is used by skill developers.
     */
  def resolveRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.ResolveRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an invitation and invalidates the enrollment URL.
     */
  def revokeInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an invitation and invalidates the enrollment URL.
     */
  def revokeInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an invitation and invalidates the enrollment URL.
     */
  def revokeInvitation(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Revokes an invitation and invalidates the enrollment URL.
     */
  def revokeInvitation(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.RevokeInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     */
  def searchAddressBooks(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     */
  def searchAddressBooks(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     */
  def searchAddressBooks(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches address books and lists the ones that meet a set of filter and sort criteria.
     */
  def searchAddressBooks(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchAddressBooksResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     */
  def searchContacts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     */
  def searchContacts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     */
  def searchContacts(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches contacts and lists the ones that meet a set of filter and sort criteria.
     */
  def searchContacts(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchContactsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches devices and lists the ones that meet a set of filter criteria.
     */
  def searchDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches devices and lists the ones that meet a set of filter criteria.
     */
  def searchDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches devices and lists the ones that meet a set of filter criteria.
     */
  def searchDevices(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches devices and lists the ones that meet a set of filter criteria.
     */
  def searchDevices(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     */
  def searchProfiles(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     */
  def searchProfiles(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     */
  def searchProfiles(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches room profiles and lists the ones that meet a set of filter criteria.
     */
  def searchProfiles(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchProfilesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     */
  def searchRooms(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     */
  def searchRooms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     */
  def searchRooms(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches rooms and lists the ones that meet a set of filter and sort criteria.
     */
  def searchRooms(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchRoomsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     */
  def searchSkillGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     */
  def searchSkillGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     */
  def searchSkillGroups(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches skill groups and lists the ones that meet a set of filter and sort criteria.
     */
  def searchSkillGroups(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchSkillGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     */
  def searchUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     */
  def searchUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     */
  def searchUsers(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Searches users and lists the ones that meet a set of filter and sort criteria.
     */
  def searchUsers(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SearchUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
     */
  def sendInvitation(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
     */
  def sendInvitation(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
     */
  def sendInvitation(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends an enrollment invitation email with a URL to a user. The URL is valid for 72 hours or until you call this operation again, whichever comes first. 
     */
  def sendInvitation(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.SendInvitationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
     */
  def startDeviceSync(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
     */
  def startDeviceSync(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
     */
  def startDeviceSync(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets a device and its account to the known default settings, by clearing all information and settings set by previous users.
     */
  def startDeviceSync(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartDeviceSyncResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates the discovery of any smart home appliances associated with the room.
     */
  def startSmartHomeApplianceDiscovery(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates the discovery of any smart home appliances associated with the room.
     */
  def startSmartHomeApplianceDiscovery(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates the discovery of any smart home appliances associated with the room.
     */
  def startSmartHomeApplianceDiscovery(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Initiates the discovery of any smart home appliances associated with the room.
     */
  def startSmartHomeApplianceDiscovery(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.StartSmartHomeApplianceDiscoveryResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to a specified resource.
     */
  def tagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to a specified resource.
     */
  def tagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to a specified resource.
     */
  def tagResource(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Adds metadata tags to a specified resource.
     */
  def tagResource(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.TagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a specified resource.
     */
  def untagResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a specified resource.
     */
  def untagResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a specified resource.
     */
  def untagResource(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Removes metadata tags from a specified resource.
     */
  def untagResource(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UntagResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates address book details by the address book ARN.
     */
  def updateAddressBook(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates address book details by the address book ARN.
     */
  def updateAddressBook(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates address book details by the address book ARN.
     */
  def updateAddressBook(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates address book details by the address book ARN.
     */
  def updateAddressBook(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateAddressBookResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     */
  def updateBusinessReportSchedule(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     */
  def updateBusinessReportSchedule(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     */
  def updateBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the configuration of the report delivery schedule with the specified schedule ARN.
     */
  def updateBusinessReportSchedule(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateBusinessReportScheduleResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing conference provider's settings.
     */
  def updateConferenceProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing conference provider's settings.
     */
  def updateConferenceProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing conference provider's settings.
     */
  def updateConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing conference provider's settings.
     */
  def updateConferenceProvider(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateConferenceProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the contact details by the contact ARN.
     */
  def updateContact(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the contact details by the contact ARN.
     */
  def updateContact(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the contact details by the contact ARN.
     */
  def updateContact(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the contact details by the contact ARN.
     */
  def updateContact(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateContactResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the device name by device ARN.
     */
  def updateDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the device name by device ARN.
     */
  def updateDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the device name by device ARN.
     */
  def updateDevice(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates the device name by device ARN.
     */
  def updateDevice(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing room profile by room profile ARN.
     */
  def updateProfile(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing room profile by room profile ARN.
     */
  def updateProfile(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing room profile by room profile ARN.
     */
  def updateProfile(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates an existing room profile by room profile ARN.
     */
  def updateProfile(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateProfileResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room details by room ARN.
     */
  def updateRoom(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room details by room ARN.
     */
  def updateRoom(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room details by room ARN.
     */
  def updateRoom(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates room details by room ARN.
     */
  def updateRoom(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateRoomResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates skill group details by skill group ARN.
     */
  def updateSkillGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates skill group details by skill group ARN.
     */
  def updateSkillGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates skill group details by skill group ARN.
     */
  def updateSkillGroup(params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates skill group details by skill group ARN.
     */
  def updateSkillGroup(
    params: awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsAlexaforbusinessMod.AlexaForBusinessNs.UpdateSkillGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

