package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  /**
    * The URL of the broker's ActiveMQ Web Console.
    */
  var ConsoleURL: js.UndefOr[__string] = js.native
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[__listOf__string] = js.native
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker.
    */
  var IpAddress: js.UndefOr[__string] = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(ConsoleURL: __string = null, Endpoints: __listOf__string = null, IpAddress: __string = null): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    if (ConsoleURL != null) __obj.updateDynamic("ConsoleURL")(ConsoleURL.asInstanceOf[js.Any])
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints.asInstanceOf[js.Any])
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerInstance]
  }
}

