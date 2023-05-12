package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetAnnotationStoreResponse extends StObject {
  
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
    * A status message.
    */
  var statusMessage: StatusMessage
  
  /**
    * The store's ARN.
    */
  var storeArn: Arn
  
  /**
    * The store's annotation file format.
    */
  var storeFormat: js.UndefOr[StoreFormat] = js.undefined
  
  /**
    * The store's parsing options.
    */
  var storeOptions: js.UndefOr[StoreOptions] = js.undefined
  
  /**
    * The store's size in bytes.
    */
  var storeSizeBytes: Long
  
  /**
    * The store's tags.
    */
  var tags: TagMap
  
  /**
    * When the store was updated.
    */
  var updateTime: js.Date
}
object GetAnnotationStoreResponse {
  
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
    tags: TagMap,
    updateTime: js.Date
  ): GetAnnotationStoreResponse = {
    val __obj = js.Dynamic.literal(creationTime = creationTime.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], sseConfig = sseConfig.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusMessage = statusMessage.asInstanceOf[js.Any], storeArn = storeArn.asInstanceOf[js.Any], storeSizeBytes = storeSizeBytes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], updateTime = updateTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetAnnotationStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetAnnotationStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setId(value: ResourceId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: StoreStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: StatusMessage): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStoreArn(value: Arn): Self = StObject.set(x, "storeArn", value.asInstanceOf[js.Any])
    
    inline def setStoreFormat(value: StoreFormat): Self = StObject.set(x, "storeFormat", value.asInstanceOf[js.Any])
    
    inline def setStoreFormatUndefined: Self = StObject.set(x, "storeFormat", js.undefined)
    
    inline def setStoreOptions(value: StoreOptions): Self = StObject.set(x, "storeOptions", value.asInstanceOf[js.Any])
    
    inline def setStoreOptionsUndefined: Self = StObject.set(x, "storeOptions", js.undefined)
    
    inline def setStoreSizeBytes(value: Long): Self = StObject.set(x, "storeSizeBytes", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setUpdateTime(value: js.Date): Self = StObject.set(x, "updateTime", value.asInstanceOf[js.Any])
  }
}
