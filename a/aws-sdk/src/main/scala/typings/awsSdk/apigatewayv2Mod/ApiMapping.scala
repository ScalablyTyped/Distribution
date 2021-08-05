package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ApiMapping extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: Id
  
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
  var Stage: StringWithLengthBetween1And128
}
object ApiMapping {
  
  inline def apply(ApiId: Id, Stage: StringWithLengthBetween1And128): ApiMapping = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Stage = Stage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApiMapping]
  }
  
  extension [Self <: ApiMapping](x: Self) {
    
    inline def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingId(value: Id): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    inline def setApiMappingIdUndefined: Self = StObject.set(x, "ApiMappingId", js.undefined)
    
    inline def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    inline def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    inline def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
  }
}
