package typings
package awsDashSdkLib.clientsAppmeshMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MeshStatus extends js.Object {
  /**
    * The current mesh status.
    */
  var status: js.UndefOr[MeshStatusCode] = js.undefined
}

object MeshStatus {
  @scala.inline
  def apply(status: MeshStatusCode = null): MeshStatus = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[MeshStatus]
  }
}

