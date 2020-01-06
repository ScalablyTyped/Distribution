package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetMissionProfileRequest extends js.Object {
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String = js.native
}

object GetMissionProfileRequest {
  @scala.inline
  def apply(missionProfileId: String): GetMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetMissionProfileRequest]
  }
}

