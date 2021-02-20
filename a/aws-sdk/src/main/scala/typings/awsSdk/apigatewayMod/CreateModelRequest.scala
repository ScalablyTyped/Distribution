package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateModelRequest extends StObject {
  
  /**
    * [Required] The content-type for the model.
    */
  var contentType: String = js.native
  
  /**
    * The description of the model.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    * [Required] The name of the model. Must be alphanumeric.
    */
  var name: String = js.native
  
  /**
    * [Required] The RestApi identifier under which the Model will be created.
    */
  var restApiId: String = js.native
  
  /**
    * The schema for the model. For application/json models, this should be JSON schema draft 4 model.
    */
  var schema: js.UndefOr[String] = js.native
}
object CreateModelRequest {
  
  @scala.inline
  def apply(contentType: String, name: String, restApiId: String): CreateModelRequest = {
    val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], restApiId = restApiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateModelRequest]
  }
  
  @scala.inline
  implicit class CreateModelRequestMutableBuilder[Self <: CreateModelRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestApiId(value: String): Self = StObject.set(x, "restApiId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchema(value: String): Self = StObject.set(x, "schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaUndefined: Self = StObject.set(x, "schema", js.undefined)
  }
}
