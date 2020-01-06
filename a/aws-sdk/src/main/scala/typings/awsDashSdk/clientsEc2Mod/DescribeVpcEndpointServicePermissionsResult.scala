package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcEndpointServicePermissionsResult extends js.Object {
  /**
    * Information about one or more allowed principals.
    */
  var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.native
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object DescribeVpcEndpointServicePermissionsResult {
  @scala.inline
  def apply(AllowedPrincipals: AllowedPrincipalSet = null, NextToken: String = null): DescribeVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (AllowedPrincipals != null) __obj.updateDynamic("AllowedPrincipals")(AllowedPrincipals.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
  }
}

