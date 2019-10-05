package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceDetail extends js.Object {
  /**
    * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
    */
  var AgeRange: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.AgeRange] = js.undefined
  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  var Beard: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Beard] = js.undefined
  /**
    * Bounding box of the face. Default attribute.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.undefined
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  var Emotions: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Emotions] = js.undefined
  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  var Eyeglasses: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Eyeglasses] = js.undefined
  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  var EyesOpen: js.UndefOr[EyeOpen] = js.undefined
  /**
    * Gender of the face and the confidence level in the determination.
    */
  var Gender: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Gender] = js.undefined
  /**
    * Indicates the location of landmarks on the face. Default attribute.
    */
  var Landmarks: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Landmarks] = js.undefined
  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  var MouthOpen: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.MouthOpen] = js.undefined
  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  var Mustache: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Mustache] = js.undefined
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
    */
  var Pose: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Pose] = js.undefined
  /**
    * Identifies image brightness and sharpness. Default attribute.
    */
  var Quality: js.UndefOr[ImageQuality] = js.undefined
  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  var Smile: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Smile] = js.undefined
  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  var Sunglasses: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Sunglasses] = js.undefined
}

object FaceDetail {
  @scala.inline
  def apply(
    AgeRange: AgeRange = null,
    Beard: Beard = null,
    BoundingBox: BoundingBox = null,
    Confidence: Int | Double = null,
    Emotions: Emotions = null,
    Eyeglasses: Eyeglasses = null,
    EyesOpen: EyeOpen = null,
    Gender: Gender = null,
    Landmarks: Landmarks = null,
    MouthOpen: MouthOpen = null,
    Mustache: Mustache = null,
    Pose: Pose = null,
    Quality: ImageQuality = null,
    Smile: Smile = null,
    Sunglasses: Sunglasses = null
  ): FaceDetail = {
    val __obj = js.Dynamic.literal()
    if (AgeRange != null) __obj.updateDynamic("AgeRange")(AgeRange)
    if (Beard != null) __obj.updateDynamic("Beard")(Beard)
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Emotions != null) __obj.updateDynamic("Emotions")(Emotions)
    if (Eyeglasses != null) __obj.updateDynamic("Eyeglasses")(Eyeglasses)
    if (EyesOpen != null) __obj.updateDynamic("EyesOpen")(EyesOpen)
    if (Gender != null) __obj.updateDynamic("Gender")(Gender)
    if (Landmarks != null) __obj.updateDynamic("Landmarks")(Landmarks)
    if (MouthOpen != null) __obj.updateDynamic("MouthOpen")(MouthOpen)
    if (Mustache != null) __obj.updateDynamic("Mustache")(Mustache)
    if (Pose != null) __obj.updateDynamic("Pose")(Pose)
    if (Quality != null) __obj.updateDynamic("Quality")(Quality)
    if (Smile != null) __obj.updateDynamic("Smile")(Smile)
    if (Sunglasses != null) __obj.updateDynamic("Sunglasses")(Sunglasses)
    __obj.asInstanceOf[FaceDetail]
  }
}

