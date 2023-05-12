package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReferenceStoreRequest extends StObject {
  
  /**
    * To ensure that requests don't run multiple times, specify a unique token for each request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description for the store.
    */
  var description: js.UndefOr[ReferenceStoreDescription] = js.undefined
  
  /**
    * A name for the store.
    */
  var name: ReferenceStoreName
  
  /**
    * Server-side encryption (SSE) settings for the store.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
  
  /**
    * Tags for the store.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateReferenceStoreRequest {
  
  inline def apply(name: ReferenceStoreName): CreateReferenceStoreRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReferenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReferenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: ReferenceStoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setName(value: ReferenceStoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
