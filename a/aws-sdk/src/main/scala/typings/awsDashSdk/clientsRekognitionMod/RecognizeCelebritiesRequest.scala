package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RecognizeCelebritiesRequest extends js.Object {
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing base64-encoded image bytes is not supported.  If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsDashSdk.clientsRekognitionMod.Image
}

object RecognizeCelebritiesRequest {
  @scala.inline
  def apply(Image: Image): RecognizeCelebritiesRequest = {
    val __obj = js.Dynamic.literal(Image = Image)
  
    __obj.asInstanceOf[RecognizeCelebritiesRequest]
  }
}

