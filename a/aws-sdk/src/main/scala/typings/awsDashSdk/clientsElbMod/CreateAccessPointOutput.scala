package typings.awsDashSdk.clientsElbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateAccessPointOutput extends js.Object {
  /**
    * The DNS name of the load balancer.
    */
  var DNSName: js.UndefOr[typings.awsDashSdk.clientsElbMod.DNSName] = js.native
}

object CreateAccessPointOutput {
  @scala.inline
  def apply(DNSName: DNSName = null): CreateAccessPointOutput = {
    val __obj = js.Dynamic.literal()
    if (DNSName != null) __obj.updateDynamic("DNSName")(DNSName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAccessPointOutput]
  }
}

