package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpenInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance for which you want to open the public ports.
    */
  var instanceName: ResourceName = js.native
  /**
    * An array of key-value pairs containing information about the port mappings.
    */
  var portInfo: PortInfo = js.native
}

object OpenInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): OpenInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName.asInstanceOf[js.Any], portInfo = portInfo.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[OpenInstancePublicPortsRequest]
  }
}

