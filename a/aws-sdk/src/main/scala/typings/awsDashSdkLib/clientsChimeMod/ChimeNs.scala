package typings
package awsDashSdkLib.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/chime", "Chime")
@js.native
object ChimeNs extends js.Object {
  trait Account extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: String
    /**
      * The Amazon Chime account type. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide.
      */
    var AccountType: js.UndefOr[AccountType] = js.undefined
    /**
      * The AWS account ID.
      */
    var AwsAccountId: String
    /**
      * The Amazon Chime account creation timestamp, in ISO 8601 format.
      */
    var CreatedTimestamp: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The default license for the Amazon Chime account.
      */
    var DefaultLicense: js.UndefOr[License] = js.undefined
    /**
      * The Amazon Chime account name.
      */
    var Name: String
    /**
      * Supported licenses for the Amazon Chime account.
      */
    var SupportedLicenses: js.UndefOr[LicenseList] = js.undefined
  }
  
  trait AccountSettings extends js.Object {
    /**
      * Setting that stops or starts remote control of shared screens during meetings.
      */
    var DisableRemoteControl: js.UndefOr[Boolean] = js.undefined
    /**
      * Setting that allows meeting participants to choose the Call me at a phone number option. For more information, see Join a Meeting without the Amazon Chime App.
      */
    var EnableDialOut: js.UndefOr[Boolean] = js.undefined
  }
  
  trait BatchSuspendUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs to suspend.
      */
    var UserIdList: UserIdList
  }
  
  trait BatchSuspendUserResponse extends js.Object {
    /**
      * If the BatchSuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait BatchUnsuspendUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs to unsuspend.
      */
    var UserIdList: UserIdList
  }
  
  trait BatchUnsuspendUserResponse extends js.Object {
    /**
      * If the BatchUnsuspendUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait BatchUpdateUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The request containing the user IDs and details to update.
      */
    var UpdateUserRequestItems: UpdateUserRequestItemList
  }
  
  trait BatchUpdateUserResponse extends js.Object {
    /**
      * If the BatchUpdateUser action fails for one or more of the user IDs in the request, a list of the user IDs is returned, along with error codes and error messages.
      */
    var UserErrors: js.UndefOr[UserErrorList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait CreateAccountRequest extends js.Object {
    /**
      * The name of the Amazon Chime account.
      */
    var Name: AccountName
  }
  
  trait CreateAccountResponse extends js.Object {
    /**
      * The Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait DeleteAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait DeleteAccountResponse extends js.Object
  
  trait GetAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait GetAccountResponse extends js.Object {
    /**
      * The Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait GetAccountSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
  }
  
  trait GetAccountSettingsResponse extends js.Object {
    /**
      * The Amazon Chime account settings.
      */
    var AccountSettings: js.UndefOr[AccountSettings] = js.undefined
  }
  
  trait GetUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait GetUserResponse extends js.Object {
    /**
      * The user details.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait Invite extends js.Object {
    /**
      * The email address to which the invite is sent.
      */
    var EmailAddress: js.UndefOr[EmailAddress] = js.undefined
    /**
      * The status of the invite email.
      */
    var EmailStatus: js.UndefOr[EmailStatus] = js.undefined
    /**
      * The invite ID.
      */
    var InviteId: js.UndefOr[String] = js.undefined
    /**
      * The status of the invite.
      */
    var Status: js.UndefOr[InviteStatus] = js.undefined
  }
  
  trait InviteUsersRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user email addresses to which to send the invite.
      */
    var UserEmailList: UserEmailList
  }
  
  trait InviteUsersResponse extends js.Object {
    /**
      * The invite details.
      */
    var Invites: js.UndefOr[InviteList] = js.undefined
  }
  
  trait ListAccountsRequest extends js.Object {
    /**
      * The maximum number of results to return in a single call. Defaults to 100.
      */
    var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
    /**
      * Amazon Chime account name prefix with which to filter results.
      */
    var Name: js.UndefOr[AccountName] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * User email address with which to filter results.
      */
    var UserEmail: js.UndefOr[EmailAddress] = js.undefined
  }
  
  trait ListAccountsResponse extends js.Object {
    /**
      * List of Amazon Chime accounts and account details.
      */
    var Accounts: js.UndefOr[AccountList] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The maximum number of results to return in a single call. Defaults to 100.
      */
    var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * Optional. The user email address used to filter results. Maximum 1.
      */
    var UserEmail: js.UndefOr[EmailAddress] = js.undefined
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * The token to use to retrieve the next page of results.
      */
    var NextToken: js.UndefOr[String] = js.undefined
    /**
      * List of users and user details.
      */
    var Users: js.UndefOr[UserList] = js.undefined
  }
  
  trait LogoutUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait LogoutUserResponse extends js.Object
  
  trait ResetPersonalPINRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait ResetPersonalPINResponse extends js.Object {
    /**
      * The user details and new personal meeting PIN.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
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
      * Suspends up to 50 users from a Team or EnterpriseLWA Amazon Chime account. For more information about different account types, see Managing Your Amazon Chime Accounts in the Amazon Chime Administration Guide. Users suspended from a Team account are dissociated from the account, but they can continue to use Amazon Chime as free users. To remove the suspension from suspended Team account users, invite them to the Team account again. You can use the InviteUsers action to do so. Users suspended from an EnterpriseLWA account are immediately signed out of Amazon Chime and are no longer able to sign in. To remove the suspension from suspended EnterpriseLWA account users, use the BatchUnsuspendUser action.  To sign out users without suspending them, use the LogoutUser action.
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
  }
  
  trait UpdateAccountRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The new name for the specified Amazon Chime account.
      */
    var Name: js.UndefOr[AccountName] = js.undefined
  }
  
  trait UpdateAccountResponse extends js.Object {
    /**
      * The updated Amazon Chime account details.
      */
    var Account: js.UndefOr[Account] = js.undefined
  }
  
  trait UpdateAccountSettingsRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The Amazon Chime account settings to update.
      */
    var AccountSettings: AccountSettings
  }
  
  trait UpdateAccountSettingsResponse extends js.Object
  
  trait UpdateUserRequest extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: NonEmptyString
    /**
      * The user license type to update. This must be a supported license type for the Amazon Chime account that the user belongs to.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait UpdateUserRequestItem extends js.Object {
    /**
      * The user license type.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user ID.
      */
    var UserId: NonEmptyString
  }
  
  trait UpdateUserResponse extends js.Object {
    /**
      * The updated user details.
      */
    var User: js.UndefOr[User] = js.undefined
  }
  
  trait User extends js.Object {
    /**
      * The Amazon Chime account ID.
      */
    var AccountId: js.UndefOr[String] = js.undefined
    /**
      * The display name of the user.
      */
    var DisplayName: js.UndefOr[SensitiveString] = js.undefined
    /**
      * Date and time when the user is invited to the Amazon Chime account, in ISO 8601 format.
      */
    var InvitedOn: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The license type for the user.
      */
    var LicenseType: js.UndefOr[License] = js.undefined
    /**
      * The user's personal meeting PIN.
      */
    var PersonalPIN: js.UndefOr[String] = js.undefined
    /**
      * The primary email address of the user.
      */
    var PrimaryEmail: js.UndefOr[EmailAddress] = js.undefined
    /**
      * Date and time when the user is registered, in ISO 8601 format.
      */
    var RegisteredOn: js.UndefOr[Iso8601Timestamp] = js.undefined
    /**
      * The user ID.
      */
    var UserId: String
    /**
      * The user invite status.
      */
    var UserInvitationStatus: js.UndefOr[InviteStatus] = js.undefined
    /**
      * The user registration status.
      */
    var UserRegistrationStatus: js.UndefOr[RegistrationStatus] = js.undefined
  }
  
  trait UserError extends js.Object {
    /**
      * The error code.
      */
    var ErrorCode: js.UndefOr[ErrorCode] = js.undefined
    /**
      * The error message.
      */
    var ErrorMessage: js.UndefOr[String] = js.undefined
    /**
      * The user ID for which the action failed.
      */
    var UserId: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  val TypesNs: this.type = js.native
  type AccountList = js.Array[Account]
  type AccountName = java.lang.String
  type AccountType = awsDashSdkLib.awsDashSdkLibStrings.Team | awsDashSdkLib.awsDashSdkLibStrings.EnterpriseDirectory | awsDashSdkLib.awsDashSdkLibStrings.EnterpriseLWA | awsDashSdkLib.awsDashSdkLibStrings.EnterpriseOIDC | java.lang.String
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type EmailAddress = java.lang.String
  type EmailStatus = awsDashSdkLib.awsDashSdkLibStrings.NotSent | awsDashSdkLib.awsDashSdkLibStrings.Sent | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type ErrorCode = awsDashSdkLib.awsDashSdkLibStrings.Unauthorized | awsDashSdkLib.awsDashSdkLibStrings.Forbidden | awsDashSdkLib.awsDashSdkLibStrings.NotFound | awsDashSdkLib.awsDashSdkLibStrings.BadRequest | awsDashSdkLib.awsDashSdkLibStrings.Conflict | awsDashSdkLib.awsDashSdkLibStrings.ServiceFailure | awsDashSdkLib.awsDashSdkLibStrings.ServiceUnavailable | awsDashSdkLib.awsDashSdkLibStrings.Unprocessable | awsDashSdkLib.awsDashSdkLibStrings.Throttled | awsDashSdkLib.awsDashSdkLibStrings.PreconditionFailed | java.lang.String
  type InviteList = js.Array[Invite]
  type InviteStatus = awsDashSdkLib.awsDashSdkLibStrings.Pending | awsDashSdkLib.awsDashSdkLibStrings.Accepted | awsDashSdkLib.awsDashSdkLibStrings.Failed | java.lang.String
  type Iso8601Timestamp = stdLib.Date
  type License = awsDashSdkLib.awsDashSdkLibStrings.Basic | awsDashSdkLib.awsDashSdkLibStrings.Plus | awsDashSdkLib.awsDashSdkLibStrings.Pro | awsDashSdkLib.awsDashSdkLibStrings.ProTrial | java.lang.String
  type LicenseList = js.Array[License]
  type NonEmptyString = java.lang.String
  type ProfileServiceMaxResults = scala.Double
  type RegistrationStatus = awsDashSdkLib.awsDashSdkLibStrings.Unregistered | awsDashSdkLib.awsDashSdkLibStrings.Registered | awsDashSdkLib.awsDashSdkLibStrings.Suspended | java.lang.String
  type SensitiveString = java.lang.String
  type String = java.lang.String
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2018-05-01` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

