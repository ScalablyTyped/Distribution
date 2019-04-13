package typings
package awsDashSdkLib.clientsIotMod

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
  def apply(version: js.UndefOr[Version] = js.undefined): UpdateDynamicThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateDynamicThingGroupResponse]
  }
}

