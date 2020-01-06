package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: PortNumber = js.native
  /**
    * The protocol used for the port mapping. Specify one protocol.
    */
  var protocol: PortProtocol = js.native
}

object PortMapping {
  @scala.inline
  def apply(port: PortNumber, protocol: PortProtocol): PortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortMapping]
  }
}

