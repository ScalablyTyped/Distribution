package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFacesByImageResponse extends js.Object {
  /**
    * An array of faces that match the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  /**
    * The bounding box around the face in the input image that Amazon Rekognition used for the search.
    */
  var SearchedFaceBoundingBox: js.UndefOr[BoundingBox] = js.undefined
  /**
    * The level of confidence that the searchedFaceBoundingBox, contains a face.
    */
  var SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
}

object SearchFacesByImageResponse {
  @scala.inline
  def apply(
    FaceMatches: FaceMatchList = null,
    FaceModelVersion: String = null,
    SearchedFaceBoundingBox: BoundingBox = null,
    SearchedFaceConfidence: js.UndefOr[Percent] = js.undefined
  ): SearchFacesByImageResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches)
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion)
    if (SearchedFaceBoundingBox != null) __obj.updateDynamic("SearchedFaceBoundingBox")(SearchedFaceBoundingBox)
    if (!js.isUndefined(SearchedFaceConfidence)) __obj.updateDynamic("SearchedFaceConfidence")(SearchedFaceConfidence)
    __obj.asInstanceOf[SearchFacesByImageResponse]
  }
}

