package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInstanceProfileResult extends js.Object {
  /**
    * An object containing information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
}

object CreateInstanceProfileResult {
  @scala.inline
  def apply(instanceProfile: InstanceProfile = null): CreateInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile)
    __obj.asInstanceOf[CreateInstanceProfileResult]
  }
}

