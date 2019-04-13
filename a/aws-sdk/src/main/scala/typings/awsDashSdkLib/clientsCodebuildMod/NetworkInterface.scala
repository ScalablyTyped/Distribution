package typings
package awsDashSdkLib.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkInterface extends js.Object {
  /**
    * The ID of the network interface.
    */
  var networkInterfaceId: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The ID of the subnet.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
}

object NetworkInterface {
  @scala.inline
  def apply(networkInterfaceId: NonEmptyString = null, subnetId: NonEmptyString = null): NetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (networkInterfaceId != null) __obj.updateDynamic("networkInterfaceId")(networkInterfaceId)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[NetworkInterface]
  }
}

