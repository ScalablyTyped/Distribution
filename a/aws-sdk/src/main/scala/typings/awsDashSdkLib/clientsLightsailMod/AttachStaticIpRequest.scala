package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachStaticIpRequest extends js.Object {
  /**
    * The instance name to which you want to attach the static IP address.
    */
  var instanceName: ResourceName
  /**
    * The name of the static IP.
    */
  var staticIpName: ResourceName
}

object AttachStaticIpRequest {
  @scala.inline
  def apply(instanceName: ResourceName, staticIpName: ResourceName): AttachStaticIpRequest = {
    val __obj = js.Dynamic.literal(instanceName = instanceName, staticIpName = staticIpName)
  
    __obj.asInstanceOf[AttachStaticIpRequest]
  }
}

