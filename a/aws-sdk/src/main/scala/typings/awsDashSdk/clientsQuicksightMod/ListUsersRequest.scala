package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUsersRequest extends js.Object {
  /**
    * The ID for the AWS account that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
    */
  var AwsAccountId: typings.awsDashSdk.clientsQuicksightMod.AwsAccountId
  /**
    * The maximum number of results to return from this request.
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

object ListUsersRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null
  ): ListUsersRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUsersRequest]
  }
}

