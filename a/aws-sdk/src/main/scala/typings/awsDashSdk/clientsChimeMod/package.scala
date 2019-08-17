package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsChimeMod {
  import typings.awsDashSdk.awsDashSdkStrings.ChatBot
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AccountList = js.Array[Account]
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Team
    - typings.awsDashSdk.awsDashSdkStrings.EnterpriseDirectory
    - typings.awsDashSdk.awsDashSdkStrings.EnterpriseLWA
    - typings.awsDashSdk.awsDashSdkStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = _AccountType | java.lang.String
  type Boolean = scala.Boolean
  type BotList = js.Array[Bot]
  type BotType = ChatBot | java.lang.String
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[CallingRegion]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type CpsLimit = Double
  type CredentialList = js.Array[Credential]
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotSent
    - typings.awsDashSdk.awsDashSdkStrings.Sent
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type EmailStatus = _EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Unauthorized
    - typings.awsDashSdk.awsDashSdkStrings.Forbidden
    - typings.awsDashSdk.awsDashSdkStrings.NotFound
    - typings.awsDashSdk.awsDashSdkStrings.BadRequest
    - typings.awsDashSdk.awsDashSdkStrings.Conflict
    - typings.awsDashSdk.awsDashSdkStrings.ServiceFailure
    - typings.awsDashSdk.awsDashSdkStrings.ServiceUnavailable
    - typings.awsDashSdk.awsDashSdkStrings.Unprocessable
    - typings.awsDashSdk.awsDashSdkStrings.Throttled
    - typings.awsDashSdk.awsDashSdkStrings.PreconditionFailed
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type GuidString = java.lang.String
  type InviteList = js.Array[Invite]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending
    - typings.awsDashSdk.awsDashSdkStrings.Accepted
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type InviteStatus = _InviteStatus | java.lang.String
  type Iso8601Timestamp = Date
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Basic
    - typings.awsDashSdk.awsDashSdkStrings.Plus
    - typings.awsDashSdk.awsDashSdkStrings.Pro
    - typings.awsDashSdk.awsDashSdkStrings.ProTrial
    - java.lang.String
  */
  type License = _License | java.lang.String
  type LicenseList = js.Array[License]
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[String]
  type NullableBoolean = scala.Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Processing
    - typings.awsDashSdk.awsDashSdkStrings.Acquired
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = _OrderedPhoneNumberStatus | java.lang.String
  type OriginationRouteList = js.Array[OriginationRoute]
  type OriginationRoutePriority = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.TCP
    - typings.awsDashSdk.awsDashSdkStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = _OriginationRouteProtocol | java.lang.String
  type OriginationRouteWeight = Double
  type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AccountId
    - typings.awsDashSdk.awsDashSdkStrings.UserId
    - typings.awsDashSdk.awsDashSdkStrings.VoiceConnectorId
    - java.lang.String
  */
  type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = Double
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Processing
    - typings.awsDashSdk.awsDashSdkStrings.Successful
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Partial
    - java.lang.String
  */
  type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BusinessCalling
    - typings.awsDashSdk.awsDashSdkStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AcquireInProgress
    - typings.awsDashSdk.awsDashSdkStrings.AcquireFailed
    - typings.awsDashSdk.awsDashSdkStrings.Unassigned
    - typings.awsDashSdk.awsDashSdkStrings.Assigned
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseInProgress
    - typings.awsDashSdk.awsDashSdkStrings.DeleteInProgress
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseFailed
    - typings.awsDashSdk.awsDashSdkStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Local
    - typings.awsDashSdk.awsDashSdkStrings.TollFree
    - java.lang.String
  */
  type PhoneNumberType = _PhoneNumberType | java.lang.String
  type Port = Double
  type ProfileServiceMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Unregistered
    - typings.awsDashSdk.awsDashSdkStrings.Registered
    - typings.awsDashSdk.awsDashSdkStrings.Suspended
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type ResultMax = Double
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[SensitiveString]
  type String = java.lang.String
  type StringList = js.Array[String]
  type TollFreePrefix = java.lang.String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
