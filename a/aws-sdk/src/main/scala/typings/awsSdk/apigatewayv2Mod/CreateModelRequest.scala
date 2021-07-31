package typings.awsSdk.apigatewayv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateModelRequest extends StObject {
  
  /**
    * The API identifier.
    */
  var ApiId: string
  
  /**
    * The content-type for the model, for example, "application/json".
    */
  var ContentType: js.UndefOr[StringWithLengthBetween1And256] = js.undefined
  
  /**
    * The description of the model.
    */
  var Description: js.UndefOr[StringWithLengthBetween0And1024] = js.undefined
  
  /**
    * The name of the model. Must be alphanumeric.
    */
  var Name: StringWithLengthBetween1And128
  
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var Schema: StringWithLengthBetween0And32K
}
object CreateModelRequest {
  
  @scala.inline
  def apply(ApiId: string, Name: StringWithLengthBetween1And128, Schema: StringWithLengthBetween0And32K): CreateModelRequest = {
    val __obj = js.Dynamic.literal(ApiId = ApiId.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
  
  @scala.inline
  implicit class CreateModelRequestMutableBuilder[Self <: CreateModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApiId(value: string): Self = StObject.set(x, "ApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentType(value: StringWithLengthBetween1And256): Self = StObject.set(x, "ContentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "ContentType", js.undefined)
    
    @scala.inline
    def setDescription(value: StringWithLengthBetween0And1024): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: StringWithLengthBetween0And32K): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
  }
}
