package typings.awsDashSdk.clientsRekognitionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteFacesRequest extends js.Object {
  /**
    * Collection from which to remove the specific faces.
    */
  var CollectionId: typings.awsDashSdk.clientsRekognitionMod.CollectionId
  /**
    * An array of face IDs to delete.
    */
  var FaceIds: FaceIdList
}

object DeleteFacesRequest {
  @scala.inline
  def apply(CollectionId: CollectionId, FaceIds: FaceIdList): DeleteFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId, FaceIds = FaceIds)
  
    __obj.asInstanceOf[DeleteFacesRequest]
  }
}

