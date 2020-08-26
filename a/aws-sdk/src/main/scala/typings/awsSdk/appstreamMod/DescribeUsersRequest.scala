package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUsersRequest extends js.Object {
  /**
    * The authentication type for the users in the user pool to describe. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType = js.native
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeUsersRequest {
  @scala.inline
  def apply(AuthenticationType: AuthenticationType): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsersRequest]
  }
  @scala.inline
  implicit class DescribeUsersRequestOps[Self <: DescribeUsersRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxResults(value: Integer): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
  }
  
}

