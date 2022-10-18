package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParentEntityUpdateRequest extends StObject {
  
  /**
    * The ID of the parent entity.
    */
  var parentEntityId: js.UndefOr[ParentEntityId] = js.undefined
  
  /**
    * The type of the update.
    */
  var updateType: ParentEntityUpdateType
}
object ParentEntityUpdateRequest {
  
  inline def apply(updateType: ParentEntityUpdateType): ParentEntityUpdateRequest = {
    val __obj = js.Dynamic.literal(updateType = updateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParentEntityUpdateRequest]
  }
  
  extension [Self <: ParentEntityUpdateRequest](x: Self) {
    
    inline def setParentEntityId(value: ParentEntityId): Self = StObject.set(x, "parentEntityId", value.asInstanceOf[js.Any])
    
    inline def setParentEntityIdUndefined: Self = StObject.set(x, "parentEntityId", js.undefined)
    
    inline def setUpdateType(value: ParentEntityUpdateType): Self = StObject.set(x, "updateType", value.asInstanceOf[js.Any])
  }
}
