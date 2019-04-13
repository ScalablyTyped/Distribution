package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeUserStackAssociationsRequest extends js.Object {
  /**
    * The authentication type for the user who is associated with the stack. You must specify USERPOOL.
    */
  var AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: js.UndefOr[String] = js.undefined
  /**
    * The email address of the user who is associated with the stack.
    */
  var UserName: js.UndefOr[Username] = js.undefined
}

object DescribeUserStackAssociationsRequest {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType = null,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: String = null,
    StackName: String = null,
    UserName: Username = null
  ): DescribeUserStackAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationType != null) __obj.updateDynamic("AuthenticationType")(AuthenticationType.asInstanceOf[js.Any])
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    if (UserName != null) __obj.updateDynamic("UserName")(UserName)
    __obj.asInstanceOf[DescribeUserStackAssociationsRequest]
  }
}

