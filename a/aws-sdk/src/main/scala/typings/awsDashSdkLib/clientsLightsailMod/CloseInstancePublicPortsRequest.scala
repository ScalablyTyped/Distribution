package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloseInstancePublicPortsRequest extends js.Object {
  /**
    * The name of the instance on which you're attempting to close the public ports.
    */
  var instanceName: ResourceName
  /**
    * Information about the public port you are trying to close.
    */
  var portInfo: PortInfo
}

object CloseInstancePublicPortsRequest {
  @scala.inline
  def apply(instanceName: ResourceName, portInfo: PortInfo): CloseInstancePublicPortsRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName, portInfo = portInfo)
  
    __obj.asInstanceOf[CloseInstancePublicPortsRequest]
  }
}

