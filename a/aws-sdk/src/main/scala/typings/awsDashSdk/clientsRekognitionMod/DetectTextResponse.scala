package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DetectTextResponse extends js.Object {
  /**
    * An array of text that was detected in the input image.
    */
  var TextDetections: js.UndefOr[TextDetectionList] = js.undefined
}

object DetectTextResponse {
  @scala.inline
  def apply(TextDetections: TextDetectionList = null): DetectTextResponse = {
    val __obj = js.Dynamic.literal()
    if (TextDetections != null) __obj.updateDynamic("TextDetections")(TextDetections)
    __obj.asInstanceOf[DetectTextResponse]
  }
}

