package typings
package awsDashSdkLib.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFacesResponse extends js.Object {
  /**
    * An array of faces that matched the input face, along with the confidence in the match.
    */
  var FaceMatches: js.UndefOr[FaceMatchList] = js.undefined
  /**
    * Version number of the face detection model associated with the input collection (CollectionId).
    */
  var FaceModelVersion: js.UndefOr[String] = js.undefined
  /**
    * ID of the face that was searched for matches in a collection.
    */
  var SearchedFaceId: js.UndefOr[FaceId] = js.undefined
}

object SearchFacesResponse {
  @scala.inline
  def apply(FaceMatches: FaceMatchList = null, FaceModelVersion: String = null, SearchedFaceId: FaceId = null): SearchFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (FaceMatches != null) __obj.updateDynamic("FaceMatches")(FaceMatches)
    if (FaceModelVersion != null) __obj.updateDynamic("FaceModelVersion")(FaceModelVersion)
    if (SearchedFaceId != null) __obj.updateDynamic("SearchedFaceId")(SearchedFaceId)
    __obj.asInstanceOf[SearchFacesResponse]
  }
}

