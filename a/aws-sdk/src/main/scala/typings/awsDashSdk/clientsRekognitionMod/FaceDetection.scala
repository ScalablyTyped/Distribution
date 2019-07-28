package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceDetection extends js.Object {
  /**
    * The face properties for the detected face.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  /**
    * Time, in milliseconds from the start of the video, that the face was detected.
    */
  var Timestamp: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Timestamp] = js.undefined
}

object FaceDetection {
  @scala.inline
  def apply(Face: FaceDetail = null, Timestamp: js.UndefOr[Timestamp] = js.undefined): FaceDetection = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face)
    if (!js.isUndefined(Timestamp)) __obj.updateDynamic("Timestamp")(Timestamp)
    __obj.asInstanceOf[FaceDetection]
  }
}

