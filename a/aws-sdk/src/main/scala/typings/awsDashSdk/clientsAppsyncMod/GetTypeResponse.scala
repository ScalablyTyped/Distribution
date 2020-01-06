package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetTypeResponse extends js.Object {
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.native
}

object GetTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): GetTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTypeResponse]
  }
}

