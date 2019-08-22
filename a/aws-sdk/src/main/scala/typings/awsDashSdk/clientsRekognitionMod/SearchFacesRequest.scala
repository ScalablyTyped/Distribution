package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchFacesRequest extends js.Object {
  /**
    * ID of the collection the face belongs to.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
  /**
    * ID of a face to find matches for in the collection.
    */
  var FaceId: typings.awsDashSdk.clientsRekognitionMod.FaceId
  /**
    * Optional value specifying the minimum confidence in the face match to return. For example, don't return any matches where confidence in matches is less than 70%. The default value is 80%. 
    */
  var FaceMatchThreshold: js.UndefOr[Percent] = js.undefined
  /**
    * Maximum number of faces to return. The operation returns the maximum number of faces with the highest confidence in the match.
    */
  var MaxFaces: js.UndefOr[typings.awsDashSdk.clientsRekognitionMod.MaxFaces] = js.undefined
}

object SearchFacesRequest {
  @scala.inline
  def apply(
    CollectionId: CollectionId,
    FaceId: FaceId,
    FaceMatchThreshold: js.UndefOr[Percent] = js.undefined,
    MaxFaces: js.UndefOr[MaxFaces] = js.undefined
  ): SearchFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId, FaceId = FaceId)
    if (!js.isUndefined(FaceMatchThreshold)) __obj.updateDynamic("FaceMatchThreshold")(FaceMatchThreshold)
    if (!js.isUndefined(MaxFaces)) __obj.updateDynamic("MaxFaces")(MaxFaces)
    __obj.asInstanceOf[SearchFacesRequest]
  }
}

