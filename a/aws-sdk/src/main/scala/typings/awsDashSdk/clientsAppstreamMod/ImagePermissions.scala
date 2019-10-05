package typings.awsDashSdk.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImagePermissions extends js.Object {
  /**
    * Indicates whether the image can be used for a fleet.
    */
  var allowFleet: js.UndefOr[BooleanObject] = js.undefined
  /**
    * Indicates whether the image can be used for an image builder.
    */
  var allowImageBuilder: js.UndefOr[BooleanObject] = js.undefined
}

object ImagePermissions {
  @scala.inline
  def apply(
    allowFleet: js.UndefOr[scala.Boolean] = js.undefined,
    allowImageBuilder: js.UndefOr[scala.Boolean] = js.undefined
  ): ImagePermissions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowFleet)) __obj.updateDynamic("allowFleet")(allowFleet)
    if (!js.isUndefined(allowImageBuilder)) __obj.updateDynamic("allowImageBuilder")(allowImageBuilder)
    __obj.asInstanceOf[ImagePermissions]
  }
}

