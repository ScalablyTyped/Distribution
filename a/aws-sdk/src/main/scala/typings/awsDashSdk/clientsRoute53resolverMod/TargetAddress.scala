package typings.awsDashSdk.clientsRoute53resolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetAddress extends js.Object {
  /**
    * One IP address that you want to forward DNS queries to. You can specify only IPv4 addresses.
    */
  var Ip: typings.awsDashSdk.clientsRoute53resolverMod.Ip
  /**
    * The port at Ip that you want to forward DNS queries to.
    */
  var Port: js.UndefOr[typings.awsDashSdk.clientsRoute53resolverMod.Port] = js.undefined
}

object TargetAddress {
  @scala.inline
  def apply(Ip: Ip, Port: Int | Double = null): TargetAddress = {
    val __obj = js.Dynamic.literal(Ip = Ip)
    if (Port != null) __obj.updateDynamic("Port")(Port.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetAddress]
  }
}

