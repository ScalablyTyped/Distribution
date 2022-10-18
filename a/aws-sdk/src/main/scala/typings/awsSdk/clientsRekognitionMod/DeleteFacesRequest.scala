package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFacesRequest extends StObject {
  
  /**
    * Collection from which to remove the specific faces.
    */
  var CollectionId: typings.awsSdk.clientsRekognitionMod.CollectionId
  
  /**
    * An array of face IDs to delete.
    */
  var FaceIds: FaceIdList
}
object DeleteFacesRequest {
  
  inline def apply(CollectionId: CollectionId, FaceIds: FaceIdList): DeleteFacesRequest = {
    val __obj = js.Dynamic.literal(CollectionId = CollectionId.asInstanceOf[js.Any], FaceIds = FaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFacesRequest]
  }
  
  extension [Self <: DeleteFacesRequest](x: Self) {
    
    inline def setCollectionId(value: CollectionId): Self = StObject.set(x, "CollectionId", value.asInstanceOf[js.Any])
    
    inline def setFaceIds(value: FaceIdList): Self = StObject.set(x, "FaceIds", value.asInstanceOf[js.Any])
    
    inline def setFaceIdsVarargs(value: FaceId*): Self = StObject.set(x, "FaceIds", js.Array(value*))
  }
}
