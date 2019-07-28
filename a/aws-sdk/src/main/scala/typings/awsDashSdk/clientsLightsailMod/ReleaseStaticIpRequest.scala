package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReleaseStaticIpRequest extends js.Object {
  /**
    * The name of the static IP to delete.
    */
  var staticIpName: ResourceName
}

object ReleaseStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): ReleaseStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName)
  
    __obj.asInstanceOf[ReleaseStaticIpRequest]
  }
}

