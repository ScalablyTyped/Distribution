package typings
package awsDashSdkLib.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NetworkBinding extends js.Object {
  /**
    * The IP address that the container is bound to on the container instance.
    */
  var bindIP: js.UndefOr[String] = js.undefined
  /**
    * The port number on the container that is used with the network binding.
    */
  var containerPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The port number on the host that is used with the network binding.
    */
  var hostPort: js.UndefOr[BoxedInteger] = js.undefined
  /**
    * The protocol used for the network binding.
    */
  var protocol: js.UndefOr[TransportProtocol] = js.undefined
}

object NetworkBinding {
  @scala.inline
  def apply(
    bindIP: String = null,
    containerPort: js.UndefOr[BoxedInteger] = js.undefined,
    hostPort: js.UndefOr[BoxedInteger] = js.undefined,
    protocol: TransportProtocol = null
  ): NetworkBinding = {
    val __obj = js.Dynamic.literal()
    if (bindIP != null) __obj.updateDynamic("bindIP")(bindIP)
    if (!js.isUndefined(containerPort)) __obj.updateDynamic("containerPort")(containerPort)
    if (!js.isUndefined(hostPort)) __obj.updateDynamic("hostPort")(hostPort)
    if (protocol != null) __obj.updateDynamic("protocol")(protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkBinding]
  }
}

