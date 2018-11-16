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
     * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
     */
  def batchSuspendUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
     */
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
     * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
     */
  def batchSuspendUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchSuspendUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
     */
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
  /**
     * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
     */
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
  /**
     * Removes the suspension from up to 50 previously suspended users for the specified Amazon Chime EnterpriseLWA account. Only users on EnterpriseLWA accounts can be unsuspended using this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Previously suspended users who are unsuspended using this action are returned to Registered status. Users who are not previously suspended are ignored.
     */
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
     * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
     */
  def batchUpdateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.BatchUpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
     */
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
  /**
     * Updates user details within the UpdateUserRequestItem object for up to 20 users for the specified Amazon Chime account. Currently, only LicenseType updates are supported for this action.
     */
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
  /**
     * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
     */
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
  /**
     * Creates an Amazon Chime account under the administrator's AWS account. Only Team account types are currently supported for this action. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
     */
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
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
     */
  def deleteAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.DeleteAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
     */
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
  /**
     * Deletes the specified Amazon Chime account. You must suspend all users before deleting a Team account. You can use the BatchSuspendUser action to do so. For EnterpriseLWA and EnterpriseAD accounts, you must release the claimed domains for your Amazon Chime account before deletion. As soon as you release the domain, all users under that account are suspended. Deleted accounts appear in your Disabled accounts list for 90 days. To restore a deleted account from your Disabled accounts list, you must contact AWS Support. After 90 days, deleted accounts are permanently removed from your Disabled accounts list.
     */
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
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     */
  def getAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     */
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
  /**
     * Retrieves details for the specified Amazon Chime account, such as account type and supported licenses.
     */
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
  /**
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
     */
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
  /**
     * Retrieves account settings for the specified Amazon Chime account ID, such as remote control and dial out settings. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
     */
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
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN.
     */
  def getUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN.
     */
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
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN.
     */
  def getUser(params: awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Retrieves details for the specified user ID, such as primary email address, license type, and personal meeting PIN.
     */
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
     * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
     */
  def inviteUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.InviteUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
     */
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
  /**
     * Sends email invites to as many as 50 users, inviting them to the specified Amazon Chime Team account. Only Team account types are currently supported for this action. 
     */
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
  /**
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
     */
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
  /**
     * Lists the Amazon Chime accounts under the administrator's AWS account. You can filter accounts by account name prefix. To find out which Amazon Chime account a user belongs to, you can filter by the user's email address, which returns one account result.
     */
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
     * Lists the users that belong to the specified Amazon Chime account.
     */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the users that belong to the specified Amazon Chime account.
     */
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
     * Lists the users that belong to the specified Amazon Chime account.
     */
  def listUsers(params: awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Lists the users that belong to the specified Amazon Chime account.
     */
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
     * Logs out the specified user from all of the devices they are currently logged into.
     */
  def logoutUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.LogoutUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Logs out the specified user from all of the devices they are currently logged into.
     */
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
  /**
     * Logs out the specified user from all of the devices they are currently logged into.
     */
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
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
     */
  def resetPersonalPIN(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.ResetPersonalPINResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
     */
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
  /**
     * Resets the personal meeting PIN for the specified user on an Amazon Chime account. Returns the User object with the updated personal meeting PIN.
     */
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
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
     */
  def updateAccount(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateAccountResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
     */
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
  /**
     * Updates account details for the specified Amazon Chime account. Currently, only account name updates are supported for this action.
     */
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
  /**
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
     */
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
  /**
     * Updates the settings for the specified Amazon Chime account. You can update settings for remote control of shared screens, or for the dial-out option. For more information about these settings, see Use the Policies Page in the Amazon Chime Administration Guide.
     */
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
     * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
     */
  def updateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsChimeMod.ChimeNs.UpdateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
     */
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
  /**
     * Updates user details for a specified user ID. Currently, only LicenseType updates are supported for this action.
     */
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
}

