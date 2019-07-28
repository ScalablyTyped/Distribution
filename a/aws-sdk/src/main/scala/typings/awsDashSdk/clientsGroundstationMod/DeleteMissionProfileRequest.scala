package typings.awsDashSdk.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteMissionProfileRequest extends js.Object {
  /**
    * UUID of a mission profile.
    */
  var missionProfileId: String
}

object DeleteMissionProfileRequest {
  @scala.inline
  def apply(missionProfileId: String): DeleteMissionProfileRequest = {
    val __obj = js.Dynamic.literal(missionProfileId = missionProfileId)
  
    __obj.asInstanceOf[DeleteMissionProfileRequest]
  }
}

