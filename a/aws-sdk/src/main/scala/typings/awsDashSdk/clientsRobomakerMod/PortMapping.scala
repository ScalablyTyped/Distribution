package typings.awsDashSdk.clientsRobomakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortMapping extends js.Object {
  /**
    * The port number on the application.
    */
  var applicationPort: NonSystemPort
  /**
    * A Boolean indicating whether to enable this port mapping on public IP.
    */
  var enableOnPublicIp: js.UndefOr[Boolean] = js.undefined
  /**
    * The port number on the simulation job instance to use as a remote connection point. 
    */
  var jobPort: Port
}

object PortMapping {
  @scala.inline
  def apply(
    applicationPort: NonSystemPort,
    jobPort: Port,
    enableOnPublicIp: js.UndefOr[Boolean] = js.undefined
  ): PortMapping = {
    val __obj = js.Dynamic.literal(applicationPort = applicationPort, jobPort = jobPort)
    if (!js.isUndefined(enableOnPublicIp)) __obj.updateDynamic("enableOnPublicIp")(enableOnPublicIp)
    __obj.asInstanceOf[PortMapping]
  }
}

