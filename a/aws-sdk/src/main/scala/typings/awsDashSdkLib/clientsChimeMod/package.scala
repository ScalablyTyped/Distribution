package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsChimeMod {
  type AccountList = js.Array[Account]
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Team
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseDirectory
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseLWA
    - awsDashSdkLib.awsDashSdkLibStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = _AccountType | java.lang.String
  type Boolean = scala.Boolean
  type BotList = js.Array[Bot]
  type BotType = awsDashSdkLib.awsDashSdkLibStrings.ChatBot | java.lang.String
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[CallingRegion]
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CpsLimit = scala.Double
  type CredentialList = js.Array[Credential]
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotSent
    - awsDashSdkLib.awsDashSdkLibStrings.Sent
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type EmailStatus = _EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Unauthorized
    - awsDashSdkLib.awsDashSdkLibStrings.Forbidden
    - awsDashSdkLib.awsDashSdkLibStrings.NotFound
    - awsDashSdkLib.awsDashSdkLibStrings.BadRequest
    - awsDashSdkLib.awsDashSdkLibStrings.Conflict
    - awsDashSdkLib.awsDashSdkLibStrings.ServiceFailure
    - awsDashSdkLib.awsDashSdkLibStrings.ServiceUnavailable
    - awsDashSdkLib.awsDashSdkLibStrings.Unprocessable
    - awsDashSdkLib.awsDashSdkLibStrings.Throttled
    - awsDashSdkLib.awsDashSdkLibStrings.PreconditionFailed
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type GuidString = java.lang.String
  type InviteList = js.Array[Invite]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Pending
    - awsDashSdkLib.awsDashSdkLibStrings.Accepted
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type InviteStatus = _InviteStatus | java.lang.String
  type Iso8601Timestamp = stdLib.Date
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Basic
    - awsDashSdkLib.awsDashSdkLibStrings.Plus
    - awsDashSdkLib.awsDashSdkLibStrings.Pro
    - awsDashSdkLib.awsDashSdkLibStrings.ProTrial
    - java.lang.String
  */
  type License = _License | java.lang.String
  type LicenseList = js.Array[License]
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[String]
  type NullableBoolean = scala.Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Acquired
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = _OrderedPhoneNumberStatus | java.lang.String
  type OriginationRouteList = js.Array[OriginationRoute]
  type OriginationRoutePriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.TCP
    - awsDashSdkLib.awsDashSdkLibStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = _OriginationRouteProtocol | java.lang.String
  type OriginationRouteWeight = scala.Double
  type PhoneNumberAssociationList = js.Array[PhoneNumberAssociation]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AccountId
    - awsDashSdkLib.awsDashSdkLibStrings.UserId
    - awsDashSdkLib.awsDashSdkLibStrings.VoiceConnectorId
    - java.lang.String
  */
  type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = scala.Double
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Processing
    - awsDashSdkLib.awsDashSdkLibStrings.Successful
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Partial
    - java.lang.String
  */
  type PhoneNumberOrderStatus = _PhoneNumberOrderStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.BusinessCalling
    - awsDashSdkLib.awsDashSdkLibStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = _PhoneNumberProductType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AcquireInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.AcquireFailed
    - awsDashSdkLib.awsDashSdkLibStrings.Unassigned
    - awsDashSdkLib.awsDashSdkLibStrings.Assigned
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteInProgress
    - awsDashSdkLib.awsDashSdkLibStrings.ReleaseFailed
    - awsDashSdkLib.awsDashSdkLibStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String
  type Port = scala.Double
  type ProfileServiceMaxResults = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Unregistered
    - awsDashSdkLib.awsDashSdkLibStrings.Registered
    - awsDashSdkLib.awsDashSdkLibStrings.Suspended
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type ResultMax = scala.Double
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[SensitiveString]
  type String = java.lang.String
  type StringList = js.Array[String]
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2018-05-01`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
