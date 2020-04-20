package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceStatus extends js.Object {
  /**
    * The current status of the virtual service.
    */
  var status: VirtualServiceStatusCode = js.native
}

object VirtualServiceStatus {
  @scala.inline
  def apply(status: VirtualServiceStatusCode): VirtualServiceStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceStatus]
  }
}

