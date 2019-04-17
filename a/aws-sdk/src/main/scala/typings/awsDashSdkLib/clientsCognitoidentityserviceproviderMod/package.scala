package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsCognitoidentityserviceproviderMod {
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
  type AttributeMappingType = org.scalablytyped.runtime.StringDictionary[StringType]
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
  type AuthParametersType = org.scalablytyped.runtime.StringDictionary[StringType]
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
  type ChallengeParametersType = org.scalablytyped.runtime.StringDictionary[StringType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Success
    - awsDashSdkLib.awsDashSdkLibStrings.Failure
    - java.lang.String
  */
  type ChallengeResponse = _ChallengeResponse | java.lang.String
  type ChallengeResponseListType = js.Array[ChallengeResponseType]
  type ChallengeResponsesType = org.scalablytyped.runtime.StringDictionary[StringType]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type ClientIdType = java.lang.String
  type ClientMetadataType = org.scalablytyped.runtime.StringDictionary[StringType]
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
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.COGNITO_DEFAULT
    - awsDashSdkLib.awsDashSdkLibStrings.DEVELOPER
    - java.lang.String
  */
  type EmailSendingAccountType = _EmailSendingAccountType | java.lang.String
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
  type ImageFileType = nodeLib.Buffer | stdLib.Uint8Array | Blob | java.lang.String
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
  type ProviderDetailsType = org.scalablytyped.runtime.StringDictionary[StringType]
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
  type UserPoolTagsType = org.scalablytyped.runtime.StringDictionary[TagValueType]
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
