package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateVariantStoreRequest extends StObject {
  
  /**
    * A description for the store.
    */
  var description: js.UndefOr[StoreDescription] = js.undefined
  
  /**
    * A name for the store.
    */
  var name: js.UndefOr[CreateVariantStoreRequestNameString] = js.undefined
  
  /**
    * The genome reference for the store's variants.
    */
  var reference: ReferenceItem
  
  /**
    * Server-side encryption (SSE) settings for the store.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
  
  /**
    * Tags for the store.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateVariantStoreRequest {
  
  inline def apply(reference: ReferenceItem): CreateVariantStoreRequest = {
    val __obj = js.Dynamic.literal(reference = reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVariantStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateVariantStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: StoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: CreateVariantStoreRequestNameString): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setReference(value: ReferenceItem): Self = StObject.set(x, "reference", value.asInstanceOf[js.Any])
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
