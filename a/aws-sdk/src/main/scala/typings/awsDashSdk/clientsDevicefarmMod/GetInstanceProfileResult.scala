package typings.awsDashSdk.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetInstanceProfileResult extends js.Object {
  /**
    * An object that contains information about an instance profile.
    */
  var instanceProfile: js.UndefOr[InstanceProfile] = js.native
}

object GetInstanceProfileResult {
  @scala.inline
  def apply(instanceProfile: InstanceProfile = null): GetInstanceProfileResult = {
    val __obj = js.Dynamic.literal()
    if (instanceProfile != null) __obj.updateDynamic("instanceProfile")(instanceProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetInstanceProfileResult]
  }
}

