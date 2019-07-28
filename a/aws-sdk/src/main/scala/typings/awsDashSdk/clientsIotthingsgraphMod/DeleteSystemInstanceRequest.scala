package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteSystemInstanceRequest extends js.Object {
  /**
    * The ID of the system instance to be deleted.
    */
  var id: js.UndefOr[Urn] = js.undefined
}

object DeleteSystemInstanceRequest {
  @scala.inline
  def apply(id: Urn = null): DeleteSystemInstanceRequest = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DeleteSystemInstanceRequest]
  }
}

