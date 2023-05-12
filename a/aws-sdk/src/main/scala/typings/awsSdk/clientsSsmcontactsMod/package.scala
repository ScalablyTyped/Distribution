package typings.awsSdk.clientsSsmcontactsMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AcceptCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.IGNORE
  - typings.awsSdk.awsSdkStrings.ENFORCE
  - java.lang.String
*/
type AcceptCodeValidation = _AcceptCodeValidation | String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELIVERED
  - typings.awsSdk.awsSdkStrings.READ
  - java.lang.String
*/
type AcceptType = _AcceptType | String

type ActivationCode = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.ACTIVATED
  - typings.awsSdk.awsSdkStrings.NOT_ACTIVATED
  - java.lang.String
*/
type ActivationStatus = _ActivationStatus | String

type AmazonResourceName = String

type ChannelName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SMS
  - typings.awsSdk.awsSdkStrings.VOICE
  - typings.awsSdk.awsSdkStrings.EMAIL
  - java.lang.String
*/
type ChannelType = _ChannelType | String

type ContactAlias = String

type ContactChannelList = js.Array[ContactChannel]

type ContactName = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.PERSONAL
  - typings.awsSdk.awsSdkStrings.ESCALATION
  - typings.awsSdk.awsSdkStrings.ONCALL_SCHEDULE
  - java.lang.String
*/
type ContactType = _ContactType | String

type ContactsList = js.Array[Contact]

type Content = String

type CoverageTimes = js.Array[CoverageTime]

type DailySettings = js.Array[HandOffTime]

type DateTime = js.Date

type DayOfMonth = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.MON
  - typings.awsSdk.awsSdkStrings.TUE
  - typings.awsSdk.awsSdkStrings.WED
  - typings.awsSdk.awsSdkStrings.THU
  - typings.awsSdk.awsSdkStrings.FRI
  - typings.awsSdk.awsSdkStrings.SAT
  - typings.awsSdk.awsSdkStrings.SUN
  - java.lang.String
*/
type DayOfWeek = _DayOfWeek | String

type DeferActivation = Boolean

type EngagementsList = js.Array[Engagement]

type HourOfDay = Double

type IdempotencyToken = String

type IncidentId = String

type IsEssential = Boolean

type MaxResults = Double

type Member = String

type MinuteOfHour = Double

type MonthlySettings = js.Array[MonthlySetting]

type NumberOfOnCalls = Double

type OverrideList = js.Array[PreviewOverride]

type PagesList = js.Array[Page]

type PaginationToken = String

type Policy = String

type PublicContent = String

type PublicSubject = String

type ReceiptInfo = String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.DELIVERED
  - typings.awsSdk.awsSdkStrings.ERROR
  - typings.awsSdk.awsSdkStrings.READ
  - typings.awsSdk.awsSdkStrings.SENT
  - typings.awsSdk.awsSdkStrings.STOP
  - java.lang.String
*/
type ReceiptType = _ReceiptType | String

type ReceiptsList = js.Array[Receipt]

type RecurrenceMultiplier = Double

type ResolutionList = js.Array[ResolutionContact]

type RetryIntervalInMinutes = Double

type RotationContactsArnList = js.Array[SsmContactsArn]

type RotationName = String

type RotationOverrideContactsArnList = js.Array[SsmContactsArn]

type RotationOverridePreviewMemberList = js.Array[Member]

type RotationOverrides = js.Array[RotationOverride]

type RotationPreviewMemberList = js.Array[Member]

type RotationShifts = js.Array[RotationShift]

type Rotations = js.Array[Rotation]

type Sender = String

type ShiftCoveragesMap = StringDictionary[CoverageTimes]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.REGULAR
  - typings.awsSdk.awsSdkStrings.OVERRIDDEN
  - java.lang.String
*/
type ShiftType = _ShiftType | String

type SimpleAddress = String

type SsmContactsArn = String

type SsmContactsArnList = js.Array[SsmContactsArn]

type StageDurationInMins = Double

type StageIndex = Double

type StagesList = js.Array[Stage]

type StopReason = String

type Subject = String

type TagKey = String

type TagKeyList = js.Array[TagKey]

type TagValue = String

type TagsList = js.Array[Tag]

type TargetsList = js.Array[Target]

type TimeZoneId = String

type Uuid = String

type WeeklySettings = js.Array[WeeklySetting]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2021-05-03`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | String
