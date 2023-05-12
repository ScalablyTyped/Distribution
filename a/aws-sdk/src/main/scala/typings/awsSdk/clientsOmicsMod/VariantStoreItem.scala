package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariantStoreItem extends StObject {
  
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
    * The store's server-side encryption (SSE) settings.
    */
  var sseConfig: SseConfig
  
  /**
    * The store's status.
    */
  var status: StoreStatus
  
  /**
    * The store's status message.
    */
  var statusMessage: StatusMessage
  
  /**
    * The store's ARN.
    */
  var storeArn: Arn
  
  /**
    * The store's size in bytes.
    */
  var storeSizeBytes: Long
  
  /**
    * When the store was updated.
    */
  var updateTime: js.Date
}
object VariantStoreItem {
  
  inline def apply(
    creationTime: js.Date,
    description: StoreDescription,
    id: ResourceId,
    name: String,
    reference: ReferenceItem,
    sseConfig: SseConfig,
    status: StoreStatus,
    statusMessage: StatusMessage,
    storeArn: Arn,
    storeSizeBytes: Long,
    updateTime: js.Date
  ): VariantStoreItem = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], sseConfig = sseConfig.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], storeArn = storeArn.asInstanceOf[js.Any], storeSizeBytes = storeSizeBytes.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[VariantStoreItem]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VariantStoreItem] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStoreArn(value: Arn): Self = StObject.set(x, "storeArn", value.asInstanceOf[js.Any])
    
    inline def setStoreSizeBytes(value: Long): Self = StObject.set(x, "storeSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
