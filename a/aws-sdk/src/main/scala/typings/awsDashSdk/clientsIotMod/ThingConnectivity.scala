package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ThingConnectivity extends js.Object {
  /**
    * True if the thing is connected to the AWS IoT service; false if it is not connected.
    */
  var connected: js.UndefOr[Boolean] = js.undefined
  /**
    * The epoch time (in milliseconds) when the thing last connected or disconnected. If the thing has been disconnected for more than a few weeks, the time value might be missing.
    */
  var timestamp: js.UndefOr[ConnectivityTimestamp] = js.undefined
}

object ThingConnectivity {
  @scala.inline
  def apply(connected: js.UndefOr[scala.Boolean] = js.undefined, timestamp: Int | Double = null): ThingConnectivity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(connected)) __obj.updateDynamic("connected")(connected)
    if (timestamp != null) __obj.updateDynamic("timestamp")(timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThingConnectivity]
  }
}

