package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReleaseStaticIpRequest extends js.Object {
  /**
    * The name of the static IP to delete.
    */
  var staticIpName: ResourceName = js.native
}

object ReleaseStaticIpRequest {
  @scala.inline
  def apply(staticIpName: ResourceName): ReleaseStaticIpRequest = {
    val __obj = js.Dynamic.literal(staticIpName = staticIpName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReleaseStaticIpRequest]
  }
}

