package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerInstance extends js.Object {
  /**
    * The URL of the broker's ActiveMQ Web Console.
    */
  var ConsoleURL: js.UndefOr[__string] = js.undefined
  /**
    * The broker's wire-level protocol endpoints.
    */
  var Endpoints: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The IP address of the Elastic Network Interface (ENI) attached to the broker.
    */
  var IpAddress: js.UndefOr[__string] = js.undefined
}

object BrokerInstance {
  @scala.inline
  def apply(ConsoleURL: __string = null, Endpoints: __listOf__string = null, IpAddress: __string = null): BrokerInstance = {
    val __obj = js.Dynamic.literal()
    if (ConsoleURL != null) __obj.updateDynamic("ConsoleURL")(ConsoleURL)
    if (Endpoints != null) __obj.updateDynamic("Endpoints")(Endpoints)
    if (IpAddress != null) __obj.updateDynamic("IpAddress")(IpAddress)
    __obj.asInstanceOf[BrokerInstance]
  }
}

