package typings
package awsDashSdkLib.clientsCognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/cognitoidentityserviceprovider", "CognitoIdentityServiceProvider")
@js.native
object CognitoIdentityServiceProviderNs extends js.Object {
  trait AccountTakeoverActionType extends js.Object {
    /**
      * The event action.    BLOCK Choosing this action will block the request.    MFA_IF_CONFIGURED Throw MFA challenge if user has configured it, else allow the request.    MFA_REQUIRED Throw MFA challenge if user has configured it, else block the request.    NO_ACTION Allow the user sign-in.  
      */
    var EventAction: AccountTakeoverEventActionType
    /**
      * Flag specifying whether to send a notification.
      */
    var Notify: AccountTakeoverActionNotifyType
  }
  
  trait AccountTakeoverActionsType extends js.Object {
    /**
      * Action to take for a high risk.
      */
    var HighAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
    /**
      * Action to take for a low risk.
      */
    var LowAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
    /**
      * Action to take for a medium risk.
      */
    var MediumAction: js.UndefOr[AccountTakeoverActionType] = js.undefined
  }
  
  trait AccountTakeoverRiskConfigurationType extends js.Object {
    /**
      * Account takeover risk configuration actions
      */
    var Actions: AccountTakeoverActionsType
    /**
      * The notify configuration used to construct email notifications.
      */
    var NotifyConfiguration: js.UndefOr[NotifyConfigurationType] = js.undefined
  }
  
  trait AddCustomAttributesRequest extends js.Object {
    /**
      * An array of custom attributes, such as Mutable and Name.
      */
    var CustomAttributes: CustomAttributesListType
    /**
      * The user pool ID for the user pool where you want to add custom attributes.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait AddCustomAttributesResponse extends js.Object
  
  trait AdminAddUserToGroupRequest extends js.Object {
    /**
      * The group name.
      */
    var GroupName: GroupNameType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The username for the user.
      */
    var Username: UsernameType
  }
  
  trait AdminConfirmSignUpRequest extends js.Object {
    /**
      * The user pool ID for which you want to confirm user registration.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name for which you want to confirm user registration.
      */
    var Username: UsernameType
  }
  
  trait AdminConfirmSignUpResponse extends js.Object
  
  trait AdminCreateUserConfigType extends js.Object {
    /**
      * Set to True if only the administrator is allowed to create user profiles. Set to False if users can sign themselves up via an app.
      */
    var AllowAdminCreateUserOnly: js.UndefOr[BooleanType] = js.undefined
    /**
      * The message template to be used for the welcome message to new users. See also Customizing User Invitation Messages.
      */
    var InviteMessageTemplate: js.UndefOr[MessageTemplateType] = js.undefined
    /**
      * The user account expiration limit, in days, after which the account is no longer usable. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter. The default value for this parameter is 7.
      */
    var UnusedAccountValidityDays: js.UndefOr[AdminCreateUserUnusedAccountValidityDaysType] = js.undefined
  }
  
  trait AdminCreateUserRequest extends js.Object {
    /**
      * Specify "EMAIL" if email will be used to send the welcome message. Specify "SMS" if the phone number will be used. The default value is "SMS". More than one value can be specified.
      */
    var DesiredDeliveryMediums: js.UndefOr[DeliveryMediumListType] = js.undefined
    /**
      * This parameter is only used if the phone_number_verified or email_verified attribute is set to True. Otherwise, it is ignored. If this parameter is set to True and the phone number or email address specified in the UserAttributes parameter already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user. The previous user will no longer be able to log in using that alias. If this parameter is set to False, the API throws an AliasExistsException error if the alias already exists. The default value is False.
      */
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined
    /**
      * Set to "RESEND" to resend the invitation message to a user that already exists and reset the expiration limit on the user's account. Set to "SUPPRESS" to suppress sending the message. Only one value can be specified.
      */
    var MessageAction: js.UndefOr[MessageActionType] = js.undefined
    /**
      * The user's temporary password. This password must conform to the password policy that you specified when you created the user pool. The temporary password is valid only once. To complete the Admin Create User flow, the user must enter the temporary password in the sign-in page along with a new password to be used in all future sign-ins. This parameter is not required. If you do not specify a value, Amazon Cognito generates one for you. The temporary password can only be used until the user account expiration limit that you specified when you created the user pool. To reset the account after that time limit, you must call AdminCreateUser again, specifying "RESEND" for the MessageAction parameter.
      */
    var TemporaryPassword: js.UndefOr[PasswordType] = js.undefined
    /**
      * An array of name-value pairs that contain user attributes and attribute values to be set for the user to be created. You can create a user without specifying any attributes other than Username. However, any attributes that you specify as required (in or in the Attributes tab of the console) must be supplied either by you (in your call to AdminCreateUser) or by the user (when he or she signs up in response to your welcome message). For custom attributes, you must prepend the custom: prefix to the attribute name. To send a message inviting the user to sign up, you must specify the user's email address or phone number. This can be done in your call to AdminCreateUser or in the Users tab of the Amazon Cognito console for managing your user pools. In your call to AdminCreateUser, you can set the email_verified attribute to True, and you can set the phone_number_verified attribute to True. (You can also do this by calling .)    email: The email address of the user to whom the message that contains the code and username will be sent. Required if the email_verified attribute is set to True, or if "EMAIL" is specified in the DesiredDeliveryMediums parameter.    phone_number: The phone number of the user to whom the message that contains the code and username will be sent. Required if the phone_number_verified attribute is set to True, or if "SMS" is specified in the DesiredDeliveryMediums parameter.  
      */
    var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
    /**
      * The user pool ID for the user pool where the user will be created.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The username for the user. Must be unique within the user pool. Must be a UTF-8 string between 1 and 128 characters. After the user is created, the username cannot be changed.
      */
    var Username: UsernameType
    /**
      * The user's validation data. This is an array of name-value pairs that contain user attributes and attribute values that you can use for custom validation, such as restricting the types of user accounts that can be registered. For example, you might choose to allow or disallow user sign-up based on the user's domain. To configure custom validation, you must create a Pre Sign-up Lambda trigger for the user pool as described in the Amazon Cognito Developer Guide. The Lambda trigger receives the validation data and uses it in the validation process. The user's validation data is not persisted.
      */
    var ValidationData: js.UndefOr[AttributeListType] = js.undefined
  }
  
  trait AdminCreateUserResponse extends js.Object {
    /**
      * The newly created user.
      */
    var User: js.UndefOr[UserType] = js.undefined
  }
  
  trait AdminDeleteUserAttributesRequest extends js.Object {
    /**
      * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributeNames: AttributeNameListType
    /**
      * The user pool ID for the user pool where you want to delete user attributes.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user from which you would like to delete attributes.
      */
    var Username: UsernameType
  }
  
  trait AdminDeleteUserAttributesResponse extends js.Object
  
  trait AdminDeleteUserRequest extends js.Object {
    /**
      * The user pool ID for the user pool where you want to delete the user.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user you wish to delete.
      */
    var Username: UsernameType
  }
  
  trait AdminDisableProviderForUserRequest extends js.Object {
    /**
      * The user to be disabled.
      */
    var User: ProviderUserIdentifierType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: StringType
  }
  
  trait AdminDisableProviderForUserResponse extends js.Object
  
  trait AdminDisableUserRequest extends js.Object {
    /**
      * The user pool ID for the user pool where you want to disable the user.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user you wish to disable.
      */
    var Username: UsernameType
  }
  
  trait AdminDisableUserResponse extends js.Object
  
  trait AdminEnableUserRequest extends js.Object {
    /**
      * The user pool ID for the user pool where you want to enable the user.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user you wish to enable.
      */
    var Username: UsernameType
  }
  
  trait AdminEnableUserResponse extends js.Object
  
  trait AdminForgetDeviceRequest extends js.Object {
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name.
      */
    var Username: UsernameType
  }
  
  trait AdminGetDeviceRequest extends js.Object {
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name.
      */
    var Username: UsernameType
  }
  
  trait AdminGetDeviceResponse extends js.Object {
    /**
      * The device.
      */
    var Device: DeviceType
  }
  
  trait AdminGetUserRequest extends js.Object {
    /**
      * The user pool ID for the user pool where you want to get information about the user.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user you wish to retrieve.
      */
    var Username: UsernameType
  }
  
  trait AdminGetUserResponse extends js.Object {
    /**
      * Indicates that the status is enabled.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
    /**
      * Specifies the options for MFA (e.g., email or phone number).
      */
    var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
    /**
      * The user's preferred MFA setting.
      */
    var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
    /**
      * An array of name-value pairs representing user attributes.
      */
    var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
    /**
      * The date the user was created.
      */
    var UserCreateDate: js.UndefOr[DateType] = js.undefined
    /**
      * The date the user was last modified.
      */
    var UserLastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The list of the user's MFA settings.
      */
    var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
    /**
      * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.  
      */
    var UserStatus: js.UndefOr[UserStatusType] = js.undefined
    /**
      * The user name of the user about whom you are receiving information.
      */
    var Username: UsernameType
  }
  
  trait AdminInitiateAuthRequest extends js.Object {
    /**
      * The analytics metadata for collecting Amazon Pinpoint metrics for AdminInitiateAuth calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The authentication flow for this call to execute. The API action will depend on this value. For example:    REFRESH_TOKEN_AUTH will take in a valid refresh token and return new tokens.    USER_SRP_AUTH will take in USERNAME and SRP_A and return the SRP variables to be used for next challenge execution.    USER_PASSWORD_AUTH will take in USERNAME and PASSWORD and return the next challenge or tokens.   Valid values include:    USER_SRP_AUTH: Authentication flow for the Secure Remote Password (SRP) protocol.    REFRESH_TOKEN_AUTH/REFRESH_TOKEN: Authentication flow for refreshing the access token and ID token by supplying a valid refresh token.    CUSTOM_AUTH: Custom authentication flow.    ADMIN_NO_SRP_AUTH: Non-SRP authentication flow; you can pass in the USERNAME and PASSWORD directly if the flow is enabled for calling the app client.    USER_PASSWORD_AUTH: Non-SRP authentication flow; USERNAME and PASSWORD are passed directly. If a user migration Lambda trigger is set, this flow will invoke the user migration Lambda if the USERNAME is not found in the user pool.   
      */
    var AuthFlow: AuthFlowType
    /**
      * The authentication parameters. These are inputs corresponding to the AuthFlow that you are invoking. The required values depend on the value of AuthFlow:   For USER_SRP_AUTH: USERNAME (required), SRP_A (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For REFRESH_TOKEN_AUTH/REFRESH_TOKEN: REFRESH_TOKEN (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For ADMIN_NO_SRP_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), PASSWORD (required), DEVICE_KEY    For CUSTOM_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), DEVICE_KEY   
      */
    var AuthParameters: js.UndefOr[AuthParametersType] = js.undefined
    /**
      * The app client ID.
      */
    var ClientId: ClientIdType
    /**
      * This is a random key-value pair map which can contain any key and will be passed to your PreAuthentication Lambda trigger as-is. It can be used to implement additional validations around authentication.
      */
    var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var ContextData: js.UndefOr[ContextDataType] = js.undefined
    /**
      * The ID of the Amazon Cognito user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait AdminInitiateAuthResponse extends js.Object {
    /**
      * The result of the authentication response. This is only returned if the caller does not need to pass another challenge. If the caller does need to pass another challenge before it gets tokens, ChallengeName, ChallengeParameters, and Session are returned.
      */
    var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
    /**
      * The name of the challenge which you are responding to with this call. This is returned to you in the AdminInitiateAuth response if you need to pass another challenge.    MFA_SETUP: If MFA is required, users who do not have at least one of the MFA methods set up are presented with an MFA_SETUP challenge. The user must set up at least one MFA type to continue to authenticate.    SELECT_MFA_TYPE: Selects the MFA type. Valid MFA options are SMS_MFA for text SMS MFA, and SOFTWARE_TOKEN_MFA for TOTP software token MFA.    SMS_MFA: Next challenge is to supply an SMS_MFA_CODE, delivered via SMS.    PASSWORD_VERIFIER: Next challenge is to supply PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, and TIMESTAMP after the client-side SRP calculations.    CUSTOM_CHALLENGE: This is returned if your custom authentication flow determines that the user should pass another challenge before tokens are issued.    DEVICE_SRP_AUTH: If device tracking was enabled on your user pool and the previous challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.    DEVICE_PASSWORD_VERIFIER: Similar to PASSWORD_VERIFIER, but for devices only.    ADMIN_NO_SRP_AUTH: This is returned if you need to authenticate with USERNAME and PASSWORD directly. An app client must be enabled to use this flow.    NEW_PASSWORD_REQUIRED: For users which are required to change their passwords after successful first login. This challenge should be passed with NEW_PASSWORD and any other required attributes.  
      */
    var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
    /**
      * The challenge parameters. These are returned to you in the AdminInitiateAuth response if you need to pass another challenge. The responses in this parameter should be used to compute inputs to the next call (AdminRespondToAuthChallenge). All challenges require USERNAME and SECRET_HASH (if applicable). The value of the USER_ID_FOR_SRP attribute will be the user's actual username, not an alias (such as email address or phone number), even if you specified an alias in your call to AdminInitiateAuth. This is because, in the AdminRespondToAuthChallenge API ChallengeResponses, the USERNAME attribute cannot be an alias.
      */
    var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If AdminInitiateAuth or AdminRespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next AdminRespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait AdminLinkProviderForUserRequest extends js.Object {
    /**
      * The existing user in the user pool to be linked to the external identity provider user account. Can be a native (Username + Password) Cognito User Pools user or a federated user (for example, a SAML or Facebook user). If the user doesn't exist, an exception is thrown. This is the user that is returned when the new user (with the linked identity provider attribute) signs in. For a native username + password user, the ProviderAttributeValue for the DestinationUser should be the username in the user pool. For a federated user, it should be the provider-specific user_id. The ProviderAttributeName of the DestinationUser is ignored. The ProviderName should be set to Cognito for users in Cognito user pools.
      */
    var DestinationUser: ProviderUserIdentifierType
    /**
      * An external identity provider account for a user who does not currently exist yet in the user pool. This user must be a federated user (for example, a SAML or Facebook user), not another native user. If the SourceUser is a federated social identity provider user (Facebook, Google, or Login with Amazon), you must set the ProviderAttributeName to Cognito_Subject. For social identity providers, the ProviderName will be Facebook, Google, or LoginWithAmazon, and Cognito will automatically parse the Facebook, Google, and Login with Amazon tokens for id, sub, and user_id, respectively. The ProviderAttributeValue for the user must be the same value as the id, sub, or user_id value found in the social identity provider token.  For SAML, the ProviderAttributeName can be any value that matches a claim in the SAML assertion. If you wish to link SAML users based on the subject of the SAML assertion, you should map the subject to a claim through the SAML identity provider and submit that claim name as the ProviderAttributeName. If you set ProviderAttributeName to Cognito_Subject, Cognito will automatically parse the default unique identifier found in the subject from the SAML token.
      */
    var SourceUser: ProviderUserIdentifierType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: StringType
  }
  
