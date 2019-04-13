package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceProfileResult extends js.Object {
  /**
    * An object containing information about your instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.undefined
}

object GetInstanceProfileResult {
  @scala.inline
  def apply(instanceProfile: InstanceProfile = null): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile)
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
}

