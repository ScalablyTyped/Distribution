package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateThingGroupResponse extends js.Object {
  /**
    * The version of the updated thing group.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object UpdateThingGroupResponse {
  @scala.inline
  def apply(version: Int | Double = null): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
}

