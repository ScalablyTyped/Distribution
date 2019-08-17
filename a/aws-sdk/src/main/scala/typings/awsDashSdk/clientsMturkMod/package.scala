package typings.awsDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMturkMod {
  import typings.awsDashSdk.libServiceMod.ServiceConfigurationOptions
  import typings.std.Date

  type AssignmentList = js.Array[Assignment]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Submitted
    - typings.awsDashSdk.awsDashSdkStrings.Approved
    - typings.awsDashSdk.awsDashSdkStrings.Rejected
    - java.lang.String
  */
  type AssignmentStatus = _AssignmentStatus | java.lang.String
  type AssignmentStatusList = js.Array[AssignmentStatus]
  type BonusPaymentList = js.Array[BonusPayment]
  type Boolean = scala.Boolean
  type ClientConfiguration = ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.LessThan
    - typings.awsDashSdk.awsDashSdkStrings.LessThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThan
    - typings.awsDashSdk.awsDashSdkStrings.GreaterThanOrEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.EqualTo
    - typings.awsDashSdk.awsDashSdkStrings.NotEqualTo
    - typings.awsDashSdk.awsDashSdkStrings.Exists
    - typings.awsDashSdk.awsDashSdkStrings.DoesNotExist
    - typings.awsDashSdk.awsDashSdkStrings.In
    - typings.awsDashSdk.awsDashSdkStrings.NotIn
    - java.lang.String
  */
  type Comparator = _Comparator | java.lang.String
  type CountryParameters = java.lang.String
  type CurrencyAmount = java.lang.String
  type CustomerId = java.lang.String
  type CustomerIdList = js.Array[CustomerId]
  type EntityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentAccepted
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentAbandoned
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentReturned
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentSubmitted
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentRejected
    - typings.awsDashSdk.awsDashSdkStrings.AssignmentApproved
    - typings.awsDashSdk.awsDashSdkStrings.HITCreated
    - typings.awsDashSdk.awsDashSdkStrings.HITExpired
    - typings.awsDashSdk.awsDashSdkStrings.HITReviewable
    - typings.awsDashSdk.awsDashSdkStrings.HITExtended
    - typings.awsDashSdk.awsDashSdkStrings.HITDisposed
    - typings.awsDashSdk.awsDashSdkStrings.Ping
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type EventTypeList = js.Array[EventType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Accept
    - typings.awsDashSdk.awsDashSdkStrings.PreviewAndAccept
    - typings.awsDashSdk.awsDashSdkStrings.DiscoverPreviewAndAccept
    - java.lang.String
  */
  type HITAccessActions = _HITAccessActions | java.lang.String
  type HITLayoutParameterList = js.Array[HITLayoutParameter]
  type HITList = js.Array[HIT]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.NotReviewed
    - typings.awsDashSdk.awsDashSdkStrings.MarkedForReview
    - typings.awsDashSdk.awsDashSdkStrings.ReviewedAppropriate
    - typings.awsDashSdk.awsDashSdkStrings.ReviewedInappropriate
    - java.lang.String
  */
  type HITReviewStatus = _HITReviewStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Assignable
    - typings.awsDashSdk.awsDashSdkStrings.Unassignable
    - typings.awsDashSdk.awsDashSdkStrings.Reviewable
    - typings.awsDashSdk.awsDashSdkStrings.Reviewing
    - typings.awsDashSdk.awsDashSdkStrings.Disposed
    - java.lang.String
  */
  type HITStatus = _HITStatus | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = Double
  type IntegerList = js.Array[Integer]
  type LocaleList = js.Array[Locale]
  type Long = Double
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Email
    - typings.awsDashSdk.awsDashSdkStrings.SQS
    - typings.awsDashSdk.awsDashSdkStrings.SNS
    - java.lang.String
  */
  type NotificationTransport = _NotificationTransport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.SoftFailure
    - typings.awsDashSdk.awsDashSdkStrings.HardFailure
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
    - typings.awsDashSdk.awsDashSdkStrings.Granted
    - typings.awsDashSdk.awsDashSdkStrings.Revoked
    - java.lang.String
  */
  type QualificationStatus = _QualificationStatus | java.lang.String
  type QualificationTypeList = js.Array[QualificationType]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Active
    - typings.awsDashSdk.awsDashSdkStrings.Inactive
    - java.lang.String
  */
  type QualificationTypeStatus = _QualificationTypeStatus | java.lang.String
  type ResultSize = Double
  type ReviewActionDetailList = js.Array[ReviewActionDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Intended
    - typings.awsDashSdk.awsDashSdkStrings.Succeeded
    - typings.awsDashSdk.awsDashSdkStrings.Failed
    - typings.awsDashSdk.awsDashSdkStrings.Cancelled
    - java.lang.String
  */
  type ReviewActionStatus = _ReviewActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Assignment
    - typings.awsDashSdk.awsDashSdkStrings.HIT
    - java.lang.String
  */
  type ReviewPolicyLevel = _ReviewPolicyLevel | java.lang.String
  type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[ReviewResultDetail]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.Reviewable
    - typings.awsDashSdk.awsDashSdkStrings.Reviewing
    - java.lang.String
  */
  type ReviewableHITStatus = _ReviewableHITStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type Timestamp = Date
  type WorkerBlockList = js.Array[WorkerBlock]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashSdk.awsDashSdkStrings.`2017-01-17`
    - typings.awsDashSdk.awsDashSdkStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
