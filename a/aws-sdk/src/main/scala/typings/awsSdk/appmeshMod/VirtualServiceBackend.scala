package typings.awsSdk.appmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VirtualServiceBackend extends js.Object {
  /**
    * A reference to an object that represents the client policy for a backend.
    */
  var clientPolicy: js.UndefOr[ClientPolicy] = js.native
  /**
    * The name of the virtual service that is acting as a virtual node backend.
    */
  var virtualServiceName: ServiceName = js.native
}

object VirtualServiceBackend {
  @scala.inline
  def apply(virtualServiceName: ServiceName, clientPolicy: ClientPolicy = null): VirtualServiceBackend = {
    val __obj = js.Dynamic.literal(virtualServiceName = virtualServiceName.asInstanceOf[js.Any])
    if (clientPolicy != null) __obj.updateDynamic("clientPolicy")(clientPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[VirtualServiceBackend]
  }
}

