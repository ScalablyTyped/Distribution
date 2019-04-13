package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateVpcResult extends js.Object {
  /**
    * Information about the VPC.
    */
  var Vpc: js.UndefOr[Vpc] = js.undefined
}

object CreateVpcResult {
  @scala.inline
  def apply(Vpc: Vpc = null): CreateVpcResult = {
    val __obj = js.Dynamic.literal()
    if (Vpc != null) __obj.updateDynamic("Vpc")(Vpc)
    __obj.asInstanceOf[CreateVpcResult]
  }
}

