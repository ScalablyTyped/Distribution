package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitoidentityserviceproviderMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.node.Buffer
  import typings.std.Date
  import typings.std.Uint8Array

  type AWSAccountIdType = String
  type AccountTakeoverActionNotifyType = Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLOCK
    - typings.awsDashSdk.awsDashSdkStrings.MFA_IF_CONFIGURED
    - typings.awsDashSdk.awsDashSdkStrings.MFA_REQUIRED
    - typings.awsDashSdk.awsDashSdkStrings.NO_ACTION
    - java.lang.String
  */
  type AccountTakeoverEventActionType = _AccountTakeoverEventActionType | String
  type AdminCreateUserUnusedAccountValidityDaysType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.AUDIT
    - typings.awsDashSdk.awsDashSdkStrings.ENFORCED
    - java.lang.String
  */
  type AdvancedSecurityModeType = _AdvancedSecurityModeType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.phone_number
    - typings.awsDashSdk.awsDashSdkStrings.email__
    - typings.awsDashSdk.awsDashSdkStrings.preferred_username
    - java.lang.String
  */
  type AliasAttributeType = _AliasAttributeType | String
  type AliasAttributesListType = js.Array[AliasAttributeType]
  type ArnType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.String_
    - typings.awsDashSdk.awsDashSdkStrings.Number_
    - typings.awsDashSdk.awsDashSdkStrings.DateTime_
    - typings.awsDashSdk.awsDashSdkStrings.Boolean_
    - java.lang.String
  */
  type AttributeDataType = _AttributeDataType | String
  type AttributeListType = js.Array[AttributeType]
  type AttributeMappingKeyType = String
  type AttributeMappingType = StringDictionary[StringType]
  type AttributeNameListType = js.Array[AttributeNameType]
  type AttributeNameType = String
  type AttributeValueType = String
  type AuthEventsType = js.Array[AuthEventType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.USER_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.REFRESH_TOKEN_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.REFRESH_TOKEN
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_NO_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.USER_PASSWORD_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_USER_PASSWORD_AUTH
    - java.lang.String
  */
  type AuthFlowType = _AuthFlowType | String
  type AuthParametersType = StringDictionary[StringType]
  type BlockedIPRangeListType = js.Array[StringType]
  type BooleanType = Boolean
  type CSSType = String
  type CSSVersionType = String
  type CallbackURLsListType = js.Array[RedirectUrlType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Password_
    - typings.awsDashSdk.awsDashSdkStrings.Mfa
    - java.lang.String
  */
  type ChallengeName = _ChallengeName | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SMS_MFA
    - typings.awsDashSdk.awsDashSdkStrings.SOFTWARE_TOKEN_MFA
    - typings.awsDashSdk.awsDashSdkStrings.SELECT_MFA_TYPE
    - typings.awsDashSdk.awsDashSdkStrings.MFA_SETUP
    - typings.awsDashSdk.awsDashSdkStrings.PASSWORD_VERIFIER
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_CHALLENGE
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.DEVICE_PASSWORD_VERIFIER
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_NO_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.NEW_PASSWORD_REQUIRED
    - java.lang.String
  */
  type ChallengeNameType = _ChallengeNameType | String
  type ChallengeParametersType = StringDictionary[StringType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.Failure_
    - java.lang.String
  */
  type ChallengeResponse = _ChallengeResponse | String
  type ChallengeResponseListType = js.Array[ChallengeResponseType]
  type ChallengeResponsesType = StringDictionary[StringType]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientIdType = String
  type ClientMetadataType = StringDictionary[StringType]
  type ClientNameType = String
  type ClientPermissionListType = js.Array[ClientPermissionType]
  type ClientPermissionType = String
  type ClientSecretType = String
  type CodeDeliveryDetailsListType = js.Array[CodeDeliveryDetailsType]
  type CompletionMessageType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BLOCK
    - typings.awsDashSdk.awsDashSdkStrings.NO_ACTION
    - java.lang.String
  */
  type CompromisedCredentialsEventActionType = _CompromisedCredentialsEventActionType | String
  type ConfirmationCodeType = String
  type CustomAttributeNameType = String
  type CustomAttributesListType = js.Array[SchemaAttributeType]
  type DateType = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CONFIRM_WITH_LINK
    - typings.awsDashSdk.awsDashSdkStrings.CONFIRM_WITH_CODE
    - java.lang.String
  */
  type DefaultEmailOptionType = _DefaultEmailOptionType | String
  type DeliveryMediumListType = js.Array[DeliveryMediumType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SMS
    - typings.awsDashSdk.awsDashSdkStrings.EMAIL
    - java.lang.String
  */
  type DeliveryMediumType = _DeliveryMediumType | String
  type DescriptionType = String
  type DeviceKeyType = String
  type DeviceListType = js.Array[DeviceType]
  type DeviceNameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.remembered
    - typings.awsDashSdk.awsDashSdkStrings.not_remembered
    - java.lang.String
  */
  type DeviceRememberedStatusType = _DeviceRememberedStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.CREATING
    - typings.awsDashSdk.awsDashSdkStrings.DELETING
    - typings.awsDashSdk.awsDashSdkStrings.UPDATING
    - typings.awsDashSdk.awsDashSdkStrings.ACTIVE
    - typings.awsDashSdk.awsDashSdkStrings.FAILED
    - java.lang.String
  */
  type DomainStatusType = _DomainStatusType | String
  type DomainType = String
  type DomainVersionType = String
  type EmailAddressType = String
  type EmailNotificationBodyType = String
  type EmailNotificationSubjectType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.COGNITO_DEFAULT
    - typings.awsDashSdk.awsDashSdkStrings.DEVELOPER
    - java.lang.String
  */
  type EmailSendingAccountType = _EmailSendingAccountType | String
  type EmailVerificationMessageByLinkType = String
  type EmailVerificationMessageType = String
  type EmailVerificationSubjectByLinkType = String
  type EmailVerificationSubjectType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SIGN_IN
    - typings.awsDashSdk.awsDashSdkStrings.PASSWORD_CHANGE
    - typings.awsDashSdk.awsDashSdkStrings.SIGN_UP
    - java.lang.String
  */
  type EventFilterType = _EventFilterType | String
  type EventFiltersType = js.Array[EventFilterType]
  type EventIdType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Success_
    - typings.awsDashSdk.awsDashSdkStrings.Failure_
    - java.lang.String
  */
  type EventResponseType = _EventResponseType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SignIn
    - typings.awsDashSdk.awsDashSdkStrings.SignUp
    - typings.awsDashSdk.awsDashSdkStrings.ForgotPassword
    - java.lang.String
  */
  type EventType = _EventType | String
  type ExplicitAuthFlowsListType = js.Array[ExplicitAuthFlowsType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.ADMIN_NO_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.CUSTOM_AUTH_FLOW_ONLY
    - typings.awsDashSdk.awsDashSdkStrings.USER_PASSWORD_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_ADMIN_USER_PASSWORD_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_CUSTOM_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_USER_PASSWORD_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_USER_SRP_AUTH
    - typings.awsDashSdk.awsDashSdkStrings.ALLOW_REFRESH_TOKEN_AUTH
    - java.lang.String
  */
  type ExplicitAuthFlowsType = _ExplicitAuthFlowsType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Valid_
    - typings.awsDashSdk.awsDashSdkStrings.Invalid_
    - java.lang.String
  */
  type FeedbackValueType = _FeedbackValueType | String
  type ForceAliasCreation = Boolean
  type GenerateSecret = Boolean
  type GroupListType = js.Array[GroupType]
  type GroupNameType = String
  type HexStringType = String
  type HttpHeaderList = js.Array[HttpHeader]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SAML
    - typings.awsDashSdk.awsDashSdkStrings.Facebook
    - typings.awsDashSdk.awsDashSdkStrings.Google
    - typings.awsDashSdk.awsDashSdkStrings.LoginWithAmazon
    - typings.awsDashSdk.awsDashSdkStrings.SignInWithApple
    - typings.awsDashSdk.awsDashSdkStrings.OIDC
    - java.lang.String
  */
  type IdentityProviderTypeType = _IdentityProviderTypeType | String
  type IdpIdentifierType = String
  type IdpIdentifiersListType = js.Array[IdpIdentifierType]
  type ImageFileType = Buffer | Uint8Array | Blob | String
  type ImageUrlType = String
  type IntegerType = Double
  type ListOfStringTypes = js.Array[StringType]
  type ListProvidersLimitType = Double
  type ListResourceServersLimitType = Double
  type LogoutURLsListType = js.Array[RedirectUrlType]
  type LongType = Double
  type MFAOptionListType = js.Array[MFAOptionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.RESEND
    - typings.awsDashSdk.awsDashSdkStrings.SUPPRESS
    - java.lang.String
  */
  type MessageActionType = _MessageActionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.code
    - typings.awsDashSdk.awsDashSdkStrings.`implicit`
    - typings.awsDashSdk.awsDashSdkStrings.client_credentials
    - java.lang.String
  */
  type OAuthFlowType = _OAuthFlowType | String
  type OAuthFlowsType = js.Array[OAuthFlowType]
  type PaginationKey = String
  type PaginationKeyType = String
  type PasswordPolicyMinLengthType = Double
  type PasswordType = String
  type PoolQueryLimitType = Double
  type PreSignedUrlType = String
  type PrecedenceType = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LEGACY
    - typings.awsDashSdk.awsDashSdkStrings.ENABLED
    - java.lang.String
  */
  type PreventUserExistenceErrorTypes = _PreventUserExistenceErrorTypes | String
  type PriorityType = Double
  type ProviderDetailsType = StringDictionary[StringType]
  type ProviderNameType = String
  type ProviderNameTypeV1 = String
  type ProvidersListType = js.Array[ProviderDescription]
  type QueryLimit = Double
  type QueryLimitType = Double
  type RecoveryMechanismsType = js.Array[RecoveryOptionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.verified_email
    - typings.awsDashSdk.awsDashSdkStrings.verified_phone_number
    - typings.awsDashSdk.awsDashSdkStrings.admin_only
    - java.lang.String
  */
  type RecoveryOptionNameType = _RecoveryOptionNameType | String
  type RedirectUrlType = String
  type RefreshTokenValidityType = Double
  type ResourceServerIdentifierType = String
  type ResourceServerNameType = String
  type ResourceServerScopeDescriptionType = String
  type ResourceServerScopeListType = js.Array[ResourceServerScopeType]
  type ResourceServerScopeNameType = String
  type ResourceServersListType = js.Array[ResourceServerType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NoRisk
    - typings.awsDashSdk.awsDashSdkStrings.AccountTakeover
    - typings.awsDashSdk.awsDashSdkStrings.Block_
    - java.lang.String
  */
  type RiskDecisionType = _RiskDecisionType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Low_
    - typings.awsDashSdk.awsDashSdkStrings.Medium_
    - typings.awsDashSdk.awsDashSdkStrings.High_
    - java.lang.String
  */
  type RiskLevelType = _RiskLevelType | String
  type S3BucketType = String
  type SESConfigurationSet = String
  type SchemaAttributesListType = js.Array[SchemaAttributeType]
  type ScopeListType = js.Array[ScopeType]
  type ScopeType = String
  type SearchPaginationTokenType = String
  type SearchedAttributeNamesListType = js.Array[AttributeNameType]
  type SecretCodeType = String
  type SecretHashType = String
  type SessionType = String
  type SkippedIPRangeListType = js.Array[StringType]
  type SmsVerificationMessageType = String
  type SoftwareTokenMFAUserCodeType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Enabled_
    - typings.awsDashSdk.awsDashSdkStrings.Disabled_
    - java.lang.String
  */
  type StatusType = _StatusType | String
  type StringType = String
  type SupportedIdentityProvidersListType = js.Array[ProviderNameType]
  type TagKeysType = String
  type TagValueType = String
  type TemporaryPasswordValidityDaysType = Double
  type TokenModelType = String
  type UserFilterType = String
  type UserImportJobIdType = String
  type UserImportJobNameType = String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Created_
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.InProgress_
    - typings.awsDashSdk.awsDashSdkStrings.Stopping_
    - typings.awsDashSdk.awsDashSdkStrings.Expired_
    - typings.awsDashSdk.awsDashSdkStrings.Stopped_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded_
    - java.lang.String
  */
  type UserImportJobStatusType = _UserImportJobStatusType | String
  type UserImportJobsListType = js.Array[UserImportJobType]
  type UserMFASettingListType = js.Array[StringType]
  type UserPoolClientListType = js.Array[UserPoolClientDescription]
  type UserPoolIdType = String
  type UserPoolListType = js.Array[UserPoolDescriptionType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.OFF
    - typings.awsDashSdk.awsDashSdkStrings.ON
    - typings.awsDashSdk.awsDashSdkStrings.OPTIONAL
    - java.lang.String
  */
  type UserPoolMfaType = _UserPoolMfaType | String
  type UserPoolNameType = String
  type UserPoolTagsListType = js.Array[TagKeysType]
  type UserPoolTagsType = StringDictionary[TagValueType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.UNCONFIRMED
    - typings.awsDashSdk.awsDashSdkStrings.CONFIRMED
    - typings.awsDashSdk.awsDashSdkStrings.ARCHIVED
    - typings.awsDashSdk.awsDashSdkStrings.COMPROMISED
    - typings.awsDashSdk.awsDashSdkStrings.UNKNOWN
    - typings.awsDashSdk.awsDashSdkStrings.RESET_REQUIRED
    - typings.awsDashSdk.awsDashSdkStrings.FORCE_CHANGE_PASSWORD
    - java.lang.String
  */
  type UserStatusType = _UserStatusType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.phone_number
    - typings.awsDashSdk.awsDashSdkStrings.email__
    - java.lang.String
  */
  type UsernameAttributeType = _UsernameAttributeType | String
  type UsernameAttributesListType = js.Array[UsernameAttributeType]
  type UsernameType = String
  type UsersListType = js.Array[UserType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.phone_number
    - typings.awsDashSdk.awsDashSdkStrings.email__
    - java.lang.String
  */
  type VerifiedAttributeType = _VerifiedAttributeType | String
  type VerifiedAttributesListType = js.Array[VerifiedAttributeType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SUCCESS
    - typings.awsDashSdk.awsDashSdkStrings.ERROR
    - java.lang.String
  */
  type VerifySoftwareTokenResponseType = _VerifySoftwareTokenResponseType | String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2016-04-18`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | String
}
