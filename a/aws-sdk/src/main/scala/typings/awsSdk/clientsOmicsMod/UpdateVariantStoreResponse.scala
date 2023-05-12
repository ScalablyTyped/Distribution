package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateVariantStoreResponse extends StObject {
  
  /**
    * When the store was created.
    */
  var creationTime: js.Date
  
  /**
    * The store's description.
    */
  var description: StoreDescription
  
  /**
    * The store's ID.
    */
  var id: ResourceId
  
  /**
    * The store's name.
    */
  var name: String
  
  /**
    * The store's genome reference.
    */
  var reference: ReferenceItem
  
  /**
    * The store's status.
    */
  var status: StoreStatus
  
  /**
    * When the store was updated.
    */
  var updateTime: js.Date
}
object UpdateVariantStoreResponse {
  
  inline def apply(
    creationTime: js.Date,
    description: StoreDescription,
    id: ResourceId,
    name: String,
    reference: ReferenceItem,
    status: StoreStatus,
    updateTime: js.Date
  ): UpdateVariantStoreResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateVariantStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateVariantStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
