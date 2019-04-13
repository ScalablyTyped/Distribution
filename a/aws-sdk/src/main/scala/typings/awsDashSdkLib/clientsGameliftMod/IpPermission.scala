package typings
package awsDashSdkLib.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IpPermission extends js.Object {
  /**
    * Starting value for a range of allowed port numbers.
    */
  var FromPort: PortNumber
  /**
    * Range of allowed IP addresses. This value must be expressed in CIDR notation. Example: "000.000.000.000/[subnet mask]" or optionally the shortened version "0.0.0.0/[subnet mask]".
    */
  var IpRange: NonBlankString
  /**
    * Network communication protocol used by the fleet.
    */
  var Protocol: IpProtocol
  /**
    * Ending value for a range of allowed port numbers. Port numbers are end-inclusive. This value must be higher than FromPort.
    */
  var ToPort: PortNumber
}

object IpPermission {
  @scala.inline
  def apply(FromPort: PortNumber, IpRange: NonBlankString, Protocol: IpProtocol, ToPort: PortNumber): IpPermission = {
    val __obj = js.Dynamic.literal(FromPort = FromPort, IpRange = IpRange, Protocol = Protocol.asInstanceOf[js.Any], ToPort = ToPort)
  
    __obj.asInstanceOf[IpPermission]
  }
}

