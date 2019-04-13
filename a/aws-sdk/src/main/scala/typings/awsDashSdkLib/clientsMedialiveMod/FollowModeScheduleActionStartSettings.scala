package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FollowModeScheduleActionStartSettings extends js.Object {
  /**
    * Identifies whether this action starts relative to the start or relative to the end of the reference action.
    */
  var FollowPoint: awsDashSdkLib.clientsMedialiveMod.FollowPoint
  /**
    * The action name of another action that this one refers to.
    */
  var ReferenceActionName: __string
}

object FollowModeScheduleActionStartSettings {
  @scala.inline
  def apply(FollowPoint: FollowPoint, ReferenceActionName: __string): FollowModeScheduleActionStartSettings = {
    val __obj = js.Dynamic.literal(FollowPoint = FollowPoint.asInstanceOf[js.Any], ReferenceActionName = ReferenceActionName)
  
    __obj.asInstanceOf[FollowModeScheduleActionStartSettings]
  }
}

