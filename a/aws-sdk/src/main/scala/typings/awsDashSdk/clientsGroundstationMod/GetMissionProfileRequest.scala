package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetMissionProfileRequest extends js.Object {
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String
}

object GetMissionProfileRequest {
  @scala.inline
  def apply(missionProfileId: String): GetMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId)
  
    __obj.asInstanceOf[GetMissionProfileRequest]
  }
}

