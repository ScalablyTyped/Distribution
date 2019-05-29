package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chime
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Chime: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associatePhoneNumberWithUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePhoneNumberWithUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(params: AssociatePhoneNumberWithUserRequest): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associatePhoneNumberWithUser(
    params: AssociatePhoneNumberWithUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePhoneNumberWithUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociatePhoneNumberWithUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(params: AssociatePhoneNumbersWithVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    params: AssociatePhoneNumbersWithVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociatePhoneNumbersWithVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeletePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeletePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(params: BatchDeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchDeletePhoneNumber(
    params: BatchDeletePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchDeletePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchDeletePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissasociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchSuspendUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchSuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissasociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(params: BatchSuspendUserRequest): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchSuspendUser(
    params: BatchSuspendUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchSuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchSuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUnsuspendUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUnsuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(params: BatchUnsuspendUserRequest): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUnsuspendUser(
    params: BatchUnsuspendUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUnsuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUnsuspendUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def batchUpdatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdatePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def batchUpdatePhoneNumber(params: BatchUpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdatePhoneNumber(
    params: BatchUpdatePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(params: BatchUpdateUserRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateUser(
    params: BatchUpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(params: CreateAccountRequest): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createAccount(
    params: CreateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a bot for an Amazon Chime Enterprise account.
    */
  def createBot(): awsDashSdkLib.libRequestMod.Request[CreateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a bot for an Amazon Chime Enterprise account.
    */
  def createBot(params: CreateBotRequest): awsDashSdkLib.libRequestMod.Request[CreateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createBot(
    params: CreateBotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def createPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPhoneNumberOrder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def createPhoneNumberOrder(params: CreatePhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createPhoneNumberOrder(
    params: CreatePhoneNumberOrderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreatePhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreatePhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(params: CreateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createVoiceConnector(
    params: CreateVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(params: DeleteAccountRequest): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteAccount(
    params: DeleteAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the events configuration that allows a bot to receive outgoing events.
    */
  def deleteEventsConfiguration(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventsConfiguration(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the events configuration that allows a bot to receive outgoing events.
    */
  def deleteEventsConfiguration(params: DeleteEventsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteEventsConfiguration(
    params: DeleteEventsConfigurationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePhoneNumber(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves the specified phone number into the Deletion queue. A phone number must be disassociated from any users or Amazon Chime Voice Connectors before it can be deleted. Deleted phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def deletePhoneNumber(params: DeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePhoneNumber(
    params: DeletePhoneNumberRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice Connector must be unassigned from it before it can be deleted.
    */
  def deleteVoiceConnector(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnector(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Chime Voice Connector. Any phone numbers assigned to the Amazon Chime Voice Connector must be unassigned from it before it can be deleted.
    */
  def deleteVoiceConnector(params: DeleteVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnector(
    params: DeleteVoiceConnectorRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the origination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorOrigination(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the origination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorOrigination(params: DeleteVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorOrigination(
    params: DeleteVoiceConnectorOriginationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the termination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTermination(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the termination settings for the specified Amazon Chime Voice Connector.
    */
  def deleteVoiceConnectorTermination(params: DeleteVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTermination(
    params: DeleteVoiceConnectorTerminationRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified SIP credentials used by your equipment to authenticate during call termination.
    */
  def deleteVoiceConnectorTerminationCredentials(params: DeleteVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(
    params: DeleteVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociatePhoneNumberFromUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePhoneNumberFromUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(params: DisassociatePhoneNumberFromUserRequest): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def disassociatePhoneNumberFromUser(
    params: DisassociatePhoneNumberFromUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePhoneNumberFromUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DisassociatePhoneNumberFromUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(params: DisassociatePhoneNumbersFromVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    params: DisassociatePhoneNumbersFromVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(params: GetAccountRequest): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccount(
    params: GetAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(params: GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getAccountSettings(
    params: GetAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
    */
  def getBot(): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBot(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified bot, such as bot email address, bot type, status, and display name.
    */
  def getBot(params: GetBotRequest): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getBot(
    params: GetBotRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetBotResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint or Lambda function ARN. 
    */
  def getEventsConfiguration(): awsDashSdkLib.libRequestMod.Request[GetEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEventsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEventsConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets details for an events configuration that allows a bot to receive outgoing events, such as an HTTPS endpoint or Lambda function ARN. 
    */
  def getEventsConfiguration(params: GetEventsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[GetEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEventsConfiguration(
    params: GetEventsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEventsConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def getGlobalSettings(): awsDashSdkLib.libRequestMod.Request[GetGlobalSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGlobalSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGlobalSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGlobalSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(params: GetPhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPhoneNumber(
    params: GetPhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPhoneNumberOrder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(params: GetPhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getPhoneNumberOrder(
    params: GetPhoneNumberOrderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetPhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetPhoneNumberOrderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(params: GetUserRequest): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(params: GetUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserSettings(
    params: GetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(params: GetVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnector(
    params: GetVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorOrigination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(params: GetVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorOrigination(
    params: GetVoiceConnectorOriginationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorTermination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(params: GetVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorTermination(
    params: GetVoiceConnectorTerminationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorTerminationHealthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(params: GetVoiceConnectorTerminationHealthRequest): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getVoiceConnectorTerminationHealth(
    params: GetVoiceConnectorTerminationHealthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetVoiceConnectorTerminationHealthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetVoiceConnectorTerminationHealthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(params: InviteUsersRequest): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def inviteUsers(
    params: InviteUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InviteUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InviteUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(params: ListAccountsRequest): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAccounts(
    params: ListAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAccountsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
    */
  def listBots(): awsDashSdkLib.libRequestMod.Request[ListBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBots(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the bots associated with the administrator's Amazon Chime Enterprise account ID.
    */
  def listBots(params: ListBotsRequest): awsDashSdkLib.libRequestMod.Request[ListBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listBots(
    params: ListBotsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListBotsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListBotsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPhoneNumberOrders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPhoneNumberOrdersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(params: ListPhoneNumberOrdersRequest): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPhoneNumberOrders(
    params: ListPhoneNumberOrdersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPhoneNumberOrdersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumberOrdersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
    */
  def listPhoneNumbers(): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPhoneNumbers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
    */
  def listPhoneNumbers(params: ListPhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listPhoneNumbers(
    params: ListPhoneNumbersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListPhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListPhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(params: ListUsersRequest): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsers(
    params: ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[
    ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectorTerminationCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(params: ListVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
    ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectorTerminationCredentials(
    params: ListVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVoiceConnectorTerminationCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVoiceConnectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVoiceConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(params: ListVoiceConnectorsRequest): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listVoiceConnectors(
    params: ListVoiceConnectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListVoiceConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListVoiceConnectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def logoutUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LogoutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(params: LogoutUserRequest): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def logoutUser(
    params: LogoutUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ LogoutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[LogoutUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.
    */
  def putEventsConfiguration(): awsDashSdkLib.libRequestMod.Request[PutEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEventsConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventsConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an events configuration that allows a bot to receive outgoing events sent by Amazon Chime. Choose either an HTTPS endpoint or a Lambda function ARN. For more information, see Bot.
    */
  def putEventsConfiguration(params: PutEventsConfigurationRequest): awsDashSdkLib.libRequestMod.Request[PutEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putEventsConfiguration(
    params: PutEventsConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutEventsConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutEventsConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorOrigination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(params: PutVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorOrigination(
    params: PutVoiceConnectorOriginationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorOriginationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorTermination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(params: PutVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorTermination(
    params: PutVoiceConnectorTerminationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ PutVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[PutVoiceConnectorTerminationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds termination SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTerminationCredentials(params: PutVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(
    params: PutVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Regenerates the security token for a bot.
    */
  def regenerateSecurityToken(): awsDashSdkLib.libRequestMod.Request[RegenerateSecurityTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def regenerateSecurityToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegenerateSecurityTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegenerateSecurityTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Regenerates the security token for a bot.
    */
  def regenerateSecurityToken(params: RegenerateSecurityTokenRequest): awsDashSdkLib.libRequestMod.Request[RegenerateSecurityTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def regenerateSecurityToken(
    params: RegenerateSecurityTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RegenerateSecurityTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RegenerateSecurityTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetPersonalPIN(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetPersonalPINResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(params: ResetPersonalPINRequest): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resetPersonalPIN(
    params: ResetPersonalPINRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResetPersonalPINResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResetPersonalPINResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restorePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestorePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(params: RestorePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def restorePhoneNumber(
    params: RestorePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RestorePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RestorePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchAvailablePhoneNumbers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchAvailablePhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(params: SearchAvailablePhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def searchAvailablePhoneNumbers(
    params: SearchAvailablePhoneNumbersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SearchAvailablePhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SearchAvailablePhoneNumbersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(params: UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccount(
    params: UpdateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(params: UpdateAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAccountSettings(
    params: UpdateAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAccountSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime Enterprise account.
    */
  def updateBot(): awsDashSdkLib.libRequestMod.Request[UpdateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBot(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the status of the specified bot, such as starting or stopping the bot from running in your Amazon Chime Enterprise account.
    */
  def updateBot(params: UpdateBotRequest): awsDashSdkLib.libRequestMod.Request[UpdateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateBot(
    params: UpdateBotRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateBotResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateBotResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def updateGlobalSettings(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGlobalSettings(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def updateGlobalSettings(params: UpdateGlobalSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGlobalSettings(
    params: UpdateGlobalSettingsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates phone number details, such as product type, for the specified phone number ID. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def updatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates phone number details, such as product type, for the specified phone number ID. For toll-free numbers, you can use only the Amazon Chime Voice Connector product type.
    */
  def updatePhoneNumber(params: UpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updatePhoneNumber(
    params: UpdatePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdatePhoneNumberResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(params: UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUser(
    params: UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the specified user, such as phone number settings.
    */
  def updateUserSettings(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserSettings(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the settings for the specified user, such as phone number settings.
    */
  def updateUserSettings(params: UpdateUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserSettings(
    params: UpdateUserSettingsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(params: UpdateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateVoiceConnector(
    params: UpdateVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateVoiceConnectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

