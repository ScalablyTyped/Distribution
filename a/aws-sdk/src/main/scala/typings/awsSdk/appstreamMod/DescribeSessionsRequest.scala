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
  def apply(
    FleetName: String,
    StackName: String,
    AuthenticationType: AuthenticationType = null,
    Limit: Int | Double = null,
    NextToken: String = null,
    UserId: UserId = null
  ): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    if (AuthenticationType != null) __obj.updateDynamic("AuthenticationType")(AuthenticationType.asInstanceOf[js.Any])
    if (Limit != null) __obj.updateDynamic("Limit")(Limit.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserId != null) __obj.updateDynamic("UserId")(UserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
}

