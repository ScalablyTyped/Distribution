package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInstanceProfileResult extends js.Object {
  /**
    * An object containing information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
}

object UpdateInstanceProfileResult {
  @scala.inline
  def apply(instanceProfile: InstanceProfile = null): UpdateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile)
    __obj.asInstanceOf[UpdateInstanceProfileResult]
  }
}

