package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PeerVpcResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the request operation.
    */
  var operation: js.UndefOr[Operation] = js.native
}

object PeerVpcResult {
  @scala.inline
  def apply(operation: Operation = null): PeerVpcResult = {
    val __obj = js.Dynamic.literal()
    if (operation != null) __obj.updateDynamic("operation")(operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PeerVpcResult]
  }
}

