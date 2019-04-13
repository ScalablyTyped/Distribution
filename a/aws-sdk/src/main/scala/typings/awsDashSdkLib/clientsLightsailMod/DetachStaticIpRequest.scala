package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetachStaticIpRequest extends js.Object {
  /**
    * The name of the static IP to detach from the instance.
    */
  var staticIpName: ResourceName
}

object DetachStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): DetachStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName)
  
    __obj.asInstanceOf[DetachStaticIpRequest]
  }
}

