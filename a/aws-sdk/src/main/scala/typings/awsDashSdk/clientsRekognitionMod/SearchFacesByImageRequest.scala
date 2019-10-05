package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFacesByImageRequest extends js.Object {
  /**
    * ID of the collection to search.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
  /**
    * (Optional) Specifies the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%.
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsDashSdk.clientsRekognitionMod.Image
  /**
    * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
    */
  var MaxFaces: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.MaxFaces] = js.undefined
}

object SearchFacesByImageRequest {
  @scala.inline
  def apply(
    CollectionId: CollectionId,
    Image: Image,
    FaceMatchThreshold: Int | Double = null,
    MaxFaces: Int | Double = null
  ): SearchFacesByImageRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId, Image = Image)
    if (FaceMatchThreshold != null) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold.asInstanceOf[js.Any])
    if (MaxFaces != null) __obj.updateDynamic("MaxFaces")(MaxFaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchFacesByImageRequest]
  }
}

