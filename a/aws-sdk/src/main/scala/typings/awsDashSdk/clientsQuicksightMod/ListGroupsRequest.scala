package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsRequest extends js.Object {
  /**
    * The ID for the AWS account that the group is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The maximum number of results to return.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsQuicksightMod.MaxResults] = js.undefined
  /**
    * The namespace. Currently, you should set this to default.
    */
  var Namespace: typings.awsDashSdk.clientsQuicksightMod.Namespace
  /**
    * A pagination token that can be used in a subsequent request.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListGroupsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    MaxResults: Int | Double = null,
    NextToken: String = null
  ): ListGroupsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsRequest]
  }
}

