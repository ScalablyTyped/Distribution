package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateApiMappingResponse extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: js.UndefOr[Id] = js.native
  
  /**
    * The API mapping identifier.
    */
  var ApiMappingId: js.UndefOr[Id] = js.native
  
  /**
    * The API mapping key.
    */
  var ApiMappingKey: js.UndefOr[SelectionKey] = js.native
  
  /**
    * The API stage.
    */
  var Stage: js.UndefOr[StringWithLengthBetween1And128] = js.native
}
object CreateApiMappingResponse {
  
  @scala.inline
  def apply(): CreateApiMappingResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateApiMappingResponse]
  }
  
  @scala.inline
  implicit class CreateApiMappingResponseMutableBuilder[Self <: CreateApiMappingResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: Id): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiIdUndefined: Self = StObject.set(x, "ApiId", js.undefined)
    
    @scala.inline
    def setApiMappingId(value: Id): Self = StObject.set(x, "ApiMappingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingIdUndefined: Self = StObject.set(x, "ApiMappingId", js.undefined)
    
    @scala.inline
    def setApiMappingKey(value: SelectionKey): Self = StObject.set(x, "ApiMappingKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApiMappingKeyUndefined: Self = StObject.set(x, "ApiMappingKey", js.undefined)
    
    @scala.inline
    def setStage(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Stage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStageUndefined: Self = StObject.set(x, "Stage", js.undefined)
  }
}
