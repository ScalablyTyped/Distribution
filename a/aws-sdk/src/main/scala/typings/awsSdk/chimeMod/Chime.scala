package typings.awsSdk.chimeMod

import typings.awsSdk.configMod.ConfigBase
import typings.awsSdk.errorMod.AWSError
import typings.awsSdk.requestMod.Request
import typings.awsSdk.serviceMod.Service
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chime extends Service {
  @JSName("config")
  var config_Chime: ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(): Request[AssociatePhoneNumberWithUserResponse, AWSError] = js.native
  def associatePhoneNumberWithUser(callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumberWithUserResponse, Unit]): Request[AssociatePhoneNumberWithUserResponse, AWSError] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(params: AssociatePhoneNumberWithUserRequest): Request[AssociatePhoneNumberWithUserResponse, AWSError] = js.native
  def associatePhoneNumberWithUser(
    params: AssociatePhoneNumberWithUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumberWithUserResponse, Unit]
  ): Request[AssociatePhoneNumberWithUserResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, Unit]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    params: AssociatePhoneNumbersWithVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, Unit]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime Voice Connector group.
    */
  def associatePhoneNumbersWithVoiceConnectorGroup(): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnectorGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Associates phone numbers with the specified Amazon Chime Voice Connector group.
    */
  def associatePhoneNumbersWithVoiceConnectorGroup(params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  def associatePhoneNumbersWithVoiceConnectorGroup(
    params: AssociatePhoneNumbersWithVoiceConnectorGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[AssociatePhoneNumbersWithVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Associates the specified sign-in delegate groups with the specified Amazon Chime account.
    */
  def associateSigninDelegateGroupsWithAccount(): Request[AssociateSigninDelegateGroupsWithAccountResponse, AWSError] = js.native
  def associateSigninDelegateGroupsWithAccount(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateSigninDelegateGroupsWithAccountResponse, 
      Unit
    ]
  ): Request[AssociateSigninDelegateGroupsWithAccountResponse, AWSError] = js.native
  /**
    * Associates the specified sign-in delegate groups with the specified Amazon Chime account.
    */
  def associateSigninDelegateGroupsWithAccount(params: AssociateSigninDelegateGroupsWithAccountRequest): Request[AssociateSigninDelegateGroupsWithAccountResponse, AWSError] = js.native
  def associateSigninDelegateGroupsWithAccount(
    params: AssociateSigninDelegateGroupsWithAccountRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ AssociateSigninDelegateGroupsWithAccountResponse, 
      Unit
    ]
  ): Request[AssociateSigninDelegateGroupsWithAccountResponse, AWSError] = js.native
  /**
    * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def batchCreateAttendee(): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  def batchCreateAttendee(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateAttendeeResponse, Unit]): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  /**
    * Creates up to 100 new attendees for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide. 
    */
  def batchCreateAttendee(params: BatchCreateAttendeeRequest): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  def batchCreateAttendee(
    params: BatchCreateAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateAttendeeResponse, Unit]
  ): Request[BatchCreateAttendeeResponse, AWSError] = js.native
  /**
    * Adds up to 50 members to a chat room in an Amazon Chime Enterprise account. Members can be either users or bots. The member role designates whether the member is a chat room administrator or a general chat room member.
    */
  def batchCreateRoomMembership(): Request[BatchCreateRoomMembershipResponse, AWSError] = js.native
  def batchCreateRoomMembership(callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateRoomMembershipResponse, Unit]): Request[BatchCreateRoomMembershipResponse, AWSError] = js.native
  /**
    * Adds up to 50 members to a chat room in an Amazon Chime Enterprise account. Members can be either users or bots. The member role designates whether the member is a chat room administrator or a general chat room member.
    */
  def batchCreateRoomMembership(params: BatchCreateRoomMembershipRequest): Request[BatchCreateRoomMembershipResponse, AWSError] = js.native
  def batchCreateRoomMembership(
    params: BatchCreateRoomMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchCreateRoomMembershipResponse, Unit]
  ): Request[BatchCreateRoomMembershipResponse, AWSError] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  def batchDeletePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePhoneNumberResponse, Unit]): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  def batchDeletePhoneNumber(
    params: BatchDeletePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeletePhoneNumberResponse, Unit]
  ): Request[BatchDeletePhoneNumberResponse, AWSError] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are disassociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(): Request[BatchSuspendUserResponse, AWSError] = js.native
  def batchSuspendUser(callback: js.Function2[/* err */ AWSError, /* data */ BatchSuspendUserResponse, Unit]): Request[BatchSuspendUserResponse, AWSError] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are disassociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(params: BatchSuspendUserRequest): Request[BatchSuspendUserResponse, AWSError] = js.native
  def batchSuspendUser(
    params: BatchSuspendUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchSuspendUserResponse, Unit]
  ): Request[BatchSuspendUserResponse, AWSError] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(): Request[BatchUnsuspendUserResponse, AWSError] = js.native
  def batchUnsuspendUser(callback: js.Function2[/* err */ AWSError, /* data */ BatchUnsuspendUserResponse, Unit]): Request[BatchUnsuspendUserResponse, AWSError] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(params: BatchUnsuspendUserRequest): Request[BatchUnsuspendUserResponse, AWSError] = js.native
  def batchUnsuspendUser(
    params: BatchUnsuspendUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUnsuspendUserResponse, Unit]
  ): Request[BatchUnsuspendUserResponse, AWSError] = js.native
  /**
    * Updates phone number product types or calling names. You can update one attribute at a time for each UpdatePhoneNumberRequestItem. For example, you can update either the product type or the calling name. For product types, choose from Amazon Chime Business Calling and Amazon Chime Voice Connector. For toll-free numbers, you must use the Amazon Chime Voice Connector product type. Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def batchUpdatePhoneNumber(): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  def batchUpdatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdatePhoneNumberResponse, Unit]): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates phone number product types or calling names. You can update one attribute at a time for each UpdatePhoneNumberRequestItem. For example, you can update either the product type or the calling name. For product types, choose from Amazon Chime Business Calling and Amazon Chime Voice Connector. For toll-free numbers, you must use the Amazon Chime Voice Connector product type. Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  def batchUpdatePhoneNumber(
    params: BatchUpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdatePhoneNumberResponse, Unit]
  ): Request[BatchUpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(): Request[BatchUpdateUserResponse, AWSError] = js.native
  def batchUpdateUser(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateUserResponse, Unit]): Request[BatchUpdateUserResponse, AWSError] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(params: BatchUpdateUserRequest): Request[BatchUpdateUserResponse, AWSError] = js.native
  def batchUpdateUser(
    params: BatchUpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateUserResponse, Unit]
  ): Request[BatchUpdateUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(): Request[CreateAccountResponse, AWSError] = js.native
  def createAccount(callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountResponse, Unit]): Request[CreateAccountResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(params: CreateAccountRequest): Request[CreateAccountResponse, AWSError] = js.native
  def createAccount(
    params: CreateAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAccountResponse, Unit]
  ): Request[CreateAccountResponse, AWSError] = js.native
  /**
    * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def createAttendee(): Request[CreateAttendeeResponse, AWSError] = js.native
  def createAttendee(callback: js.Function2[/* err */ AWSError, /* data */ CreateAttendeeResponse, Unit]): Request[CreateAttendeeResponse, AWSError] = js.native
  /**
    * Creates a new attendee for an active Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def createAttendee(params: CreateAttendeeRequest): Request[CreateAttendeeResponse, AWSError] = js.native
  def createAttendee(
    params: CreateAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateAttendeeResponse, Unit]
  ): Request[CreateAttendeeResponse, AWSError] = js.native
  /**
    * Creates a bot for an Amazon Chime Enterprise account.
    */
  def createBot(): Request[CreateBotResponse, AWSError] = js.native
  def createBot(callback: js.Function2[/* err */ AWSError, /* data */ CreateBotResponse, Unit]): Request[CreateBotResponse, AWSError] = js.native
  /**
    * Creates a bot for an Amazon Chime Enterprise account.
    */
  def createBot(params: CreateBotRequest): Request[CreateBotResponse, AWSError] = js.native
  def createBot(
    params: CreateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateBotResponse, Unit]
  ): Request[CreateBotResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def createMeeting(): Request[CreateMeetingResponse, AWSError] = js.native
  def createMeeting(callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingResponse, Unit]): Request[CreateMeetingResponse, AWSError] = js.native
  /**
    * Creates a new Amazon Chime SDK meeting in the specified media Region with no initial attendees. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def createMeeting(params: CreateMeetingRequest): Request[CreateMeetingResponse, AWSError] = js.native
  def createMeeting(
    params: CreateMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateMeetingResponse, Unit]
  ): Request[CreateMeetingResponse, AWSError] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
    */
  def createPhoneNumberOrder(): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  def createPhoneNumberOrder(callback: js.Function2[/* err */ AWSError, /* data */ CreatePhoneNumberOrderResponse, Unit]): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you must use the Amazon Chime Voice Connector product type.
    */
  def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  def createPhoneNumberOrder(
    params: CreatePhoneNumberOrderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreatePhoneNumberOrderResponse, Unit]
  ): Request[CreatePhoneNumberOrderResponse, AWSError] = js.native
  /**
    * 
    */
  def createProxySession(): Request[CreateProxySessionResponse, AWSError] = js.native
  def createProxySession(callback: js.Function2[/* err */ AWSError, /* data */ CreateProxySessionResponse, Unit]): Request[CreateProxySessionResponse, AWSError] = js.native
  /**
    * 
    */
  def createProxySession(params: CreateProxySessionRequest): Request[CreateProxySessionResponse, AWSError] = js.native
  def createProxySession(
    params: CreateProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateProxySessionResponse, Unit]
  ): Request[CreateProxySessionResponse, AWSError] = js.native
  /**
    * Creates a chat room for the specified Amazon Chime Enterprise account.
    */
  def createRoom(): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]): Request[CreateRoomResponse, AWSError] = js.native
  /**
    * Creates a chat room for the specified Amazon Chime Enterprise account.
    */
  def createRoom(params: CreateRoomRequest): Request[CreateRoomResponse, AWSError] = js.native
  def createRoom(
    params: CreateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomResponse, Unit]
  ): Request[CreateRoomResponse, AWSError] = js.native
  /**
    * Adds a member to a chat room in an Amazon Chime Enterprise account. A member can be either a user or a bot. The member role designates whether the member is a chat room administrator or a general chat room member.
    */
  def createRoomMembership(): Request[CreateRoomMembershipResponse, AWSError] = js.native
  def createRoomMembership(callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomMembershipResponse, Unit]): Request[CreateRoomMembershipResponse, AWSError] = js.native
  /**
    * Adds a member to a chat room in an Amazon Chime Enterprise account. A member can be either a user or a bot. The member role designates whether the member is a chat room administrator or a general chat room member.
    */
  def createRoomMembership(params: CreateRoomMembershipRequest): Request[CreateRoomMembershipResponse, AWSError] = js.native
  def createRoomMembership(
    params: CreateRoomMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateRoomMembershipResponse, Unit]
  ): Request[CreateRoomMembershipResponse, AWSError] = js.native
  /**
    * Creates a user under the specified Amazon Chime account.
    */
  def createUser(): Request[CreateUserResponse, AWSError] = js.native
  def createUser(callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates a user under the specified Amazon Chime account.
    */
  def createUser(params: CreateUserRequest): Request[CreateUserResponse, AWSError] = js.native
  def createUser(
    params: CreateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateUserResponse, Unit]
  ): Request[CreateUserResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. You can choose to create an Amazon Chime Voice Connector in a specific AWS Region. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  def createVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorResponse, Unit]): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. You can choose to create an Amazon Chime Voice Connector in a specific AWS Region. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(params: CreateVoiceConnectorRequest): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  def createVoiceConnector(
    params: CreateVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorResponse, Unit]
  ): Request[CreateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request. You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  def createVoiceConnectorGroup(): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  def createVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorGroupResponse, Unit]): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector group under the administrator's AWS account. You can associate Amazon Chime Voice Connectors with the Amazon Chime Voice Connector group by including VoiceConnectorItems in the request. You can include Amazon Chime Voice Connectors from different AWS Regions in your group. This creates a fault tolerant mechanism for fallback in case of availability events.
    */
  def createVoiceConnectorGroup(params: CreateVoiceConnectorGroupRequest): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  def createVoiceConnectorGroup(
    params: CreateVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ CreateVoiceConnectorGroupResponse, Unit]
  ): Request[CreateVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(): Request[DeleteAccountResponse, AWSError] = js.native
  def deleteAccount(callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountResponse, Unit]): Request[DeleteAccountResponse, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(params: DeleteAccountRequest): Request[DeleteAccountResponse, AWSError] = js.native
  def deleteAccount(
    params: DeleteAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DeleteAccountResponse, Unit]
  ): Request[DeleteAccountResponse, AWSError] = js.native
  /**
    * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their JoinToken. Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteAttendee(): Request[js.Object, AWSError] = js.native
  def deleteAttendee(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes an attendee from the specified Amazon Chime SDK meeting and deletes their JoinToken. Attendees are automatically deleted when a Amazon Chime SDK meeting is deleted. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteAttendee(params: DeleteAttendeeRequest): Request[js.Object, AWSError] = js.native
  def deleteAttendee(
    params: DeleteAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the events configuration that allows a bot to receive outgoing events.
    */
  def deleteEventsConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteEventsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the events configuration that allows a bot to receive outgoing events.
    */
  def deleteEventsConfiguration(params: DeleteEventsConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteEventsConfiguration(
    params: DeleteEventsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime SDK meeting. When a meeting is deleted, its attendees are also deleted and clients can no longer join it. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteMeeting(): Request[js.Object, AWSError] = js.native
  def deleteMeeting(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime SDK meeting. When a meeting is deleted, its attendees are also deleted and clients can no longer join it. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def deleteMeeting(params: DeleteMeetingRequest): Request[js.Object, AWSError] = js.native
  def deleteMeeting(
    params: DeleteMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(): Request[js.Object, AWSError] = js.native
  def deletePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(params: DeletePhoneNumberRequest): Request[js.Object, AWSError] = js.native
  def deletePhoneNumber(
    params: DeletePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def deleteProxySession(): Request[js.Object, AWSError] = js.native
  def deleteProxySession(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def deleteProxySession(params: DeleteProxySessionRequest): Request[js.Object, AWSError] = js.native
  def deleteProxySession(
    params: DeleteProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a chat room in an Amazon Chime Enterprise account.
    */
  def deleteRoom(): Request[js.Object, AWSError] = js.native
  def deleteRoom(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes a chat room in an Amazon Chime Enterprise account.
    */
  def deleteRoom(params: DeleteRoomRequest): Request[js.Object, AWSError] = js.native
  def deleteRoom(params: DeleteRoomRequest, callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a member from a chat room in an Amazon Chime Enterprise account.
    */
  def deleteRoomMembership(): Request[js.Object, AWSError] = js.native
  def deleteRoomMembership(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Removes a member from a chat room in an Amazon Chime Enterprise account.
    */
  def deleteRoomMembership(params: DeleteRoomMembershipRequest): Request[js.Object, AWSError] = js.native
  def deleteRoomMembership(
    params: DeleteRoomMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector. Any phone numbers associated with the Amazon Chime Voice Connector must be disassociated from it before it can be deleted.
    */
  def deleteVoiceConnector(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector. Any phone numbers associated with the Amazon Chime Voice Connector must be disassociated from it before it can be deleted.
    */
  def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnector(
    params: DeleteVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector group. Any VoiceConnectorItems and phone numbers associated with the group must be removed before it can be deleted.
    */
  def deleteVoiceConnectorGroup(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector group. Any VoiceConnectorItems and phone numbers associated with the group must be removed before it can be deleted.
    */
  def deleteVoiceConnectorGroup(params: DeleteVoiceConnectorGroupRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorGroup(
    params: DeleteVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the origination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorOrigination(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the origination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorOrigination(
    params: DeleteVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def deleteVoiceConnectorProxy(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def deleteVoiceConnectorProxy(params: DeleteVoiceConnectorProxyRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorProxy(
    params: DeleteVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the streaming configuration for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorStreamingConfiguration(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorStreamingConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the streaming configuration for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorStreamingConfiguration(params: DeleteVoiceConnectorStreamingConfigurationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorStreamingConfiguration(
    params: DeleteVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the termination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorTermination(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the termination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTermination(
    params: DeleteVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): Request[js.Object, AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(
    params: DeleteVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(): Request[DisassociatePhoneNumberFromUserResponse, AWSError] = js.native
  def disassociatePhoneNumberFromUser(
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePhoneNumberFromUserResponse, Unit]
  ): Request[DisassociatePhoneNumberFromUserResponse, AWSError] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(params: DisassociatePhoneNumberFromUserRequest): Request[DisassociatePhoneNumberFromUserResponse, AWSError] = js.native
  def disassociatePhoneNumberFromUser(
    params: DisassociatePhoneNumberFromUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DisassociatePhoneNumberFromUserResponse, Unit]
  ): Request[DisassociatePhoneNumberFromUserResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    params: DisassociatePhoneNumbersFromVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector group.
    */
  def disassociatePhoneNumbersFromVoiceConnectorGroup(): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnectorGroup(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Disassociates the specified phone numbers from the specified Amazon Chime Voice Connector group.
    */
  def disassociatePhoneNumbersFromVoiceConnectorGroup(params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  def disassociatePhoneNumbersFromVoiceConnectorGroup(
    params: DisassociatePhoneNumbersFromVoiceConnectorGroupRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, 
      Unit
    ]
  ): Request[DisassociatePhoneNumbersFromVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Disassociates the specified sign-in delegate groups from the specified Amazon Chime account.
    */
  def disassociateSigninDelegateGroupsFromAccount(): Request[DisassociateSigninDelegateGroupsFromAccountResponse, AWSError] = js.native
  def disassociateSigninDelegateGroupsFromAccount(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateSigninDelegateGroupsFromAccountResponse, 
      Unit
    ]
  ): Request[DisassociateSigninDelegateGroupsFromAccountResponse, AWSError] = js.native
  /**
    * Disassociates the specified sign-in delegate groups from the specified Amazon Chime account.
    */
  def disassociateSigninDelegateGroupsFromAccount(params: DisassociateSigninDelegateGroupsFromAccountRequest): Request[DisassociateSigninDelegateGroupsFromAccountResponse, AWSError] = js.native
  def disassociateSigninDelegateGroupsFromAccount(
    params: DisassociateSigninDelegateGroupsFromAccountRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ DisassociateSigninDelegateGroupsFromAccountResponse, 
      Unit
    ]
  ): Request[DisassociateSigninDelegateGroupsFromAccountResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(): Request[GetAccountResponse, AWSError] = js.native
  def getAccount(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountResponse, Unit]): Request[GetAccountResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(params: GetAccountRequest): Request[GetAccountResponse, AWSError] = js.native
  def getAccount(
    params: GetAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountResponse, Unit]
  ): Request[GetAccountResponse, AWSError] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]): Request[GetAccountSettingsResponse, AWSError] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): Request[GetAccountSettingsResponse, AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAccountSettingsResponse, Unit]
  ): Request[GetAccountSettingsResponse, AWSError] = js.native
  /**
    * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getAttendee(): Request[GetAttendeeResponse, AWSError] = js.native
  def getAttendee(callback: js.Function2[/* err */ AWSError, /* data */ GetAttendeeResponse, Unit]): Request[GetAttendeeResponse, AWSError] = js.native
  /**
    * Gets the Amazon Chime SDK attendee details for a specified meeting ID and attendee ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getAttendee(params: GetAttendeeRequest): Request[GetAttendeeResponse, AWSError] = js.native
  def getAttendee(
    params: GetAttendeeRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttendeeResponse, Unit]
  ): Request[GetAttendeeResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
    */
  def getBot(): Request[GetBotResponse, AWSError] = js.native
  def getBot(callback: js.Function2[/* err */ AWSError, /* data */ GetBotResponse, Unit]): Request[GetBotResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
    */
  def getBot(params: GetBotRequest): Request[GetBotResponse, AWSError] = js.native
  def getBot(params: GetBotRequest, callback: js.Function2[/* err */ AWSError, /* data */ GetBotResponse, Unit]): Request[GetBotResponse, AWSError] = js.native
  /**
    * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint or Lambda function ARN. 
    */
  def getEventsConfiguration(): Request[GetEventsConfigurationResponse, AWSError] = js.native
  def getEventsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ GetEventsConfigurationResponse, Unit]): Request[GetEventsConfigurationResponse, AWSError] = js.native
  /**
    * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint or Lambda function ARN. 
    */
  def getEventsConfiguration(params: GetEventsConfigurationRequest): Request[GetEventsConfigurationResponse, AWSError] = js.native
  def getEventsConfiguration(
    params: GetEventsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetEventsConfigurationResponse, Unit]
  ): Request[GetEventsConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def getGlobalSettings(): Request[GetGlobalSettingsResponse, AWSError] = js.native
  def getGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetGlobalSettingsResponse, Unit]): Request[GetGlobalSettingsResponse, AWSError] = js.native
  /**
    * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getMeeting(): Request[GetMeetingResponse, AWSError] = js.native
  def getMeeting(callback: js.Function2[/* err */ AWSError, /* data */ GetMeetingResponse, Unit]): Request[GetMeetingResponse, AWSError] = js.native
  /**
    * Gets the Amazon Chime SDK meeting details for the specified meeting ID. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def getMeeting(params: GetMeetingRequest): Request[GetMeetingResponse, AWSError] = js.native
  def getMeeting(
    params: GetMeetingRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetMeetingResponse, Unit]
  ): Request[GetMeetingResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(): Request[GetPhoneNumberResponse, AWSError] = js.native
  def getPhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberResponse, Unit]): Request[GetPhoneNumberResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(params: GetPhoneNumberRequest): Request[GetPhoneNumberResponse, AWSError] = js.native
  def getPhoneNumber(
    params: GetPhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberResponse, Unit]
  ): Request[GetPhoneNumberResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  def getPhoneNumberOrder(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberOrderResponse, Unit]): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  def getPhoneNumberOrder(
    params: GetPhoneNumberOrderRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberOrderResponse, Unit]
  ): Request[GetPhoneNumberOrderResponse, AWSError] = js.native
  /**
    * Retrieves the phone number settings for the administrator's AWS account, such as the default outbound calling name.
    */
  def getPhoneNumberSettings(): Request[GetPhoneNumberSettingsResponse, AWSError] = js.native
  def getPhoneNumberSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetPhoneNumberSettingsResponse, Unit]): Request[GetPhoneNumberSettingsResponse, AWSError] = js.native
  /**
    * 
    */
  def getProxySession(): Request[GetProxySessionResponse, AWSError] = js.native
  def getProxySession(callback: js.Function2[/* err */ AWSError, /* data */ GetProxySessionResponse, Unit]): Request[GetProxySessionResponse, AWSError] = js.native
  /**
    * 
    */
  def getProxySession(params: GetProxySessionRequest): Request[GetProxySessionResponse, AWSError] = js.native
  def getProxySession(
    params: GetProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProxySessionResponse, Unit]
  ): Request[GetProxySessionResponse, AWSError] = js.native
  /**
    * Retrieves room details, such as the room name, for a room in an Amazon Chime Enterprise account.
    */
  def getRoom(): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]): Request[GetRoomResponse, AWSError] = js.native
  /**
    * Retrieves room details, such as the room name, for a room in an Amazon Chime Enterprise account.
    */
  def getRoom(params: GetRoomRequest): Request[GetRoomResponse, AWSError] = js.native
  def getRoom(
    params: GetRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetRoomResponse, Unit]
  ): Request[GetRoomResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(): Request[GetUserResponse, AWSError] = js.native
  def getUser(callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]): Request[GetUserResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(params: GetUserRequest): Request[GetUserResponse, AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserResponse, Unit]
  ): Request[GetUserResponse, AWSError] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(): Request[GetUserSettingsResponse, AWSError] = js.native
  def getUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ GetUserSettingsResponse, Unit]): Request[GetUserSettingsResponse, AWSError] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(params: GetUserSettingsRequest): Request[GetUserSettingsResponse, AWSError] = js.native
  def getUserSettings(
    params: GetUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetUserSettingsResponse, Unit]
  ): Request[GetUserSettingsResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(): Request[GetVoiceConnectorResponse, AWSError] = js.native
  def getVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorResponse, Unit]): Request[GetVoiceConnectorResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(params: GetVoiceConnectorRequest): Request[GetVoiceConnectorResponse, AWSError] = js.native
  def getVoiceConnector(
    params: GetVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorResponse, Unit]
  ): Request[GetVoiceConnectorResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector group, such as timestamps, name, and associated VoiceConnectorItems.
    */
  def getVoiceConnectorGroup(): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  def getVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorGroupResponse, Unit]): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector group, such as timestamps, name, and associated VoiceConnectorItems.
    */
  def getVoiceConnectorGroup(params: GetVoiceConnectorGroupRequest): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  def getVoiceConnectorGroup(
    params: GetVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorGroupResponse, Unit]
  ): Request[GetVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Retrieves the logging configuration details for the specified Amazon Chime Voice Connector. Shows whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def getVoiceConnectorLoggingConfiguration(): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorLoggingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the logging configuration details for the specified Amazon Chime Voice Connector. Shows whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def getVoiceConnectorLoggingConfiguration(params: GetVoiceConnectorLoggingConfigurationRequest): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorLoggingConfiguration(
    params: GetVoiceConnectorLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  def getVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorOriginationResponse, Unit]): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  def getVoiceConnectorOrigination(
    params: GetVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorOriginationResponse, Unit]
  ): Request[GetVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * 
    */
  def getVoiceConnectorProxy(): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  def getVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorProxyResponse, Unit]): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * 
    */
  def getVoiceConnectorProxy(params: GetVoiceConnectorProxyRequest): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  def getVoiceConnectorProxy(
    params: GetVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorProxyResponse, Unit]
  ): Request[GetVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * Retrieves the streaming configuration details for the specified Amazon Chime Voice Connector. Shows whether media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon Kinesis data.
    */
  def getVoiceConnectorStreamingConfiguration(): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorStreamingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves the streaming configuration details for the specified Amazon Chime Voice Connector. Shows whether media streaming is enabled for sending to Amazon Kinesis. It also shows the retention period, in hours, for the Amazon Kinesis data.
    */
  def getVoiceConnectorStreamingConfiguration(params: GetVoiceConnectorStreamingConfigurationRequest): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def getVoiceConnectorStreamingConfiguration(
    params: GetVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[GetVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  def getVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationResponse, Unit]): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  def getVoiceConnectorTermination(
    params: GetVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationResponse, Unit]
  ): Request[GetVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationHealthResponse, Unit]
  ): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    params: GetVoiceConnectorTerminationHealthRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetVoiceConnectorTerminationHealthResponse, Unit]
  ): Request[GetVoiceConnectorTerminationHealthResponse, AWSError] = js.native
  /**
    * Sends email to a maximum of 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(): Request[InviteUsersResponse, AWSError] = js.native
  def inviteUsers(callback: js.Function2[/* err */ AWSError, /* data */ InviteUsersResponse, Unit]): Request[InviteUsersResponse, AWSError] = js.native
  /**
    * Sends email to a maximum of 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(params: InviteUsersRequest): Request[InviteUsersResponse, AWSError] = js.native
  def inviteUsers(
    params: InviteUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ InviteUsersResponse, Unit]
  ): Request[InviteUsersResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(): Request[ListAccountsResponse, AWSError] = js.native
  def listAccounts(callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]): Request[ListAccountsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(params: ListAccountsRequest): Request[ListAccountsResponse, AWSError] = js.native
  def listAccounts(
    params: ListAccountsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAccountsResponse, Unit]
  ): Request[ListAccountsResponse, AWSError] = js.native
  /**
    * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def listAttendees(): Request[ListAttendeesResponse, AWSError] = js.native
  def listAttendees(callback: js.Function2[/* err */ AWSError, /* data */ ListAttendeesResponse, Unit]): Request[ListAttendeesResponse, AWSError] = js.native
  /**
    * Lists the attendees for the specified Amazon Chime SDK meeting. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def listAttendees(params: ListAttendeesRequest): Request[ListAttendeesResponse, AWSError] = js.native
  def listAttendees(
    params: ListAttendeesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAttendeesResponse, Unit]
  ): Request[ListAttendeesResponse, AWSError] = js.native
  /**
    * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
    */
  def listBots(): Request[ListBotsResponse, AWSError] = js.native
  def listBots(callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, Unit]): Request[ListBotsResponse, AWSError] = js.native
  /**
    * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
    */
  def listBots(params: ListBotsRequest): Request[ListBotsResponse, AWSError] = js.native
  def listBots(
    params: ListBotsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListBotsResponse, Unit]
  ): Request[ListBotsResponse, AWSError] = js.native
  /**
    * Lists up to 100 active Amazon Chime SDK meetings. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def listMeetings(): Request[ListMeetingsResponse, AWSError] = js.native
  def listMeetings(callback: js.Function2[/* err */ AWSError, /* data */ ListMeetingsResponse, Unit]): Request[ListMeetingsResponse, AWSError] = js.native
  /**
    * Lists up to 100 active Amazon Chime SDK meetings. For more information about the Amazon Chime SDK, see Using the Amazon Chime SDK in the Amazon Chime Developer Guide.
    */
  def listMeetings(params: ListMeetingsRequest): Request[ListMeetingsResponse, AWSError] = js.native
  def listMeetings(
    params: ListMeetingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListMeetingsResponse, Unit]
  ): Request[ListMeetingsResponse, AWSError] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  def listPhoneNumberOrders(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumberOrdersResponse, Unit]): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  def listPhoneNumberOrders(
    params: ListPhoneNumberOrdersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumberOrdersResponse, Unit]
  ): Request[ListPhoneNumberOrdersResponse, AWSError] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, Amazon Chime Voice Connector, or Amazon Chime Voice Connector group.
    */
  def listPhoneNumbers(): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, Unit]): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, Amazon Chime Voice Connector, or Amazon Chime Voice Connector group.
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): Request[ListPhoneNumbersResponse, AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPhoneNumbersResponse, Unit]
  ): Request[ListPhoneNumbersResponse, AWSError] = js.native
  /**
    * 
    */
  def listProxySessions(): Request[ListProxySessionsResponse, AWSError] = js.native
  def listProxySessions(callback: js.Function2[/* err */ AWSError, /* data */ ListProxySessionsResponse, Unit]): Request[ListProxySessionsResponse, AWSError] = js.native
  /**
    * 
    */
  def listProxySessions(params: ListProxySessionsRequest): Request[ListProxySessionsResponse, AWSError] = js.native
  def listProxySessions(
    params: ListProxySessionsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListProxySessionsResponse, Unit]
  ): Request[ListProxySessionsResponse, AWSError] = js.native
  /**
    * Lists the membership details for the specified room in an Amazon Chime Enterprise account, such as the members' IDs, email addresses, and names.
    */
  def listRoomMemberships(): Request[ListRoomMembershipsResponse, AWSError] = js.native
  def listRoomMemberships(callback: js.Function2[/* err */ AWSError, /* data */ ListRoomMembershipsResponse, Unit]): Request[ListRoomMembershipsResponse, AWSError] = js.native
  /**
    * Lists the membership details for the specified room in an Amazon Chime Enterprise account, such as the members' IDs, email addresses, and names.
    */
  def listRoomMemberships(params: ListRoomMembershipsRequest): Request[ListRoomMembershipsResponse, AWSError] = js.native
  def listRoomMemberships(
    params: ListRoomMembershipsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoomMembershipsResponse, Unit]
  ): Request[ListRoomMembershipsResponse, AWSError] = js.native
  /**
    * Lists the room details for the specified Amazon Chime Enterprise account. Optionally, filter the results by a member ID (user ID or bot ID) to see a list of rooms that the member belongs to.
    */
  def listRooms(): Request[ListRoomsResponse, AWSError] = js.native
  def listRooms(callback: js.Function2[/* err */ AWSError, /* data */ ListRoomsResponse, Unit]): Request[ListRoomsResponse, AWSError] = js.native
  /**
    * Lists the room details for the specified Amazon Chime Enterprise account. Optionally, filter the results by a member ID (user ID or bot ID) to see a list of rooms that the member belongs to.
    */
  def listRooms(params: ListRoomsRequest): Request[ListRoomsResponse, AWSError] = js.native
  def listRooms(
    params: ListRoomsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListRoomsResponse, Unit]
  ): Request[ListRoomsResponse, AWSError] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(params: ListUsersRequest): Request[ListUsersResponse, AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListUsersResponse, Unit]
  ): Request[ListUsersResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime Voice Connector groups for the administrator's AWS account.
    */
  def listVoiceConnectorGroups(): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  def listVoiceConnectorGroups(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorGroupsResponse, Unit]): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime Voice Connector groups for the administrator's AWS account.
    */
  def listVoiceConnectorGroups(params: ListVoiceConnectorGroupsRequest): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  def listVoiceConnectorGroups(
    params: ListVoiceConnectorGroupsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorGroupsResponse, Unit]
  ): Request[ListVoiceConnectorGroupsResponse, AWSError] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  def listVoiceConnectorTerminationCredentials(
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      Unit
    ]
  ): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  def listVoiceConnectorTerminationCredentials(
    params: ListVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[
      /* err */ AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      Unit
    ]
  ): Request[ListVoiceConnectorTerminationCredentialsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  def listVoiceConnectors(callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorsResponse, Unit]): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(params: ListVoiceConnectorsRequest): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  def listVoiceConnectors(
    params: ListVoiceConnectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListVoiceConnectorsResponse, Unit]
  ): Request[ListVoiceConnectorsResponse, AWSError] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(): Request[LogoutUserResponse, AWSError] = js.native
  def logoutUser(callback: js.Function2[/* err */ AWSError, /* data */ LogoutUserResponse, Unit]): Request[LogoutUserResponse, AWSError] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(params: LogoutUserRequest): Request[LogoutUserResponse, AWSError] = js.native
  def logoutUser(
    params: LogoutUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ LogoutUserResponse, Unit]
  ): Request[LogoutUserResponse, AWSError] = js.native
  /**
    * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.
    */
  def putEventsConfiguration(): Request[PutEventsConfigurationResponse, AWSError] = js.native
  def putEventsConfiguration(callback: js.Function2[/* err */ AWSError, /* data */ PutEventsConfigurationResponse, Unit]): Request[PutEventsConfigurationResponse, AWSError] = js.native
  /**
    * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.
    */
  def putEventsConfiguration(params: PutEventsConfigurationRequest): Request[PutEventsConfigurationResponse, AWSError] = js.native
  def putEventsConfiguration(
    params: PutEventsConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutEventsConfigurationResponse, Unit]
  ): Request[PutEventsConfigurationResponse, AWSError] = js.native
  /**
    * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def putVoiceConnectorLoggingConfiguration(): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorLoggingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Adds a logging configuration for the specified Amazon Chime Voice Connector. The logging configuration specifies whether SIP message logs are enabled for sending to Amazon CloudWatch Logs.
    */
  def putVoiceConnectorLoggingConfiguration(params: PutVoiceConnectorLoggingConfigurationRequest): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorLoggingConfiguration(
    params: PutVoiceConnectorLoggingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorLoggingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorLoggingConfigurationResponse, AWSError] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  def putVoiceConnectorOrigination(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorOriginationResponse, Unit]): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  def putVoiceConnectorOrigination(
    params: PutVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorOriginationResponse, Unit]
  ): Request[PutVoiceConnectorOriginationResponse, AWSError] = js.native
  /**
    * 
    */
  def putVoiceConnectorProxy(): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  def putVoiceConnectorProxy(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorProxyResponse, Unit]): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * 
    */
  def putVoiceConnectorProxy(params: PutVoiceConnectorProxyRequest): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  def putVoiceConnectorProxy(
    params: PutVoiceConnectorProxyRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorProxyResponse, Unit]
  ): Request[PutVoiceConnectorProxyResponse, AWSError] = js.native
  /**
    * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis. It also sets the retention period, in hours, for the Amazon Kinesis data.
    */
  def putVoiceConnectorStreamingConfiguration(): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorStreamingConfiguration(
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Adds a streaming configuration for the specified Amazon Chime Voice Connector. The streaming configuration specifies whether media streaming is enabled for sending to Amazon Kinesis. It also sets the retention period, in hours, for the Amazon Kinesis data.
    */
  def putVoiceConnectorStreamingConfiguration(params: PutVoiceConnectorStreamingConfigurationRequest): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  def putVoiceConnectorStreamingConfiguration(
    params: PutVoiceConnectorStreamingConfigurationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorStreamingConfigurationResponse, Unit]
  ): Request[PutVoiceConnectorStreamingConfigurationResponse, AWSError] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  def putVoiceConnectorTermination(callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorTerminationResponse, Unit]): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  def putVoiceConnectorTermination(
    params: PutVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ PutVoiceConnectorTerminationResponse, Unit]
  ): Request[PutVoiceConnectorTerminationResponse, AWSError] = js.native
  /**
    * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTerminationCredentials(): Request[js.Object, AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): Request[js.Object, AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(
    params: PutVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Regenerates the security token for a bot.
    */
  def regenerateSecurityToken(): Request[RegenerateSecurityTokenResponse, AWSError] = js.native
  def regenerateSecurityToken(callback: js.Function2[/* err */ AWSError, /* data */ RegenerateSecurityTokenResponse, Unit]): Request[RegenerateSecurityTokenResponse, AWSError] = js.native
  /**
    * Regenerates the security token for a bot.
    */
  def regenerateSecurityToken(params: RegenerateSecurityTokenRequest): Request[RegenerateSecurityTokenResponse, AWSError] = js.native
  def regenerateSecurityToken(
    params: RegenerateSecurityTokenRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RegenerateSecurityTokenResponse, Unit]
  ): Request[RegenerateSecurityTokenResponse, AWSError] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(): Request[ResetPersonalPINResponse, AWSError] = js.native
  def resetPersonalPIN(callback: js.Function2[/* err */ AWSError, /* data */ ResetPersonalPINResponse, Unit]): Request[ResetPersonalPINResponse, AWSError] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(params: ResetPersonalPINRequest): Request[ResetPersonalPINResponse, AWSError] = js.native
  def resetPersonalPIN(
    params: ResetPersonalPINRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ResetPersonalPINResponse, Unit]
  ): Request[ResetPersonalPINResponse, AWSError] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(): Request[RestorePhoneNumberResponse, AWSError] = js.native
  def restorePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ RestorePhoneNumberResponse, Unit]): Request[RestorePhoneNumberResponse, AWSError] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(params: RestorePhoneNumberRequest): Request[RestorePhoneNumberResponse, AWSError] = js.native
  def restorePhoneNumber(
    params: RestorePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ RestorePhoneNumberResponse, Unit]
  ): Request[RestorePhoneNumberResponse, AWSError] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, Unit]): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  def searchAvailablePhoneNumbers(
    params: SearchAvailablePhoneNumbersRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ SearchAvailablePhoneNumbersResponse, Unit]
  ): Request[SearchAvailablePhoneNumbersResponse, AWSError] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(): Request[UpdateAccountResponse, AWSError] = js.native
  def updateAccount(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountResponse, Unit]): Request[UpdateAccountResponse, AWSError] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(params: UpdateAccountRequest): Request[UpdateAccountResponse, AWSError] = js.native
  def updateAccount(
    params: UpdateAccountRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountResponse, Unit]
  ): Request[UpdateAccountResponse, AWSError] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(params: UpdateAccountSettingsRequest): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateAccountSettingsResponse, Unit]
  ): Request[UpdateAccountSettingsResponse, AWSError] = js.native
  /**
    * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime Enterprise account.
    */
  def updateBot(): Request[UpdateBotResponse, AWSError] = js.native
  def updateBot(callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotResponse, Unit]): Request[UpdateBotResponse, AWSError] = js.native
  /**
    * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime Enterprise account.
    */
  def updateBot(params: UpdateBotRequest): Request[UpdateBotResponse, AWSError] = js.native
  def updateBot(
    params: UpdateBotRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateBotResponse, Unit]
  ): Request[UpdateBotResponse, AWSError] = js.native
  /**
    * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def updateGlobalSettings(): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def updateGlobalSettings(params: UpdateGlobalSettingsRequest): Request[js.Object, AWSError] = js.native
  def updateGlobalSettings(
    params: UpdateGlobalSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can update one phone number detail at a time. For example, you can update either the product type or the calling name in one action. For toll-free numbers, you must use the Amazon Chime Voice Connector product type. Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def updatePhoneNumber(): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, Unit]): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates phone number details, such as product type or calling name, for the specified phone number ID. You can update one phone number detail at a time. For example, you can update either the product type or the calling name in one action. For toll-free numbers, you must use the Amazon Chime Voice Connector product type. Updates to outbound calling names can take up to 72 hours to complete. Pending updates to outbound calling names must be complete before you can request another update.
    */
  def updatePhoneNumber(params: UpdatePhoneNumberRequest): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  def updatePhoneNumber(
    params: UpdatePhoneNumberRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdatePhoneNumberResponse, Unit]
  ): Request[UpdatePhoneNumberResponse, AWSError] = js.native
  /**
    * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name. You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72 hours to update.
    */
  def updatePhoneNumberSettings(): Request[js.Object, AWSError] = js.native
  def updatePhoneNumberSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the phone number settings for the administrator's AWS account, such as the default outbound calling name. You can update the default outbound calling name once every seven days. Outbound calling names can take up to 72 hours to update.
    */
  def updatePhoneNumberSettings(params: UpdatePhoneNumberSettingsRequest): Request[js.Object, AWSError] = js.native
  def updatePhoneNumberSettings(
    params: UpdatePhoneNumberSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * 
    */
  def updateProxySession(): Request[UpdateProxySessionResponse, AWSError] = js.native
  def updateProxySession(callback: js.Function2[/* err */ AWSError, /* data */ UpdateProxySessionResponse, Unit]): Request[UpdateProxySessionResponse, AWSError] = js.native
  /**
    * 
    */
  def updateProxySession(params: UpdateProxySessionRequest): Request[UpdateProxySessionResponse, AWSError] = js.native
  def updateProxySession(
    params: UpdateProxySessionRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateProxySessionResponse, Unit]
  ): Request[UpdateProxySessionResponse, AWSError] = js.native
  /**
    * Updates room details, such as the room name, for a room in an Amazon Chime Enterprise account.
    */
  def updateRoom(): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]): Request[UpdateRoomResponse, AWSError] = js.native
  /**
    * Updates room details, such as the room name, for a room in an Amazon Chime Enterprise account.
    */
  def updateRoom(params: UpdateRoomRequest): Request[UpdateRoomResponse, AWSError] = js.native
  def updateRoom(
    params: UpdateRoomRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomResponse, Unit]
  ): Request[UpdateRoomResponse, AWSError] = js.native
  /**
    * Updates room membership details, such as the member role, for a room in an Amazon Chime Enterprise account. The member role designates whether the member is a chat room administrator or a general chat room member. The member role can be updated only for user IDs.
    */
  def updateRoomMembership(): Request[UpdateRoomMembershipResponse, AWSError] = js.native
  def updateRoomMembership(callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomMembershipResponse, Unit]): Request[UpdateRoomMembershipResponse, AWSError] = js.native
  /**
    * Updates room membership details, such as the member role, for a room in an Amazon Chime Enterprise account. The member role designates whether the member is a chat room administrator or a general chat room member. The member role can be updated only for user IDs.
    */
  def updateRoomMembership(params: UpdateRoomMembershipRequest): Request[UpdateRoomMembershipResponse, AWSError] = js.native
  def updateRoomMembership(
    params: UpdateRoomMembershipRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateRoomMembershipResponse, Unit]
  ): Request[UpdateRoomMembershipResponse, AWSError] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(params: UpdateUserRequest): Request[UpdateUserResponse, AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateUserResponse, Unit]
  ): Request[UpdateUserResponse, AWSError] = js.native
  /**
    * Updates the settings for the specified user, such as phone number settings.
    */
  def updateUserSettings(): Request[js.Object, AWSError] = js.native
  def updateUserSettings(callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]): Request[js.Object, AWSError] = js.native
  /**
    * Updates the settings for the specified user, such as phone number settings.
    */
  def updateUserSettings(params: UpdateUserSettingsRequest): Request[js.Object, AWSError] = js.native
  def updateUserSettings(
    params: UpdateUserSettingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ js.Object, Unit]
  ): Request[js.Object, AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  def updateVoiceConnector(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorResponse, Unit]): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(params: UpdateVoiceConnectorRequest): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  def updateVoiceConnector(
    params: UpdateVoiceConnectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorResponse, Unit]
  ): Request[UpdateVoiceConnectorResponse, AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector group, such as the name and Amazon Chime Voice Connector priority ranking.
    */
  def updateVoiceConnectorGroup(): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  def updateVoiceConnectorGroup(callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorGroupResponse, Unit]): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector group, such as the name and Amazon Chime Voice Connector priority ranking.
    */
  def updateVoiceConnectorGroup(params: UpdateVoiceConnectorGroupRequest): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
  def updateVoiceConnectorGroup(
    params: UpdateVoiceConnectorGroupRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UpdateVoiceConnectorGroupResponse, Unit]
  ): Request[UpdateVoiceConnectorGroupResponse, AWSError] = js.native
}

