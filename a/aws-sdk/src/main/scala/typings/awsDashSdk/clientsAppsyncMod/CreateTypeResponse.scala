package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateTypeResponse extends js.Object {
  /**
    * The Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object CreateTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): CreateTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CreateTypeResponse]
  }
}

