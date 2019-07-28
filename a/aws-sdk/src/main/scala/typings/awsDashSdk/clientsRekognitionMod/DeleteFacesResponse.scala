package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFacesResponse extends js.Object {
  /**
    * An array of strings (face IDs) of the faces that were deleted.
    */
  var DeletedFaces: js.UndefOr[FaceIdList] = js.undefined
}

object DeleteFacesResponse {
  @scala.inline
  def apply(DeletedFaces: FaceIdList = null): DeleteFacesResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletedFaces != null) __obj.updateDynamic("DeletedFaces")(DeletedFaces)
    __obj.asInstanceOf[DeleteFacesResponse]
  }
}

