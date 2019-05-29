package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissionProfileIdResponse extends js.Object {
  /**
    * ID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
}

object MissionProfileIdResponse {
  @scala.inline
  def apply(missionProfileId: String = null): MissionProfileIdResponse = {
    val __obj = js.Dynamic.literal()
    if (missionProfileId != null) __obj.updateDynamic("missionProfileId")(missionProfileId)
    __obj.asInstanceOf[MissionProfileIdResponse]
  }
}

