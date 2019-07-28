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
  def apply(
    Pitch: js.UndefOr[Degree] = js.undefined,
    Roll: js.UndefOr[Degree] = js.undefined,
    Yaw: js.UndefOr[Degree] = js.undefined
  ): Pose = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Pitch)) __obj.updateDynamic("Pitch")(Pitch)
    if (!js.isUndefined(Roll)) __obj.updateDynamic("Roll")(Roll)
    if (!js.isUndefined(Yaw)) __obj.updateDynamic("Yaw")(Yaw)
    __obj.asInstanceOf[Pose]
  }
}

