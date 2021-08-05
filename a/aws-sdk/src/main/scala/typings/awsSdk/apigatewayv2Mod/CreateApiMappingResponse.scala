package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiMappingResponse extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: js.UndefOr[Id] = js.undefined
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.undefined
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.undefined
  
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
}
object CreateApiMappingResponse {
  
  inline def apply(): CreateApiMappingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiMappingResponse]
  }
  
  extension [Self <: CreateApiMappingResponse](x: Self) {
    
    inline def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiIdUndefined: Self = StObject.set(x, "ApiId", js.undefined)
    
    inline def setApiMappingId(value: Id): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingIdUndefined: Self = StObject.set(x, "ApiMappingId", js.undefined)
    
    inline def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    inline def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    inline def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
