package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllocateStaticIpRequest extends js.Object {
  /**
    * The name of the static IP address.
    */
  var staticIpName: ResourceName
}

object AllocateStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): AllocateStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName)
  
    __obj.asInstanceOf[AllocateStaticIpRequest]
  }
}

