package typings.awsSdk.clientsMturkMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AssignmentList = js.Array[Assignment]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Submitted_
  - typings.awsSdk.awsSdkStrings.Approved_
  - typings.awsSdk.awsSdkStrings.Rejected_
  - java.lang.String
*/
type AssignmentStatus = _AssignmentStatus | java.lang.String

type AssignmentStatusList = js.Array[AssignmentStatus]

type BonusPaymentList = js.Array[BonusPayment]

type Boolean = scala.Boolean

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.LessThan
  - typings.awsSdk.awsSdkStrings.LessThanOrEqualTo
  - typings.awsSdk.awsSdkStrings.GreaterThan
  - typings.awsSdk.awsSdkStrings.GreaterThanOrEqualTo
  - typings.awsSdk.awsSdkStrings.EqualTo
  - typings.awsSdk.awsSdkStrings.NotEqualTo
  - typings.awsSdk.awsSdkStrings.Exists
  - typings.awsSdk.awsSdkStrings.DoesNotExist
  - typings.awsSdk.awsSdkStrings.In_
  - typings.awsSdk.awsSdkStrings.NotIn
  - java.lang.String
*/
type Comparator = _Comparator | java.lang.String

type CountryParameters = java.lang.String

type CurrencyAmount = java.lang.String

type CustomerId = java.lang.String

type CustomerIdList = js.Array[CustomerId]

type EntityId = java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.AssignmentAccepted
  - typings.awsSdk.awsSdkStrings.AssignmentAbandoned
  - typings.awsSdk.awsSdkStrings.AssignmentReturned
  - typings.awsSdk.awsSdkStrings.AssignmentSubmitted
  - typings.awsSdk.awsSdkStrings.AssignmentRejected
  - typings.awsSdk.awsSdkStrings.AssignmentApproved
  - typings.awsSdk.awsSdkStrings.HITCreated
  - typings.awsSdk.awsSdkStrings.HITExpired
  - typings.awsSdk.awsSdkStrings.HITReviewable
  - typings.awsSdk.awsSdkStrings.HITExtended
  - typings.awsSdk.awsSdkStrings.HITDisposed
  - typings.awsSdk.awsSdkStrings.Ping
  - java.lang.String
*/
type EventType = _EventType | java.lang.String

type EventTypeList = js.Array[EventType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Accept_
  - typings.awsSdk.awsSdkStrings.PreviewAndAccept
  - typings.awsSdk.awsSdkStrings.DiscoverPreviewAndAccept
  - java.lang.String
*/
type HITAccessActions = _HITAccessActions | java.lang.String

type HITLayoutParameterList = js.Array[HITLayoutParameter]

type HITList = js.Array[HIT]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.NotReviewed
  - typings.awsSdk.awsSdkStrings.MarkedForReview
  - typings.awsSdk.awsSdkStrings.ReviewedAppropriate
  - typings.awsSdk.awsSdkStrings.ReviewedInappropriate
  - java.lang.String
*/
type HITReviewStatus = _HITReviewStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Assignable
  - typings.awsSdk.awsSdkStrings.Unassignable
  - typings.awsSdk.awsSdkStrings.Reviewable
  - typings.awsSdk.awsSdkStrings.Reviewing
  - typings.awsSdk.awsSdkStrings.Disposed
  - java.lang.String
*/
type HITStatus = _HITStatus | java.lang.String

type IdempotencyToken = java.lang.String

type Integer = Double

type IntegerList = js.Array[Integer]

type LocaleList = js.Array[Locale]

type Long = Double

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Email_
  - typings.awsSdk.awsSdkStrings.SQS
  - typings.awsSdk.awsSdkStrings.SNS
  - java.lang.String
*/
type NotificationTransport = _NotificationTransport | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.SoftFailure
  - typings.awsSdk.awsSdkStrings.HardFailure
  - java.lang.String
*/
type NotifyWorkersFailureCode = _NotifyWorkersFailureCode | java.lang.String

type NotifyWorkersFailureStatusList = js.Array[NotifyWorkersFailureStatus]

type PaginationToken = java.lang.String

type ParameterMapEntryList = js.Array[ParameterMapEntry]

type PolicyParameterList = js.Array[PolicyParameter]

type QualificationList = js.Array[Qualification]

type QualificationRequestList = js.Array[QualificationRequest]

type QualificationRequirementList = js.Array[QualificationRequirement]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Granted_
  - typings.awsSdk.awsSdkStrings.Revoked_
  - java.lang.String
*/
type QualificationStatus = _QualificationStatus | java.lang.String

type QualificationTypeList = js.Array[QualificationType]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Active_
  - typings.awsSdk.awsSdkStrings.Inactive_
  - java.lang.String
*/
type QualificationTypeStatus = _QualificationTypeStatus | java.lang.String

type ResultSize = Double

type ReviewActionDetailList = js.Array[ReviewActionDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Intended
  - typings.awsSdk.awsSdkStrings.Succeeded_
  - typings.awsSdk.awsSdkStrings.Failed_
  - typings.awsSdk.awsSdkStrings.Cancelled_
  - java.lang.String
*/
type ReviewActionStatus = _ReviewActionStatus | java.lang.String

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Assignment
  - typings.awsSdk.awsSdkStrings.HIT
  - java.lang.String
*/
type ReviewPolicyLevel = _ReviewPolicyLevel | java.lang.String

type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]

type ReviewResultDetailList = js.Array[ReviewResultDetail]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.Reviewable
  - typings.awsSdk.awsSdkStrings.Reviewing
  - java.lang.String
*/
type ReviewableHITStatus = _ReviewableHITStatus | java.lang.String

type String = java.lang.String

type StringList = js.Array[String]

type Timestamp = js.Date

type WorkerBlockList = js.Array[WorkerBlock]

/* Rewritten from type alias, can be one of: 
  - typings.awsSdk.awsSdkStrings.`2017-01-17`
  - typings.awsSdk.awsSdkStrings.latest_
  - java.lang.String
*/
type apiVersion = _apiVersion | java.lang.String
