package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListUserGroupsRequest extends js.Object {
  /**
    * The AWS Account ID that the user is in. Currently, you use the ID for the AWS account that contains your Amazon QuickSight account.
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
  /**
    * The Amazon QuickSight user name that you want to list group memberships for.
    */
  var UserName: typings.awsDashSdk.clientsQuicksightMod.UserName
}

object ListUserGroupsRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    Namespace: Namespace,
    UserName: UserName,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null
  ): ListUserGroupsRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId, Namespace = Namespace, UserName = UserName)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListUserGroupsRequest]
  }
}

