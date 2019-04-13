package typings
package awsDashSdkLib.clientsIotMod

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
  def apply(version: js.UndefOr[Version] = js.undefined): UpdateThingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(version)) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[UpdateThingGroupResponse]
  }
}

