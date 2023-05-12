package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnnotationStoreRequest extends StObject {
  
  /**
    * A description for the store.
    */
  var description: js.UndefOr[StoreDescription] = js.undefined
  
  /**
    * A name for the store.
    */
  var name: js.UndefOr[CreateAnnotationStoreRequestNameString] = js.undefined
  
  /**
    * The genome reference for the store's annotations.
    */
  var reference: js.UndefOr[ReferenceItem] = js.undefined
  
  /**
    * Server-side encryption (SSE) settings for the store.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
  
  /**
    * The annotation file format of the store.
    */
  var storeFormat: StoreFormat
  
  /**
    * File parsing options for the annotation store.
    */
  var storeOptions: js.UndefOr[StoreOptions] = js.undefined
  
  /**
    * Tags for the store.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateAnnotationStoreRequest {
  
  inline def apply(storeFormat: StoreFormat): CreateAnnotationStoreRequest = {
    val __obj = js.Dynamic.literal(storeFormat = storeFormat.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnnotationStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnnotationStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: CreateAnnotationStoreRequestNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setReferenceUndefined: Self = StObject.set(x, "reference", js.undefined)
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
    
    inline def setStoreFormat(value: StoreFormat): Self = StObject.set(x, "storeFormat", value.asInstanceOf[js.Any])
    
    inline def setStoreOptions(value: StoreOptions): Self = StObject.set(x, "storeOptions", value.asInstanceOf[js.Any])
    
    inline def setStoreOptionsUndefined: Self = StObject.set(x, "storeOptions", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
