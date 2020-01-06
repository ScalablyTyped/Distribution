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
  type Arn = java.lang.String
  type AttendeeList = js.Array[Attendee]
  type BatchCreateAttendeeErrorList = js.Array[CreateAttendeeError]
  type Boolean = scala.Boolean
  type BotList = js.Array[Bot]
  type BotType = ChatBot | java.lang.String
  type CallingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Unassigned
    - typings.awsDashSdk.awsDashSdkStrings.UpdateInProgress
    - typings.awsDashSdk.awsDashSdkStrings.UpdateSucceeded
    - typings.awsDashSdk.awsDashSdkStrings.UpdateFailed
    - java.lang.String
  */
  type CallingNameStatus = _CallingNameStatus | java.lang.String
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[CallingRegion]
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  type ClientRequestToken = java.lang.String
  type CpsLimit = Double
  type CreateAttendeeRequestItemList = js.Array[CreateAttendeeRequestItem]
  type CredentialList = js.Array[Credential]
  type DataRetentionInHours = Double
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotSent
    - typings.awsDashSdk.awsDashSdkStrings.Sent
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type EmailStatus = _EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.BadRequest
    - typings.awsDashSdk.awsDashSdkStrings.Conflict_
    - typings.awsDashSdk.awsDashSdkStrings.Forbidden
    - typings.awsDashSdk.awsDashSdkStrings.NotFound
    - typings.awsDashSdk.awsDashSdkStrings.PreconditionFailed
    - typings.awsDashSdk.awsDashSdkStrings.ResourceLimitExceeded
    - typings.awsDashSdk.awsDashSdkStrings.ServiceFailure
    - typings.awsDashSdk.awsDashSdkStrings.AccessDenied
    - typings.awsDashSdk.awsDashSdkStrings.ServiceUnavailable
    - typings.awsDashSdk.awsDashSdkStrings.Throttled_
    - typings.awsDashSdk.awsDashSdkStrings.Unauthorized_
    - typings.awsDashSdk.awsDashSdkStrings.Unprocessable
    - typings.awsDashSdk.awsDashSdkStrings.VoiceConnectorGroupAssociationsExist
    - typings.awsDashSdk.awsDashSdkStrings.PhoneNumberAssociationsExist
    - java.lang.String
  */
  type ErrorCode = _ErrorCode | java.lang.String
  type ExternalUserIdType = java.lang.String
  type GuidString = java.lang.String
  type InviteList = js.Array[Invite]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Pending_
    - typings.awsDashSdk.awsDashSdkStrings.Accepted_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - java.lang.String
  */
  type InviteStatus = _InviteStatus | java.lang.String
  type Iso8601Timestamp = Date
  type JoinTokenString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Basic_
    - typings.awsDashSdk.awsDashSdkStrings.Plus
    - typings.awsDashSdk.awsDashSdkStrings.Pro
    - typings.awsDashSdk.awsDashSdkStrings.ProTrial
    - java.lang.String
  */
  type License = _License | java.lang.String
  type LicenseList = js.Array[License]
  type MeetingList = js.Array[Meeting]
  type MemberErrorList = js.Array[MemberError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.User_
    - typings.awsDashSdk.awsDashSdkStrings.Bot_
    - typings.awsDashSdk.awsDashSdkStrings.Webhook
    - java.lang.String
  */
  type MemberType = _MemberType | java.lang.String
  type MembershipItemList = js.Array[MembershipItem]
  type NonEmptyString = java.lang.String
  type NonEmptyStringList = js.Array[String]
  type NullableBoolean = scala.Boolean
  type OrderedPhoneNumberList = js.Array[OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Processing_
    - typings.awsDashSdk.awsDashSdkStrings.Acquired
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
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
    - typings.awsDashSdk.awsDashSdkStrings.VoiceConnectorGroupId
    - java.lang.String
  */
  type PhoneNumberAssociationName = _PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[PhoneNumberError]
  type PhoneNumberList = js.Array[PhoneNumber]
  type PhoneNumberMaxResults = Double
  type PhoneNumberOrderList = js.Array[PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Processing_
    - typings.awsDashSdk.awsDashSdkStrings.Successful_
    - typings.awsDashSdk.awsDashSdkStrings.Failed_
    - typings.awsDashSdk.awsDashSdkStrings.Partial_
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
    - typings.awsDashSdk.awsDashSdkStrings.Assigned_
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseInProgress
    - typings.awsDashSdk.awsDashSdkStrings.DeleteInProgress
    - typings.awsDashSdk.awsDashSdkStrings.ReleaseFailed
    - typings.awsDashSdk.awsDashSdkStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = _PhoneNumberStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Local_
    - typings.awsDashSdk.awsDashSdkStrings.TollFree
    - java.lang.String
  */
  type PhoneNumberType = _PhoneNumberType | java.lang.String
  type Port = Double
  type ProfileServiceMaxResults = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Unregistered
    - typings.awsDashSdk.awsDashSdkStrings.Registered_
    - typings.awsDashSdk.awsDashSdkStrings.Suspended_
    - java.lang.String
  */
  type RegistrationStatus = _RegistrationStatus | java.lang.String
  type ResultMax = Double
  type RoomList = js.Array[Room]
  type RoomMembershipList = js.Array[RoomMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Administrator
    - typings.awsDashSdk.awsDashSdkStrings.Member
    - java.lang.String
  */
  type RoomMembershipRole = _RoomMembershipRole | java.lang.String
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[SensitiveString]
  type String = java.lang.String
  type StringList = js.Array[String]
  type TollFreePrefix = java.lang.String
  type UpdatePhoneNumberRequestItemList = js.Array[UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[UpdateUserRequestItem]
  type UriType = java.lang.String
  type UserEmailList = js.Array[EmailAddress]
  type UserErrorList = js.Array[UserError]
  type UserIdList = js.Array[NonEmptyString]
  type UserList = js.Array[User]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`us-east-1`
    - typings.awsDashSdk.awsDashSdkStrings.`us-west-2`
    - java.lang.String
  */
  type VoiceConnectorAwsRegion = _VoiceConnectorAwsRegion | java.lang.String
  type VoiceConnectorGroupList = js.Array[VoiceConnectorGroup]
  type VoiceConnectorGroupName = java.lang.String
  type VoiceConnectorItemList = js.Array[VoiceConnectorItem]
  type VoiceConnectorItemPriority = Double
  type VoiceConnectorList = js.Array[VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2018-05-01`
    - typings.awsDashSdk.awsDashSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
