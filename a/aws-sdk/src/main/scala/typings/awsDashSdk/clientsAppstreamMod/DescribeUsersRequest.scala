package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUsersRequest extends js.Object {
  /**
    * The authentication type for the users in the user pool to describe. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsDashSdk.clientsAppstreamMod.AuthenticationType
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeUsersRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType, MaxResults: Int | Double = null, NextToken: String = null): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeUsersRequest]
  }
}

