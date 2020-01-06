package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateTypeResponse extends js.Object {
  /**
    * The updated Type object.
    */
  var `type`: js.UndefOr[Type] = js.native
}

object UpdateTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): UpdateTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateTypeResponse]
  }
}

