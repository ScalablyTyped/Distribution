package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVpcPeeringAuthorizationsOutput extends js.Object {
  /**
    * Collection of objects that describe all valid VPC peering operations for the current AWS account.
    */
  var VpcPeeringAuthorizations: js.UndefOr[VpcPeeringAuthorizationList] = js.undefined
}

object DescribeVpcPeeringAuthorizationsOutput {
  @scala.inline
  def apply(VpcPeeringAuthorizations: VpcPeeringAuthorizationList = null): DescribeVpcPeeringAuthorizationsOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringAuthorizations != null) __obj.updateDynamic("VpcPeeringAuthorizations")(VpcPeeringAuthorizations)
    __obj.asInstanceOf[DescribeVpcPeeringAuthorizationsOutput]
  }
}

