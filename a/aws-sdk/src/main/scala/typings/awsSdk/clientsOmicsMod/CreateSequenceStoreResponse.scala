package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSequenceStoreResponse extends StObject {
  
  /**
    * The store's ARN.
    */
  var arn: SequenceStoreArn
  
  /**
    * When the store was created.
    */
  var creationTime: js.Date
  
  /**
    * The store's description.
    */
  var description: js.UndefOr[SequenceStoreDescription] = js.undefined
  
  /**
    *  An S3 location that is used to store files that have failed a direct upload. 
    */
  var fallbackLocation: js.UndefOr[S3Destination] = js.undefined
  
  /**
    * The store's ID.
    */
  var id: SequenceStoreId
  
  /**
    * The store's name.
    */
  var name: js.UndefOr[SequenceStoreName] = js.undefined
  
  /**
    * The store's SSE settings.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
}
object CreateSequenceStoreResponse {
  
  inline def apply(arn: SequenceStoreArn, creationTime: js.Date, id: SequenceStoreId): CreateSequenceStoreResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSequenceStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSequenceStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: SequenceStoreArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: SequenceStoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setFallbackLocation(value: S3Destination): Self = StObject.set(x, "fallbackLocation", value.asInstanceOf[js.Any])
    
    inline def setFallbackLocationUndefined: Self = StObject.set(x, "fallbackLocation", js.undefined)
    
    inline def setId(value: SequenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: SequenceStoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
  }
}
