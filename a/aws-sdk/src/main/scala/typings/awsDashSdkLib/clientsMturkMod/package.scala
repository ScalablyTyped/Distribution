package typings
package awsDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object clientsMturkMod {
  type AssignmentList = js.Array[Assignment]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Submitted
    - awsDashSdkLib.awsDashSdkLibStrings.Approved
    - awsDashSdkLib.awsDashSdkLibStrings.Rejected
    - java.lang.String
  */
  type AssignmentStatus = _AssignmentStatus | java.lang.String
  type AssignmentStatusList = js.Array[AssignmentStatus]
  type BonusPaymentList = js.Array[BonusPayment]
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.LessThan
    - awsDashSdkLib.awsDashSdkLibStrings.LessThanOrEqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThan
    - awsDashSdkLib.awsDashSdkLibStrings.GreaterThanOrEqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.EqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.NotEqualTo
    - awsDashSdkLib.awsDashSdkLibStrings.Exists
    - awsDashSdkLib.awsDashSdkLibStrings.DoesNotExist
    - awsDashSdkLib.awsDashSdkLibStrings.In
    - awsDashSdkLib.awsDashSdkLibStrings.NotIn
    - java.lang.String
  */
  type Comparator = _Comparator | java.lang.String
  type CountryParameters = java.lang.String
  type CurrencyAmount = java.lang.String
  type CustomerId = java.lang.String
  type CustomerIdList = js.Array[CustomerId]
  type EntityId = java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentAccepted
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentAbandoned
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentReturned
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentSubmitted
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentRejected
    - awsDashSdkLib.awsDashSdkLibStrings.AssignmentApproved
    - awsDashSdkLib.awsDashSdkLibStrings.HITCreated
    - awsDashSdkLib.awsDashSdkLibStrings.HITExpired
    - awsDashSdkLib.awsDashSdkLibStrings.HITReviewable
    - awsDashSdkLib.awsDashSdkLibStrings.HITExtended
    - awsDashSdkLib.awsDashSdkLibStrings.HITDisposed
    - awsDashSdkLib.awsDashSdkLibStrings.Ping
    - java.lang.String
  */
  type EventType = _EventType | java.lang.String
  type EventTypeList = js.Array[EventType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Accept
    - awsDashSdkLib.awsDashSdkLibStrings.PreviewAndAccept
    - awsDashSdkLib.awsDashSdkLibStrings.DiscoverPreviewAndAccept
    - java.lang.String
  */
  type HITAccessActions = _HITAccessActions | java.lang.String
  type HITLayoutParameterList = js.Array[HITLayoutParameter]
  type HITList = js.Array[HIT]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.NotReviewed
    - awsDashSdkLib.awsDashSdkLibStrings.MarkedForReview
    - awsDashSdkLib.awsDashSdkLibStrings.ReviewedAppropriate
    - awsDashSdkLib.awsDashSdkLibStrings.ReviewedInappropriate
    - java.lang.String
  */
  type HITReviewStatus = _HITReviewStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Assignable
    - awsDashSdkLib.awsDashSdkLibStrings.Unassignable
    - awsDashSdkLib.awsDashSdkLibStrings.Reviewable
    - awsDashSdkLib.awsDashSdkLibStrings.Reviewing
    - awsDashSdkLib.awsDashSdkLibStrings.Disposed
    - java.lang.String
  */
  type HITStatus = _HITStatus | java.lang.String
  type IdempotencyToken = java.lang.String
  type Integer = scala.Double
  type IntegerList = js.Array[Integer]
  type LocaleList = js.Array[Locale]
  type Long = scala.Double
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Email
    - awsDashSdkLib.awsDashSdkLibStrings.SQS
    - awsDashSdkLib.awsDashSdkLibStrings.SNS
    - java.lang.String
  */
  type NotificationTransport = _NotificationTransport | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.SoftFailure
    - awsDashSdkLib.awsDashSdkLibStrings.HardFailure
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
    - awsDashSdkLib.awsDashSdkLibStrings.Granted
    - awsDashSdkLib.awsDashSdkLibStrings.Revoked
    - java.lang.String
  */
  type QualificationStatus = _QualificationStatus | java.lang.String
  type QualificationTypeList = js.Array[QualificationType]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Active
    - awsDashSdkLib.awsDashSdkLibStrings.Inactive
    - java.lang.String
  */
  type QualificationTypeStatus = _QualificationTypeStatus | java.lang.String
  type ResultSize = scala.Double
  type ReviewActionDetailList = js.Array[ReviewActionDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Intended
    - awsDashSdkLib.awsDashSdkLibStrings.Succeeded
    - awsDashSdkLib.awsDashSdkLibStrings.Failed
    - awsDashSdkLib.awsDashSdkLibStrings.Cancelled
    - java.lang.String
  */
  type ReviewActionStatus = _ReviewActionStatus | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Assignment
    - awsDashSdkLib.awsDashSdkLibStrings.HIT
    - java.lang.String
  */
  type ReviewPolicyLevel = _ReviewPolicyLevel | java.lang.String
  type ReviewPolicyLevelList = js.Array[ReviewPolicyLevel]
  type ReviewResultDetailList = js.Array[ReviewResultDetail]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.Reviewable
    - awsDashSdkLib.awsDashSdkLibStrings.Reviewing
    - java.lang.String
  */
  type ReviewableHITStatus = _ReviewableHITStatus | java.lang.String
  type String = java.lang.String
  type StringList = js.Array[String]
  type Timestamp = stdLib.Date
  type WorkerBlockList = js.Array[WorkerBlock]
  /* Rewritten from type alias, can be one of: 
    - awsDashSdkLib.awsDashSdkLibStrings.`2017-01-17`
    - awsDashSdkLib.awsDashSdkLibStrings.latest
    - java.lang.String
  */
  type apiVersion = _apiVersion | java.lang.String
}
