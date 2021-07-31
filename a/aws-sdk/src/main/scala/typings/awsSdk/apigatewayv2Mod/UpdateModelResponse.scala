package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateModelResponse extends StObject {
  
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
  
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The model identifier.
    */
  var ModelId: js.UndefOr[Id] = js.undefined
  
  /**
    * The name of the model. Must be alphanumeric.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.undefined
  
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var Schema: js.UndefOr[StringWithLengthBetween0And32K] = js.undefined
}
object UpdateModelResponse {
  
  @scala.inline
  def apply(): UpdateModelResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateModelResponse]
  }
  
  @scala.inline
  implicit class UpdateModelResponseMutableBuilder[Self <: UpdateModelResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And256): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setModelId(value: Id): Self = StObject.set(x, "ModelId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModelIdUndefined: Self = StObject.set(x, "ModelId", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setSchema(value: StringWithLengthBetween0And32K): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "Schema", js.undefined)
  }
}
