package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeSessionsRequest extends js.Object {
  /**
    * The authentication method. Specify API for a user authenticated using a streaming URL or SAML for a SAML federated user. The default is to authenticate users using a streaming URL.
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.appstreamMod.AuthenticationType] = js.native
  /**
    * The name of the fleet. This value is case-sensitive.
    */
  var FleetName: String = js.native
  /**
    * The size of each page of results. The default value is 20 and the maximum value is 50.
    */
  var Limit: js.UndefOr[Integer] = js.native
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.native
  /**
    * The name of the stack. This value is case-sensitive.
    */
  var StackName: String = js.native
  /**
    * The user identifier.
    */
  var UserId: js.UndefOr[typings.awsSdk.appstreamMod.UserId] = js.native
}

object DescribeSessionsRequest {
  @scala.inline
  def apply(FleetName: String, StackName: String): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
  @scala.inline
  implicit class DescribeSessionsRequestOps[Self <: DescribeSessionsRequest] (val x: Self) extends AnyVal {
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
    def setFleetName(value: String): Self = this.set("FleetName", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackName(value: String): Self = this.set("StackName", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = this.set("AuthenticationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthenticationType: Self = this.set("AuthenticationType", js.undefined)
    @scala.inline
    def setLimit(value: Integer): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: String): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserId(value: UserId): Self = this.set("UserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserId: Self = this.set("UserId", js.undefined)
  }
  
}

