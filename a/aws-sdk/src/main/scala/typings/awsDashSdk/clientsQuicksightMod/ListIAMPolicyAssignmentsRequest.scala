package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListIAMPolicyAssignmentsRequest extends js.Object {
  /**
    * The status of the assignments.
    */
  var AssignmentStatus: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.AssignmentStatus] = js.native
  /**
    * The ID of the AWS account that contains these IAM policy assignments.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.MaxResults] = js.native
  /**
    * The namespace for the assignments.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace = js.native
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListIAMPolicyAssignmentsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    AssignmentStatus: AssignmentStatus = null,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): ListIAMPolicyAssignmentsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], Namespace = Namespace.asInstanceOf[js.Any])
    if (AssignmentStatus != null) __obj.updateDynamic("AssignmentStatus")(AssignmentStatus.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListIAMPolicyAssignmentsRequest]
  }
}

