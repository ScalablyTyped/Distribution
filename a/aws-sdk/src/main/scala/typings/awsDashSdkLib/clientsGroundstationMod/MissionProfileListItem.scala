package typings
package awsDashSdkLib.clientsGroundstationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MissionProfileListItem extends js.Object {
  /**
    * ARN of a mission profile.
    */
  var missionProfileArn: js.UndefOr[MissionProfileArn] = js.undefined
  /**
    * ID of a mission profile.
    */
  var missionProfileId: js.UndefOr[String] = js.undefined
  /**
    * Name of a mission profile.
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Region of a mission profile.
    */
  var region: js.UndefOr[String] = js.undefined
}

object MissionProfileListItem {
  @scala.inline
  def apply(
    missionProfileArn: MissionProfileArn = null,
    missionProfileId: String = null,
    name: String = null,
    region: String = null
  ): MissionProfileListItem = {
    val __obj = js.Dynamic.literal()
    if (missionProfileArn != null) __obj.updateDynamic("missionProfileArn")(missionProfileArn)
    if (missionProfileId != null) __obj.updateDynamic("missionProfileId")(missionProfileId)
    if (name != null) __obj.updateDynamic("name")(name)
    if (region != null) __obj.updateDynamic("region")(region)
    __obj.asInstanceOf[MissionProfileListItem]
  }
}

