package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UndeploySystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance to remove from its target.
    */
  var id: js.UndefOr[Urn] = js.undefined
}

object UndeploySystemInstanceRequest {
  @scala.inline
  def apply(id: Urn = null): UndeploySystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[UndeploySystemInstanceRequest]
  }
}

