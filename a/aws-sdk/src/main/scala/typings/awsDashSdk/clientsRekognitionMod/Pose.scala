package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Pose extends js.Object {
  /**
    * Value representing the face rotation on the pitch axis.
    */
  var Pitch: js.UndefOr[Degree] = js.undefined
  /**
    * Value representing the face rotation on the roll axis.
    */
  var Roll: js.UndefOr[Degree] = js.undefined
  /**
    * Value representing the face rotation on the yaw axis.
    */
  var Yaw: js.UndefOr[Degree] = js.undefined
}

object Pose {
  @scala.inline
  def apply(Pitch: Int | Double = null, Roll: Int | Double = null, Yaw: Int | Double = null): Pose = {
    val __obj = js.Dynamic.literal()
    if (Pitch != null) __obj.updateDynamic("Pitch")(Pitch.asInstanceOf[js.Any])
    if (Roll != null) __obj.updateDynamic("Roll")(Roll.asInstanceOf[js.Any])
    if (Yaw != null) __obj.updateDynamic("Yaw")(Yaw.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pose]
  }
}

