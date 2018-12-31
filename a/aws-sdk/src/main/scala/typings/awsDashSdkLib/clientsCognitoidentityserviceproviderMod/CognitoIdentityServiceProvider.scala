package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CognitoIdentityServiceProvider
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CognitoIdentityServiceProvider: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ClientConfiguration = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addCustomAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Adds additional user attributes to the user pool schema.
    */
  def addCustomAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def addCustomAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AddCustomAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def adminAddUserToGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminAddUserToGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminAddUserToGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminAddUserToGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Requires developer credentials.
    */
  def adminConfirmSignUp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminConfirmSignUp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms user registration as an admin without using a confirmation code. Works on any user. Requires developer credentials.
    */
  def adminConfirmSignUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminConfirmSignUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminCreateUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new user in the specified user pool. If MessageAction is not set, the default is to send a welcome message via email or phone (SMS).  This message is based on a template that you configured in your call to or . This template includes your custom sign-up instructions and placeholders for user name and temporary password.  Alternatively, you can call AdminCreateUser with “SUPPRESS” for the MessageAction parameter, and Amazon Cognito will not send any email.  In either case, the user will be in the FORCE_CHANGE_PASSWORD state until they sign in and change their password. AdminCreateUser requires developer credentials.
    */
  def adminCreateUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminCreateUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminCreateUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def adminDeleteUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminDeleteUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUserAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDeleteUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the user attributes in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDeleteUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDeleteUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDisableProviderForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the user from signing in with the specified external (SAML or social) identity provider. If the user to disable is a Cognito User Pools native username + password user, they are not permitted to use their password to sign-in. If the user to disable is a linked external IdP user, any link between that user and an existing user is removed. The next time the external user (no longer attached to the previously linked DestinationUser) signs in, they must create a new user account. See . This action is enabled only for admin access and requires developer credentials. The ProviderName must match the value specified when creating an IdP for the pool.  To disable a native username + password user, the ProviderName value must be Cognito and the ProviderAttributeName must be Cognito_Subject, with the ProviderAttributeValue being the name that is used in the user pool for the user. The ProviderAttributeName must always be Cognito_Subject for social identity providers. The ProviderAttributeValue must always be the exact subject that was used when the user was originally linked as a source user. For de-linking a SAML identity, there are two scenarios. If the linked identity has not yet been used to sign-in, the ProviderAttributeName and ProviderAttributeValue must be the same values that were used for the SourceUser when the identities were originally linked in the call. (If the linking was done with ProviderAttributeName set to Cognito_Subject, the same applies here). However, if the user has already signed in, the ProviderAttributeName must be Cognito_Subject and ProviderAttributeValue must be the subject of the SAML assertion.
    */
  def adminDisableProviderForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDisableProviderForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDisableUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDisableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Disables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminDisableUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminDisableUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminDisableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminEnableUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminEnableUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Enables the specified user as an administrator. Works on any user. Requires developer credentials.
    */
  def adminEnableUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminEnableUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminEnableUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def adminForgetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminForgetDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminForgetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminForgetDeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Gets the device, as an administrator. Requires developer credentials.
    */
  def adminGetDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminGetDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the device, as an administrator. Requires developer credentials.
    */
  def adminGetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminGetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminGetUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminGetUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the specified user by user name in a user pool as an administrator. Works on any user. Requires developer credentials.
    */
  def adminGetUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminGetUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminGetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Requires developer credentials.
    */
  def adminInitiateAuth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminInitiateAuth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the authentication flow, as an administrator. Requires developer credentials.
    */
  def adminInitiateAuth(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminInitiateAuth(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminInitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminLinkProviderForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Links an existing user account in a user pool (DestinationUser) to an identity from an external identity provider (SourceUser) based on a specified attribute name and value from the external identity provider. This allows you to create a link from the existing user account to an external federated user identity that has not yet been used to sign in, so that the federated user identity can be used to sign in as the existing user account.   For example, if there is an existing user with a username and password, this API links that user to a federated user identity, so that when the federated user identity is used, the user signs in as the existing user account.   Because this API allows a user with an external federated identity to sign in as an existing user in the user pool, it is critical that it only be used with external identity providers and provider attributes that have been trusted by the application owner.  See also . This action is enabled only for admin access and requires developer credentials.
    */
  def adminLinkProviderForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminLinkProviderForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminLinkProviderForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists devices, as an administrator. Requires developer credentials.
    */
  def adminListDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists devices, as an administrator. Requires developer credentials.
    */
  def adminListDevices(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListDevices(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the groups that the user belongs to. Requires developer credentials.
    */
  def adminListGroupsForUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListGroupsForUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the groups that the user belongs to. Requires developer credentials.
    */
  def adminListGroupsForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListGroupsForUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListGroupsForUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListUserAuthEvents(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists a history of user activity and any risks detected as part of Amazon Cognito advanced security.
    */
  def adminListUserAuthEvents(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminListUserAuthEvents(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminListUserAuthEventsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def adminRemoveUserFromGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRemoveUserFromGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def adminRemoveUserFromGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRemoveUserFromGroupRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Requires developer credentials.
    */
  def adminResetUserPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminResetUserPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resets the specified user's password in a user pool as an administrator. Works on any user. When a developer calls this API, the current password is invalidated, so it must be changed. If a user tries to sign in after the API is called, the app will get a PasswordResetRequiredException exception back and should direct the user down the flow to reset the password, which is the same as the forgot password flow. In addition, if the user pool has phone verification selected and a verified phone number exists for the user, or if email verification is selected and a verified email exists for the user, calling this API will also result in sending a message to the end user with the code to change their password. Requires developer credentials.
    */
  def adminResetUserPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminResetUserPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminResetUserPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Requires developer credentials.
    */
  def adminRespondToAuthChallenge(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminRespondToAuthChallenge(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Responds to an authentication challenge, as an administrator. Requires developer credentials.
    */
  def adminRespondToAuthChallenge(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminRespondToAuthChallenge(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminRespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference.
    */
  def adminSetUserMFAPreference(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminSetUserMFAPreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the user's multi-factor authentication (MFA) preference.
    */
  def adminSetUserMFAPreference(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminSetUserMFAPreference(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets all the user settings for a specified user name. Works on any user. Requires developer credentials.
    */
  def adminSetUserSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminSetUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets all the user settings for a specified user name. Works on any user. Requires developer credentials.
    */
  def adminSetUserSettings(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminSetUserSettings(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminSetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateAuthEventFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides feedback for an authentication event as to whether it was from a valid user. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def adminUpdateAuthEventFeedback(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateAuthEventFeedback(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device status as an administrator. Requires developer credentials.
    */
  def adminUpdateDeviceStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateDeviceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device status as an administrator. Requires developer credentials.
    */
  def adminUpdateDeviceStatus(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateDeviceStatus(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Requires developer credentials.
    */
  def adminUpdateUserAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user's attributes, including developer attributes, as an administrator. Works on any user. For custom attributes, you must prepend the custom: prefix to the attribute name. In addition to updating user attributes, this API can also be used to mark phone and email as verified. Requires developer credentials.
    */
  def adminUpdateUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUpdateUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs out users from all devices, as an administrator. Requires developer credentials.
    */
  def adminUserGlobalSignOut(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUserGlobalSignOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs out users from all devices, as an administrator. Requires developer credentials.
    */
  def adminUserGlobalSignOut(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def adminUserGlobalSignOut(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AdminUserGlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateSoftwareToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a unique generated shared secret key code for the user account. The request takes an access token or a session string, but not both.
    */
  def associateSoftwareToken(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def associateSoftwareToken(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.AssociateSoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def changePassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Changes the password for a specified user in a user pool.
    */
  def changePassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def changePassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ChangePasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms tracking of the device. This API call is the call that begins device tracking.
    */
  def confirmDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmForgotPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows a user to enter a confirmation code to reset a forgotten password.
    */
  def confirmForgotPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmForgotPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmSignUp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Confirms registration of a user and handles the existing alias from a previous user.
    */
  def confirmSignUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def confirmSignUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ConfirmSignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new group in the specified user pool. Requires developer credentials.
    */
  def createGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new group in the specified user pool. Requires developer credentials.
    */
  def createGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates an identity provider for a user pool.
    */
  def createIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new OAuth2.0 resource server and defines custom scopes in it.
    */
  def createResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the user import job.
    */
  def createUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new Amazon Cognito user pool and sets the password policy for the pool.
    */
  def createUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates the user pool client.
    */
  def createUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Creates a new domain for a user pool.
    */
  def createUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def createUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.CreateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteGroupRequest,
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
  def deleteIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteIdentityProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteIdentityProviderRequest,
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
  def deleteResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteResourceServerRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteResourceServerRequest,
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
  def deleteUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes the attributes for a user.
    */
  def deleteUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def deleteUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolRequest,
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
  def deleteUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolClientRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolClientRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Deletes a domain for a user pool.
    */
  def deleteUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def deleteUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DeleteUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a specific identity provider.
    */
  def describeIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes a resource server.
    */
  def describeResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRiskConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the risk configuration.
    */
  def describeRiskConfiguration(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeRiskConfiguration(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Describes the user import job.
    */
  def describeUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the configuration information and metadata of the specified user pool.
    */
  def describeUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Client method for returning the configuration information and metadata of the specified user pool app client.
    */
  def describeUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets information about a domain.
    */
  def describeUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.DescribeUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
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
  def forgetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgetDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def forgetDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgetDeviceRequest,
    callback: js.Function2[/* err */ awsDashSdkLib.libErrorMod.AWSError, /* data */ js.Object, scala.Unit]
  ): awsDashSdkLib.libRequestMod.Request[js.Object, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. If a verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a verified email exists, InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def forgotPassword(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Calling this API causes a message to be sent to the end user with a confirmation code that is required to change the user's password. For the Username parameter, you can use the username or user alias. If a verified phone number exists for the user, the confirmation code is sent to the phone number. Otherwise, if a verified email exists, the confirmation code is sent to the email. If neither a verified phone number nor a verified email exists, InvalidParameterException is thrown. To use the confirmation code for resetting the password, call .
    */
  def forgotPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def forgotPassword(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ForgotPasswordResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCSVHeader(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the header information for the .csv file to be used as input for the user import job.
    */
  def getCSVHeader(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getCSVHeader(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetCSVHeaderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the device.
    */
  def getDevice(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevice(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the device.
    */
  def getDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getDevice(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetDeviceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a group. Requires developer credentials.
    */
  def getGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets a group. Requires developer credentials.
    */
  def getGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityProviderByIdentifier(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the specified identity provider.
    */
  def getIdentityProviderByIdentifier(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getIdentityProviderByIdentifier(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetIdentityProviderByIdentifierResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSigningCertificate(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * This method takes a user pool ID, and returns the signing certificate.
    */
  def getSigningCertificate(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getSigningCertificate(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetSigningCertificateResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUICustomization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the UI Customization information for a particular app client's app UI, if there is something set. If nothing is set for the particular client, but there is an existing pool level customization (app clientId will be ALL), then that is returned. If nothing is present, then an empty shape is returned.
    */
  def getUICustomization(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUICustomization(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUser(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user attributes and metadata for a user.
    */
  def getUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUser(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserAttributeVerificationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user attribute verification code for the specified attribute name.
    */
  def getUserAttributeVerificationCode(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserAttributeVerificationCode(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserAttributeVerificationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserPoolMfaConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Gets the user pool multi-factor authentication (MFA) configuration.
    */
  def getUserPoolMfaConfig(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getUserPoolMfaConfig(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs out users from all devices.
    */
  def globalSignOut(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def globalSignOut(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Signs out users from all devices.
    */
  def globalSignOut(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def globalSignOut(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.GlobalSignOutResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def initiateAuth(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Initiates the authentication flow.
    */
  def initiateAuth(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def initiateAuth(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.InitiateAuthResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the devices.
    */
  def listDevices(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listDevices(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListDevicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the groups associated with a user pool. Requires developer credentials.
    */
  def listGroups(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the groups associated with a user pool. Requires developer credentials.
    */
  def listGroups(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listGroups(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListGroupsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentityProviders(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists information about all identity providers for a user pool.
    */
  def listIdentityProviders(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listIdentityProviders(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListIdentityProvidersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceServers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the resource servers for a user pool.
    */
  def listResourceServers(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listResourceServers(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListResourceServersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserImportJobs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the user import jobs.
    */
  def listUserImportJobs(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserImportJobs(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserImportJobsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserPoolClients(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the clients that have been created for the specified user pool.
    */
  def listUserPoolClients(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserPoolClients(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserPools(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the user pools associated with an AWS account.
    */
  def listUserPools(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUserPools(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUserPoolsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users in the Amazon Cognito user pool.
    */
  def listUsers(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users in the Amazon Cognito user pool.
    */
  def listUsers(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsers(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users in the specified group. Requires developer credentials.
    */
  def listUsersInGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsersInGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Lists the users in the specified group. Requires developer credentials.
    */
  def listUsersInGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def listUsersInGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ListUsersInGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resendConfirmationCode(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Resends the confirmation (for confirmation of registration) to a specific user in the user pool.
    */
  def resendConfirmationCode(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def resendConfirmationCode(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.ResendConfirmationCodeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def respondToAuthChallenge(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Responds to the authentication challenge.
    */
  def respondToAuthChallenge(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def respondToAuthChallenge(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.RespondToAuthChallengeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setRiskConfiguration(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Configures actions on detected risks. To delete the risk configuration for UserPoolId or ClientId, pass null values for all four configuration types. To enable Amazon Cognito advanced security features, update the user pool to include the UserPoolAddOns keyAdvancedSecurityMode. See .
    */
  def setRiskConfiguration(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setRiskConfiguration(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetRiskConfigurationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUICustomization(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the UI customization information for a user pool's built-in app UI. You can specify app UI customization settings for a single client (with a specific clientId) or for all clients (by setting the clientId to ALL). If you specify ALL, the default configuration will be used for every client that has no UI customization set previously. If you specify UI customization settings for a particular client, it will no longer fall back to the ALL configuration.   To use this API, your user pool must have a domain associated with it. Otherwise, there is no place to host the app's pages, and the service will throw an error. 
    */
  def setUICustomization(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUICustomization(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUICustomizationResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference.
    */
  def setUserMFAPreference(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserMFAPreference(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the user's multi-factor authentication (MFA) method preference.
    */
  def setUserMFAPreference(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserMFAPreference(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserMFAPreferenceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the user pool MFA configuration.
    */
  def setUserPoolMfaConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserPoolMfaConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Set the user pool MFA configuration.
    */
  def setUserPoolMfaConfig(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserPoolMfaConfig(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserPoolMfaConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
    */
  def setUserSettings(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserSettings(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Sets the user settings like multi-factor authentication (MFA). If MFA is to be removed for a particular attribute pass the attribute with code delivery as null. If null list is passed, all MFA options are removed.
    */
  def setUserSettings(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def setUserSettings(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SetUserSettingsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def signUp(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Registers the user in the specified user pool and creates a user name, password, and user attributes.
    */
  def signUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def signUp(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.SignUpResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Starts the user import.
    */
  def startUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def startUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StartUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopUserImportJob(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Stops the user import job.
    */
  def stopUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def stopUserImportJob(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.StopUserImportJobResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuthEventFeedback(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Provides the feedback for an authentication event whether it was from a valid user or not. This feedback is used for improving the risk evaluation decision for the user pool as part of Amazon Cognito advanced security.
    */
  def updateAuthEventFeedback(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateAuthEventFeedback(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateAuthEventFeedbackResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeviceStatus(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the device status.
    */
  def updateDeviceStatus(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateDeviceStatus(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateDeviceStatusResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified group with the specified attributes. Requires developer credentials.
    */
  def updateGroup(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroup(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified group with the specified attributes. Requires developer credentials.
    */
  def updateGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateGroup(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateGroupResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIdentityProvider(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates identity provider information for a user pool.
    */
  def updateIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateIdentityProvider(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateIdentityProviderResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.
    */
  def updateResourceServer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResourceServer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the name and scopes of resource server. All other fields are read-only.
    */
  def updateResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateResourceServer(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateResourceServerResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserAttributes(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Allows a user to update a specific attribute (one at a time).
    */
  def updateUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserAttributes(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserAttributesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool settings with .
    */
  def updateUserPool(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPool(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user pool with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool settings with .
    */
  def updateUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPool(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool app client settings with .
    */
  def updateUserPoolClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPoolClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the specified user pool app client with the specified attributes. If you don't provide a value for an attribute, it will be set to the default value. You can get a list of the current user pool app client settings with .
    */
  def updateUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPoolClient(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPoolDomain(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Updates the Secure Sockets Layer (SSL) certificate for the custom domain for your user pool. You can use this operation to provide the Amazon Resource Name (ARN) of a new certificate to Amazon Cognito. You cannot use it to change the domain for a user pool. A custom domain is used to host the Amazon Cognito hosted UI, which provides sign-up and sign-in pages for your application. When you set up a custom domain, you provide a certificate that you manage with AWS Certificate Manager (ACM). When necessary, you can use this operation to change the certificate that you applied to your custom domain. Usually, this is unnecessary following routine certificate renewal with ACM. When you renew your existing certificate in ACM, the ARN for your certificate remains the same, and your custom domain uses the new certificate automatically. However, if you replace your existing certificate with a new one, ACM gives the new certificate a new ARN. To apply the new certificate to your custom domain, you must provide this ARN to Amazon Cognito. When you add your new certificate in ACM, you must choose US East (N. Virginia) as the AWS Region. After you submit your request, Amazon Cognito requires up to 1 hour to distribute your new certificate to your custom domain. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
    */
  def updateUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def updateUserPoolDomain(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.UpdateUserPoolDomainResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifySoftwareToken(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Use this API to register a user's entered TOTP code and mark the user's software token MFA status as "verified" if successful. The request takes an access token or a session string, but not both.
    */
  def verifySoftwareToken(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifySoftwareToken(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifySoftwareTokenResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyUserAttribute(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Verifies the specified user attributes in the user pool.
    */
  def verifyUserAttribute(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def verifyUserAttribute(
    params: awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCognitoidentityserviceproviderMod.CognitoIdentityServiceProviderNs.VerifyUserAttributeResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

