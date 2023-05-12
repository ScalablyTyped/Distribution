package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSequenceStoreRequest extends StObject {
  
  /**
    * To ensure that requests don't run multiple times, specify a unique token for each request.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * A description for the store.
    */
  var description: js.UndefOr[SequenceStoreDescription] = js.undefined
  
  /**
    *  An S3 location that is used to store files that have failed a direct upload. 
    */
  var fallbackLocation: js.UndefOr[S3Destination] = js.undefined
  
  /**
    * A name for the store.
    */
  var name: SequenceStoreName
  
  /**
    * Server-side encryption (SSE) settings for the store.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
  
  /**
    * Tags for the store.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
}
object CreateSequenceStoreRequest {
  
  inline def apply(name: SequenceStoreName): CreateSequenceStoreRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSequenceStoreRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSequenceStoreRequest] (val x: Self) extends AnyVal {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setDescription(value: SequenceStoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFallbackLocation(value: S3Destination): Self = StObject.set(x, "fallbackLocation", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocationUndefined: Self = StObject.set(x, "fallbackLocation", js.undefined)
    
    inline def setName(value: SequenceStoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
