package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextDetection extends js.Object {
  /**
    * The confidence that Amazon Rekognition has in the accuracy of the detected text and the accuracy of the geometry points around the detected text.
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * The word or line of text recognized by Amazon Rekognition. 
    */
  var DetectedText: js.UndefOr[String] = js.undefined
  /**
    * The location of the detected text on the image. Includes an axis aligned coarse bounding box surrounding the text and a finer grain polygon for more accurate spatial information.
    */
  var Geometry: js.UndefOr[Geometry] = js.undefined
  /**
    * The identifier for the detected text. The identifier is only unique for a single call to DetectText. 
    */
  var Id: js.UndefOr[UInteger] = js.undefined
  /**
    * The Parent identifier for the detected text identified by the value of ID. If the type of detected text is LINE, the value of ParentId is Null. 
    */
  var ParentId: js.UndefOr[UInteger] = js.undefined
  /**
    * The type of text that was detected.
    */
  var Type: js.UndefOr[TextTypes] = js.undefined
}

object TextDetection {
  @scala.inline
  def apply(
    Confidence: js.UndefOr[Percent] = js.undefined,
    DetectedText: String = null,
    Geometry: Geometry = null,
    Id: js.UndefOr[UInteger] = js.undefined,
    ParentId: js.UndefOr[UInteger] = js.undefined,
    Type: TextTypes = null
  ): TextDetection = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (DetectedText != null) __obj.updateDynamic("DetectedText")(DetectedText)
    if (Geometry != null) __obj.updateDynamic("Geometry")(Geometry)
    if (!js.isUndefined(Id)) __obj.updateDynamic("Id")(Id)
    if (!js.isUndefined(ParentId)) __obj.updateDynamic("ParentId")(ParentId)
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDetection]
  }
}

