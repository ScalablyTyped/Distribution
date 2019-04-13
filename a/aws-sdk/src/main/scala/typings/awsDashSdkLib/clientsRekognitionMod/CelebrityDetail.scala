package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CelebrityDetail extends js.Object {
  /**
    * Bounding box around the body of a celebrity.
    */
  var BoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * The confidence, in percentage, that Amazon Rekognition has that the recognized face is the celebrity. 
    */
  var Confidence: js.UndefOr[Percent] = js.undefined
  /**
    * Face details for the recognized celebrity.
    */
  var Face: js.UndefOr[FaceDetail] = js.undefined
  /**
    * The unique identifier for the celebrity. 
    */
  var Id: js.UndefOr[RekognitionUniqueId] = js.undefined
  /**
    * The name of the celebrity.
    */
  var Name: js.UndefOr[String] = js.undefined
  /**
    * An array of URLs pointing to additional celebrity information. 
    */
  var Urls: js.UndefOr[Urls] = js.undefined
}

object CelebrityDetail {
  @scala.inline
  def apply(
    BoundingBox: BoundingBox = null,
    Confidence: js.UndefOr[Percent] = js.undefined,
    Face: FaceDetail = null,
    Id: RekognitionUniqueId = null,
    Name: String = null,
    Urls: Urls = null
  ): CelebrityDetail = {
    val __obj = js.Dynamic.literal()
    if (BoundingBox != null) __obj.updateDynamic("BoundingBox")(BoundingBox)
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence)
    if (Face != null) __obj.updateDynamic("Face")(Face)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Urls != null) __obj.updateDynamic("Urls")(Urls)
    __obj.asInstanceOf[CelebrityDetail]
  }
}

