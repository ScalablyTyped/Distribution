package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FaceRecord extends js.Object {
  /**
    * Describes the face properties such as the bounding box, face ID, image ID of the input image, and external image ID that you assigned. 
    */
  var Face: js.UndefOr[Face] = js.undefined
  /**
    * Structure containing attributes of the face that the algorithm detected.
    */
  var FaceDetail: js.UndefOr[FaceDetail] = js.undefined
}

object FaceRecord {
  @scala.inline
  def apply(Face: Face = null, FaceDetail: FaceDetail = null): FaceRecord = {
    val __obj = js.Dynamic.literal()
    if (Face != null) __obj.updateDynamic("Face")(Face)
    if (FaceDetail != null) __obj.updateDynamic("FaceDetail")(FaceDetail)
    __obj.asInstanceOf[FaceRecord]
  }
}

