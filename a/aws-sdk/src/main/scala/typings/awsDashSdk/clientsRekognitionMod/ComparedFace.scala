package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComparedFace extends js.Object {
  /**
    * Bounding box of the face.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  /**
    * Level of confidence that what the bounding box contains is a face.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * An array of facial landmarks.
    */
  var Landmarks: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Landmarks] = js.undefined
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw.
    */
  var Pose: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Pose] = js.undefined
  /**
    * Identifies face image brightness and sharpness. 
    */
  var Quality: js.UndefOr[ImageQuality] = js.undefined
}

object ComparedFace {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: js.UndefOr[Percent] = js.undefined,
    Landmarks: Landmarks = null,
    Pose: Pose = null,
    Quality: ImageQuality = null
  ): ComparedFace = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (Landmarks != null) __obj.updateDynamic("Landmarks")(Landmarks)
    if (Pose != null) __obj.updateDynamic("Pose")(Pose)
    if (Quality != null) __obj.updateDynamic("Quality")(Quality)
    __obj.asInstanceOf[ComparedFace]
  }
}

