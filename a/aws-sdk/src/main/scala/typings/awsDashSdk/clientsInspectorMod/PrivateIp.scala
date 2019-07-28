package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PrivateIp extends js.Object {
  /**
    * The DNS name of the private IP address.
    */
  var privateDnsName: js.UndefOr[Text] = js.undefined
  /**
    * The full IP address of the network inteface.
    */
  var privateIpAddress: js.UndefOr[Text] = js.undefined
}

object PrivateIp {
  @scala.inline
  def apply(privateDnsName: Text = null, privateIpAddress: Text = null): PrivateIp = {
    val __obj = js.Dynamic.literal()
    if (privateDnsName != null) __obj.updateDynamic("privateDnsName")(privateDnsName)
    if (privateIpAddress != null) __obj.updateDynamic("privateIpAddress")(privateIpAddress)
    __obj.asInstanceOf[PrivateIp]
  }
}

