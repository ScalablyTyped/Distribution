package typings.awsSdk.clientsOmicsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateReferenceStoreResponse extends StObject {
  
  /**
    * The store's ARN.
    */
  var arn: ReferenceStoreArn
  
  /**
    * When the store was created.
    */
  var creationTime: js.Date
  
  /**
    * The store's description.
    */
  var description: js.UndefOr[ReferenceStoreDescription] = js.undefined
  
  /**
    * The store's ID.
    */
  var id: ReferenceStoreId
  
  /**
    * The store's name.
    */
  var name: js.UndefOr[ReferenceStoreName] = js.undefined
  
  /**
    * The store's SSE settings.
    */
  var sseConfig: js.UndefOr[SseConfig] = js.undefined
}
object CreateReferenceStoreResponse {
  
  inline def apply(arn: ReferenceStoreArn, creationTime: js.Date, id: ReferenceStoreId): CreateReferenceStoreResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationTime = creationTime.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateReferenceStoreResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateReferenceStoreResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ReferenceStoreArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "creationTime", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ReferenceStoreDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: ReferenceStoreId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ReferenceStoreName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setSseConfig(value: SseConfig): Self = StObject.set(x, "sseConfig", value.asInstanceOf[js.Any])
    
    inline def setSseConfigUndefined: Self = StObject.set(x, "sseConfig", js.undefined)
  }
}
