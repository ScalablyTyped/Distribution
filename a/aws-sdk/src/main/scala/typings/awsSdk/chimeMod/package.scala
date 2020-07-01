package typings.awsSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object chimeMod {
  type AccountList = js.Array[typings.awsSdk.chimeMod.Account]
  type AccountName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Team
    - typings.awsSdk.awsSdkStrings.EnterpriseDirectory
    - typings.awsSdk.awsSdkStrings.EnterpriseLWA
    - typings.awsSdk.awsSdkStrings.EnterpriseOIDC
    - java.lang.String
  */
  type AccountType = typings.awsSdk.chimeMod._AccountType | java.lang.String
  type AreaCode = java.lang.String
  type Arn = java.lang.String
  type AttendeeList = js.Array[typings.awsSdk.chimeMod.Attendee]
  type AttendeeTagKeyList = js.Array[typings.awsSdk.chimeMod.TagKey]
  type AttendeeTagList = js.Array[typings.awsSdk.chimeMod.Tag]
  type BatchCreateAttendeeErrorList = js.Array[typings.awsSdk.chimeMod.CreateAttendeeError]
  type Boolean = scala.Boolean
  type BotList = js.Array[typings.awsSdk.chimeMod.Bot]
  type BotType = typings.awsSdk.awsSdkStrings.ChatBot | java.lang.String
  type CallingName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Unassigned
    - typings.awsSdk.awsSdkStrings.UpdateInProgress
    - typings.awsSdk.awsSdkStrings.UpdateSucceeded
    - typings.awsSdk.awsSdkStrings.UpdateFailed
    - java.lang.String
  */
  type CallingNameStatus = typings.awsSdk.chimeMod._CallingNameStatus | java.lang.String
  type CallingRegion = java.lang.String
  type CallingRegionList = js.Array[typings.awsSdk.chimeMod.CallingRegion]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Voice_
    - typings.awsSdk.awsSdkStrings.SMS
    - java.lang.String
  */
  type Capability = typings.awsSdk.chimeMod._Capability | java.lang.String
  type CapabilityList = js.Array[typings.awsSdk.chimeMod.Capability]
  type ClientConfiguration = typings.awsSdk.serviceMod.ServiceConfigurationOptions with typings.awsSdk.chimeMod.ClientApiVersions
  type ClientRequestToken = java.lang.String
  type Country = java.lang.String
  type CountryList = js.Array[typings.awsSdk.chimeMod.Country]
  type CpsLimit = scala.Double
  type CreateAttendeeRequestItemList = js.Array[typings.awsSdk.chimeMod.CreateAttendeeRequestItem]
  type CreateMeetingWithAttendeesRequestItemList = js.Array[typings.awsSdk.chimeMod.CreateAttendeeRequestItem]
  type CredentialList = js.Array[typings.awsSdk.chimeMod.Credential]
  type DataRetentionInHours = scala.Double
  type E164PhoneNumber = java.lang.String
  type E164PhoneNumberList = js.Array[typings.awsSdk.chimeMod.E164PhoneNumber]
  type EmailAddress = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.NotSent
    - typings.awsSdk.awsSdkStrings.Sent
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type EmailStatus = typings.awsSdk.chimeMod._EmailStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BadRequest
    - typings.awsSdk.awsSdkStrings.Conflict_
    - typings.awsSdk.awsSdkStrings.Forbidden
    - typings.awsSdk.awsSdkStrings.NotFound
    - typings.awsSdk.awsSdkStrings.PreconditionFailed
    - typings.awsSdk.awsSdkStrings.ResourceLimitExceeded
    - typings.awsSdk.awsSdkStrings.ServiceFailure
    - typings.awsSdk.awsSdkStrings.AccessDenied
    - typings.awsSdk.awsSdkStrings.ServiceUnavailable
    - typings.awsSdk.awsSdkStrings.Throttled_
    - typings.awsSdk.awsSdkStrings.Unauthorized_
    - typings.awsSdk.awsSdkStrings.Unprocessable
    - typings.awsSdk.awsSdkStrings.VoiceConnectorGroupAssociationsExist
    - typings.awsSdk.awsSdkStrings.PhoneNumberAssociationsExist
    - java.lang.String
  */
  type ErrorCode = typings.awsSdk.chimeMod._ErrorCode | java.lang.String
  type ExternalMeetingIdType = java.lang.String
  type ExternalUserIdType = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Country_
    - typings.awsSdk.awsSdkStrings.AreaCode
    - java.lang.String
  */
  type GeoMatchLevel = typings.awsSdk.chimeMod._GeoMatchLevel | java.lang.String
  type GuidString = java.lang.String
  type Integer = scala.Double
  type InviteList = js.Array[typings.awsSdk.chimeMod.Invite]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Pending_
    - typings.awsSdk.awsSdkStrings.Accepted_
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type InviteStatus = typings.awsSdk.chimeMod._InviteStatus | java.lang.String
  type Iso8601Timestamp = typings.std.Date
  type JoinTokenString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Basic_
    - typings.awsSdk.awsSdkStrings.Plus
    - typings.awsSdk.awsSdkStrings.Pro
    - typings.awsSdk.awsSdkStrings.ProTrial
    - java.lang.String
  */
  type License = typings.awsSdk.chimeMod._License | java.lang.String
  type LicenseList = js.Array[typings.awsSdk.chimeMod.License]
  type MeetingList = js.Array[typings.awsSdk.chimeMod.Meeting]
  type MeetingTagKeyList = js.Array[typings.awsSdk.chimeMod.TagKey]
  type MeetingTagList = js.Array[typings.awsSdk.chimeMod.Tag]
  type MemberErrorList = js.Array[typings.awsSdk.chimeMod.MemberError]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.User_
    - typings.awsSdk.awsSdkStrings.Bot_
    - typings.awsSdk.awsSdkStrings.Webhook
    - java.lang.String
  */
  type MemberType = typings.awsSdk.chimeMod._MemberType | java.lang.String
  type MembershipItemList = js.Array[typings.awsSdk.chimeMod.MembershipItem]
  type NextTokenString = java.lang.String
  type NonEmptyString = java.lang.String
  type NonEmptyString128 = java.lang.String
  type NonEmptyStringList = js.Array[typings.awsSdk.chimeMod.String]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.EventBridge
    - typings.awsSdk.awsSdkStrings.SNS
    - typings.awsSdk.awsSdkStrings.SQS
    - java.lang.String
  */
  type NotificationTarget = typings.awsSdk.chimeMod._NotificationTarget | java.lang.String
  type NullableBoolean = scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PreferSticky
    - typings.awsSdk.awsSdkStrings.AvoidSticky
    - java.lang.String
  */
  type NumberSelectionBehavior = typings.awsSdk.chimeMod._NumberSelectionBehavior | java.lang.String
  type OrderedPhoneNumberList = js.Array[typings.awsSdk.chimeMod.OrderedPhoneNumber]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Processing_
    - typings.awsSdk.awsSdkStrings.Acquired
    - typings.awsSdk.awsSdkStrings.Failed_
    - java.lang.String
  */
  type OrderedPhoneNumberStatus = typings.awsSdk.chimeMod._OrderedPhoneNumberStatus | java.lang.String
  type OriginationRouteList = js.Array[typings.awsSdk.chimeMod.OriginationRoute]
  type OriginationRoutePriority = scala.Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.TCP
    - typings.awsSdk.awsSdkStrings.UDP
    - java.lang.String
  */
  type OriginationRouteProtocol = typings.awsSdk.chimeMod._OriginationRouteProtocol | java.lang.String
  type OriginationRouteWeight = scala.Double
  type ParticipantPhoneNumberList = js.Array[typings.awsSdk.chimeMod.E164PhoneNumber]
  type Participants = js.Array[typings.awsSdk.chimeMod.Participant]
  type PhoneNumberAssociationList = js.Array[typings.awsSdk.chimeMod.PhoneNumberAssociation]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AccountId
    - typings.awsSdk.awsSdkStrings.UserId
    - typings.awsSdk.awsSdkStrings.VoiceConnectorId
    - typings.awsSdk.awsSdkStrings.VoiceConnectorGroupId
    - java.lang.String
  */
  type PhoneNumberAssociationName = typings.awsSdk.chimeMod._PhoneNumberAssociationName | java.lang.String
  type PhoneNumberErrorList = js.Array[typings.awsSdk.chimeMod.PhoneNumberError]
  type PhoneNumberList = js.Array[typings.awsSdk.chimeMod.PhoneNumber]
  type PhoneNumberMaxResults = scala.Double
  type PhoneNumberOrderList = js.Array[typings.awsSdk.chimeMod.PhoneNumberOrder]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Processing_
    - typings.awsSdk.awsSdkStrings.Successful_
    - typings.awsSdk.awsSdkStrings.Failed_
    - typings.awsSdk.awsSdkStrings.Partial_
    - java.lang.String
  */
  type PhoneNumberOrderStatus = typings.awsSdk.chimeMod._PhoneNumberOrderStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.BusinessCalling
    - typings.awsSdk.awsSdkStrings.VoiceConnector
    - java.lang.String
  */
  type PhoneNumberProductType = typings.awsSdk.chimeMod._PhoneNumberProductType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.AcquireInProgress
    - typings.awsSdk.awsSdkStrings.AcquireFailed
    - typings.awsSdk.awsSdkStrings.Unassigned
    - typings.awsSdk.awsSdkStrings.Assigned_
    - typings.awsSdk.awsSdkStrings.ReleaseInProgress
    - typings.awsSdk.awsSdkStrings.DeleteInProgress
    - typings.awsSdk.awsSdkStrings.ReleaseFailed
    - typings.awsSdk.awsSdkStrings.DeleteFailed
    - java.lang.String
  */
  type PhoneNumberStatus = typings.awsSdk.chimeMod._PhoneNumberStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Local_
    - typings.awsSdk.awsSdkStrings.TollFree
    - java.lang.String
  */
  type PhoneNumberType = typings.awsSdk.chimeMod._PhoneNumberType | java.lang.String
  type Port = scala.Double
  type PositiveInteger = scala.Double
  type ProfileServiceMaxResults = scala.Double
  type ProxySessionNameString = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Open_
    - typings.awsSdk.awsSdkStrings.InProgress_
    - typings.awsSdk.awsSdkStrings.Closed_
    - java.lang.String
  */
  type ProxySessionStatus = typings.awsSdk.chimeMod._ProxySessionStatus | java.lang.String
  type ProxySessions = js.Array[typings.awsSdk.chimeMod.ProxySession]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Unregistered
    - typings.awsSdk.awsSdkStrings.Registered_
    - typings.awsSdk.awsSdkStrings.Suspended_
    - java.lang.String
  */
  type RegistrationStatus = typings.awsSdk.chimeMod._RegistrationStatus | java.lang.String
  type ResultMax = scala.Double
  type RetentionDays = scala.Double
  type RoomList = js.Array[typings.awsSdk.chimeMod.Room]
  type RoomMembershipList = js.Array[typings.awsSdk.chimeMod.RoomMembership]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.Administrator_
    - typings.awsSdk.awsSdkStrings.Member
    - java.lang.String
  */
  type RoomMembershipRole = typings.awsSdk.chimeMod._RoomMembershipRole | java.lang.String
  type SensitiveString = java.lang.String
  type SensitiveStringList = js.Array[typings.awsSdk.chimeMod.SensitiveString]
  type SigninDelegateGroupList = js.Array[typings.awsSdk.chimeMod.SigninDelegateGroup]
  type StreamingNotificationTargetList = js.Array[typings.awsSdk.chimeMod.StreamingNotificationTarget]
  type String = java.lang.String
  type String128 = java.lang.String
  type StringList = js.Array[typings.awsSdk.chimeMod.String]
  type TagKey = java.lang.String
  type TagKeyList = js.Array[typings.awsSdk.chimeMod.TagKey]
  type TagList = js.Array[typings.awsSdk.chimeMod.Tag]
  type TagValue = java.lang.String
  type TollFreePrefix = java.lang.String
  type UpdatePhoneNumberRequestItemList = js.Array[typings.awsSdk.chimeMod.UpdatePhoneNumberRequestItem]
  type UpdateUserRequestItemList = js.Array[typings.awsSdk.chimeMod.UpdateUserRequestItem]
  type UriType = java.lang.String
  type UserEmailList = js.Array[typings.awsSdk.chimeMod.EmailAddress]
  type UserErrorList = js.Array[typings.awsSdk.chimeMod.UserError]
  type UserIdList = js.Array[typings.awsSdk.chimeMod.NonEmptyString]
  type UserList = js.Array[typings.awsSdk.chimeMod.User]
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.PrivateUser
    - typings.awsSdk.awsSdkStrings.SharedDevice
    - java.lang.String
  */
  type UserType = typings.awsSdk.chimeMod._UserType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`us-east-1`
    - typings.awsSdk.awsSdkStrings.`us-west-2`
    - java.lang.String
  */
  type VoiceConnectorAwsRegion = typings.awsSdk.chimeMod._VoiceConnectorAwsRegion | java.lang.String
  type VoiceConnectorGroupList = js.Array[typings.awsSdk.chimeMod.VoiceConnectorGroup]
  type VoiceConnectorGroupName = java.lang.String
  type VoiceConnectorItemList = js.Array[typings.awsSdk.chimeMod.VoiceConnectorItem]
  type VoiceConnectorItemPriority = scala.Double
  type VoiceConnectorList = js.Array[typings.awsSdk.chimeMod.VoiceConnector]
  type VoiceConnectorName = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdk.awsSdkStrings.`2018-05-01`
    - typings.awsSdk.awsSdkStrings.latest_
    - java.lang.String
  */
  type apiVersion = typings.awsSdk.chimeMod._apiVersion | java.lang.String
}
