package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CompareFacesRequest extends js.Object {
  /**
    * The minimum level of confidence in the face matches that a match must meet to be included in the FaceMatches array.
    */
  var SimilarityThreshold: js.UndefOr[Percent] = js.undefined
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var SourceImage: Image
  /**
    * The target image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var TargetImage: Image
}

object CompareFacesRequest {
  @scala.inline
  def apply(SourceImage: Image, TargetImage: Image, SimilarityThreshold: js.UndefOr[Percent] = js.undefined): CompareFacesRequest = {
    val __obj = js.Dynamic.literal(SourceImage = SourceImage, TargetImage = TargetImage)
    if (!js.isUndefined(SimilarityThreshold)) __obj.updateDynamic("SimilarityThreshold")(SimilarityThreshold)
    __obj.asInstanceOf[CompareFacesRequest]
  }
}

