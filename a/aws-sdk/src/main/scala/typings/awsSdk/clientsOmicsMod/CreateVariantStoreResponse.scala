package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVariantStoreResponse extends StObject {
  
  /**
    * When the store was created.
    */
  var creationTime: js.Date
  
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
  var reference: js.UndefOr[ReferenceItem] = js.undefined
  
  /**
    * The store's status.
    */
  var status: StoreStatus
}
object CreateVariantStoreResponse {
  
  inline def apply(creationTime: js.Date, id: ResourceId, name: String, status: StoreStatus): CreateVariantStoreResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVariantStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVariantStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
