package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIAMPolicyAssignmentsForUserResponse extends js.Object {
  /**
    * The active assignments for this user.
    */
  var ActiveAssignments: js.UndefOr[ActiveIAMPolicyAssignmentList] = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object ListIAMPolicyAssignmentsForUserResponse {
  @scala.inline
  def apply(
    ActiveAssignments: ActiveIAMPolicyAssignmentList = null,
    NextToken: String = null,
    RequestId: String = null,
    Status: Int | scala.Double = null
  ): ListIAMPolicyAssignmentsForUserResponse = {
    val __obj = js.Dynamic.literal()
    if (ActiveAssignments != null) __obj.updateDynamic("ActiveAssignments")(ActiveAssignments.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIAMPolicyAssignmentsForUserResponse]
  }
}

