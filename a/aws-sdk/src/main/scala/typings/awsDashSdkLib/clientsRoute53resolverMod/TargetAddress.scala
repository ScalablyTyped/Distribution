package typings
package awsDashSdkLib.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetAddress extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: awsDashSdkLib.clientsRoute53resolverMod.Ip
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[Port] = js.undefined
}

object TargetAddress {
  @scala.inline
  def apply(Ip: Ip, Port: js.UndefOr[Port] = js.undefined): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip)
    if (!js.isUndefined(Port)) __obj.updateDynamic("Port")(Port)
    __obj.asInstanceOf[TargetAddress]
  }
}

