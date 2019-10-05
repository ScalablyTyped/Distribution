package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateDynamicThingGroupResponse extends js.Object {
  /**
    * The dynamic thing group version.
    */
  var version: js.UndefOr[Version] = js.undefined
}

object UpdateDynamicThingGroupResponse {
  @scala.inline
  def apply(version: Int | Double = null): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
}

