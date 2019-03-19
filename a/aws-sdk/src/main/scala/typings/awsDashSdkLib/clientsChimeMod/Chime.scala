package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Chime
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Chime: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsChimeMod.ChimeNs.ClientConfiguration = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumberWithUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime user.
    */
  def associatePhoneNumberWithUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumberWithUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumberWithUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Associates a phone number with the specified Amazon Chime Voice Connector.
    */
  def associatePhoneNumbersWithVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associatePhoneNumbersWithVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.AssociatePhoneNumbersWithVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeletePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves phone numbers into the Deletion queue. Phone numbers must be disassociated from any users or Amazon Chime Voice Connectors before they can be deleted. Phone numbers remain in the Deletion queue for 7 days before they are deleted permanently.
    */
  def batchDeletePhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchDeletePhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchDeletePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchSuspendUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and can no longer sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
    */
  def batchSuspendUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchSuspendUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUnsuspendUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
    */
  def batchUnsuspendUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUnsuspendUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUnsuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
    */
  def batchUpdatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdatePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates phone number product types. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
    */
  def batchUpdatePhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdatePhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
    */
  def batchUpdateUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def batchUpdateUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
    */
  def createAccount(params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createAccount(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
    */
  def createPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPhoneNumberOrder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an order for phone numbers to be provisioned. Choose from Amazon Chime Business Calling and Amazon Chime Voice Connector product types.
    */
  def createPhoneNumberOrder(params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createPhoneNumberOrder(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreatePhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an Amazon Chime Voice Connector under the administrator's AWS account. Enabling CreateVoiceConnectorRequest$RequireEncryption configures your Amazon Chime Voice Connector to use TLS transport for SIP signaling and Secure RTP (SRTP) for media. Inbound calls use TLS transport, and unencrypted outbound calls are blocked.
    */
  def createVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.CreateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
    */
  def deleteAccount(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteAccount(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deletePhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeletePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deletePhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeletePhoneNumberRequest,
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
  def deleteVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorRequest,
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
  def deleteVoiceConnectorOrigination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorOrigination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorOriginationRequest,
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
  def deleteVoiceConnectorTermination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTermination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorTerminationRequest,
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
  def deleteVoiceConnectorTerminationCredentials(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteVoiceConnectorTerminationCredentials(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumberFromUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the primary provisioned phone number from the specified Amazon Chime user.
    */
  def disassociatePhoneNumberFromUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumberFromUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumberFromUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disassociates the specified phone number from the specified Amazon Chime Voice Connector.
    */
  def disassociatePhoneNumbersFromVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def disassociatePhoneNumbersFromVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DisassociatePhoneNumbersFromVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
    */
  def getAccount(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccount(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def getAccountSettings(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAccountSettings(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves global settings for the administrator's AWS account, such as Amazon Chime Business Calling and Amazon Chime Voice Connector settings.
    */
  def getGlobalSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetGlobalSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGlobalSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetGlobalSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetGlobalSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified phone number ID, such as associations, capabilities, and product type.
    */
  def getPhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPhoneNumberOrder(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified phone number order, such as order creation timestamp, phone numbers in E.164 format, product type, and order status.
    */
  def getPhoneNumberOrder(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getPhoneNumberOrder(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetPhoneNumberOrderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN. To retrieve user details with an email address instead of a user ID, use the ListUsers action, and then filter by email address.
    */
  def getUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves settings for the specified user ID, such as any associated phone number settings.
    */
  def getUserSettings(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserSettings(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves details for the specified Amazon Chime Voice Connector, such as timestamps, name, outbound host, and encryption requirements.
    */
  def getVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorOrigination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves origination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorOrigination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorOrigination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorTermination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves termination setting details for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTermination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorTermination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorTerminationHealth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Retrieves information about the last time a SIP OPTIONS ping was received from your SIP infrastructure for the specified Amazon Chime Voice Connector.
    */
  def getVoiceConnectorTerminationHealth(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getVoiceConnectorTerminationHealth(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetVoiceConnectorTerminationHealthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def inviteUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
    */
  def inviteUsers(params: awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def inviteUsers(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccounts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
    */
  def listAccounts(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listAccounts(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListAccountsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPhoneNumberOrders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the phone number orders for the administrator's Amazon Chime account.
    */
  def listPhoneNumberOrders(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPhoneNumberOrders(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumberOrdersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
    */
  def listPhoneNumbers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPhoneNumbers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the phone numbers for the specified Amazon Chime account, Amazon Chime user, or Amazon Chime Voice Connector.
    */
  def listPhoneNumbers(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listPhoneNumbers(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListPhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users that belong to the specified Amazon Chime account. You can specify an email address to list only the user that the email address belongs to.
    */
  def listUsers(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectorTerminationCredentials(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the SIP credentials for the specified Amazon Chime Voice Connector.
    */
  def listVoiceConnectorTerminationCredentials(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectorTerminationCredentials(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorTerminationCredentialsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the Amazon Chime Voice Connectors for the administrator's AWS account.
    */
  def listVoiceConnectors(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listVoiceConnectors(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListVoiceConnectorsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def logoutUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Logs out the specified user from all of the devices they are currently logged into.
    */
  def logoutUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def logoutUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putVoiceConnectorOrigination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds origination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorOrigination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putVoiceConnectorOrigination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorOriginationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putVoiceConnectorTermination(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds termination settings for the specified Amazon Chime Voice Connector.
    */
  def putVoiceConnectorTermination(params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def putVoiceConnectorTermination(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def putVoiceConnectorTerminationCredentials(params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationCredentialsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def putVoiceConnectorTerminationCredentials(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.PutVoiceConnectorTerminationCredentialsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetPersonalPIN(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
    */
  def resetPersonalPIN(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resetPersonalPIN(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restorePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Moves a phone number from the Deletion queue back into the phone number Inventory.
    */
  def restorePhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def restorePhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.RestorePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchAvailablePhoneNumbers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Searches phone numbers that can be ordered.
    */
  def searchAvailablePhoneNumbers(params: awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def searchAvailablePhoneNumbers(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.SearchAvailablePhoneNumbersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccount(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
    */
  def updateAccount(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccount(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccountSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
    */
  def updateAccountSettings(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAccountSettings(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def updateGlobalSettings(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateGlobalSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGlobalSettings(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateGlobalSettingsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates phone number details, such as product type, for the specified phone number ID.
    */
  def updatePhoneNumber(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePhoneNumber(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates phone number details, such as product type, for the specified phone number ID.
    */
  def updatePhoneNumber(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updatePhoneNumber(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdatePhoneNumberResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
    */
  def updateUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUser(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def updateUserSettings(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserSettings(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserSettingsRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVoiceConnector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates details for the specified Amazon Chime Voice Connector.
    */
  def updateVoiceConnector(params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateVoiceConnector(
    params: awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateVoiceConnectorResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

