package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteFargateProfileResponse extends js.Object {
  /**
    * The deleted Fargate profile.
    */
  var fargateProfile: js.UndefOr[FargateProfile] = js.native
}

object DeleteFargateProfileResponse {
  @scala.inline
  def apply(fargateProfile: FargateProfile = null): DeleteFargateProfileResponse = {
    val __obj = js.Dynamic.literal()
    if (fargateProfile != null) __obj.updateDynamic("fargateProfile")(fargateProfile.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFargateProfileResponse]
  }
}

