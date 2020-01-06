package typings.awsDashSdk.clientsMturkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListReviewPolicyResultsForHITResponse extends js.Object {
  /**
    *  The name of the Assignment-level Review Policy. This contains only the PolicyName element. 
    */
  var AssignmentReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    *  Contains both ReviewResult and ReviewAction elements for an Assignment. 
    */
  var AssignmentReviewReport: js.UndefOr[ReviewReport] = js.native
  /**
    * The HITId of the HIT for which results have been returned.
    */
  var HITId: js.UndefOr[EntityId] = js.native
  /**
    * The name of the HIT-level Review Policy. This contains only the PolicyName element.
    */
  var HITReviewPolicy: js.UndefOr[ReviewPolicy] = js.native
  /**
    * Contains both ReviewResult and ReviewAction elements for a particular HIT. 
    */
  var HITReviewReport: js.UndefOr[ReviewReport] = js.native
  var NextToken: js.UndefOr[PaginationToken] = js.native
}

object ListReviewPolicyResultsForHITResponse {
  @scala.inline
  def apply(
    AssignmentReviewPolicy: ReviewPolicy = null,
    AssignmentReviewReport: ReviewReport = null,
    HITId: EntityId = null,
    HITReviewPolicy: ReviewPolicy = null,
    HITReviewReport: ReviewReport = null,
    NextToken: PaginationToken = null
  ): ListReviewPolicyResultsForHITResponse = {
    val __obj = js.Dynamic.literal()
    if (AssignmentReviewPolicy != null) __obj.updateDynamic("AssignmentReviewPolicy")(AssignmentReviewPolicy.asInstanceOf[js.Any])
    if (AssignmentReviewReport != null) __obj.updateDynamic("AssignmentReviewReport")(AssignmentReviewReport.asInstanceOf[js.Any])
    if (HITId != null) __obj.updateDynamic("HITId")(HITId.asInstanceOf[js.Any])
    if (HITReviewPolicy != null) __obj.updateDynamic("HITReviewPolicy")(HITReviewPolicy.asInstanceOf[js.Any])
    if (HITReviewReport != null) __obj.updateDynamic("HITReviewReport")(HITReviewReport.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReviewPolicyResultsForHITResponse]
  }
}

