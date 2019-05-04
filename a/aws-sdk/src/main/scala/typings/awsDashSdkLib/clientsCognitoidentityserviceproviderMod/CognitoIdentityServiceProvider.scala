package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityServiceProvider
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CognitoIdentityServiceProvider: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(): awsDashSdkLib.libRequestMod.Request[AddCustomAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addCustomAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddCustomAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddCustomAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(params: AddCustomAttributesRequest): awsDashSdkLib.libRequestMod.Request[AddCustomAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addCustomAttributes(
    params: AddCustomAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddCustomAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddCustomAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified user to the specified group. Requires developer credentials.
    */
  def adminAddUserToGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminAddUserToGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Adds the specified user to the specified group. Requires developer credentials.
    */
  def adminAddUserToGroup(params: AdminAddUserToGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminAddUserToGroup(
    params: AdminAddUserToGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Requires developer credentials.
    */
  def adminConfirmSignUp(): awsDashSdkLib.libRequestMod.Request[AdminConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminConfirmSignUp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Requires developer credentials.
    */
  def adminConfirmSignUp(params: AdminConfirmSignUpRequest): awsDashSdkLib.libRequestMod.Request[AdminConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminConfirmSignUp(
    params: AdminConfirmSignUpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(): awsDashSdkLib.libRequestMod.Request[AdminCreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminCreateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminCreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminCreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(params: AdminCreateUserRequest): awsDashSdkLib.libRequestMod.Request[AdminCreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminCreateUser(
    params: AdminCreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminCreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminCreateUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDeleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUser(params: AdminDeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDeleteUser(
    params: AdminDeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUserAttributes(): awsDashSdkLib.libRequestMod.Request[AdminDeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDeleteUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUserAttributes(params: AdminDeleteUserAttributesRequest): awsDashSdkLib.libRequestMod.Request[AdminDeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDeleteUserAttributes(
    params: AdminDeleteUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(): awsDashSdkLib.libRequestMod.Request[AdminDisableProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDisableProviderForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDisableProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDisableProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(params: AdminDisableProviderForUserRequest): awsDashSdkLib.libRequestMod.Request[AdminDisableProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDisableProviderForUser(
    params: AdminDisableProviderForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDisableProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDisableProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDisableUser(): awsDashSdkLib.libRequestMod.Request[AdminDisableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDisableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDisableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDisableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Disables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDisableUser(params: AdminDisableUserRequest): awsDashSdkLib.libRequestMod.Request[AdminDisableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDisableUser(
    params: AdminDisableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminDisableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminDisableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminEnableUser(): awsDashSdkLib.libRequestMod.Request[AdminEnableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminEnableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminEnableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminEnableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminEnableUser(params: AdminEnableUserRequest): awsDashSdkLib.libRequestMod.Request[AdminEnableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminEnableUser(
    params: AdminEnableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminEnableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminEnableUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forgets the device, as an administrator. Requires developer credentials.
    */
  def adminForgetDevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminForgetDevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forgets the device, as an administrator. Requires developer credentials.
    */
  def adminForgetDevice(params: AdminForgetDeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminForgetDevice(
    params: AdminForgetDeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the device, as an administrator. Requires developer credentials.
    */
  def adminGetDevice(): awsDashSdkLib.libRequestMod.Request[AdminGetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminGetDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminGetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminGetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the device, as an administrator. Requires developer credentials.
    */
  def adminGetDevice(params: AdminGetDeviceRequest): awsDashSdkLib.libRequestMod.Request[AdminGetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminGetDevice(
    params: AdminGetDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminGetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminGetDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminGetUser(): awsDashSdkLib.libRequestMod.Request[AdminGetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminGetUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminGetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminGetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminGetUser(params: AdminGetUserRequest): awsDashSdkLib.libRequestMod.Request[AdminGetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminGetUser(
    params: AdminGetUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminGetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminGetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Requires developer credentials.
    */
  def adminInitiateAuth(): awsDashSdkLib.libRequestMod.Request[AdminInitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminInitiateAuth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminInitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminInitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Requires developer credentials.
    */
  def adminInitiateAuth(params: AdminInitiateAuthRequest): awsDashSdkLib.libRequestMod.Request[AdminInitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminInitiateAuth(
    params: AdminInitiateAuthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminInitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminInitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(): awsDashSdkLib.libRequestMod.Request[AdminLinkProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminLinkProviderForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminLinkProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminLinkProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(params: AdminLinkProviderForUserRequest): awsDashSdkLib.libRequestMod.Request[AdminLinkProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminLinkProviderForUser(
    params: AdminLinkProviderForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminLinkProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminLinkProviderForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists devices, as an administrator. Requires developer credentials.
    */
  def adminListDevices(): awsDashSdkLib.libRequestMod.Request[AdminListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists devices, as an administrator. Requires developer credentials.
    */
  def adminListDevices(params: AdminListDevicesRequest): awsDashSdkLib.libRequestMod.Request[AdminListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListDevices(
    params: AdminListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the groups that the user belongs to. Requires developer credentials.
    */
  def adminListGroupsForUser(): awsDashSdkLib.libRequestMod.Request[AdminListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListGroupsForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the groups that the user belongs to. Requires developer credentials.
    */
  def adminListGroupsForUser(params: AdminListGroupsForUserRequest): awsDashSdkLib.libRequestMod.Request[AdminListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListGroupsForUser(
    params: AdminListGroupsForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListGroupsForUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(): awsDashSdkLib.libRequestMod.Request[AdminListUserAuthEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListUserAuthEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListUserAuthEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListUserAuthEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(params: AdminListUserAuthEventsRequest): awsDashSdkLib.libRequestMod.Request[AdminListUserAuthEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminListUserAuthEvents(
    params: AdminListUserAuthEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminListUserAuthEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminListUserAuthEventsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified user from the specified group. Requires developer credentials.
    */
  def adminRemoveUserFromGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminRemoveUserFromGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Removes the specified user from the specified group. Requires developer credentials.
    */
  def adminRemoveUserFromGroup(params: AdminRemoveUserFromGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminRemoveUserFromGroup(
    params: AdminRemoveUserFromGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Requires developer credentials.
    */
  def adminResetUserPassword(): awsDashSdkLib.libRequestMod.Request[AdminResetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminResetUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminResetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminResetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Requires developer credentials.
    */
  def adminResetUserPassword(params: AdminResetUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[AdminResetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminResetUserPassword(
    params: AdminResetUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminResetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminResetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Requires developer credentials.
    */
  def adminRespondToAuthChallenge(): awsDashSdkLib.libRequestMod.Request[AdminRespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminRespondToAuthChallenge(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminRespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminRespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Requires developer credentials.
    */
  def adminRespondToAuthChallenge(params: AdminRespondToAuthChallengeRequest): awsDashSdkLib.libRequestMod.Request[AdminRespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminRespondToAuthChallenge(
    params: AdminRespondToAuthChallengeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminRespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminRespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference.
    */
  def adminSetUserMFAPreference(): awsDashSdkLib.libRequestMod.Request[AdminSetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserMFAPreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference.
    */
  def adminSetUserMFAPreference(params: AdminSetUserMFAPreferenceRequest): awsDashSdkLib.libRequestMod.Request[AdminSetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserMFAPreference(
    params: AdminSetUserMFAPreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def adminSetUserPassword(): awsDashSdkLib.libRequestMod.Request[AdminSetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * 
    */
  def adminSetUserPassword(params: AdminSetUserPasswordRequest): awsDashSdkLib.libRequestMod.Request[AdminSetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserPassword(
    params: AdminSetUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets all the user settings for a specified user name. Works on any user. Requires developer credentials.
    */
  def adminSetUserSettings(): awsDashSdkLib.libRequestMod.Request[AdminSetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets all the user settings for a specified user name. Works on any user. Requires developer credentials.
    */
  def adminSetUserSettings(params: AdminSetUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[AdminSetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminSetUserSettings(
    params: AdminSetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminSetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminSetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(): awsDashSdkLib.libRequestMod.Request[AdminUpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateAuthEventFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(params: AdminUpdateAuthEventFeedbackRequest): awsDashSdkLib.libRequestMod.Request[AdminUpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateAuthEventFeedback(
    params: AdminUpdateAuthEventFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device status as an administrator. Requires developer credentials.
    */
  def adminUpdateDeviceStatus(): awsDashSdkLib.libRequestMod.Request[AdminUpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateDeviceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device status as an administrator. Requires developer credentials.
    */
  def adminUpdateDeviceStatus(params: AdminUpdateDeviceStatusRequest): awsDashSdkLib.libRequestMod.Request[AdminUpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateDeviceStatus(
    params: AdminUpdateDeviceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Requires developer credentials.
    */
  def adminUpdateUserAttributes(): awsDashSdkLib.libRequestMod.Request[AdminUpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Requires developer credentials.
    */
  def adminUpdateUserAttributes(params: AdminUpdateUserAttributesRequest): awsDashSdkLib.libRequestMod.Request[AdminUpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUpdateUserAttributes(
    params: AdminUpdateUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs out users from all devices, as an administrator. Requires developer credentials.
    */
  def adminUserGlobalSignOut(): awsDashSdkLib.libRequestMod.Request[AdminUserGlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUserGlobalSignOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUserGlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUserGlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs out users from all devices, as an administrator. Requires developer credentials.
    */
  def adminUserGlobalSignOut(params: AdminUserGlobalSignOutRequest): awsDashSdkLib.libRequestMod.Request[AdminUserGlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminUserGlobalSignOut(
    params: AdminUserGlobalSignOutRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AdminUserGlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AdminUserGlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(): awsDashSdkLib.libRequestMod.Request[AssociateSoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateSoftwareToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateSoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateSoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(params: AssociateSoftwareTokenRequest): awsDashSdkLib.libRequestMod.Request[AssociateSoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def associateSoftwareToken(
    params: AssociateSoftwareTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AssociateSoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AssociateSoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(): awsDashSdkLib.libRequestMod.Request[ChangePasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changePassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangePasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangePasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(params: ChangePasswordRequest): awsDashSdkLib.libRequestMod.Request[ChangePasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def changePassword(
    params: ChangePasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ChangePasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ChangePasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(): awsDashSdkLib.libRequestMod.Request[ConfirmDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(params: ConfirmDeviceRequest): awsDashSdkLib.libRequestMod.Request[ConfirmDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmDevice(
    params: ConfirmDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmDeviceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(): awsDashSdkLib.libRequestMod.Request[ConfirmForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmForgotPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(params: ConfirmForgotPasswordRequest): awsDashSdkLib.libRequestMod.Request[ConfirmForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmForgotPassword(
    params: ConfirmForgotPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(): awsDashSdkLib.libRequestMod.Request[ConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmSignUp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(params: ConfirmSignUpRequest): awsDashSdkLib.libRequestMod.Request[ConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def confirmSignUp(
    params: ConfirmSignUpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ConfirmSignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new group in the specified user pool. Requires developer credentials.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new group in the specified user pool. Requires developer credentials.
    */
  def createGroup(params: CreateGroupRequest): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createGroup(
    params: CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(): awsDashSdkLib.libRequestMod.Request[CreateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(params: CreateIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[CreateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createIdentityProvider(
    params: CreateIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(): awsDashSdkLib.libRequestMod.Request[CreateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(params: CreateResourceServerRequest): awsDashSdkLib.libRequestMod.Request[CreateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createResourceServer(
    params: CreateResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(): awsDashSdkLib.libRequestMod.Request[CreateUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(params: CreateUserImportJobRequest): awsDashSdkLib.libRequestMod.Request[CreateUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserImportJob(
    params: CreateUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(): awsDashSdkLib.libRequestMod.Request[CreateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(params: CreateUserPoolRequest): awsDashSdkLib.libRequestMod.Request[CreateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPool(
    params: CreateUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(): awsDashSdkLib.libRequestMod.Request[CreateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(params: CreateUserPoolClientRequest): awsDashSdkLib.libRequestMod.Request[CreateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPoolClient(
    params: CreateUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[CreateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(params: CreateUserPoolDomainRequest): awsDashSdkLib.libRequestMod.Request[CreateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createUserPoolDomain(
    params: CreateUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group. Currently only groups with no members can be deleted. Requires developer credentials.
    */
  def deleteGroup(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a group. Currently only groups with no members can be deleted. Requires developer credentials.
    */
  def deleteGroup(params: DeleteGroupRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: DeleteGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an identity provider for a user pool.
    */
  def deleteIdentityProvider(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIdentityProvider(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes an identity provider for a user pool.
    */
  def deleteIdentityProvider(params: DeleteIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIdentityProvider(
    params: DeleteIdentityProviderRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a resource server.
    */
  def deleteResourceServer(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceServer(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a resource server.
    */
  def deleteResourceServer(params: DeleteResourceServerRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceServer(
    params: DeleteResourceServerRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to delete himself or herself.
    */
  def deleteUser(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to delete himself or herself.
    */
  def deleteUser(params: DeleteUserRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(): awsDashSdkLib.libRequestMod.Request[DeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(params: DeleteUserAttributesRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserAttributes(
    params: DeleteUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Cognito user pool.
    */
  def deleteUserPool(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPool(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the specified Amazon Cognito user pool.
    */
  def deleteUserPool(params: DeleteUserPoolRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPool(
    params: DeleteUserPoolRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the developer to delete the user pool client.
    */
  def deleteUserPoolClient(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPoolClient(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows the developer to delete the user pool client.
    */
  def deleteUserPoolClient(params: DeleteUserPoolClientRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPoolClient(
    params: DeleteUserPoolClientRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[DeleteUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(params: DeleteUserPoolDomainRequest): awsDashSdkLib.libRequestMod.Request[DeleteUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPoolDomain(
    params: DeleteUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(params: DescribeIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeIdentityProvider(
    params: DescribeIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(): awsDashSdkLib.libRequestMod.Request[DescribeResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(params: DescribeResourceServerRequest): awsDashSdkLib.libRequestMod.Request[DescribeResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeResourceServer(
    params: DescribeResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(): awsDashSdkLib.libRequestMod.Request[DescribeRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRiskConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(params: DescribeRiskConfigurationRequest): awsDashSdkLib.libRequestMod.Request[DescribeRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeRiskConfiguration(
    params: DescribeRiskConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(): awsDashSdkLib.libRequestMod.Request[DescribeUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(params: DescribeUserImportJobRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserImportJob(
    params: DescribeUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(params: DescribeUserPoolRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPool(
    params: DescribeUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(params: DescribeUserPoolClientRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPoolClient(
    params: DescribeUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(params: DescribeUserPoolDomainRequest): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeUserPoolDomain(
    params: DescribeUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forgets the specified device.
    */
  def forgetDevice(): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def forgetDevice(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Forgets the specified device.
    */
  def forgetDevice(params: ForgetDeviceRequest): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def forgetDevice(
    params: ForgetDeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. If a verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a verified email exists, InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(): awsDashSdkLib.libRequestMod.Request[ForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def forgotPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. If a verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a verified email exists, InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(params: ForgotPasswordRequest): awsDashSdkLib.libRequestMod.Request[ForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def forgotPassword(
    params: ForgotPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ForgotPasswordResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(): awsDashSdkLib.libRequestMod.Request[GetCSVHeaderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCSVHeader(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCSVHeaderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCSVHeaderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(params: GetCSVHeaderRequest): awsDashSdkLib.libRequestMod.Request[GetCSVHeaderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getCSVHeader(
    params: GetCSVHeaderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetCSVHeaderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetCSVHeaderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the device.
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
    * Gets the device.
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
    * Gets a group. Requires developer credentials.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets a group. Requires developer credentials.
    */
  def getGroup(params: GetGroupRequest): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getGroup(
    params: GetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(): awsDashSdkLib.libRequestMod.Request[GetIdentityProviderByIdentifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIdentityProviderByIdentifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIdentityProviderByIdentifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIdentityProviderByIdentifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(params: GetIdentityProviderByIdentifierRequest): awsDashSdkLib.libRequestMod.Request[GetIdentityProviderByIdentifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getIdentityProviderByIdentifier(
    params: GetIdentityProviderByIdentifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetIdentityProviderByIdentifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetIdentityProviderByIdentifierResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(): awsDashSdkLib.libRequestMod.Request[GetSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSigningCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(params: GetSigningCertificateRequest): awsDashSdkLib.libRequestMod.Request[GetSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getSigningCertificate(
    params: GetSigningCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetSigningCertificateResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(): awsDashSdkLib.libRequestMod.Request[GetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUICustomization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(params: GetUICustomizationRequest): awsDashSdkLib.libRequestMod.Request[GetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUICustomization(
    params: GetUICustomizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUser(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(params: GetUserRequest): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUser(
    params: GetUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ GetUserResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[GetUserResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(): awsDashSdkLib.libRequestMod.Request[GetUserAttributeVerificationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserAttributeVerificationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserAttributeVerificationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserAttributeVerificationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(params: GetUserAttributeVerificationCodeRequest): awsDashSdkLib.libRequestMod.Request[GetUserAttributeVerificationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserAttributeVerificationCode(
    params: GetUserAttributeVerificationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserAttributeVerificationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserAttributeVerificationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(): awsDashSdkLib.libRequestMod.Request[GetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserPoolMfaConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(params: GetUserPoolMfaConfigRequest): awsDashSdkLib.libRequestMod.Request[GetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getUserPoolMfaConfig(
    params: GetUserPoolMfaConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs out users from all devices.
    */
  def globalSignOut(): awsDashSdkLib.libRequestMod.Request[GlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def globalSignOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Signs out users from all devices.
    */
  def globalSignOut(params: GlobalSignOutRequest): awsDashSdkLib.libRequestMod.Request[GlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def globalSignOut(
    params: GlobalSignOutRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GlobalSignOutResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(): awsDashSdkLib.libRequestMod.Request[InitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateAuth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(params: InitiateAuthRequest): awsDashSdkLib.libRequestMod.Request[InitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def initiateAuth(
    params: InitiateAuthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ InitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[InitiateAuthResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(params: ListDevicesRequest): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDevices(
    params: ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDevicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the groups associated with a user pool. Requires developer credentials.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the groups associated with a user pool. Requires developer credentials.
    */
  def listGroups(params: ListGroupsRequest): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listGroups(
    params: ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListGroupsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(): awsDashSdkLib.libRequestMod.Request[ListIdentityProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIdentityProviders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIdentityProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIdentityProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(params: ListIdentityProvidersRequest): awsDashSdkLib.libRequestMod.Request[ListIdentityProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listIdentityProviders(
    params: ListIdentityProvidersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListIdentityProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListIdentityProvidersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(): awsDashSdkLib.libRequestMod.Request[ListResourceServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceServers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(params: ListResourceServersRequest): awsDashSdkLib.libRequestMod.Request[ListResourceServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listResourceServers(
    params: ListResourceServersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListResourceServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListResourceServersResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the tags that are assigned to an Amazon Cognito user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria. You can use this action up to 10 times per second, per account.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(): awsDashSdkLib.libRequestMod.Request[ListUserImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(params: ListUserImportJobsRequest): awsDashSdkLib.libRequestMod.Request[ListUserImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserImportJobs(
    params: ListUserImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserImportJobsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(): awsDashSdkLib.libRequestMod.Request[ListUserPoolClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserPoolClients(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserPoolClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserPoolClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(params: ListUserPoolClientsRequest): awsDashSdkLib.libRequestMod.Request[ListUserPoolClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserPoolClients(
    params: ListUserPoolClientsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserPoolClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserPoolClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(): awsDashSdkLib.libRequestMod.Request[ListUserPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserPools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(params: ListUserPoolsRequest): awsDashSdkLib.libRequestMod.Request[ListUserPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUserPools(
    params: ListUserPoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUserPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUserPoolsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the users in the Amazon Cognito user pool.
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
    * Lists the users in the Amazon Cognito user pool.
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
    * Lists the users in the specified group. Requires developer credentials.
    */
  def listUsersInGroup(): awsDashSdkLib.libRequestMod.Request[ListUsersInGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsersInGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersInGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersInGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists the users in the specified group. Requires developer credentials.
    */
  def listUsersInGroup(params: ListUsersInGroupRequest): awsDashSdkLib.libRequestMod.Request[ListUsersInGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listUsersInGroup(
    params: ListUsersInGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListUsersInGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListUsersInGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(): awsDashSdkLib.libRequestMod.Request[ResendConfirmationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resendConfirmationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResendConfirmationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResendConfirmationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(params: ResendConfirmationCodeRequest): awsDashSdkLib.libRequestMod.Request[ResendConfirmationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def resendConfirmationCode(
    params: ResendConfirmationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ResendConfirmationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ResendConfirmationCodeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(): awsDashSdkLib.libRequestMod.Request[RespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondToAuthChallenge(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(params: RespondToAuthChallengeRequest): awsDashSdkLib.libRequestMod.Request[RespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def respondToAuthChallenge(
    params: RespondToAuthChallengeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RespondToAuthChallengeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(): awsDashSdkLib.libRequestMod.Request[SetRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setRiskConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(params: SetRiskConfigurationRequest): awsDashSdkLib.libRequestMod.Request[SetRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setRiskConfiguration(
    params: SetRiskConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetRiskConfigurationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(): awsDashSdkLib.libRequestMod.Request[SetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUICustomization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(params: SetUICustomizationRequest): awsDashSdkLib.libRequestMod.Request[SetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUICustomization(
    params: SetUICustomizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUICustomizationResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference.
    */
  def setUserMFAPreference(): awsDashSdkLib.libRequestMod.Request[SetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserMFAPreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference.
    */
  def setUserMFAPreference(params: SetUserMFAPreferenceRequest): awsDashSdkLib.libRequestMod.Request[SetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserMFAPreference(
    params: SetUserMFAPreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserMFAPreferenceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the user pool MFA configuration.
    */
  def setUserPoolMfaConfig(): awsDashSdkLib.libRequestMod.Request[SetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserPoolMfaConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Set the user pool MFA configuration.
    */
  def setUserPoolMfaConfig(params: SetUserPoolMfaConfigRequest): awsDashSdkLib.libRequestMod.Request[SetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserPoolMfaConfig(
    params: SetUserPoolMfaConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserPoolMfaConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
    */
  def setUserSettings(): awsDashSdkLib.libRequestMod.Request[SetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
    */
  def setUserSettings(params: SetUserSettingsRequest): awsDashSdkLib.libRequestMod.Request[SetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def setUserSettings(
    params: SetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ SetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[SetUserSettingsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(): awsDashSdkLib.libRequestMod.Request[SignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signUp(
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SignUpResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(params: SignUpRequest): awsDashSdkLib.libRequestMod.Request[SignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def signUp(
    params: SignUpRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ SignUpResponse, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[SignUpResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(): awsDashSdkLib.libRequestMod.Request[StartUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(params: StartUserImportJobRequest): awsDashSdkLib.libRequestMod.Request[StartUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def startUserImportJob(
    params: StartUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StartUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StartUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(): awsDashSdkLib.libRequestMod.Request[StopUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(params: StopUserImportJobRequest): awsDashSdkLib.libRequestMod.Request[StopUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def stopUserImportJob(
    params: StopUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ StopUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[StopUserImportJobResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of a user pool, one for testing and another for production, you might assign an Environment tag key to both user pools. The value of this key might be Test for one user pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM policy, you can constrain permissions for user pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
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
    * Assigns a set of tags to an Amazon Cognito user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria. Each tag consists of a key and value, both of which you define. A key is a general category for more specific values. For example, if you have two versions of a user pool, one for testing and another for production, you might assign an Environment tag key to both user pools. The value of this key might be Test for one user pool and Production for the other. Tags are useful for cost tracking and access control. You can activate your tags so that they appear on the Billing and Cost Management console, where you can track the costs associated with your user pools. In an IAM policy, you can constrain permissions for user pools based on specific tags or tag values. You can use this action up to 5 times per second, per account. A user pool can have as many as 50 tags.
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
    * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second, per account
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
    * Removes the specified tags from an Amazon Cognito user pool. You can use this action up to 5 times per second, per account
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
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(): awsDashSdkLib.libRequestMod.Request[UpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthEventFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(params: UpdateAuthEventFeedbackRequest): awsDashSdkLib.libRequestMod.Request[UpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateAuthEventFeedback(
    params: UpdateAuthEventFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateAuthEventFeedbackResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(params: UpdateDeviceStatusRequest): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateDeviceStatus(
    params: UpdateDeviceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateDeviceStatusResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified group with the specified attributes. Requires developer credentials.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified group with the specified attributes. Requires developer credentials.
    */
  def updateGroup(params: UpdateGroupRequest): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateGroup(
    params: UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateGroupResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(params: UpdateIdentityProviderRequest): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateIdentityProvider(
    params: UpdateIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateIdentityProviderResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.
    */
  def updateResourceServer(): awsDashSdkLib.libRequestMod.Request[UpdateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.
    */
  def updateResourceServer(params: UpdateResourceServerRequest): awsDashSdkLib.libRequestMod.Request[UpdateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateResourceServer(
    params: UpdateResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateResourceServerResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(): awsDashSdkLib.libRequestMod.Request[UpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(params: UpdateUserAttributesRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserAttributes(
    params: UpdateUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserAttributesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool settings with .
    */
  def updateUserPool(): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool settings with .
    */
  def updateUserPool(params: UpdateUserPoolRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPool(
    params: UpdateUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool app client settings with .
    */
  def updateUserPoolClient(): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool app client settings with .
    */
  def updateUserPoolClient(params: UpdateUserPoolClientRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPoolClient(
    params: UpdateUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(params: UpdateUserPoolDomainRequest): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def updateUserPoolDomain(
    params: UpdateUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ UpdateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[UpdateUserPoolDomainResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(): awsDashSdkLib.libRequestMod.Request[VerifySoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifySoftwareToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifySoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifySoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(params: VerifySoftwareTokenRequest): awsDashSdkLib.libRequestMod.Request[VerifySoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifySoftwareToken(
    params: VerifySoftwareTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifySoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifySoftwareTokenResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(): awsDashSdkLib.libRequestMod.Request[VerifyUserAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyUserAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifyUserAttributeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifyUserAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(params: VerifyUserAttributeRequest): awsDashSdkLib.libRequestMod.Request[VerifyUserAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def verifyUserAttribute(
    params: VerifyUserAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ VerifyUserAttributeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[VerifyUserAttributeResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

