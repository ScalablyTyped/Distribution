package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcEndpointServicePermissionsResult extends js.Object {
  /**
    * Information about one or more allowed principals.
    */
  var AllowedPrincipals: js.UndefOr[AllowedPrincipalSet] = js.undefined
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object DescribeVpcEndpointServicePermissionsResult {
  @scala.inline
  def apply(AllowedPrincipals: AllowedPrincipalSet = null, NextToken: String = null): DescribeVpcEndpointServicePermissionsResult = {
    val __obj = js.Dynamic.literal()
    if (AllowedPrincipals != null) __obj.updateDynamic("AllowedPrincipals")(AllowedPrincipals)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeVpcEndpointServicePermissionsResult]
  }
}

