package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateHITWithHITTypeRequest extends js.Object {
  /**
    *  The Assignment-level Review Policy applies to the assignments under the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
  /**
    *  The HITLayoutId allows you to use a pre-existing HIT design with placeholder values and create an additional HIT by providing those values as HITLayoutParameters.   Constraints: Either a Question parameter or a HITLayoutId parameter must be provided. 
    */
  var HITLayoutId: js.UndefOr[EntityId] = js.undefined
  /**
    *  If the HITLayoutId is provided, any placeholder values must be filled in with values using the HITLayoutParameter structure. For more information, see HITLayout. 
    */
  var HITLayoutParameters: js.UndefOr[HITLayoutParameterList] = js.undefined
  /**
    *  The HIT-level Review Policy applies to the HIT. You can specify for Mechanical Turk to take various actions based on the policy. 
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.undefined
  /**
    * The HIT type ID you want to create this HIT with.
    */
  var HITTypeId: EntityId
  /**
    *  An amount of time, in seconds, after which the HIT is no longer available for users to accept. After the lifetime of the HIT elapses, the HIT no longer appears in HIT searches, even if not all of the assignments for the HIT have been accepted. 
    */
  var LifetimeInSeconds: Long
  /**
    *  The number of times the HIT can be accepted and completed before the HIT becomes unavailable. 
    */
  var MaxAssignments: js.UndefOr[Integer] = js.undefined
  /**
    *  The data the person completing the HIT uses to produce the results.   Constraints: Must be a QuestionForm data structure, an ExternalQuestion data structure, or an HTMLQuestion data structure. The XML question data must not be larger than 64 kilobytes (65,535 bytes) in size, including whitespace.  Either a Question parameter or a HITLayoutId parameter must be provided.
    */
  var Question: js.UndefOr[String] = js.undefined
  /**
    *  An arbitrary data field. The RequesterAnnotation parameter lets your application attach arbitrary data to the HIT for tracking purposes. For example, this parameter could be an identifier internal to the Requester's application that corresponds with the HIT.   The RequesterAnnotation parameter for a HIT is only visible to the Requester who created the HIT. It is not shown to the Worker, or any other Requester.   The RequesterAnnotation parameter may be different for each HIT you submit. It does not affect how your HITs are grouped. 
    */
  var RequesterAnnotation: js.UndefOr[String] = js.undefined
  /**
    *  A unique identifier for this request which allows you to retry the call on error without creating duplicate HITs. This is useful in cases such as network timeouts where it is unclear whether or not the call succeeded on the server. If the HIT already exists in the system from a previous call using the same UniqueRequestToken, subsequent calls will return a AWS.MechanicalTurk.HitAlreadyExists error with a message containing the HITId.    Note: It is your responsibility to ensure uniqueness of the token. The unique token expires after 24 hours. Subsequent calls using the same UniqueRequestToken made after the 24 hour limit could create duplicate HITs.  
    */
  var UniqueRequestToken: js.UndefOr[IdempotencyToken] = js.undefined
}

object CreateHITWithHITTypeRequest {
  @scala.inline
  def apply(
    HITTypeId: EntityId,
    LifetimeInSeconds: Long,
    AssignmentReviewPolicy: ReviewPolicy = null,
    HITLayoutId: EntityId = null,
    HITLayoutParameters: HITLayoutParameterList = null,
    HITReviewPolicy: ReviewPolicy = null,
    MaxAssignments: Int | Double = null,
    Question: String = null,
    RequesterAnnotation: String = null,
    UniqueRequestToken: IdempotencyToken = null
  ): CreateHITWithHITTypeRequest = {
    val __obj = js.Dynamic.literal(HITTypeId = HITTypeId, LifetimeInSeconds = LifetimeInSeconds)
    if (AssignmentReviewPolicy != null) __obj.updateDynamic("AssignmentReviewPolicy")(AssignmentReviewPolicy)
    if (HITLayoutId != null) __obj.updateDynamic("HITLayoutId")(HITLayoutId)
    if (HITLayoutParameters != null) __obj.updateDynamic("HITLayoutParameters")(HITLayoutParameters)
    if (HITReviewPolicy != null) __obj.updateDynamic("HITReviewPolicy")(HITReviewPolicy)
    if (MaxAssignments != null) __obj.updateDynamic("MaxAssignments")(MaxAssignments.asInstanceOf[js.Any])
    if (Question != null) __obj.updateDynamic("Question")(Question)
    if (RequesterAnnotation != null) __obj.updateDynamic("RequesterAnnotation")(RequesterAnnotation)
    if (UniqueRequestToken != null) __obj.updateDynamic("UniqueRequestToken")(UniqueRequestToken)
    __obj.asInstanceOf[CreateHITWithHITTypeRequest]
  }
}

