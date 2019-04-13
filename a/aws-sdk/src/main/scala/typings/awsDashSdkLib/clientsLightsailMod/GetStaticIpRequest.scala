package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStaticIpRequest extends js.Object {
  /**
    * The name of the static IP in Lightsail.
    */
  var staticIpName: ResourceName
}

object GetStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): GetStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName)
  
    __obj.asInstanceOf[GetStaticIpRequest]
  }
}

