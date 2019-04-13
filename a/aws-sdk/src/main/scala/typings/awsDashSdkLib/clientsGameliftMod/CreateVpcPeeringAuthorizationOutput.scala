package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcPeeringAuthorizationOutput extends js.Object {
  /**
    * Details on the requested VPC peering authorization, including expiration.
    */
  var VpcPeeringAuthorization: js.UndefOr[VpcPeeringAuthorization] = js.undefined
}

object CreateVpcPeeringAuthorizationOutput {
  @scala.inline
  def apply(VpcPeeringAuthorization: VpcPeeringAuthorization = null): CreateVpcPeeringAuthorizationOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringAuthorization != null) __obj.updateDynamic("VpcPeeringAuthorization")(VpcPeeringAuthorization)
    __obj.asInstanceOf[CreateVpcPeeringAuthorizationOutput]
  }
}

