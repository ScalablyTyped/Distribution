package typings.awsDashSdk.clientsRekognitionMod

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
  var Geometry: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.Geometry] = js.undefined
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
    Confidence: Int | Double = null,
    DetectedText: String = null,
    Geometry: Geometry = null,
    Id: Int | Double = null,
    ParentId: Int | Double = null,
    Type: TextTypes = null
  ): TextDetection = {
    val __obj = js.Dynamic.literal()
    if (Confidence != null) __obj.updateDynamic("Confidence")(Confidence.asInstanceOf[js.Any])
    if (DetectedText != null) __obj.updateDynamic("DetectedText")(DetectedText)
    if (Geometry != null) __obj.updateDynamic("Geometry")(Geometry)
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    if (ParentId != null) __obj.updateDynamic("ParentId")(ParentId.asInstanceOf[js.Any])
    if (Type != null) __obj.updateDynamic("Type")(Type.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextDetection]
  }
}

