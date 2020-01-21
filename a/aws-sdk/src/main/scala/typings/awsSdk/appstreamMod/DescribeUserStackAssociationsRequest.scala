package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUserStackAssociationsRequest extends js.Object {
  /**
    * The authentication type for the user who is associated with the stack. You must specify USERPOOL.
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.appstreamMod.AuthenticationType] = js.native
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appstreamMod.MaxResults] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: js.UndefOr[String] = js.native
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.native
}

object DescribeUserStackAssociationsRequest {
  @scala.inline
  def apply(
    AuthenticationType: AuthenticationType = null,
    MaxResults: Int | Double = null,
    NextToken: String = null,
    StackName: String = null,
    UserName: Username = null
  ): DescribeUserStackAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    if (AuthenticationType != null) __obj.updateDynamic("AuthenticationType")(AuthenticationType.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (StackName != null) __obj.updateDynamic("StackName")(StackName.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUserStackAssociationsRequest]
  }
}

