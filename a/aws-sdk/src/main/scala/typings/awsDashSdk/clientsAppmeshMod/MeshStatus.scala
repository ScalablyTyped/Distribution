package typings.awsDashSdk.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MeshStatus extends js.Object {
  /**
    * The current mesh status.
    */
  var status: js.UndefOr[MeshStatusCode] = js.native
}

object MeshStatus {
  @scala.inline
  def apply(status: MeshStatusCode = null): MeshStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshStatus]
  }
}

