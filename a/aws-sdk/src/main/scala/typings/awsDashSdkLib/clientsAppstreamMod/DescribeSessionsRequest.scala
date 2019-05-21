package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSessionsRequest extends js.Object {
  /**
    * The authentication method. Specify API for a user authenticated using a streaming URL or SAML for a SAML federated user. The default is to authenticate users using a streaming URL.
    */
  var AuthenticationType: js.UndefOr[AuthenticationType] = js.undefined
  /**
    * The name of the fleet. This value is case-sensitive.
    */
  var FleetName: String
  /**
    * The size of each page of results. The default value is 20 and the maximum value is 50.
    */
  var Limit: js.UndefOr[Integer] = js.undefined
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The name of the stack. This value is case-sensitive.
    */
  var StackName: String
  /**
    * The user identifier.
    */
  var UserId: js.UndefOr[UserId] = js.undefined
}

object DescribeSessionsRequest {
  @scala.inline
  def apply(
    FleetName: String,
    StackName: String,
    AuthenticationType: AuthenticationType = null,
    Limit: js.UndefOr[Integer] = js.undefined,
    NextToken: String = null,
    UserId: UserId = null
  ): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName, StackName = StackName)
    if (AuthenticationType != null) __obj.updateDynamic("AuthenticationType")(AuthenticationType.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (UserId != null) __obj.updateDynamic("UserId")(UserId)
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
}

