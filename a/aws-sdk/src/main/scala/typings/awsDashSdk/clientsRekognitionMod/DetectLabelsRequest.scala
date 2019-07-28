package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectLabelsRequest extends js.Object {
  /**
    * The input image as base64-encoded bytes or an S3 object. If you use the AWS CLI to call Amazon Rekognition operations, passing image bytes is not supported. Images stored in an S3 Bucket do not need to be base64-encoded. If you are using an AWS SDK to call Amazon Rekognition, you might not need to base64-encode image bytes passed using the Bytes field. For more information, see Images in the Amazon Rekognition developer guide.
    */
  var Image: typings.awsDashSdk.clientsRekognitionMod.Image
  /**
    * Maximum number of labels you want the service to return in the response. The service returns the specified number of highest confidence labels. 
    */
  var MaxLabels: js.UndefOr[UInteger] = js.undefined
  /**
    * Specifies the minimum confidence level for the labels to return. Amazon Rekognition doesn't return any labels with confidence lower than this specified value. If MinConfidence is not specified, the operation returns labels with a confidence values greater than or equal to 55 percent.
    */
  var MinConfidence: js.UndefOr[Percent] = js.undefined
}

object DetectLabelsRequest {
  @scala.inline
  def apply(
    Image: Image,
    MaxLabels: js.UndefOr[UInteger] = js.undefined,
    MinConfidence: js.UndefOr[Percent] = js.undefined
  ): DetectLabelsRequest = {
    val __obj = js.Dynamic.literal(Image = Image)
    if (!js.isUndefined(MaxLabels)) __obj.updateDynamic("MaxLabels")(MaxLabels)
    if (!js.isUndefined(MinConfidence)) __obj.updateDynamic("MinConfidence")(MinConfidence)
    __obj.asInstanceOf[DetectLabelsRequest]
  }
}

