package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateSubnetResult extends js.Object {
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[Subnet] = js.undefined
}

object CreateSubnetResult {
  @scala.inline
  def apply(Subnet: Subnet = null): CreateSubnetResult = {
    val __obj = js.Dynamic.literal()
    if (Subnet != null) __obj.updateDynamic("Subnet")(Subnet)
    __obj.asInstanceOf[CreateSubnetResult]
  }
}

