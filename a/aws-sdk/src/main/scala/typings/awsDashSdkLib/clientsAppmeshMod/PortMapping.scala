package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortMapping extends js.Object {
  /**
    * The port used for the port mapping.
    */
  var port: PortNumber
  /**
    * The protocol used for the port mapping.
    */
  var protocol: PortProtocol
}

object PortMapping {
  @scala.inline
  def apply(port: PortNumber, protocol: PortProtocol): PortMapping = {
    val __obj = js.Dynamic.literal(port = port, protocol = protocol.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PortMapping]
  }
}

