package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FaceDetail extends js.Object {
  /**
    * The estimated age range, in years, for the face. Low represents the lowest estimated age and High represents the highest estimated age.
    */
  var AgeRange: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.AgeRange] = js.native
  /**
    * Indicates whether or not the face has a beard, and the confidence level in the determination.
    */
  var Beard: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Beard] = js.native
  /**
    * Bounding box of the face. Default attribute.
    */
  var BoundingBox: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.BoundingBox] = js.native
  /**
    * Confidence level that the bounding box contains a face (and not a different object such as a tree). Default attribute.
    */
  var Confidence: js.UndefOr[Percent] = js.native
  /**
    * The emotions that appear to be expressed on the face, and the confidence level in the determination. The API is only making a determination of the physical appearance of a person's face. It is not a determination of the person’s internal emotional state and should not be used in such a way. For example, a person pretending to have a sad face might not be sad emotionally.
    */
  var Emotions: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Emotions] = js.native
  /**
    * Indicates whether or not the face is wearing eye glasses, and the confidence level in the determination.
    */
  var Eyeglasses: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Eyeglasses] = js.native
  /**
    * Indicates whether or not the eyes on the face are open, and the confidence level in the determination.
    */
  var EyesOpen: js.UndefOr[EyeOpen] = js.native
  /**
    * The predicted gender of a detected face. 
    */
  var Gender: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Gender] = js.native
  /**
    * Indicates the location of landmarks on the face. Default attribute.
    */
  var Landmarks: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Landmarks] = js.native
  /**
    * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
    */
  var MouthOpen: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.MouthOpen] = js.native
  /**
    * Indicates whether or not the face has a mustache, and the confidence level in the determination.
    */
  var Mustache: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Mustache] = js.native
  /**
    * Indicates the pose of the face as determined by its pitch, roll, and yaw. Default attribute.
    */
  var Pose: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Pose] = js.native
  /**
    * Identifies image brightness and sharpness. Default attribute.
    */
  var Quality: js.UndefOr[ImageQuality] = js.native
  /**
    * Indicates whether or not the face is smiling, and the confidence level in the determination.
    */
  var Smile: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Smile] = js.native
  /**
    * Indicates whether or not the face is wearing sunglasses, and the confidence level in the determination.
    */
  var Sunglasses: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Sunglasses] = js.native
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
    if (AgeRange != null) __obj.updateDynamic("AgeRange")(AgeRange.asInstanceOf[js.Any])
    if (Beard != null) __obj.updateDynamic("Beard")(Beard.asInstanceOf[js.Any])
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox.asInstanceOf[js.Any])
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (Emotions != null) __obj.updateDynamic("Emotions")(Emotions.asInstanceOf[js.Any])
    if (Eyeglasses != null) __obj.updateDynamic("Eyeglasses")(Eyeglasses.asInstanceOf[js.Any])
    if (EyesOpen != null) __obj.updateDynamic("EyesOpen")(EyesOpen.asInstanceOf[js.Any])
    if (Gender != null) __obj.updateDynamic("Gender")(Gender.asInstanceOf[js.Any])
    if (Landmarks != null) __obj.updateDynamic("Landmarks")(Landmarks.asInstanceOf[js.Any])
    if (MouthOpen != null) __obj.updateDynamic("MouthOpen")(MouthOpen.asInstanceOf[js.Any])
    if (Mustache != null) __obj.updateDynamic("Mustache")(Mustache.asInstanceOf[js.Any])
    if (Pose != null) __obj.updateDynamic("Pose")(Pose.asInstanceOf[js.Any])
    if (Quality != null) __obj.updateDynamic("Quality")(Quality.asInstanceOf[js.Any])
    if (Smile != null) __obj.updateDynamic("Smile")(Smile.asInstanceOf[js.Any])
    if (Sunglasses != null) __obj.updateDynamic("Sunglasses")(Sunglasses.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaceDetail]
  }
}