  trait AdminLinkProviderForUserResponse extends js.Object
  
  trait AdminListDevicesRequest extends js.Object {
    /**
      * The limit of the devices request.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * The pagination token.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name.
      */
    var Username: UsernameType
  }
  
  trait AdminListDevicesResponse extends js.Object {
    /**
      * The devices in the list of devices response.
      */
    var Devices: js.UndefOr[DeviceListType] = js.undefined
    /**
      * The pagination token.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  }
  
  trait AdminListGroupsForUserRequest extends js.Object {
    /**
      * The limit of the request to list groups.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The username for the user.
      */
    var Username: UsernameType
  }
  
  trait AdminListGroupsForUserResponse extends js.Object {
    /**
      * The groups that the user belongs to.
      */
    var Groups: js.UndefOr[GroupListType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait AdminListUserAuthEventsRequest extends js.Object {
    /**
      * The maximum number of authentication events to return.
      */
    var MaxResults: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user pool username or an alias.
      */
    var Username: UsernameType
  }
  
  trait AdminListUserAuthEventsResponse extends js.Object {
    /**
      * The response object. It includes the EventID, EventType, CreationDate, EventRisk, and EventResponse.
      */
    var AuthEvents: js.UndefOr[AuthEventsType] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait AdminRemoveUserFromGroupRequest extends js.Object {
    /**
      * The group name.
      */
    var GroupName: GroupNameType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The username for the user.
      */
    var Username: UsernameType
  }
  
  trait AdminResetUserPasswordRequest extends js.Object {
    /**
      * The user pool ID for the user pool where you want to reset the user's password.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user whose password you wish to reset.
      */
    var Username: UsernameType
  }
  
  trait AdminResetUserPasswordResponse extends js.Object
  
  trait AdminRespondToAuthChallengeRequest extends js.Object {
    /**
      * The analytics metadata for collecting Amazon Pinpoint metrics for AdminRespondToAuthChallenge calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The challenge name. For more information, see .
      */
    var ChallengeName: ChallengeNameType
    /**
      * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).    ADMIN_NO_SRP_AUTH: PASSWORD, USERNAME, SECRET_HASH (if app client is configured with client secret).     NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME, SECRET_HASH (if app client is configured with client secret).    The value of the USERNAME attribute must be the user's actual username, not an alias (such as email address or phone number). To make this easier, the AdminInitiateAuth response includes the actual username value in the USERNAMEUSER_ID_FOR_SRP attribute, even if you specified an alias in your call to AdminInitiateAuth.
      */
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
    /**
      * The app client ID.
      */
    var ClientId: ClientIdType
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var ContextData: js.UndefOr[ContextDataType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
    /**
      * The ID of the Amazon Cognito user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait AdminRespondToAuthChallengeResponse extends js.Object {
    /**
      * The result returned by the server in response to the authentication request.
      */
    var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
    /**
      * The name of the challenge. For more information, see .
      */
    var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
    /**
      * The challenge parameters. For more information, see .
      */
    var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait AdminSetUserMFAPreferenceRequest extends js.Object {
    /**
      * The SMS text message MFA settings.
      */
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined
    /**
      * The time-based one-time password software token MFA settings.
      */
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user pool username or alias.
      */
    var Username: UsernameType
  }
  
  trait AdminSetUserMFAPreferenceResponse extends js.Object
  
  trait AdminSetUserSettingsRequest extends js.Object {
    /**
      * Specifies the options for MFA (e.g., email or phone number).
      */
    var MFAOptions: MFAOptionListType
    /**
      * The user pool ID for the user pool where you want to set the user's settings, such as MFA options.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user for whom you wish to set user settings.
      */
    var Username: UsernameType
  }
  
  trait AdminSetUserSettingsResponse extends js.Object
  
  trait AdminUpdateAuthEventFeedbackRequest extends js.Object {
    /**
      * The authentication event ID.
      */
    var EventId: EventIdType
    /**
      * The authentication event feedback value.
      */
    var FeedbackValue: FeedbackValueType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user pool username.
      */
    var Username: UsernameType
  }
  
  trait AdminUpdateAuthEventFeedbackResponse extends js.Object
  
  trait AdminUpdateDeviceStatusRequest extends js.Object {
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
    /**
      * The status indicating whether a device has been remembered or not.
      */
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name.
      */
    var Username: UsernameType
  }
  
  trait AdminUpdateDeviceStatusResponse extends js.Object
  
  trait AdminUpdateUserAttributesRequest extends js.Object {
    /**
      * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributes: AttributeListType
    /**
      * The user pool ID for the user pool where you want to update user attributes.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name of the user for whom you want to update user attributes.
      */
    var Username: UsernameType
  }
  
  trait AdminUpdateUserAttributesResponse extends js.Object
  
  trait AdminUserGlobalSignOutRequest extends js.Object {
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user name.
      */
    var Username: UsernameType
  }
  
  trait AdminUserGlobalSignOutResponse extends js.Object
  
  trait AnalyticsConfigurationType extends js.Object {
    /**
      * The application ID for an Amazon Pinpoint application.
      */
    var ApplicationId: HexStringType
    /**
      * The external ID.
      */
    var ExternalId: StringType
    /**
      * The ARN of an IAM role that authorizes Amazon Cognito to publish events to Amazon Pinpoint analytics.
      */
    var RoleArn: ArnType
    /**
      * If UserDataShared is true, Amazon Cognito will include user data in the events it publishes to Amazon Pinpoint analytics.
      */
    var UserDataShared: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait AnalyticsMetadataType extends js.Object {
    /**
      * The endpoint ID.
      */
    var AnalyticsEndpointId: js.UndefOr[StringType] = js.undefined
  }
  
  trait AssociateSoftwareTokenRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait AssociateSoftwareTokenResponse extends js.Object {
    /**
      * A unique generated shared secret code that is used in the TOTP algorithm to generate a one time code.
      */
    var SecretCode: js.UndefOr[SecretCodeType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. This allows authentication of the user as part of the MFA setup process.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait AttributeMappingType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait AttributeType extends js.Object {
    /**
      * The name of the attribute.
      */
    var Name: AttributeNameType
    /**
      * The value of the attribute.
      */
    var Value: js.UndefOr[AttributeValueType] = js.undefined
  }
  
  trait AuthEventType extends js.Object {
    /**
      * The challenge responses.
      */
    var ChallengeResponses: js.UndefOr[ChallengeResponseListType] = js.undefined
    /**
      * The creation date
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The user context data captured at the time of an event request. It provides additional information about the client from which event the request is received.
      */
    var EventContextData: js.UndefOr[EventContextDataType] = js.undefined
    /**
      * A flag specifying the user feedback captured at the time of an event request is good or bad. 
      */
    var EventFeedback: js.UndefOr[EventFeedbackType] = js.undefined
    /**
      * The event ID.
      */
    var EventId: js.UndefOr[StringType] = js.undefined
    /**
      * The event response.
      */
    var EventResponse: js.UndefOr[EventResponseType] = js.undefined
    /**
      * The event risk.
      */
    var EventRisk: js.UndefOr[EventRiskType] = js.undefined
    /**
      * The event type.
      */
    var EventType: js.UndefOr[EventType] = js.undefined
  }
  
  trait AuthParametersType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait AuthenticationResultType extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The expiration period of the authentication result in seconds.
      */
    var ExpiresIn: js.UndefOr[IntegerType] = js.undefined
    /**
      * The ID token.
      */
    var IdToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The new device metadata from an authentication result.
      */
    var NewDeviceMetadata: js.UndefOr[NewDeviceMetadataType] = js.undefined
    /**
      * The refresh token.
      */
    var RefreshToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The token type.
      */
    var TokenType: js.UndefOr[StringType] = js.undefined
  }
  
  trait ChallengeParametersType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait ChallengeResponseType extends js.Object {
    /**
      * The challenge name
      */
    var ChallengeName: js.UndefOr[ChallengeName] = js.undefined
    /**
      * The challenge response.
      */
    var ChallengeResponse: js.UndefOr[ChallengeResponse] = js.undefined
  }
  
  trait ChallengeResponsesType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait ChangePasswordRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: TokenModelType
    /**
      * The old password.
      */
    var PreviousPassword: PasswordType
    /**
      * The new password.
      */
    var ProposedPassword: PasswordType
  }
  
  trait ChangePasswordResponse extends js.Object
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait ClientMetadataType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait CodeDeliveryDetailsType extends js.Object {
    /**
      * The attribute name.
      */
    var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
    /**
      * The delivery medium (email message or phone number).
      */
    var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
    /**
      * The destination for the code delivery details.
      */
    var Destination: js.UndefOr[StringType] = js.undefined
  }
  
  trait CompromisedCredentialsActionsType extends js.Object {
    /**
      * The event action.
      */
    var EventAction: CompromisedCredentialsEventActionType
  }
  
  trait CompromisedCredentialsRiskConfigurationType extends js.Object {
    /**
      * The compromised credentials risk configuration actions.
      */
    var Actions: CompromisedCredentialsActionsType
    /**
      * Perform the action for these events. The default is to perform all events if no event filter is specified.
      */
    var EventFilter: js.UndefOr[EventFiltersType] = js.undefined
  }
  
  trait ConfirmDeviceRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: TokenModelType
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
    /**
      * The device name.
      */
    var DeviceName: js.UndefOr[DeviceNameType] = js.undefined
    /**
      * The configuration of the device secret verifier.
      */
    var DeviceSecretVerifierConfig: js.UndefOr[DeviceSecretVerifierConfigType] = js.undefined
  }
  
  trait ConfirmDeviceResponse extends js.Object {
    /**
      * Indicates whether the user confirmation is necessary to confirm the device response.
      */
    var UserConfirmationNecessary: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ConfirmForgotPasswordRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmForgotPassword calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The app client ID of the app associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The confirmation code sent by a user's request to retrieve a forgotten password. For more information, see 
      */
    var ConfirmationCode: ConfirmationCodeType
    /**
      * The password sent by a user's request to retrieve a forgotten password.
      */
    var Password: PasswordType
    /**
      * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
      */
    var SecretHash: js.UndefOr[SecretHashType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    /**
      * The user name of the user for whom you want to enter a code to retrieve a forgotten password.
      */
    var Username: UsernameType
  }
  
  trait ConfirmForgotPasswordResponse extends js.Object
  
  trait ConfirmSignUpRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for ConfirmSignUp calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The ID of the app client associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The confirmation code sent by a user's request to confirm registration.
      */
    var ConfirmationCode: ConfirmationCodeType
    /**
      * Boolean to be specified to force user confirmation irrespective of existing alias. By default set to False. If this parameter is set to True and the phone number/email used for sign up confirmation already exists as an alias with a different user, the API call will migrate the alias from the previous user to the newly created user being confirmed. If set to False, the API will throw an AliasExistsException error.
      */
    var ForceAliasCreation: js.UndefOr[ForceAliasCreation] = js.undefined
    /**
      * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
      */
    var SecretHash: js.UndefOr[SecretHashType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    /**
      * The user name of the user whose registration you wish to confirm.
      */
    var Username: UsernameType
  }
  
  trait ConfirmSignUpResponse extends js.Object
  
  trait ContextDataType extends js.Object {
    /**
      * Encoded data containing device fingerprinting details, collected using the Amazon Cognito context data collection library.
      */
    var EncodedData: js.UndefOr[StringType] = js.undefined
    /**
      * HttpHeaders received on your server in same order.
      */
    var HttpHeaders: HttpHeaderList
    /**
      * Source IP address of your user.
      */
    var IpAddress: StringType
    /**
      * Your server endpoint where this API is invoked.
      */
    var ServerName: StringType
    /**
      * Your server path where this API is invoked. 
      */
    var ServerPath: StringType
  }
  
  trait CreateGroupRequest extends js.Object {
    /**
      * A string containing the description of the group.
      */
    var Description: js.UndefOr[DescriptionType] = js.undefined
    /**
      * The name of the group. Must be unique.
      */
    var GroupName: GroupNameType
    /**
      * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. Zero is the highest precedence value. Groups with lower Precedence values take precedence over groups with higher or null Precedence values. If a user belongs to two or more groups, it is the group with the lowest precedence value whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
      */
    var Precedence: js.UndefOr[PrecedenceType] = js.undefined
    /**
      * The role ARN for the group.
      */
    var RoleArn: js.UndefOr[ArnType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait CreateGroupResponse extends js.Object {
    /**
      * The group object for the group.
      */
    var Group: js.UndefOr[GroupType] = js.undefined
  }
  
  trait CreateIdentityProviderRequest extends js.Object {
    /**
      * A mapping of identity provider attributes to standard and custom user pool attributes.
      */
    var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
    /**
      * A list of identity provider identifiers.
      */
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
    /**
      * The identity provider details, such as MetadataURL and MetadataFile.
      */
    var ProviderDetails: ProviderDetailsType
    /**
      * The identity provider name.
      */
    var ProviderName: ProviderNameTypeV1
    /**
      * The identity provider type.
      */
    var ProviderType: IdentityProviderTypeType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait CreateIdentityProviderResponse extends js.Object {
    /**
      * The newly created identity provider object.
      */
    var IdentityProvider: IdentityProviderType
  }
  
  trait CreateResourceServerRequest extends js.Object {
    /**
      * A unique resource server identifier for the resource server. This could be an HTTPS endpoint where the resource server is located. For example, https://my-weather-api.example.com.
      */
    var Identifier: ResourceServerIdentifierType
    /**
      * A friendly name for the resource server.
      */
    var Name: ResourceServerNameType
    /**
      * A list of scopes. Each scope is map, where the keys are name and description.
      */
    var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait CreateResourceServerResponse extends js.Object {
    /**
      * The newly created resource server.
      */
    var ResourceServer: ResourceServerType
  }
  
  trait CreateUserImportJobRequest extends js.Object {
    /**
      * The role ARN for the Amazon CloudWatch Logging role for the user import job.
      */
    var CloudWatchLogsRoleArn: ArnType
    /**
      * The job name for the user import job.
      */
    var JobName: UserImportJobNameType
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait CreateUserImportJobResponse extends js.Object {
    /**
      * The job object that represents the user import job.
      */
    var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
  }
  
  trait CreateUserPoolClientRequest extends js.Object {
    /**
      * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to token to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly.
      */
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
    /**
      * Set to True if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
    /**
      * A list of allowed OAuth scopes. Currently supported values are "phone", "email", "openid", and "Cognito".
      */
    var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
    /**
      * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined
    /**
      * The client name for the user pool client you would like to create.
      */
    var ClientName: ClientNameType
    /**
      * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
    /**
      * The explicit authentication flows.
      */
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
    /**
      * Boolean to specify whether you want to generate a secret for the user pool client being created.
      */
    var GenerateSecret: js.UndefOr[GenerateSecret] = js.undefined
    /**
      * A list of allowed logout URLs for the identity providers.
      */
    var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
    /**
      * The read attributes.
      */
    var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    /**
      * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
      */
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
    /**
      * A list of provider names for the identity providers that are supported on this client.
      */
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
    /**
      * The user pool ID for the user pool where you want to create a user pool client.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user pool attributes that the app client can write to. If your app client allows users to sign in through an identity provider, this array must include all attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If your app client lacks write access to a mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
      */
    var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  }
  
  trait CreateUserPoolClientResponse extends js.Object {
    /**
      * The user pool client that was just created.
      */
    var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
  }
  
  trait CreateUserPoolDomainRequest extends js.Object {
    /**
      * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application. Provide this parameter only if you want to use a custom domain for your user pool. Otherwise, you can exclude this parameter and use the Amazon Cognito hosted domain instead. For more information about the hosted domain and custom domains, see Configuring a User Pool Domain.
      */
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
    /**
      * The domain string.
      */
    var Domain: DomainType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait CreateUserPoolDomainResponse extends js.Object {
    /**
      * The Amazon CloudFront endpoint that you use as the target of the alias that you set up with your Domain Name Service (DNS) provider.
      */
    var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
  }
  
  trait CreateUserPoolRequest extends js.Object {
    /**
      * The configuration for AdminCreateUser requests.
      */
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
    /**
      * Attributes supported as an alias for this user pool. Possible values: phone_number, email, or preferred_username.
      */
    var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
    /**
      * The attributes to be auto-verified. Possible values: email, phone_number.
      */
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
    /**
      * The device configuration.
      */
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
    /**
      * The email configuration.
      */
    var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
    /**
      * A string representing the email verification message.
      */
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
    /**
      * A string representing the email verification subject.
      */
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
    /**
      * The Lambda trigger configuration information for the new user pool.  In a push model, event sources (such as Amazon S3 and custom applications) need permission to invoke a function. So you will need to make an extra call to add permission for these event sources to invoke your Lambda function.  For more information on using the Lambda API to add permission, see  AddPermission .  For adding permission using the AWS CLI, see  add-permission . 
      */
    var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
    /**
      * Specifies MFA configuration details.
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * The policies associated with the new user pool.
      */
    var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
    /**
      * A string used to name the user pool.
      */
    var PoolName: UserPoolNameType
    /**
      * An array of schema attributes for the new user pool. These attributes can be standard or custom attributes.
      */
    var Schema: js.UndefOr[SchemaAttributesListType] = js.undefined
    /**
      * A string representing the SMS authentication message.
      */
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * The SMS configuration.
      */
    var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
    /**
      * A string representing the SMS verification message.
      */
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
      */
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
    /**
      * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
      */
    var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
    /**
      * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
      */
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
    /**
      * The template for the verification message that the user sees when the app requests permission to access the user's information.
      */
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
  }
  
  trait CreateUserPoolResponse extends js.Object {
    /**
      * A container for the user pool details.
      */
    var UserPool: js.UndefOr[UserPoolType] = js.undefined
  }
  
  trait CustomDomainConfigType extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of an AWS Certificate Manager SSL certificate. You use this certificate for the subdomain of your custom domain.
      */
    var CertificateArn: ArnType
  }
  
  trait DeleteGroupRequest extends js.Object {
    /**
      * The name of the group.
      */
    var GroupName: GroupNameType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteIdentityProviderRequest extends js.Object {
    /**
      * The identity provider name.
      */
    var ProviderName: ProviderNameType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteResourceServerRequest extends js.Object {
    /**
      * The identifier for the resource server.
      */
    var Identifier: ResourceServerIdentifierType
    /**
      * The user pool ID for the user pool that hosts the resource server.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteUserAttributesRequest extends js.Object {
    /**
      * The access token used in the request to delete user attributes.
      */
    var AccessToken: TokenModelType
    /**
      * An array of strings representing the user attribute names you wish to delete. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributeNames: AttributeNameListType
  }
  
  trait DeleteUserAttributesResponse extends js.Object
  
  trait DeleteUserPoolClientRequest extends js.Object {
    /**
      * The app client ID of the app associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The user pool ID for the user pool where you want to delete the client.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteUserPoolDomainRequest extends js.Object {
    /**
      * The domain string.
      */
    var Domain: DomainType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteUserPoolDomainResponse extends js.Object
  
  trait DeleteUserPoolRequest extends js.Object {
    /**
      * The user pool ID for the user pool you want to delete.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DeleteUserRequest extends js.Object {
    /**
      * The access token from a request to delete a user.
      */
    var AccessToken: TokenModelType
  }
  
  trait DescribeIdentityProviderRequest extends js.Object {
    /**
      * The identity provider name.
      */
    var ProviderName: ProviderNameType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeIdentityProviderResponse extends js.Object {
    /**
      * The identity provider that was deleted.
      */
    var IdentityProvider: IdentityProviderType
  }
  
  trait DescribeResourceServerRequest extends js.Object {
    /**
      * The identifier for the resource server
      */
    var Identifier: ResourceServerIdentifierType
    /**
      * The user pool ID for the user pool that hosts the resource server.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeResourceServerResponse extends js.Object {
    /**
      * The resource server.
      */
    var ResourceServer: ResourceServerType
  }
  
  trait DescribeRiskConfigurationRequest extends js.Object {
    /**
      * The app client ID.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeRiskConfigurationResponse extends js.Object {
    /**
      * The risk configuration.
      */
    var RiskConfiguration: RiskConfigurationType
  }
  
  trait DescribeUserImportJobRequest extends js.Object {
    /**
      * The job ID for the user import job.
      */
    var JobId: UserImportJobIdType
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeUserImportJobResponse extends js.Object {
    /**
      * The job object that represents the user import job.
      */
    var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
  }
  
  trait DescribeUserPoolClientRequest extends js.Object {
    /**
      * The app client ID of the app associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The user pool ID for the user pool you want to describe.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeUserPoolClientResponse extends js.Object {
    /**
      * The user pool client from a server response to describe the user pool client.
      */
    var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
  }
  
  trait DescribeUserPoolDomainRequest extends js.Object {
    /**
      * The domain string.
      */
    var Domain: DomainType
  }
  
  trait DescribeUserPoolDomainResponse extends js.Object {
    /**
      * A domain description object containing information about the domain.
      */
    var DomainDescription: js.UndefOr[DomainDescriptionType] = js.undefined
  }
  
  trait DescribeUserPoolRequest extends js.Object {
    /**
      * The user pool ID for the user pool you want to describe.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait DescribeUserPoolResponse extends js.Object {
    /**
      * The container of metadata returned by the server to describe the pool.
      */
    var UserPool: js.UndefOr[UserPoolType] = js.undefined
  }
  
  trait DeviceConfigurationType extends js.Object {
    /**
      * Indicates whether a challenge is required on a new device. Only applicable to a new device.
      */
    var ChallengeRequiredOnNewDevice: js.UndefOr[BooleanType] = js.undefined
    /**
      * If true, a device is only remembered on user prompt.
      */
    var DeviceOnlyRememberedOnUserPrompt: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait DeviceSecretVerifierConfigType extends js.Object {
    /**
      * The password verifier.
      */
    var PasswordVerifier: js.UndefOr[StringType] = js.undefined
    /**
      * The salt.
      */
    var Salt: js.UndefOr[StringType] = js.undefined
  }
  
  trait DeviceType extends js.Object {
    /**
      * The device attributes.
      */
    var DeviceAttributes: js.UndefOr[AttributeListType] = js.undefined
    /**
      * The creation date of the device.
      */
    var DeviceCreateDate: js.UndefOr[DateType] = js.undefined
    /**
      * The device key.
      */
    var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
    /**
      * The date in which the device was last authenticated.
      */
    var DeviceLastAuthenticatedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The last modified date of the device.
      */
    var DeviceLastModifiedDate: js.UndefOr[DateType] = js.undefined
  }
  
  trait DomainDescriptionType extends js.Object {
    /**
      * The AWS account ID for the user pool owner.
      */
    var AWSAccountId: js.UndefOr[AWSAccountIdType] = js.undefined
    /**
      * The ARN of the CloudFront distribution.
      */
    var CloudFrontDistribution: js.UndefOr[StringType] = js.undefined
    /**
      * The configuration for a custom domain that hosts the sign-up and sign-in webpages for your application.
      */
    var CustomDomainConfig: js.UndefOr[CustomDomainConfigType] = js.undefined
    /**
      * The domain string.
      */
    var Domain: js.UndefOr[DomainType] = js.undefined
    /**
      * The S3 bucket where the static files for this domain are stored.
      */
    var S3Bucket: js.UndefOr[S3BucketType] = js.undefined
    /**
      * The domain status.
      */
    var Status: js.UndefOr[DomainStatusType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    /**
      * The app version.
      */
    var Version: js.UndefOr[DomainVersionType] = js.undefined
  }
  
  trait EmailConfigurationType extends js.Object {
    /**
      * The destination to which the receiver of the email should reply to.
      */
    var ReplyToEmailAddress: js.UndefOr[EmailAddressType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the email source.
      */
    var SourceArn: js.UndefOr[ArnType] = js.undefined
  }
  
  trait EventContextDataType extends js.Object {
    /**
      * The user's city.
      */
    var City: js.UndefOr[StringType] = js.undefined
    /**
      * The user's country.
      */
    var Country: js.UndefOr[StringType] = js.undefined
    /**
      * The user's device name.
      */
    var DeviceName: js.UndefOr[StringType] = js.undefined
    /**
      * The user's IP address.
      */
    var IpAddress: js.UndefOr[StringType] = js.undefined
    /**
      * The user's time zone.
      */
    var Timezone: js.UndefOr[StringType] = js.undefined
  }
  
  trait EventFeedbackType extends js.Object {
    /**
      * The event feedback date.
      */
    var FeedbackDate: js.UndefOr[DateType] = js.undefined
    /**
      * The event feedback value.
      */
    var FeedbackValue: FeedbackValueType
    /**
      * The provider.
      */
    var Provider: StringType
  }
  
  trait EventRiskType extends js.Object {
    /**
      * The risk decision.
      */
    var RiskDecision: js.UndefOr[RiskDecisionType] = js.undefined
    /**
      * The risk level.
      */
    var RiskLevel: js.UndefOr[RiskLevelType] = js.undefined
  }
  
  trait ForgetDeviceRequest extends js.Object {
    /**
      * The access token for the forgotten device request.
      */
    var AccessToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
  }
  
  trait ForgotPasswordRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for ForgotPassword calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
      */
    var SecretHash: js.UndefOr[SecretHashType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    /**
      * The user name of the user for whom you want to enter a code to reset a forgotten password.
      */
    var Username: UsernameType
  }
  
  trait ForgotPasswordResponse extends js.Object {
    /**
      * The code delivery details returned by the server in response to the request to reset a password.
      */
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  }
  
  trait GetCSVHeaderRequest extends js.Object {
    /**
      * The user pool ID for the user pool that the users are to be imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetCSVHeaderResponse extends js.Object {
    /**
      * The header information for the .csv file for the user import job.
      */
    var CSVHeader: js.UndefOr[ListOfStringTypes] = js.undefined
    /**
      * The user pool ID for the user pool that the users are to be imported into.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait GetDeviceRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
  }
  
  trait GetDeviceResponse extends js.Object {
    /**
      * The device.
      */
    var Device: DeviceType
  }
  
  trait GetGroupRequest extends js.Object {
    /**
      * The name of the group.
      */
    var GroupName: GroupNameType
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetGroupResponse extends js.Object {
    /**
      * The group object for the group.
      */
    var Group: js.UndefOr[GroupType] = js.undefined
  }
  
  trait GetIdentityProviderByIdentifierRequest extends js.Object {
    /**
      * The identity provider ID.
      */
    var IdpIdentifier: IdpIdentifierType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetIdentityProviderByIdentifierResponse extends js.Object {
    /**
      * The identity provider object.
      */
    var IdentityProvider: IdentityProviderType
  }
  
  trait GetSigningCertificateRequest extends js.Object {
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetSigningCertificateResponse extends js.Object {
    /**
      * The signing certificate.
      */
    var Certificate: js.UndefOr[StringType] = js.undefined
  }
  
  trait GetUICustomizationRequest extends js.Object {
    /**
      * The client ID for the client app.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetUICustomizationResponse extends js.Object {
    /**
      * The UI customization information.
      */
    var UICustomization: UICustomizationType
  }
  
  trait GetUserAttributeVerificationCodeRequest extends js.Object {
    /**
      * The access token returned by the server response to get the user attribute verification code.
      */
    var AccessToken: TokenModelType
    /**
      * The attribute name returned by the server response to get the user attribute verification code.
      */
    var AttributeName: AttributeNameType
  }
  
  trait GetUserAttributeVerificationCodeResponse extends js.Object {
    /**
      * The code delivery details returned by the server in response to the request to get the user attribute verification code.
      */
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  }
  
  trait GetUserPoolMfaConfigRequest extends js.Object {
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait GetUserPoolMfaConfigResponse extends js.Object {
    /**
      * The multi-factor (MFA) configuration.
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * The SMS text message multi-factor (MFA) configuration.
      */
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined
    /**
      * The software token multi-factor (MFA) configuration.
      */
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
  }
  
  trait GetUserRequest extends js.Object {
    /**
      * The access token returned by the server response to get information about the user.
      */
    var AccessToken: TokenModelType
  }
  
  trait GetUserResponse extends js.Object {
    /**
      * Specifies the options for MFA (e.g., email or phone number).
      */
    var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
    /**
      * The user's preferred MFA setting.
      */
    var PreferredMfaSetting: js.UndefOr[StringType] = js.undefined
    /**
      * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributes: AttributeListType
    /**
      * The list of the user's MFA settings.
      */
    var UserMFASettingList: js.UndefOr[UserMFASettingListType] = js.undefined
    /**
      * The user name of the user you wish to retrieve from the get user request.
      */
    var Username: UsernameType
  }
  
  trait GlobalSignOutRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: TokenModelType
  }
  
  trait GlobalSignOutResponse extends js.Object
  
  trait GroupType extends js.Object {
    /**
      * The date the group was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A string containing the description of the group.
      */
    var Description: js.UndefOr[DescriptionType] = js.undefined
    /**
      * The name of the group.
      */
    var GroupName: js.UndefOr[GroupNameType] = js.undefined
    /**
      * The date the group was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * A nonnegative integer value that specifies the precedence of this group relative to the other groups that a user can belong to in the user pool. If a user belongs to two or more groups, it is the group with the highest precedence whose role ARN will be used in the cognito:roles and cognito:preferred_role claims in the user's tokens. Groups with higher Precedence values take precedence over groups with lower Precedence values or with null Precedence values. Two groups can have the same Precedence value. If this happens, neither group takes precedence over the other. If two groups with the same Precedence have the same role ARN, that role is used in the cognito:preferred_role claim in tokens for users in each group. If the two groups have different role ARNs, the cognito:preferred_role claim is not set in users' tokens. The default Precedence value is null.
      */
    var Precedence: js.UndefOr[PrecedenceType] = js.undefined
    /**
      * The role ARN for the group.
      */
    var RoleArn: js.UndefOr[ArnType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait HttpHeader extends js.Object {
    /**
      * The header name
      */
    var headerName: js.UndefOr[StringType] = js.undefined
    /**
      * The header value.
      */
    var headerValue: js.UndefOr[StringType] = js.undefined
  }
  
  trait IdentityProviderType extends js.Object {
    /**
      * A mapping of identity provider attributes to standard and custom user pool attributes.
      */
    var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
    /**
      * The date the identity provider was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A list of identity provider identifiers.
      */
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
    /**
      * The date the identity provider was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The identity provider details, such as MetadataURL and MetadataFile.
      */
    var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
    /**
      * The identity provider name.
      */
    var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
    /**
      * The identity provider type.
      */
    var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait InitiateAuthRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for InitiateAuth calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The authentication flow for this call to execute. The API action will depend on this value. For example:     REFRESH_TOKEN_AUTH will take in a valid refresh token and return new tokens.    USER_SRP_AUTH will take in USERNAME and SRP_A and return the SRP variables to be used for next challenge execution.    USER_PASSWORD_AUTH will take in USERNAME and PASSWORD and return the next challenge or tokens.   Valid values include:    USER_SRP_AUTH: Authentication flow for the Secure Remote Password (SRP) protocol.    REFRESH_TOKEN_AUTH/REFRESH_TOKEN: Authentication flow for refreshing the access token and ID token by supplying a valid refresh token.    CUSTOM_AUTH: Custom authentication flow.    USER_PASSWORD_AUTH: Non-SRP authentication flow; USERNAME and PASSWORD are passed directly. If a user migration Lambda trigger is set, this flow will invoke the user migration Lambda if the USERNAME is not found in the user pool.     ADMIN_NO_SRP_AUTH is not a valid value.
      */
    var AuthFlow: AuthFlowType
    /**
      * The authentication parameters. These are inputs corresponding to the AuthFlow that you are invoking. The required values depend on the value of AuthFlow:   For USER_SRP_AUTH: USERNAME (required), SRP_A (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For REFRESH_TOKEN_AUTH/REFRESH_TOKEN: REFRESH_TOKEN (required), SECRET_HASH (required if the app client is configured with a client secret), DEVICE_KEY    For CUSTOM_AUTH: USERNAME (required), SECRET_HASH (if app client is configured with client secret), DEVICE_KEY   
      */
    var AuthParameters: js.UndefOr[AuthParametersType] = js.undefined
    /**
      * The app client ID.
      */
    var ClientId: ClientIdType
    /**
      * This is a random key-value pair map which can contain any key and will be passed to your PreAuthentication Lambda trigger as-is. It can be used to implement additional validations around authentication.
      */
    var ClientMetadata: js.UndefOr[ClientMetadataType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  }
  
  trait InitiateAuthResponse extends js.Object {
    /**
      * The result of the authentication response. This is only returned if the caller does not need to pass another challenge. If the caller does need to pass another challenge before it gets tokens, ChallengeName, ChallengeParameters, and Session are returned.
      */
    var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
    /**
      * The name of the challenge which you are responding to with this call. This is returned to you in the AdminInitiateAuth response if you need to pass another challenge. Valid values include the following. Note that all of these challenges require USERNAME and SECRET_HASH (if applicable) in the parameters.    SMS_MFA: Next challenge is to supply an SMS_MFA_CODE, delivered via SMS.    PASSWORD_VERIFIER: Next challenge is to supply PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, and TIMESTAMP after the client-side SRP calculations.    CUSTOM_CHALLENGE: This is returned if your custom authentication flow determines that the user should pass another challenge before tokens are issued.    DEVICE_SRP_AUTH: If device tracking was enabled on your user pool and the previous challenges were passed, this challenge is returned so that Amazon Cognito can start tracking this device.    DEVICE_PASSWORD_VERIFIER: Similar to PASSWORD_VERIFIER, but for devices only.    NEW_PASSWORD_REQUIRED: For users which are required to change their passwords after successful first login. This challenge should be passed with NEW_PASSWORD and any other required attributes.  
      */
    var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
    /**
      * The challenge parameters. These are returned to you in the InitiateAuth response if you need to pass another challenge. The responses in this parameter should be used to compute inputs to the next call (RespondToAuthChallenge).  All challenges require USERNAME and SECRET_HASH (if applicable).
      */
    var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait LambdaConfigType extends js.Object {
    /**
      * Creates an authentication challenge.
      */
    var CreateAuthChallenge: js.UndefOr[ArnType] = js.undefined
    /**
      * A custom Message AWS Lambda trigger.
      */
    var CustomMessage: js.UndefOr[ArnType] = js.undefined
    /**
      * Defines the authentication challenge.
      */
    var DefineAuthChallenge: js.UndefOr[ArnType] = js.undefined
    /**
      * A post-authentication AWS Lambda trigger.
      */
    var PostAuthentication: js.UndefOr[ArnType] = js.undefined
    /**
      * A post-confirmation AWS Lambda trigger.
      */
    var PostConfirmation: js.UndefOr[ArnType] = js.undefined
    /**
      * A pre-authentication AWS Lambda trigger.
      */
    var PreAuthentication: js.UndefOr[ArnType] = js.undefined
    /**
      * A pre-registration AWS Lambda trigger.
      */
    var PreSignUp: js.UndefOr[ArnType] = js.undefined
    /**
      * A Lambda trigger that is invoked before token generation.
      */
    var PreTokenGeneration: js.UndefOr[ArnType] = js.undefined
    /**
      * The user migration Lambda config type.
      */
    var UserMigration: js.UndefOr[ArnType] = js.undefined
    /**
      * Verifies the authentication challenge response.
      */
    var VerifyAuthChallengeResponse: js.UndefOr[ArnType] = js.undefined
  }
  
  trait ListDevicesRequest extends js.Object {
    /**
      * The access tokens for the request to list devices.
      */
    var AccessToken: TokenModelType
    /**
      * The limit of the device request.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * The pagination token for the list request.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  }
  
  trait ListDevicesResponse extends js.Object {
    /**
      * The devices returned in the list devices response.
      */
    var Devices: js.UndefOr[DeviceListType] = js.undefined
    /**
      * The pagination token for the list device response.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
  }
  
  trait ListGroupsRequest extends js.Object {
    /**
      * The limit of the request to list groups.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListGroupsResponse extends js.Object {
    /**
      * The group objects for the groups.
      */
    var Groups: js.UndefOr[GroupListType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
  }
  
  trait ListIdentityProvidersRequest extends js.Object {
    /**
      * The maximum number of identity providers to return.
      */
    var MaxResults: js.UndefOr[ListProvidersLimitType] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListIdentityProvidersResponse extends js.Object {
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * A list of identity provider objects.
      */
    var Providers: ProvidersListType
  }
  
  trait ListResourceServersRequest extends js.Object {
    /**
      * The maximum number of resource servers to return.
      */
    var MaxResults: js.UndefOr[ListResourceServersLimitType] = js.undefined
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListResourceServersResponse extends js.Object {
    /**
      * A pagination token.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The resource servers.
      */
    var ResourceServers: ResourceServersListType
  }
  
  trait ListTagsForResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user pool that the tags are assigned to.
      */
    var ResourceArn: ArnType
  }
  
  trait ListTagsForResourceResponse extends js.Object {
    /**
      * The tags that are assigned to the user pool.
      */
    var Tags: js.UndefOr[UserPoolTagsType] = js.undefined
  }
  
  trait ListUserImportJobsRequest extends js.Object {
    /**
      * The maximum number of import jobs you want the request to return.
      */
    var MaxResults: PoolQueryLimitType
    /**
      * An identifier that was returned from the previous call to ListUserImportJobs, which can be used to return the next set of import jobs in the list.
      */
    var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListUserImportJobsResponse extends js.Object {
    /**
      * An identifier that can be used to return the next set of user import jobs in the list.
      */
    var PaginationToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The user import jobs.
      */
    var UserImportJobs: js.UndefOr[UserImportJobsListType] = js.undefined
  }
  
  trait ListUserPoolClientsRequest extends js.Object {
    /**
      * The maximum number of results you want the request to return when listing the user pool clients.
      */
    var MaxResults: js.UndefOr[QueryLimit] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool ID for the user pool where you want to list user pool clients.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListUserPoolClientsResponse extends js.Object {
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool clients in the response that lists user pool clients.
      */
    var UserPoolClients: js.UndefOr[UserPoolClientListType] = js.undefined
  }
  
  trait ListUserPoolsRequest extends js.Object {
    /**
      * The maximum number of results you want the request to return when listing the user pools.
      */
    var MaxResults: PoolQueryLimitType
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
  }
  
  trait ListUserPoolsResponse extends js.Object {
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKeyType] = js.undefined
    /**
      * The user pools from the response to list users.
      */
    var UserPools: js.UndefOr[UserPoolListType] = js.undefined
  }
  
  trait ListUsersInGroupRequest extends js.Object {
    /**
      * The name of the group.
      */
    var GroupName: GroupNameType
    /**
      * The limit of the request to list users.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListUsersInGroupResponse extends js.Object {
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var NextToken: js.UndefOr[PaginationKey] = js.undefined
    /**
      * The users returned in the request to list users.
      */
    var Users: js.UndefOr[UsersListType] = js.undefined
  }
  
  trait ListUsersRequest extends js.Object {
    /**
      * An array of strings, where each string is the name of a user attribute to be returned for each user in the search results. If the array is null, all attributes are returned.
      */
    var AttributesToGet: js.UndefOr[SearchedAttributeNamesListType] = js.undefined
    /**
      * A filter string of the form "AttributeName Filter-Type "AttributeValue"". Quotation marks within the filter string must be escaped using the backslash (\) character. For example, "family_name = \"Reddy\"".    AttributeName: The name of the attribute to search for. You can only search for one attribute at a time.    Filter-Type: For an exact match, use =, for example, "given_name = \"Jon\"". For a prefix ("starts with") match, use ^=, for example, "given_name ^= \"Jon\"".     AttributeValue: The attribute value that must be matched for each user.   If the filter string is empty, ListUsers returns all users in the user pool. You can only search for the following standard attributes:    username (case-sensitive)    email     phone_number     name     given_name     family_name     preferred_username     cognito:user_status (called Status in the Console) (case-insensitive)    status (called Enabled in the Console) (case-sensitive)     sub    Custom attributes are not searchable. For more information, see Searching for Users Using the ListUsers API and Examples of Using the ListUsers API in the Amazon Cognito Developer Guide.
      */
    var Filter: js.UndefOr[UserFilterType] = js.undefined
    /**
      * Maximum number of users to be returned.
      */
    var Limit: js.UndefOr[QueryLimitType] = js.undefined
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    /**
      * The user pool ID for the user pool on which the search should be performed.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait ListUsersResponse extends js.Object {
    /**
      * An identifier that was returned from the previous call to this operation, which can be used to return the next set of items in the list.
      */
    var PaginationToken: js.UndefOr[SearchPaginationTokenType] = js.undefined
    /**
      * The users returned in the request to list users.
      */
    var Users: js.UndefOr[UsersListType] = js.undefined
  }
  
  trait MFAOptionType extends js.Object {
    /**
      * The attribute name of the MFA option type.
      */
    var AttributeName: js.UndefOr[AttributeNameType] = js.undefined
    /**
      * The delivery medium (email message or SMS message) to send the MFA code.
      */
    var DeliveryMedium: js.UndefOr[DeliveryMediumType] = js.undefined
  }
  
  trait MessageTemplateType extends js.Object {
    /**
      * The message template for email messages.
      */
    var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
    /**
      * The subject line for email messages.
      */
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
    /**
      * The message template for SMS messages.
      */
    var SMSMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  }
  
  trait NewDeviceMetadataType extends js.Object {
    /**
      * The device group key.
      */
    var DeviceGroupKey: js.UndefOr[StringType] = js.undefined
    /**
      * The device key.
      */
    var DeviceKey: js.UndefOr[DeviceKeyType] = js.undefined
  }
  
  trait NotifyConfigurationType extends js.Object {
    /**
      * Email template used when a detected risk event is blocked.
      */
    var BlockEmail: js.UndefOr[NotifyEmailType] = js.undefined
    /**
      * The email address that is sending the email. It must be either individually verified with Amazon SES, or from a domain that has been verified with Amazon SES.
      */
    var From: js.UndefOr[StringType] = js.undefined
    /**
      * The MFA email template used when MFA is challenged as part of a detected risk.
      */
    var MfaEmail: js.UndefOr[NotifyEmailType] = js.undefined
    /**
      * The email template used when a detected risk event is allowed.
      */
    var NoActionEmail: js.UndefOr[NotifyEmailType] = js.undefined
    /**
      * The destination to which the receiver of an email should reply to.
      */
    var ReplyTo: js.UndefOr[StringType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the identity that is associated with the sending authorization policy. It permits Amazon Cognito to send for the email address specified in the From parameter.
      */
    var SourceArn: ArnType
  }
  
  trait NotifyEmailType extends js.Object {
    /**
      * The HTML body.
      */
    var HtmlBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
    /**
      * The subject.
      */
    var Subject: EmailNotificationSubjectType
    /**
      * The text body.
      */
    var TextBody: js.UndefOr[EmailNotificationBodyType] = js.undefined
  }
  
  trait NumberAttributeConstraintsType extends js.Object {
    /**
      * The maximum value of an attribute that is of the number data type.
      */
    var MaxValue: js.UndefOr[StringType] = js.undefined
    /**
      * The minimum value of an attribute that is of the number data type.
      */
    var MinValue: js.UndefOr[StringType] = js.undefined
  }
  
  trait PasswordPolicyType extends js.Object {
    /**
      * The minimum length of the password policy that you have set. Cannot be less than 6.
      */
    var MinimumLength: js.UndefOr[PasswordPolicyMinLengthType] = js.undefined
    /**
      * In the password policy that you have set, refers to whether you have required users to use at least one lowercase letter in their password.
      */
    var RequireLowercase: js.UndefOr[BooleanType] = js.undefined
    /**
      * In the password policy that you have set, refers to whether you have required users to use at least one number in their password.
      */
    var RequireNumbers: js.UndefOr[BooleanType] = js.undefined
    /**
      * In the password policy that you have set, refers to whether you have required users to use at least one symbol in their password.
      */
    var RequireSymbols: js.UndefOr[BooleanType] = js.undefined
    /**
      * In the password policy that you have set, refers to whether you have required users to use at least one uppercase letter in their password.
      */
    var RequireUppercase: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait ProviderDescription extends js.Object {
    /**
      * The date the provider was added to the user pool.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The date the provider was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The identity provider name.
      */
    var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
    /**
      * The identity provider type.
      */
    var ProviderType: js.UndefOr[IdentityProviderTypeType] = js.undefined
  }
  
  trait ProviderDetailsType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[StringType]
  
  trait ProviderUserIdentifierType extends js.Object {
    /**
      * The name of the provider attribute to link to, for example, NameID.
      */
    var ProviderAttributeName: js.UndefOr[StringType] = js.undefined
    /**
      * The value of the provider attribute to link to, for example, xxxxx_account.
      */
    var ProviderAttributeValue: js.UndefOr[StringType] = js.undefined
    /**
      * The name of the provider, for example, Facebook, Google, or Login with Amazon.
      */
    var ProviderName: js.UndefOr[ProviderNameType] = js.undefined
  }
  
  trait ResendConfirmationCodeRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for ResendConfirmationCode calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
      */
    var SecretHash: js.UndefOr[SecretHashType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    /**
      * The user name of the user to whom you wish to resend a confirmation code.
      */
    var Username: UsernameType
  }
  
  trait ResendConfirmationCodeResponse extends js.Object {
    /**
      * The code delivery details returned by the server in response to the request to resend the confirmation code.
      */
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
  }
  
  trait ResourceServerScopeType extends js.Object {
    /**
      * A description of the scope.
      */
    var ScopeDescription: ResourceServerScopeDescriptionType
    /**
      * The name of the scope.
      */
    var ScopeName: ResourceServerScopeNameType
  }
  
  trait ResourceServerType extends js.Object {
    /**
      * The identifier for the resource server.
      */
    var Identifier: js.UndefOr[ResourceServerIdentifierType] = js.undefined
    /**
      * The name of the resource server.
      */
    var Name: js.UndefOr[ResourceServerNameType] = js.undefined
    /**
      * A list of scopes that are defined for the resource server.
      */
    var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    /**
      * The user pool ID for the user pool that hosts the resource server.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait RespondToAuthChallengeRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for RespondToAuthChallenge calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The challenge name. For more information, see .  ADMIN_NO_SRP_AUTH is not a valid value.
      */
    var ChallengeName: ChallengeNameType
    /**
      * The challenge responses. These are inputs corresponding to the value of ChallengeName, for example:    SMS_MFA: SMS_MFA_CODE, USERNAME, SECRET_HASH (if app client is configured with client secret).    PASSWORD_VERIFIER: PASSWORD_CLAIM_SIGNATURE, PASSWORD_CLAIM_SECRET_BLOCK, TIMESTAMP, USERNAME, SECRET_HASH (if app client is configured with client secret).    NEW_PASSWORD_REQUIRED: NEW_PASSWORD, any other required attributes, USERNAME, SECRET_HASH (if app client is configured with client secret).   
      */
    var ChallengeResponses: js.UndefOr[ChallengeResponsesType] = js.undefined
    /**
      * The app client ID.
      */
    var ClientId: ClientIdType
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If InitiateAuth or RespondToAuthChallenge API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
  }
  
  trait RespondToAuthChallengeResponse extends js.Object {
    /**
      * The result returned by the server in response to the request to respond to the authentication challenge.
      */
    var AuthenticationResult: js.UndefOr[AuthenticationResultType] = js.undefined
    /**
      * The challenge name. For more information, see .
      */
    var ChallengeName: js.UndefOr[ChallengeNameType] = js.undefined
    /**
      * The challenge parameters. For more information, see .
      */
    var ChallengeParameters: js.UndefOr[ChallengeParametersType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service. If the or API call determines that the caller needs to go through another challenge, they return a session with other challenge parameters. This session should be passed as it is to the next RespondToAuthChallenge API call.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
  }
  
  trait RiskConfigurationType extends js.Object {
    /**
      * The account takeover risk configuration object including the NotifyConfiguration object and Actions to take in the case of an account takeover.
      */
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
    /**
      * The app client ID.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The compromised credentials risk configuration object including the EventFilter and the EventAction 
      */
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
    /**
      * The last modified date.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The configuration to override the risk decision.
      */
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait RiskExceptionConfigurationType extends js.Object {
    /**
      * Overrides the risk decision to always block the pre-authentication requests. The IP range is in CIDR notation: a compact representation of an IP address and its associated routing prefix.
      */
    var BlockedIPRangeList: js.UndefOr[BlockedIPRangeListType] = js.undefined
    /**
      * Risk detection is not performed on the IP addresses in the range list. The IP range is in CIDR notation.
      */
    var SkippedIPRangeList: js.UndefOr[SkippedIPRangeListType] = js.undefined
  }
  
  trait SMSMfaSettingsType extends js.Object {
    /**
      * Specifies whether SMS text message MFA is enabled.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
    /**
      * The preferred MFA method.
      */
    var PreferredMfa: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait SchemaAttributeType extends js.Object {
    /**
      * The attribute data type.
      */
    var AttributeDataType: js.UndefOr[AttributeDataType] = js.undefined
    /**
      * Specifies whether the attribute type is developer only.
      */
    var DeveloperOnlyAttribute: js.UndefOr[BooleanType] = js.undefined
    /**
      * Specifies whether the value of the attribute can be changed. For any user pool attribute that's mapped to an identity provider attribute, you must set this parameter to true. Amazon Cognito updates mapped attributes when users sign in to your application through an identity provider. If an attribute is immutable, Amazon Cognito throws an error when it attempts to update the attribute. For more information, see Specifying Identity Provider Attribute Mappings for Your User Pool.
      */
    var Mutable: js.UndefOr[BooleanType] = js.undefined
    /**
      * A schema attribute of the name type.
      */
    var Name: js.UndefOr[CustomAttributeNameType] = js.undefined
    /**
      * Specifies the constraints for an attribute of the number type.
      */
    var NumberAttributeConstraints: js.UndefOr[NumberAttributeConstraintsType] = js.undefined
    /**
      * Specifies whether a user pool attribute is required. If the attribute is required and the user does not provide a value, registration or sign-in will fail.
      */
    var Required: js.UndefOr[BooleanType] = js.undefined
    /**
      * Specifies the constraints for an attribute of the string type.
      */
    var StringAttributeConstraints: js.UndefOr[StringAttributeConstraintsType] = js.undefined
  }
  
  trait SetRiskConfigurationRequest extends js.Object {
    /**
      * The account takeover risk configuration.
      */
    var AccountTakeoverRiskConfiguration: js.UndefOr[AccountTakeoverRiskConfigurationType] = js.undefined
    /**
      * The app client ID. If ClientId is null, then the risk configuration is mapped to userPoolId. When the client ID is null, the same risk configuration is applied to all the clients in the userPool. Otherwise, ClientId is mapped to the client. When the client ID is not null, the user pool configuration is overridden and the risk configuration for the client is used instead.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The compromised credentials risk configuration.
      */
    var CompromisedCredentialsRiskConfiguration: js.UndefOr[CompromisedCredentialsRiskConfigurationType] = js.undefined
    /**
      * The configuration to override the risk decision.
      */
    var RiskExceptionConfiguration: js.UndefOr[RiskExceptionConfigurationType] = js.undefined
    /**
      * The user pool ID. 
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait SetRiskConfigurationResponse extends js.Object {
    /**
      * The risk configuration.
      */
    var RiskConfiguration: RiskConfigurationType
  }
  
  trait SetUICustomizationRequest extends js.Object {
    /**
      * The CSS values in the UI customization.
      */
    var CSS: js.UndefOr[CSSType] = js.undefined
    /**
      * The client ID for the client app.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The uploaded logo image for the UI customization.
      */
    var ImageFile: js.UndefOr[ImageFileType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait SetUICustomizationResponse extends js.Object {
    /**
      * The UI customization information.
      */
    var UICustomization: UICustomizationType
  }
  
  trait SetUserMFAPreferenceRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: TokenModelType
    /**
      * The SMS text message multi-factor authentication (MFA) settings.
      */
    var SMSMfaSettings: js.UndefOr[SMSMfaSettingsType] = js.undefined
    /**
      * The time-based one-time password software token MFA settings.
      */
    var SoftwareTokenMfaSettings: js.UndefOr[SoftwareTokenMfaSettingsType] = js.undefined
  }
  
  trait SetUserMFAPreferenceResponse extends js.Object
  
  trait SetUserPoolMfaConfigRequest extends js.Object {
    /**
      * The MFA configuration.
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * The SMS text message MFA configuration.
      */
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined
    /**
      * The software token MFA configuration.
      */
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait SetUserPoolMfaConfigResponse extends js.Object {
    /**
      * The MFA configuration.
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * The SMS text message MFA configuration.
      */
    var SmsMfaConfiguration: js.UndefOr[SmsMfaConfigType] = js.undefined
    /**
      * The software token MFA configuration.
      */
    var SoftwareTokenMfaConfiguration: js.UndefOr[SoftwareTokenMfaConfigType] = js.undefined
  }
  
  trait SetUserSettingsRequest extends js.Object {
    /**
      * The access token for the set user settings request.
      */
    var AccessToken: TokenModelType
    /**
      * Specifies the options for MFA (e.g., email or phone number).
      */
    var MFAOptions: MFAOptionListType
  }
  
  trait SetUserSettingsResponse extends js.Object
  
  trait SignUpRequest extends js.Object {
    /**
      * The Amazon Pinpoint analytics metadata for collecting metrics for SignUp calls.
      */
    var AnalyticsMetadata: js.UndefOr[AnalyticsMetadataType] = js.undefined
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The password of the user you wish to register.
      */
    var Password: PasswordType
    /**
      * A keyed-hash message authentication code (HMAC) calculated using the secret key of a user pool client and username plus the client ID in the message.
      */
    var SecretHash: js.UndefOr[SecretHashType] = js.undefined
    /**
      * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributes: js.UndefOr[AttributeListType] = js.undefined
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var UserContextData: js.UndefOr[UserContextDataType] = js.undefined
    /**
      * The user name of the user you wish to register.
      */
    var Username: UsernameType
    /**
      * The validation data in the request to register a user.
      */
    var ValidationData: js.UndefOr[AttributeListType] = js.undefined
  }
  
  trait SignUpResponse extends js.Object {
    /**
      * The code delivery details returned by the server response to the user registration request.
      */
    var CodeDeliveryDetails: js.UndefOr[CodeDeliveryDetailsType] = js.undefined
    /**
      * A response from the server indicating that a user registration has been confirmed.
      */
    var UserConfirmed: BooleanType
    /**
      * The UUID of the authenticated user. This is not the same as username.
      */
    var UserSub: StringType
  }
  
  trait SmsConfigurationType extends js.Object {
    /**
      * The external ID.
      */
    var ExternalId: js.UndefOr[StringType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) of the Amazon Simple Notification Service (SNS) caller.
      */
    var SnsCallerArn: ArnType
  }
  
  trait SmsMfaConfigType extends js.Object {
    /**
      * The SMS authentication message.
      */
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * The SMS configuration.
      */
    var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
  }
  
  trait SoftwareTokenMfaConfigType extends js.Object {
    /**
      * Specifies whether software token MFA is enabled.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait SoftwareTokenMfaSettingsType extends js.Object {
    /**
      * Specifies whether software token MFA is enabled.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
    /**
      * The preferred MFA method.
      */
    var PreferredMfa: js.UndefOr[BooleanType] = js.undefined
  }
  
  trait StartUserImportJobRequest extends js.Object {
    /**
      * The job ID for the user import job.
      */
    var JobId: UserImportJobIdType
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait StartUserImportJobResponse extends js.Object {
    /**
      * The job object that represents the user import job.
      */
    var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
  }
  
  trait StopUserImportJobRequest extends js.Object {
    /**
      * The job ID for the user import job.
      */
    var JobId: UserImportJobIdType
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait StopUserImportJobResponse extends js.Object {
    /**
      * The job object that represents the user import job.
      */
    var UserImportJob: js.UndefOr[UserImportJobType] = js.undefined
  }
  
  trait StringAttributeConstraintsType extends js.Object {
    /**
      * The maximum length.
      */
    var MaxLength: js.UndefOr[StringType] = js.undefined
    /**
      * The minimum length.
      */
    var MinLength: js.UndefOr[StringType] = js.undefined
  }
  
  trait TagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user pool to assign the tags to.
      */
    var ResourceArn: ArnType
    /**
      * The tags to assign to the user pool.
      */
    var Tags: js.UndefOr[UserPoolTagsType] = js.undefined
  }
  
  trait TagResourceResponse extends js.Object
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
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
  
  trait UICustomizationType extends js.Object {
    /**
      * The CSS values in the UI customization.
      */
    var CSS: js.UndefOr[CSSType] = js.undefined
    /**
      * The CSS version number.
      */
    var CSSVersion: js.UndefOr[CSSVersionType] = js.undefined
    /**
      * The client ID for the client app.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The creation date for the UI customization.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The logo image for the UI customization.
      */
    var ImageUrl: js.UndefOr[ImageUrlType] = js.undefined
    /**
      * The last-modified date for the UI customization.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait UntagResourceRequest extends js.Object {
    /**
      * The Amazon Resource Name (ARN) of the user pool that the tags are assigned to.
      */
    var ResourceArn: ArnType
    /**
      * The keys of the tags to remove from the user pool.
      */
    var TagKeys: js.UndefOr[UserPoolTagsListType] = js.undefined
  }
  
  trait UntagResourceResponse extends js.Object
  
  trait UpdateAuthEventFeedbackRequest extends js.Object {
    /**
      * The event ID.
      */
    var EventId: EventIdType
    /**
      * The feedback token.
      */
    var FeedbackToken: TokenModelType
    /**
      * The authentication event feedback value.
      */
    var FeedbackValue: FeedbackValueType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The user pool username.
      */
    var Username: UsernameType
  }
  
  trait UpdateAuthEventFeedbackResponse extends js.Object
  
  trait UpdateDeviceStatusRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: TokenModelType
    /**
      * The device key.
      */
    var DeviceKey: DeviceKeyType
    /**
      * The status of whether a device is remembered.
      */
    var DeviceRememberedStatus: js.UndefOr[DeviceRememberedStatusType] = js.undefined
  }
  
  trait UpdateDeviceStatusResponse extends js.Object
  
  trait UpdateGroupRequest extends js.Object {
    /**
      * A string containing the new description of the group.
      */
    var Description: js.UndefOr[DescriptionType] = js.undefined
    /**
      * The name of the group.
      */
    var GroupName: GroupNameType
    /**
      * The new precedence value for the group. For more information about this parameter, see .
      */
    var Precedence: js.UndefOr[PrecedenceType] = js.undefined
    /**
      * The new role ARN for the group. This is used for setting the cognito:roles and cognito:preferred_role claims in the token.
      */
    var RoleArn: js.UndefOr[ArnType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait UpdateGroupResponse extends js.Object {
    /**
      * The group object for the group.
      */
    var Group: js.UndefOr[GroupType] = js.undefined
  }
  
  trait UpdateIdentityProviderRequest extends js.Object {
    /**
      * The identity provider attribute mapping to be changed.
      */
    var AttributeMapping: js.UndefOr[AttributeMappingType] = js.undefined
    /**
      * A list of identity provider identifiers.
      */
    var IdpIdentifiers: js.UndefOr[IdpIdentifiersListType] = js.undefined
    /**
      * The identity provider details to be updated, such as MetadataURL and MetadataFile.
      */
    var ProviderDetails: js.UndefOr[ProviderDetailsType] = js.undefined
    /**
      * The identity provider name.
      */
    var ProviderName: ProviderNameType
    /**
      * The user pool ID.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait UpdateIdentityProviderResponse extends js.Object {
    /**
      * The identity provider object.
      */
    var IdentityProvider: IdentityProviderType
  }
  
  trait UpdateResourceServerRequest extends js.Object {
    /**
      * The identifier for the resource server.
      */
    var Identifier: ResourceServerIdentifierType
    /**
      * The name of the resource server.
      */
    var Name: ResourceServerNameType
    /**
      * The scope values to be set for the resource server.
      */
    var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
    /**
      * The user pool ID for the user pool.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait UpdateResourceServerResponse extends js.Object {
    /**
      * The resource server.
      */
    var ResourceServer: ResourceServerType
  }
  
  trait UpdateUserAttributesRequest extends js.Object {
    /**
      * The access token for the request to update user attributes.
      */
    var AccessToken: TokenModelType
    /**
      * An array of name-value pairs representing user attributes. For custom attributes, you must prepend the custom: prefix to the attribute name.
      */
    var UserAttributes: AttributeListType
  }
  
  trait UpdateUserAttributesResponse extends js.Object {
    /**
      * The code delivery details list from the server for the request to update user attributes.
      */
    var CodeDeliveryDetailsList: js.UndefOr[CodeDeliveryDetailsListType] = js.undefined
  }
  
  trait UpdateUserPoolClientRequest extends js.Object {
    /**
      * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to token to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly.
      */
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
    /**
      * Set to TRUE if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
    /**
      * A list of allowed OAuth scopes. Currently supported values are "phone", "email", "openid", and "Cognito".
      */
    var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
    /**
      * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
      */
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
    /**
      * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: ClientIdType
    /**
      * The client name from the update user pool client request.
      */
    var ClientName: js.UndefOr[ClientNameType] = js.undefined
    /**
      * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
    /**
      * Explicit authentication flows.
      */
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
    /**
      * A list of allowed logout URLs for the identity providers.
      */
    var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
    /**
      * The read-only attributes of the user pool.
      */
    var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    /**
      * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
      */
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
    /**
      * A list of provider names for the identity providers that are supported on this client.
      */
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
    /**
      * The user pool ID for the user pool where you want to update the user pool client.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The writeable attributes of the user pool.
      */
    var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  }
  
  trait UpdateUserPoolClientResponse extends js.Object {
    /**
      * The user pool client value from the response from the server when an update user pool client request is made.
      */
    var UserPoolClient: js.UndefOr[UserPoolClientType] = js.undefined
  }
  
  trait UpdateUserPoolDomainRequest extends js.Object {
    /**
      * The configuration for a custom domain that hosts the sign-up and sign-in pages for your application. Use this object to specify an SSL certificate that is managed by ACM.
      */
    var CustomDomainConfig: CustomDomainConfigType
    /**
      * The domain name for the custom domain that hosts the sign-up and sign-in pages for your application. For example: auth.example.com.  This string can include only lowercase letters, numbers, and hyphens. Do not use a hyphen for the first or last character. Use periods to separate subdomain names.
      */
    var Domain: DomainType
    /**
      * The ID of the user pool that is associated with the custom domain that you are updating the certificate for.
      */
    var UserPoolId: UserPoolIdType
  }
  
  trait UpdateUserPoolDomainResponse extends js.Object {
    /**
      * The Amazon CloudFront endpoint that Amazon Cognito set up when you added the custom domain to your user pool.
      */
    var CloudFrontDomain: js.UndefOr[DomainType] = js.undefined
  }
  
  trait UpdateUserPoolRequest extends js.Object {
    /**
      * The configuration for AdminCreateUser requests.
      */
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
    /**
      * The attributes that are automatically verified when the Amazon Cognito service makes a request to update user pools.
      */
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
    /**
      * Device configuration.
      */
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
    /**
      * Email configuration.
      */
    var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
    /**
      * The contents of the email verification message.
      */
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
    /**
      * The subject of the email verification message.
      */
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
    /**
      * The AWS Lambda configuration information from the request to update the user pool.
      */
    var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
    /**
      * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * A container with the policies you wish to update in a user pool.
      */
    var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
    /**
      * The contents of the SMS authentication message.
      */
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * SMS configuration.
      */
    var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
    /**
      * A container with information about the SMS verification message.
      */
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * Used to enable advanced security risk detection. Set the key AdvancedSecurityMode to the value "AUDIT".
      */
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
    /**
      * The user pool ID for the user pool you want to update.
      */
    var UserPoolId: UserPoolIdType
    /**
      * The tag keys and values to assign to the user pool. A tag is a label that you can use to categorize and manage user pools in different ways, such as by purpose, owner, environment, or other criteria.
      */
    var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
    /**
      * The template for verification messages.
      */
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
  }
  
  trait UpdateUserPoolResponse extends js.Object
  
  trait UserContextDataType extends js.Object {
    /**
      * Contextual data such as the user's device fingerprint, IP address, or location used for evaluating the risk of an unexpected event by Amazon Cognito advanced security.
      */
    var EncodedData: js.UndefOr[StringType] = js.undefined
  }
  
  trait UserImportJobType extends js.Object {
    /**
      * The role ARN for the Amazon CloudWatch Logging role for the user import job. For more information, see "Creating the CloudWatch Logs IAM Role" in the Amazon Cognito Developer Guide.
      */
    var CloudWatchLogsRoleArn: js.UndefOr[ArnType] = js.undefined
    /**
      * The date when the user import job was completed.
      */
    var CompletionDate: js.UndefOr[DateType] = js.undefined
    /**
      * The message returned when the user import job is completed.
      */
    var CompletionMessage: js.UndefOr[CompletionMessageType] = js.undefined
    /**
      * The date the user import job was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The number of users that could not be imported.
      */
    var FailedUsers: js.UndefOr[LongType] = js.undefined
    /**
      * The number of users that were successfully imported.
      */
    var ImportedUsers: js.UndefOr[LongType] = js.undefined
    /**
      * The job ID for the user import job.
      */
    var JobId: js.UndefOr[UserImportJobIdType] = js.undefined
    /**
      * The job name for the user import job.
      */
    var JobName: js.UndefOr[UserImportJobNameType] = js.undefined
    /**
      * The pre-signed URL to be used to upload the .csv file.
      */
    var PreSignedUrl: js.UndefOr[PreSignedUrlType] = js.undefined
    /**
      * The number of users that were skipped.
      */
    var SkippedUsers: js.UndefOr[LongType] = js.undefined
    /**
      * The date when the user import job was started.
      */
    var StartDate: js.UndefOr[DateType] = js.undefined
    /**
      * The status of the user import job. One of the following:    Created - The job was created but not started.    Pending - A transition state. You have started the job, but it has not begun importing users yet.    InProgress - The job has started, and users are being imported.    Stopping - You have stopped the job, but the job has not stopped importing users yet.    Stopped - You have stopped the job, and the job has stopped importing users.    Succeeded - The job has completed successfully.    Failed - The job has stopped due to an error.    Expired - You created a job, but did not start the job within 24-48 hours. All data associated with the job was deleted, and the job cannot be started.  
      */
    var Status: js.UndefOr[UserImportJobStatusType] = js.undefined
    /**
      * The user pool ID for the user pool that the users are being imported into.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait UserPoolAddOnsType extends js.Object {
    /**
      * The advanced security mode.
      */
    var AdvancedSecurityMode: AdvancedSecurityModeType
  }
  
  trait UserPoolClientDescription extends js.Object {
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The client name from the user pool client description.
      */
    var ClientName: js.UndefOr[ClientNameType] = js.undefined
    /**
      * The user pool ID for the user pool where you want to describe the user pool client.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
  }
  
  trait UserPoolClientType extends js.Object {
    /**
      * Set to code to initiate a code grant flow, which provides an authorization code as the response. This code can be exchanged for access tokens with the token endpoint. Set to token to specify that the client should get the access token (and, optionally, ID token, based on scopes) directly.
      */
    var AllowedOAuthFlows: js.UndefOr[OAuthFlowsType] = js.undefined
    /**
      * Set to TRUE if the client is allowed to follow the OAuth protocol when interacting with Cognito user pools.
      */
    var AllowedOAuthFlowsUserPoolClient: js.UndefOr[BooleanType] = js.undefined
    /**
      * A list of allowed OAuth scopes. Currently supported values are "phone", "email", "openid", and "Cognito".
      */
    var AllowedOAuthScopes: js.UndefOr[ScopeListType] = js.undefined
    /**
      * The Amazon Pinpoint analytics configuration for the user pool client.
      */
    var AnalyticsConfiguration: js.UndefOr[AnalyticsConfigurationType] = js.undefined
    /**
      * A list of allowed redirect (callback) URLs for the identity providers. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var CallbackURLs: js.UndefOr[CallbackURLsListType] = js.undefined
    /**
      * The ID of the client associated with the user pool.
      */
    var ClientId: js.UndefOr[ClientIdType] = js.undefined
    /**
      * The client name from the user pool request of the client type.
      */
    var ClientName: js.UndefOr[ClientNameType] = js.undefined
    /**
      * The client secret from the user pool request of the client type.
      */
    var ClientSecret: js.UndefOr[ClientSecretType] = js.undefined
    /**
      * The date the user pool client was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The default redirect URI. Must be in the CallbackURLs list. A redirect URI must:   Be an absolute URI.   Be registered with the authorization server.   Not include a fragment component.   See OAuth 2.0 - Redirection Endpoint. Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only. App callback URLs such as myapp://example are also supported.
      */
    var DefaultRedirectURI: js.UndefOr[RedirectUrlType] = js.undefined
    /**
      * The explicit authentication flows.
      */
    var ExplicitAuthFlows: js.UndefOr[ExplicitAuthFlowsListType] = js.undefined
    /**
      * The date the user pool client was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * A list of allowed logout URLs for the identity providers.
      */
    var LogoutURLs: js.UndefOr[LogoutURLsListType] = js.undefined
    /**
      * The Read-only attributes.
      */
    var ReadAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
    /**
      * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
      */
    var RefreshTokenValidity: js.UndefOr[RefreshTokenValidityType] = js.undefined
    /**
      * A list of provider names for the identity providers that are supported on this client.
      */
    var SupportedIdentityProviders: js.UndefOr[SupportedIdentityProvidersListType] = js.undefined
    /**
      * The user pool ID for the user pool client.
      */
    var UserPoolId: js.UndefOr[UserPoolIdType] = js.undefined
    /**
      * The writeable attributes.
      */
    var WriteAttributes: js.UndefOr[ClientPermissionListType] = js.undefined
  }
  
  trait UserPoolDescriptionType extends js.Object {
    /**
      * The date the user pool description was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * The ID in a user pool description.
      */
    var Id: js.UndefOr[UserPoolIdType] = js.undefined
    /**
      * The AWS Lambda configuration information in a user pool description.
      */
    var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
    /**
      * The date the user pool description was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The name in a user pool description.
      */
    var Name: js.UndefOr[UserPoolNameType] = js.undefined
    /**
      * The user pool status in a user pool description.
      */
    var Status: js.UndefOr[StatusType] = js.undefined
  }
  
  trait UserPoolPolicyType extends js.Object {
    /**
      * The password policy.
      */
    var PasswordPolicy: js.UndefOr[PasswordPolicyType] = js.undefined
  }
  
  trait UserPoolTagsType
    extends /* key */ org.scalablytyped.runtime.StringDictionary[TagValueType]
  
  trait UserPoolType extends js.Object {
    /**
      * The configuration for AdminCreateUser requests.
      */
    var AdminCreateUserConfig: js.UndefOr[AdminCreateUserConfigType] = js.undefined
    /**
      * Specifies the attributes that are aliased in a user pool.
      */
    var AliasAttributes: js.UndefOr[AliasAttributesListType] = js.undefined
    /**
      * The Amazon Resource Name (ARN) for the user pool.
      */
    var Arn: js.UndefOr[ArnType] = js.undefined
    /**
      * Specifies the attributes that are auto-verified in a user pool.
      */
    var AutoVerifiedAttributes: js.UndefOr[VerifiedAttributesListType] = js.undefined
    /**
      * The date the user pool was created.
      */
    var CreationDate: js.UndefOr[DateType] = js.undefined
    /**
      * A custom domain name that you provide to Amazon Cognito. This parameter applies only if you use a custom domain to host the sign-up and sign-in pages for your application. For example: auth.example.com. For more information about adding a custom domain to your user pool, see Using Your Own Domain for the Hosted UI.
      */
    var CustomDomain: js.UndefOr[DomainType] = js.undefined
    /**
      * The device configuration.
      */
    var DeviceConfiguration: js.UndefOr[DeviceConfigurationType] = js.undefined
    /**
      * Holds the domain prefix if the user pool has a domain associated with it.
      */
    var Domain: js.UndefOr[DomainType] = js.undefined
    /**
      * The email configuration.
      */
    var EmailConfiguration: js.UndefOr[EmailConfigurationType] = js.undefined
    /**
      * The reason why the email configuration cannot send the messages to your users.
      */
    var EmailConfigurationFailure: js.UndefOr[StringType] = js.undefined
    /**
      * The contents of the email verification message.
      */
    var EmailVerificationMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
    /**
      * The subject of the email verification message.
      */
    var EmailVerificationSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
    /**
      * A number estimating the size of the user pool.
      */
    var EstimatedNumberOfUsers: js.UndefOr[IntegerType] = js.undefined
    /**
      * The ID of the user pool.
      */
    var Id: js.UndefOr[UserPoolIdType] = js.undefined
    /**
      * The AWS Lambda triggers associated with the user pool.
      */
    var LambdaConfig: js.UndefOr[LambdaConfigType] = js.undefined
    /**
      * The date the user pool was last modified.
      */
    var LastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * Can be one of the following values:    OFF - MFA tokens are not required and cannot be specified during user registration.    ON - MFA tokens are required for all user registrations. You can only specify required when you are initially creating a user pool.    OPTIONAL - Users have the option when registering to create an MFA token.  
      */
    var MfaConfiguration: js.UndefOr[UserPoolMfaType] = js.undefined
    /**
      * The name of the user pool.
      */
    var Name: js.UndefOr[UserPoolNameType] = js.undefined
    /**
      * The policies associated with the user pool.
      */
    var Policies: js.UndefOr[UserPoolPolicyType] = js.undefined
    /**
      * A container with the schema attributes of a user pool.
      */
    var SchemaAttributes: js.UndefOr[SchemaAttributesListType] = js.undefined
    /**
      * The contents of the SMS authentication message.
      */
    var SmsAuthenticationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * The SMS configuration.
      */
    var SmsConfiguration: js.UndefOr[SmsConfigurationType] = js.undefined
    /**
      * The reason why the SMS configuration cannot send the messages to your users.
      */
    var SmsConfigurationFailure: js.UndefOr[StringType] = js.undefined
    /**
      * The contents of the SMS verification message.
      */
    var SmsVerificationMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
    /**
      * The status of a user pool.
      */
    var Status: js.UndefOr[StatusType] = js.undefined
    /**
      * The user pool add-ons.
      */
    var UserPoolAddOns: js.UndefOr[UserPoolAddOnsType] = js.undefined
    /**
      * The tags that are assigned to the user pool. A tag is a label that you can apply to user pools to categorize and manage them in different ways, such as by purpose, owner, environment, or other criteria.
      */
    var UserPoolTags: js.UndefOr[UserPoolTagsType] = js.undefined
    /**
      * Specifies whether email addresses or phone numbers can be specified as usernames when a user signs up.
      */
    var UsernameAttributes: js.UndefOr[UsernameAttributesListType] = js.undefined
    /**
      * The template for verification messages.
      */
    var VerificationMessageTemplate: js.UndefOr[VerificationMessageTemplateType] = js.undefined
  }
  
  trait UserType extends js.Object {
    /**
      * A container with information about the user type attributes.
      */
    var Attributes: js.UndefOr[AttributeListType] = js.undefined
    /**
      * Specifies whether the user is enabled.
      */
    var Enabled: js.UndefOr[BooleanType] = js.undefined
    /**
      * The MFA options for the user.
      */
    var MFAOptions: js.UndefOr[MFAOptionListType] = js.undefined
    /**
      * The creation date of the user.
      */
    var UserCreateDate: js.UndefOr[DateType] = js.undefined
    /**
      * The last modified date of the user.
      */
    var UserLastModifiedDate: js.UndefOr[DateType] = js.undefined
    /**
      * The user status. Can be one of the following:   UNCONFIRMED - User has been created but not confirmed.   CONFIRMED - User has been confirmed.   ARCHIVED - User is no longer active.   COMPROMISED - User is disabled due to a potential security threat.   UNKNOWN - User status is not known.  
      */
    var UserStatus: js.UndefOr[UserStatusType] = js.undefined
    /**
      * The user name of the user you wish to describe.
      */
    var Username: js.UndefOr[UsernameType] = js.undefined
  }
  
  trait VerificationMessageTemplateType extends js.Object {
    /**
      * The default email option.
      */
    var DefaultEmailOption: js.UndefOr[DefaultEmailOptionType] = js.undefined
    /**
      * The email message template.
      */
    var EmailMessage: js.UndefOr[EmailVerificationMessageType] = js.undefined
    /**
      * The email message template for sending a confirmation link to the user.
      */
    var EmailMessageByLink: js.UndefOr[EmailVerificationMessageByLinkType] = js.undefined
    /**
      * The subject line for the email message template.
      */
    var EmailSubject: js.UndefOr[EmailVerificationSubjectType] = js.undefined
    /**
      * The subject line for the email message template for sending a confirmation link to the user.
      */
    var EmailSubjectByLink: js.UndefOr[EmailVerificationSubjectByLinkType] = js.undefined
    /**
      * The SMS message template.
      */
    var SmsMessage: js.UndefOr[SmsVerificationMessageType] = js.undefined
  }
  
  trait VerifySoftwareTokenRequest extends js.Object {
    /**
      * The access token.
      */
    var AccessToken: js.UndefOr[TokenModelType] = js.undefined
    /**
      * The friendly device name.
      */
    var FriendlyDeviceName: js.UndefOr[StringType] = js.undefined
    /**
      * The session which should be passed both ways in challenge-response calls to the service.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
    /**
      * The one time password computed using the secret code returned by 
      */
    var UserCode: SoftwareTokenMFAUserCodeType
  }
  
  trait VerifySoftwareTokenResponse extends js.Object {
    /**
      * The session which should be passed both ways in challenge-response calls to the service.
      */
    var Session: js.UndefOr[SessionType] = js.undefined
    /**
      * The status of the verify software token.
      */
    var Status: js.UndefOr[VerifySoftwareTokenResponseType] = js.undefined
  }
  
  trait VerifyUserAttributeRequest extends js.Object {
    /**
      * Represents the access token of the request to verify user attributes.
      */
    var AccessToken: TokenModelType
    /**
      * The attribute name in the request to verify user attributes.
      */
    var AttributeName: AttributeNameType
    /**
      * The verification code in the request to verify user attributes.
      */
    var Code: ConfirmationCodeType
  }
  
  trait VerifyUserAttributeResponse extends js.Object
  
  trait _AccountTakeoverEventActionType extends js.Object
  
  trait _AdvancedSecurityModeType extends js.Object
  
  trait _AliasAttributeType extends js.Object
  
  trait _AttributeDataType extends js.Object
  
  trait _AuthFlowType extends js.Object
  
  trait _ChallengeName extends js.Object
  
  trait _ChallengeNameType extends js.Object
  
  trait _ChallengeResponse extends js.Object
  
  trait _CompromisedCredentialsEventActionType extends js.Object
  
  trait _DefaultEmailOptionType extends js.Object
  
  trait _DeliveryMediumType extends js.Object
  
  trait _DeviceRememberedStatusType extends js.Object
  
  trait _DomainStatusType extends js.Object
  
  trait _EventFilterType extends js.Object
  
  trait _EventResponseType extends js.Object
  
  trait _EventType extends js.Object
  
  trait _ExplicitAuthFlowsType extends js.Object
  
  trait _FeedbackValueType extends js.Object
  
  trait _IdentityProviderTypeType extends js.Object
  
  trait _MessageActionType extends js.Object
  
  trait _OAuthFlowType extends js.Object
  
  trait _RiskDecisionType extends js.Object
  
  trait _RiskLevelType extends js.Object
  
  trait _StatusType extends js.Object
  
  trait _UserImportJobStatusType extends js.Object
  
  trait _UserPoolMfaType extends js.Object
  
  trait _UserStatusType extends js.Object
  
  trait _UsernameAttributeType extends js.Object
  
  trait _VerifiedAttributeType extends js.Object
  
  trait _VerifySoftwareTokenResponseType extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type AWSAccountIdType = java.lang.String
  type AccountTakeoverActionNotifyType = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BLOCK
    - awsDashSdkLib.awsDashSdkLibStrings.MFA_IF_CONFIGURED
    - awsDashSdkLib.awsDashSdkLibStrings.MFA_REQUIRED
    - awsDashSdkLib.awsDashSdkLibStrings.NO_ACTION
    - java.lang.String
  */
  type AccountTakeoverEventActionType = _AccountTakeoverEventActionType | java.lang.String
  type AdminCreateUserUnusedAccountValidityDaysType = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.AUDIT
    - awsDashSdkLib.awsDashSdkLibStrings.ENFORCED
    - java.lang.String
  */
  type AdvancedSecurityModeType = _AdvancedSecurityModeType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.phone_number
    - awsDashSdkLib.awsDashSdkLibStrings.email
    - awsDashSdkLib.awsDashSdkLibStrings.preferred_username
    - java.lang.String
  */
  type AliasAttributeType = _AliasAttributeType | java.lang.String
  type AliasAttributesListType = js.Array[AliasAttributeType]
  type ArnType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.String
    - awsDashSdkLib.awsDashSdkLibStrings.Number
    - awsDashSdkLib.awsDashSdkLibStrings.DateTime
    - awsDashSdkLib.awsDashSdkLibStrings.Boolean
    - java.lang.String
  */
  type AttributeDataType = _AttributeDataType | java.lang.String
  type AttributeListType = js.Array[AttributeType]
  type AttributeMappingKeyType = java.lang.String
  type AttributeNameListType = js.Array[AttributeNameType]
  type AttributeNameType = java.lang.String
  type AttributeValueType = java.lang.String
  type AuthEventsType = js.Array[AuthEventType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.USER_SRP_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.REFRESH_TOKEN_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.REFRESH_TOKEN
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_NO_SRP_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.USER_PASSWORD_AUTH
    - java.lang.String
  */
  type AuthFlowType = _AuthFlowType | java.lang.String
  type BlockedIPRangeListType = js.Array[StringType]
  type BooleanType = scala.Boolean
  type CSSType = java.lang.String
  type CSSVersionType = java.lang.String
  type CallbackURLsListType = js.Array[RedirectUrlType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Password
    - awsDashSdkLib.awsDashSdkLibStrings.Mfa
    - java.lang.String
  */
  type ChallengeName = _ChallengeName | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SMS_MFA
    - awsDashSdkLib.awsDashSdkLibStrings.SOFTWARE_TOKEN_MFA
    - awsDashSdkLib.awsDashSdkLibStrings.SELECT_MFA_TYPE
    - awsDashSdkLib.awsDashSdkLibStrings.MFA_SETUP
    - awsDashSdkLib.awsDashSdkLibStrings.PASSWORD_VERIFIER
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM_CHALLENGE
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_SRP_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.DEVICE_PASSWORD_VERIFIER
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_NO_SRP_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.NEW_PASSWORD_REQUIRED
    - java.lang.String
  */
  type ChallengeNameType = _ChallengeNameType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failure
    - java.lang.String
  */
  type ChallengeResponse = _ChallengeResponse | java.lang.String
  type ChallengeResponseListType = js.Array[ChallengeResponseType]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientIdType = java.lang.String
  type ClientNameType = java.lang.String
  type ClientPermissionListType = js.Array[ClientPermissionType]
  type ClientPermissionType = java.lang.String
  type ClientSecretType = java.lang.String
  type CodeDeliveryDetailsListType = js.Array[CodeDeliveryDetailsType]
  type CompletionMessageType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BLOCK
    - awsDashSdkLib.awsDashSdkLibStrings.NO_ACTION
    - java.lang.String
  */
  type CompromisedCredentialsEventActionType = _CompromisedCredentialsEventActionType | java.lang.String
  type ConfirmationCodeType = java.lang.String
  type CustomAttributeNameType = java.lang.String
  type CustomAttributesListType = js.Array[SchemaAttributeType]
  type DateType = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIRM_WITH_LINK
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIRM_WITH_CODE
    - java.lang.String
  */
  type DefaultEmailOptionType = _DefaultEmailOptionType | java.lang.String
  type DeliveryMediumListType = js.Array[DeliveryMediumType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SMS
    - awsDashSdkLib.awsDashSdkLibStrings.EMAIL
    - java.lang.String
  */
  type DeliveryMediumType = _DeliveryMediumType | java.lang.String
  type DescriptionType = java.lang.String
  type DeviceKeyType = java.lang.String
  type DeviceListType = js.Array[DeviceType]
  type DeviceNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.remembered
    - awsDashSdkLib.awsDashSdkLibStrings.not_remembered
    - java.lang.String
  */
  type DeviceRememberedStatusType = _DeviceRememberedStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.CREATING
    - awsDashSdkLib.awsDashSdkLibStrings.DELETING
    - awsDashSdkLib.awsDashSdkLibStrings.UPDATING
    - awsDashSdkLib.awsDashSdkLibStrings.ACTIVE
    - awsDashSdkLib.awsDashSdkLibStrings.FAILED
    - java.lang.String
  */
  type DomainStatusType = _DomainStatusType | java.lang.String
  type DomainType = java.lang.String
  type DomainVersionType = java.lang.String
  type EmailAddressType = java.lang.String
  type EmailNotificationBodyType = java.lang.String
  type EmailNotificationSubjectType = java.lang.String
  type EmailVerificationMessageByLinkType = java.lang.String
  type EmailVerificationMessageType = java.lang.String
  type EmailVerificationSubjectByLinkType = java.lang.String
  type EmailVerificationSubjectType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SIGN_IN
    - awsDashSdkLib.awsDashSdkLibStrings.PASSWORD_CHANGE
    - awsDashSdkLib.awsDashSdkLibStrings.SIGN_UP
    - java.lang.String
  */
  type EventFilterType = _EventFilterType | java.lang.String
  type EventFiltersType = js.Array[EventFilterType]
  type EventIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failure
    - java.lang.String
  */
  type EventResponseType = _EventResponseType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SignIn
    - awsDashSdkLib.awsDashSdkLibStrings.SignUp
    - awsDashSdkLib.awsDashSdkLibStrings.ForgotPassword
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.ADMIN_NO_SRP_AUTH
    - awsDashSdkLib.awsDashSdkLibStrings.CUSTOM_AUTH_FLOW_ONLY
    - awsDashSdkLib.awsDashSdkLibStrings.USER_PASSWORD_AUTH
    - java.lang.String
  */
  type ExplicitAuthFlowsType = _ExplicitAuthFlowsType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Valid
    - awsDashSdkLib.awsDashSdkLibStrings.Invalid
    - java.lang.String
  */
  type FeedbackValueType = _FeedbackValueType | java.lang.String
  type ForceAliasCreation = scala.Boolean
  type GenerateSecret = scala.Boolean
  type GroupListType = js.Array[GroupType]
  type GroupNameType = java.lang.String
  type HexStringType = java.lang.String
  type HttpHeaderList = js.Array[HttpHeader]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SAML
    - awsDashSdkLib.awsDashSdkLibStrings.Facebook
    - awsDashSdkLib.awsDashSdkLibStrings.Google
    - awsDashSdkLib.awsDashSdkLibStrings.LoginWithAmazon
    - awsDashSdkLib.awsDashSdkLibStrings.OIDC
    - java.lang.String
  */
  type IdentityProviderTypeType = _IdentityProviderTypeType | java.lang.String
  type IdpIdentifierType = java.lang.String
  type IdpIdentifiersListType = js.Array[IdpIdentifierType]
  type ImageFileType = nodeLib.Buffer | stdLib.Uint8Array | awsDashSdkLib.clientsCognitoidentityserviceproviderMod.Blob | java.lang.String
  type ImageUrlType = java.lang.String
  type IntegerType = scala.Double
  type ListOfStringTypes = js.Array[StringType]
  type ListProvidersLimitType = scala.Double
  type ListResourceServersLimitType = scala.Double
  type LogoutURLsListType = js.Array[RedirectUrlType]
  type LongType = scala.Double
  type MFAOptionListType = js.Array[MFAOptionType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.RESEND
    - awsDashSdkLib.awsDashSdkLibStrings.SUPPRESS
    - java.lang.String
  */
  type MessageActionType = _MessageActionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.code
    - awsDashSdkLib.awsDashSdkLibStrings.`implicit`
    - awsDashSdkLib.awsDashSdkLibStrings.client_credentials
    - java.lang.String
  */
  type OAuthFlowType = _OAuthFlowType | java.lang.String
  type OAuthFlowsType = js.Array[OAuthFlowType]
  type PaginationKey = java.lang.String
  type PaginationKeyType = java.lang.String
  type PasswordPolicyMinLengthType = scala.Double
  type PasswordType = java.lang.String
  type PoolQueryLimitType = scala.Double
  type PreSignedUrlType = java.lang.String
  type PrecedenceType = scala.Double
  type ProviderNameType = java.lang.String
  type ProviderNameTypeV1 = java.lang.String
  type ProvidersListType = js.Array[ProviderDescription]
  type QueryLimit = scala.Double
  type QueryLimitType = scala.Double
  type RedirectUrlType = java.lang.String
  type RefreshTokenValidityType = scala.Double
  type ResourceServerIdentifierType = java.lang.String
  type ResourceServerNameType = java.lang.String
  type ResourceServerScopeDescriptionType = java.lang.String
  type ResourceServerScopeListType = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType = java.lang.String
  type ResourceServersListType = js.Array[ResourceServerType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NoRisk
    - awsDashSdkLib.awsDashSdkLibStrings.AccountTakeover
    - awsDashSdkLib.awsDashSdkLibStrings.Block
    - java.lang.String
  */
  type RiskDecisionType = _RiskDecisionType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Low
    - awsDashSdkLib.awsDashSdkLibStrings.Medium
    - awsDashSdkLib.awsDashSdkLibStrings.High
    - java.lang.String
  */
  type RiskLevelType = _RiskLevelType | java.lang.String
  type S3BucketType = java.lang.String
  type SchemaAttributesListType = js.Array[SchemaAttributeType]
  type ScopeListType = js.Array[ScopeType]
  type ScopeType = java.lang.String
  type SearchPaginationTokenType = java.lang.String
  type SearchedAttributeNamesListType = js.Array[AttributeNameType]
  type SecretCodeType = java.lang.String
  type SecretHashType = java.lang.String
  type SessionType = java.lang.String
  type SkippedIPRangeListType = js.Array[StringType]
  type SmsVerificationMessageType = java.lang.String
  type SoftwareTokenMFAUserCodeType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Enabled
    - awsDashSdkLib.awsDashSdkLibStrings.Disabled
    - java.lang.String
  */
  type StatusType = _StatusType | java.lang.String
  type StringType = java.lang.String
  type SupportedIdentityProvidersListType = js.Array[ProviderNameType]
  type TagKeysType = java.lang.String
  type TagValueType = java.lang.String
  type TokenModelType = java.lang.String
  type UserFilterType = java.lang.String
  type UserImportJobIdType = java.lang.String
  type UserImportJobNameType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Created
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.InProgress
    - awsDashSdkLib.awsDashSdkLibStrings.Stopping
    - awsDashSdkLib.awsDashSdkLibStrings.Expired
    - awsDashSdkLib.awsDashSdkLibStrings.Stopped
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - java.lang.String
  */
  type UserImportJobStatusType = _UserImportJobStatusType | java.lang.String
  type UserImportJobsListType = js.Array[UserImportJobType]
  type UserMFASettingListType = js.Array[StringType]
  type UserPoolClientListType = js.Array[UserPoolClientDescription]
  type UserPoolIdType = java.lang.String
  type UserPoolListType = js.Array[UserPoolDescriptionType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.OFF
    - awsDashSdkLib.awsDashSdkLibStrings.ON
    - awsDashSdkLib.awsDashSdkLibStrings.OPTIONAL
    - java.lang.String
  */
  type UserPoolMfaType = _UserPoolMfaType | java.lang.String
  type UserPoolNameType = java.lang.String
  type UserPoolTagsListType = js.Array[TagKeysType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.UNCONFIRMED
    - awsDashSdkLib.awsDashSdkLibStrings.CONFIRMED
    - awsDashSdkLib.awsDashSdkLibStrings.ARCHIVED
    - awsDashSdkLib.awsDashSdkLibStrings.COMPROMISED
    - awsDashSdkLib.awsDashSdkLibStrings.UNKNOWN
    - awsDashSdkLib.awsDashSdkLibStrings.RESET_REQUIRED
    - awsDashSdkLib.awsDashSdkLibStrings.FORCE_CHANGE_PASSWORD
    - java.lang.String
  */
  type UserStatusType = _UserStatusType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.phone_number
    - awsDashSdkLib.awsDashSdkLibStrings.email
    - java.lang.String
  */
  type UsernameAttributeType = _UsernameAttributeType | java.lang.String
  type UsernameAttributesListType = js.Array[UsernameAttributeType]
  type UsernameType = java.lang.String
  type UsersListType = js.Array[UserType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.phone_number
    - awsDashSdkLib.awsDashSdkLibStrings.email
    - java.lang.String
  */
  type VerifiedAttributeType = _VerifiedAttributeType | java.lang.String
  type VerifiedAttributesListType = js.Array[VerifiedAttributeType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SUCCESS
    - awsDashSdkLib.awsDashSdkLibStrings.ERROR
    - java.lang.String
  */
  type VerifySoftwareTokenResponseType = _VerifySoftwareTokenResponseType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2016-04-18`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}

