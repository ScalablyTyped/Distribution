package typings
package awsDashSdkLib.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateTypeResponse extends js.Object {
  /**
    * The updated Type object.
    */
  var `type`: js.UndefOr[Type] = js.undefined
}

object UpdateTypeResponse {
  @scala.inline
  def apply(`type`: Type = null): UpdateTypeResponse = {
    val __obj = js.Dynamic.literal()
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[UpdateTypeResponse]
  }
}

